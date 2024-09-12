package br.com.savioea;

import br.com.savioea.dao.IProdutoDao;
import br.com.savioea.dao.mock.ProdutoDaoMock;
import br.com.savioea.domain.Produto;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ProdutoDaoTest {

    private IProdutoDao produtoDao;
    private Produto produto;

    public ProdutoDaoTest() {
        produtoDao = new ProdutoDaoMock();
    }

    @BeforeEach
    public void init() throws TipoChaveNaoEncontradaException {
        produto = new Produto();
        produto.setCodigoProduto(123456L);
        produto.setNomeProduto("Porta de Madeira");
        produto.setDescricao("Uma bela porta de madeira.");
        produto.setValor(BigDecimal.valueOf(200.00));
        produtoDao.cadastrar(produto);
    }

    @Test
    public void pesquisarProduto() {

        Produto produtoConsultado = produtoDao.consultar(produto.getCodigoProduto());

        Assertions.assertNotNull(produtoConsultado);
    }

    @Test
    public void salvarProduto() throws TipoChaveNaoEncontradaException {
        Assertions.assertTrue(produtoDao.cadastrar(produto));
    }

    @Test
    public void excluir() {

        produtoDao.excluir(produto.getCodigoProduto());
    }

    @Test
    public void alterar() throws TipoChaveNaoEncontradaException {
        produto.setNomeProduto("Porta de Plástico");
        produtoDao.alterar(produto);

        Assertions.assertEquals("Porta de Plástico", produto.getNomeProduto());
    }
}
