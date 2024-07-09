package br.com.savioea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        // Definição do Scanner que lerá os valores do console
        Scanner leitorDoConsole = new Scanner(System.in);

        // Definição da String que sofrerá o .split() e será então processada
        System.out.println("Digite uma lista de nomes no modelo:");
        System.out.println("[nome 1], [nome 2], [nome 3], ... [nome n]\n");
        String listaDeNomesString = leitorDoConsole.nextLine();

        // Definição da List (ArrayList) que receberá os valores dos nomes
        List<String> listaDeNomesList = new ArrayList<String>();

        /*
         * Para cada iteração a variavel nome recebe o valor de um item do array
         * resultante do .split(), esse valor é adicionado ao ArrayList listaDeNomesList
         */
        for (String nome : listaDeNomesString.split(","))
        {
            // Usei o método .trim() para excluir espaços vazios no inicio e fim das Strings
            listaDeNomesList.add(nome.trim());
        }

        // Fazemos a ordenação com o método .sort()
        Collections.sort(listaDeNomesList);

        // Agora fazemos a impressão de cada item da lista que está ordenada
        System.out.println("\nOs nomes em ordem alfabética são: ");
        for (String nome : listaDeNomesList)
        {
            System.out.println(nome);
        }
    }
}
