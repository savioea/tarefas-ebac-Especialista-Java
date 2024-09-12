package br.com.savioea;

import br.com.savioea.domain.Produto;
import br.com.savioea.domain.ProdutoQuantidade;
import br.com.savioea.domain.mock.ProdutoMock;
import br.com.savioea.domain.mock.ProdutoQuantidadeMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoQuantidadeTest {

    private ProdutoQuantidade produtoQuantidade;

    @BeforeEach
    public void init(){
        Produto produtoMock = new ProdutoMock();
        this.produtoQuantidade = new ProdutoQuantidadeMock(produtoMock);
    }

    @Test
    public void adicionarTest(){
        Integer quantidadeAdicionada = 2;
        Integer quantidadeInicial = produtoQuantidade.getQuantidade();

        produtoQuantidade.adicionar(quantidadeAdicionada);
        Assertions.assertEquals(quantidadeAdicionada+quantidadeInicial, produtoQuantidade.getQuantidade());
    }

    @Test
    public void removerTest(){
        Integer quantidadeRemovida = 2;
        Integer quantidadeInicial = produtoQuantidade.getQuantidade();

        produtoQuantidade.remover(quantidadeRemovida);
        Assertions.assertEquals(quantidadeInicial-quantidadeRemovida, produtoQuantidade.getQuantidade());
    }
}
