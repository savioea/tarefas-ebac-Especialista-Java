package br.com.savioea;

import br.com.savioea.dao.IVendaDao;
import br.com.savioea.dao.mock.VendaDaoMock;
import br.com.savioea.domain.Venda;
import br.com.savioea.domain.mock.ClienteMock;
import br.com.savioea.exception.TipoChaveNaoEncontradaException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class VendaDaoTest {

    private IVendaDao vendaDao;
    private Venda venda;

    public VendaDaoTest() {
        vendaDao = new VendaDaoMock();
    }

    @BeforeEach
    public void init() throws TipoChaveNaoEncontradaException {
        venda = new Venda();
        venda.setCodigo(12345678910L);
        venda.setDataVenda(Instant.now());
        venda.setStatus(Venda.Status.INICIADA);
        venda.setCliente(new ClienteMock());
        vendaDao.cadastrar(venda);
    }

    @Test
    public void pesquisarVenda() {

        Venda vendaConsultada = vendaDao.consultar(venda.getCodigo());

        Assertions.assertNotNull(vendaConsultada);
    }

    @Test
    public void salvarVenda() throws TipoChaveNaoEncontradaException {
        Assertions.assertTrue(vendaDao.cadastrar(venda));
    }

    @Test
    public void excluir() {

        vendaDao.excluir(venda.getCodigo());
    }

    @Test
    public void alterar() throws TipoChaveNaoEncontradaException {
        venda.setStatus(Venda.Status.CONCLUIDA);
        vendaDao.alterar(venda);

        Assertions.assertEquals(Venda.Status.CONCLUIDA, venda.getStatus());
    }
}
