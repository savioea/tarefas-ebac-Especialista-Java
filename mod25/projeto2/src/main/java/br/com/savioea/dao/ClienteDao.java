package br.com.savioea.dao;

import br.com.savioea.dao.generic.GenericDAO;
import br.com.savioea.domain.Cliente;

public class ClienteDao extends GenericDAO<Cliente> implements IClienteDao {

    public ClienteDao() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
