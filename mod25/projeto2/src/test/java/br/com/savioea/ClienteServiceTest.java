package br.com.savioea;

import br.com.savioea.dao.IClienteDao;
import br.com.savioea.domain.Cliente;
import br.com.savioea.dao.mock.ClienteDaoMock;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;
import br.com.savioea.service.ClienteService;
import br.com.savioea.service.IClienteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDao dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @BeforeEach
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12345678910L);
        cliente.setNome("Sávio");
        cliente.setCel(11999990000L);
        cliente.setEnd("Rua Java");
        cliente.setNumero(11);
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());

        Assertions.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Assertions.assertTrue(clienteService.cadastrar(cliente));
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Sávio Emerick");
        clienteService.alterar(cliente);

        Assertions.assertEquals("Sávio Emerick", cliente.getNome());
    }
}
