package br.com.savioea;

import br.com.savioea.dao.IClienteDao;
import br.com.savioea.dao.mock.ClienteDaoMock;
import br.com.savioea.domain.Cliente;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDaoTest {

    private IClienteDao clienteDao;
    private Cliente cliente;

    public ClienteDaoTest() {
        clienteDao = new ClienteDaoMock();
    }

    @BeforeEach
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(12345678910L);
        cliente.setNome("Sávio");
        cliente.setCel(11999990000L);
        cliente.setEnd("Rua Java");
        cliente.setNumero(11);
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());

        Assertions.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Assertions.assertTrue(clienteDao.cadastrar(cliente));
    }

    @Test
    public void excluir() {

        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterar() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Sávio Emerick");
        clienteDao.alterar(cliente);

        Assertions.assertEquals("Sávio Emerick", cliente.getNome());
    }
}
