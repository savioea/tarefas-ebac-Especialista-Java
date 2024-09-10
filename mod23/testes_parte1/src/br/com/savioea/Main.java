package br.com.savioea;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        AtividadeStreams atividade = new AtividadeStreams();

        atividade.populaListaDeNomes(atividade.getLeitorDoConsole().nextLine());

        atividade.filtraListaMulheres(atividade.getListaDeNomes());

        atividade.imprimeNomes(atividade.getListaDeMulheres());
    }
}
