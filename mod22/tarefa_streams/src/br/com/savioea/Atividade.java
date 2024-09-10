package br.com.savioea;

import java.util.*;
import java.util.stream.Collectors;

public class Atividade {

    public static void main(String[] args) {

        // Definição do Scanner que lerá os valores do console
        Scanner leitorDoConsole = new Scanner(System.in);

        // Mensagem no console pedindo que sejam fornecidos nomes e sexos
        System.out.println("Digite uma lista de nomes no modelo:");
        System.out.println("[nome 1] - [SEXO 1], [nome 2] - [SEXO 2], [nome 3] - [SEXO 3], ... [nome n] - [SEXO n]");

        // leitorDoConsole.nextLine().split(","); Faz a leitura dos nomes, um split e uma conversão por meio de stream
        // de array para List
        List<String> listaDeNomes = Arrays.stream(leitorDoConsole.nextLine().split(",")).toList();

        // Stream que faz o filter para pegar apenas nomes que tenham um " F" como sexo
        // e coleta para uma lista separada.
        // É feito um trim, de modo que não haja espaços antes dos nomes para que nomes
        // masculinos que comecem com "F" não sejam pegos no filtro.
        List<String> listaDeMulheres = listaDeNomes.stream()
                .filter(pessoa -> pessoa.trim().contains(" F"))
                .collect(Collectors.toList());

        // Impressão da lista de nomes femininos.
        System.out.println("Nomes do sexo Feminino:");
        listaDeMulheres.forEach(System.out::println);


        /*
        EXEMPLO DE FUNCIONAMENTO:

        Digite uma lista de nomes no modelo:
        [nome 1] [SEXO 1], [nome 2] [SEXO 2], [nome 3] [SEXO 3], ... [nome n] [SEXO n]
        Sávio - M, Letícia - F, Sara - F, Cynthia - F, Arthur - M, Mateus - M, Paula - F, Fabrício - M
        Nomes do sexo Feminino:
         Letícia - F
         Sara - F
         Cynthia - F
         Paula - F
         */
    }
}
