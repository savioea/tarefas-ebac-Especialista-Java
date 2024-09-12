package br.com.savioea.service.generic;

import br.com.savioea.domain.Persistente;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService <T extends Persistente> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(Long id);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(Long id);

    public Collection<T> buscarTodos();
}
