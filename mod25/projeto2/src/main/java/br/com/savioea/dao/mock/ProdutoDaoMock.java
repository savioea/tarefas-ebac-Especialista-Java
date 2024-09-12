package br.com.savioea.dao.mock;

import br.com.savioea.dao.IProdutoDao;
import br.com.savioea.domain.Produto;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;

import java.util.Collection;
import java.util.List;

public class ProdutoDaoMock implements IProdutoDao {
    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Produto consultar(Long valor) {
        Produto produto = new Produto();
        produto.setCodigoProduto(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return List.of();
    }
}
