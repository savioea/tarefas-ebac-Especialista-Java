package br.com.savioea;

import br.com.savioea.domain.Cliente;
import br.com.savioea.domain.Produto;
import br.com.savioea.domain.Venda;
import br.com.savioea.domain.mock.ClienteMock;
import br.com.savioea.domain.mock.ProdutoMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class VendaTest {

    private Venda venda;

    @BeforeEach
    public void init(){

        Cliente clienteMock = new ClienteMock();
        this.venda = new Venda();

        this.venda.setCodigo(123465L);
        this.venda.setCliente(clienteMock);
        this.venda.setStatus(Venda.Status.INICIADA);
        this.venda.setDataVenda(Instant.now());
    }

    @Test
    public void adicionarProdutoTest(){
        Produto produtoMock = new ProdutoMock();

        venda.adicionarProduto(produtoMock, 1);

        Assertions.assertFalse(venda.getProdutos().isEmpty());
    }

    @Test
    public void removerProdutoTest(){
        Produto produtoMock = new ProdutoMock();
        venda.adicionarProduto(produtoMock, 1);

        venda.removerProduto(produtoMock, 1);
        Assertions.assertTrue(venda.getProdutos().isEmpty());
    }

    @Test
    public void removerTodosProdutosTest(){
        Produto produtoMock1 = new ProdutoMock(12345L);
        venda.adicionarProduto(produtoMock1, 1);
        Produto produtoMock2 = new ProdutoMock(45678L);
        venda.adicionarProduto(produtoMock2, 1);

        venda.removerTodosProdutos();
        Assertions.assertTrue(venda.getProdutos().isEmpty());
    }

    @Test
    public void getQuantidadeTotalProdutosTest(){
        Produto produtoMock1 = new ProdutoMock(12345L);
        venda.adicionarProduto(produtoMock1, 1);
        Produto produtoMock2 = new ProdutoMock(45678L);
        venda.adicionarProduto(produtoMock2, 1);

        Assertions.assertEquals(2, venda.getQuantidadeTotalProdutos());

        venda.removerTodosProdutos();

        Assertions.assertEquals(0, venda.getQuantidadeTotalProdutos());
    }
}
