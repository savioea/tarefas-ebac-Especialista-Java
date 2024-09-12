package br.com.savioea.dao.mock;

import br.com.savioea.dao.IVendaDao;
import br.com.savioea.domain.Venda;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;

import java.util.Collection;
import java.util.List;

public class VendaDaoMock implements IVendaDao {
    @Override
    public Boolean cadastrar(Venda entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Venda entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Venda consultar(Long valor) {
        Venda venda = new Venda();
        venda.setCodigo(valor);
        return venda;
    }

    @Override
    public Collection<Venda> buscarTodos() {
        return List.of();
    }
}
