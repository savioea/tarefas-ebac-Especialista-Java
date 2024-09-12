package br.com.savioea.domain;

import br.com.savioea.annotation.TipoChave;

import java.math.BigDecimal;

public class Produto implements Persistente{

    @TipoChave("getCodigo")
    private Long codigoProduto;

    private String nomeProduto;

    private String descricao;

    private BigDecimal valor;

    public Produto(Long codigoProduto, String nomeProduto, String descricao, BigDecimal valor) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(){

    }

    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
