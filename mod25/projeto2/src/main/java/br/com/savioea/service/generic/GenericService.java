package br.com.savioea.service.generic;

import br.com.savioea.dao.generic.IGenericDAO;
import br.com.savioea.domain.Cliente;
import br.com.savioea.domain.Persistente;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public abstract class GenericService<T extends Persistente, E extends Serializable>
        implements IGenericService<T> {

    protected IGenericDAO<T> dao;

    public GenericService(IGenericDAO<T> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(Long id) {
        this.dao.excluir(id);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(Long id) {
        return this.dao.consultar(id);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.dao.buscarTodos();
    }

    public abstract T buscarId(Long id);
}
