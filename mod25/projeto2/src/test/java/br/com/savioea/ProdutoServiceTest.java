package br.com.savioea;

import br.com.savioea.dao.IProdutoDao;
import br.com.savioea.dao.mock.ProdutoDaoMock;
import br.com.savioea.domain.Cliente;
import br.com.savioea.domain.Produto;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;
import br.com.savioea.service.IProdutoService;
import br.com.savioea.service.ProdutoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ProdutoServiceTest {

    private IProdutoService produtoService;
    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDao dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @BeforeEach
    public void init() throws TipoChaveNaoEncontradaException {
        produto = new Produto();
        produto.setCodigoProduto(123456L);
        produto.setNomeProduto("Porta de Madeira");
        produto.setDescricao("Uma bela porta de madeira.");
        produto.setValor(BigDecimal.valueOf(200.00));
    }

    @Test
    public void pesquisarProduto() {
        Produto produtoConsultado = produtoService.consultar(produto.getCodigoProduto());

        Assertions.assertNotNull(produtoConsultado);
    }

    @Test
    public void salvarProduto() throws TipoChaveNaoEncontradaException {
        Assertions.assertTrue(produtoService.cadastrar(produto));
    }

    @Test
    public void excluirProduto() {
        produtoService.excluir(produto.getCodigoProduto());
    }

    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException {
        produto.setNomeProduto("Porta de Plástico");
        produtoService.alterar(produto);

        Assertions.assertEquals("Porta de Plástico", produto.getNomeProduto());
    }
}
