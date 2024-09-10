package br.com.savioea;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class AtividadeStreamsTest {

    // Teste que verifica se a lista de nomes está sendo criada corretamente
    @Test
    public void testPopulaListaDeNomes(){
        AtividadeStreams atividadeStreams = new AtividadeStreams();
        atividadeStreams.populaListaDeNomes("Sávio - M, Letícia - F, Sara - F, Cynthia - F, Arthur - M, Mateus - M, Paula - F, Fabrício - M");

        List<String> listaDeNomes = atividadeStreams.getListaDeNomes();
        Assertions.assertNotEquals(0, listaDeNomes.size());
    }

    // Teste que verifica se após o filtro existem apenas mulheres na lista
    @Test
    public void testFiltraListaMulheres(){
        // Cria o objeto atividadeStreams
        AtividadeStreams atividadeStreams = new AtividadeStreams();

        // Adiciona nomes à lista de nomes
        atividadeStreams.populaListaDeNomes("Sávio - M, Letícia - F, Sara - F, Cynthia - F, Arthur - M, Mateus - M, Paula - F, Fabrício - M");

        // Faz o filtro da lista anterior para apenas haverem mulheres
        List<String> listaDeMulheres = atividadeStreams.filtraListaMulheres(atividadeStreams.getListaDeNomes());

        // Testa cada nome da lista retornada, para verificar se todos possuem " - F"
        listaDeMulheres.forEach(nome -> Assertions.assertTrue(nome.contains(" - F")));
    }
}
