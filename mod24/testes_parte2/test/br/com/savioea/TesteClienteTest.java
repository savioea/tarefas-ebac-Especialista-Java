package br.com.savioea;

import org.junit.Assert;
import org.junit.Test;

import br.com.savioea.TesteCliente;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Sávio");
        cli.adicionarNome1("Sávio");

        Assert.assertEquals("Sávio", cli.getNome());
    }
}
