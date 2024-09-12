package br.com.savioea.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import br.com.savioea.annotation.TipoChave;

public class Venda implements Persistente{

    @TipoChave("getCodigo")
    private Long codigo;

    public enum Status {
        INICIADA, CONCLUIDA, CANCELADA;
    }

    private Cliente cliente;

    private Set<ProdutoQuantidade> produtos;

    private BigDecimal valorTotal;

    private Instant dataVenda;

    private Status status;

    public Venda() {
        produtos = new HashSet<>();
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<ProdutoQuantidade> getProdutos() {
        return produtos;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public Instant getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Instant dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void adicionarProduto(Produto produto, Integer quantidade) {
        validarStatus();

        Optional<ProdutoQuantidade> op =
                produtos.stream()
                        .filter(p -> p.getProduto().getCodigoProduto().equals(produto.getCodigoProduto()))
                        .findAny();

        if (op.isPresent()) {
            ProdutoQuantidade produtpQtd = op.get();
            produtpQtd.adicionar(quantidade);
        } else {
            // Criar fabrica para criar ProdutoQuantidade
            ProdutoQuantidade prod = new ProdutoQuantidade();
            prod.setProduto(produto);
            prod.adicionar(quantidade);
            produtos.add(prod);
        }
        recalcularValorTotalVenda();
    }

    private void validarStatus() {
        if (this.status == Status.CONCLUIDA) {
            throw new UnsupportedOperationException("IMPOSSÍVEL ALTERAR VENDA FINALIZADA");
        }
    }

    public void removerProduto(Produto produto, Integer quantidade) {
        validarStatus();
        Optional<ProdutoQuantidade> op =
                produtos.stream()
                        .filter(p -> p.getProduto().getCodigoProduto().equals(produto.getCodigoProduto()))
                        .findAny();

        if (op.isPresent()) {
            ProdutoQuantidade produtpQtd = op.get();
            if (produtpQtd.getQuantidade()>quantidade) {
                produtpQtd.remover(quantidade);
                recalcularValorTotalVenda();
            } else {
                produtos.remove(op.get());
                recalcularValorTotalVenda();
            }

        }
    }

    public void removerTodosProdutos() {
        validarStatus();
        produtos.clear();
        valorTotal = BigDecimal.ZERO;
    }

    public Integer getQuantidadeTotalProdutos() {
        // Soma a quantidade getQuantidade() de todos os objetos ProdutoQuantidade
        int result = produtos.stream()
                .reduce(0, (partialCountResult, prod) -> partialCountResult + prod.getQuantidade(), Integer::sum);
        return result;
    }

    private void recalcularValorTotalVenda() {
        validarStatus();
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ProdutoQuantidade prod : this.produtos) {
            valorTotal = valorTotal.add(prod.getValorTotal());
        }
        this.valorTotal = valorTotal;
    }

}
