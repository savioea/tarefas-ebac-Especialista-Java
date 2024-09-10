package br.com.savioea;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class AtividadeStreamsTest {

    @Test
    public void testPopulaListaDeNomes(){
        AtividadeStreams atividadeStreams = new AtividadeStreams();
        atividadeStreams.populaListaDeNomes("Sávio - M, Letícia - F, Sara - F, Cynthia - F, Arthur - M, Mateus - M, Paula - F, Fabrício - M");

        List<String> listaDeNomes = atividadeStreams.getListaDeNomes();
        Assertions.assertNotEquals(0, listaDeNomes.size());
    }

    @Test
    public void testFiltraListaMulheres(){
        AtividadeStreams atividadeStreams = new AtividadeStreams();
        atividadeStreams.populaListaDeNomes("Sávio - M, Letícia - F, Sara - F, Cynthia - F, Arthur - M, Mateus - M, Paula - F, Fabrício - M");
        List<String> listaDeMulheres = atividadeStreams.filtraListaMulheres(atividadeStreams.getListaDeNomes());

        listaDeMulheres.forEach(nome -> Assertions.assertTrue(nome.contains(" - F")));
    }
}
