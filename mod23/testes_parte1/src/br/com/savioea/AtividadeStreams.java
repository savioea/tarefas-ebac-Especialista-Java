package br.com.savioea;

import java.util.*;
import java.util.stream.Collectors;

public class AtividadeStreams {

    // Definição do Scanner que lerá os valores do console
    private final Scanner leitorDoConsole;

    private List<String> listaDeNomes;

    private List<String> listaDeMulheres;

    AtividadeStreams(){
        this.leitorDoConsole = new Scanner(System.in);
    }

    public Scanner getLeitorDoConsole() {
        return leitorDoConsole;
    }

    public List<String> getListaDeNomes() {
        return listaDeNomes;
    }

    public List<String> getListaDeMulheres() {
        return listaDeMulheres;
    }

    public void populaListaDeNomes(String nomes) {

        // Mensagem no console pedindo que sejam fornecidos nomes e sexos
        System.out.println("Digite uma lista de nomes no modelo:");
        System.out.println("[nome 1] - [SEXO 1], [nome 2] - [SEXO 2], [nome 3] - [SEXO 3], ... [nome n] - [SEXO n]");

        // leitorDoConsole.nextLine().split(","); Faz a leitura dos nomes, um split e uma conversão por meio de stream
        // de array para List
        System.out.println(nomes);
        this.listaDeNomes = Arrays.stream(nomes.split(",")).toList();
    }

    public List<String> filtraListaMulheres(List<String> listaDeNomes) {

        // Stream que faz o filter para pegar apenas nomes que tenham um " F" como sexo
        // e coleta para uma lista separada.
        // É feito um trim, de modo que não haja espaços antes dos nomes para que nomes
        // masculinos que comecem com "F" não sejam pegos no filtro.
        List<String> listaDeMulheres = listaDeNomes.stream()
                .filter(pessoa -> pessoa.trim().contains(" F"))
                .collect(Collectors.toList());

        this.listaDeMulheres = listaDeMulheres;
        imprimeNomes(listaDeMulheres);
        return listaDeMulheres;
    }

    public void imprimeNomes(List<String> listaDeNomes){
        listaDeNomes.forEach(System.out::println);
    }
}
