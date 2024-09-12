package br.com.savioea.service;

import br.com.savioea.dao.IClienteDao;
import br.com.savioea.domain.Cliente;
import br.com.savioea.service.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        super(clienteDao);
    }

    @Override
    public Cliente buscarId(Long cpf) {
        return this.dao.consultar(cpf);
    }

}
