package br.com.savioea;

import br.com.savioea.dao.IVendaDao;
import br.com.savioea.dao.mock.VendaDaoMock;
import br.com.savioea.domain.Venda;
import br.com.savioea.domain.mock.ClienteMock;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;
import br.com.savioea.service.IVendaService;
import br.com.savioea.service.VendaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class VendaServiceTest {

    private IVendaService vendaService;
    private Venda venda;

    public VendaServiceTest() {
        IVendaDao dao = new VendaDaoMock();
        vendaService = new VendaService(dao);
    }

    @BeforeEach
    public void init() {
        venda = new Venda();
        venda.setCodigo(12345678910L);
        venda.setDataVenda(Instant.now());
        venda.setStatus(Venda.Status.INICIADA);
        venda.setCliente(new ClienteMock());
    }

    @Test
    public void pesquisarVenda() {
        Venda clienteConsultado = vendaService.consultar(venda.getCodigo());

        Assertions.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarVenda() throws TipoChaveNaoEncontradaException {
        Assertions.assertTrue(vendaService.cadastrar(venda));
    }

    @Test
    public void excluirVenda() {
        vendaService.excluir(venda.getCodigo());
    }

    @Test
    public void alterarVenda() throws TipoChaveNaoEncontradaException {
        venda.setStatus(Venda.Status.CONCLUIDA);
        vendaService.alterar(venda);

        Assertions.assertEquals(Venda.Status.CONCLUIDA, venda.getStatus());
    }
}
