package br.com.savioea;

import java.util.*;

public class Atividade2 {

    public static void main(String[] args) {

        // Definição do Scanner que lerá os valores do console
        Scanner leitorDoConsole = new Scanner(System.in);

        // Definição da String 'listaDeNomesString' que sofrerá o .split() e será então processada
        System.out.println("Digite uma lista de nomes no modelo:");
        System.out.println("[nome 1] - [SEXO 1], [nome 2] - [SEXO 2], [nome 3] - [SEXO 3], ... [nome n] - [SEXO n]");
        String listaDeNomesString = leitorDoConsole.nextLine();

        // Definição do Map (HashMap) que receberá os valores de sexo (como chaves) e uma lista de nomes
        Map<String, List<String>> pessoaMap = new HashMap<String, List<String>>();

        /*
         * Para cada iteração a variavel pessoa recebe o valor de um item do array
         * resultante do .split(",")
         */
        for (String pessoa : listaDeNomesString.split(","))
        {

            /*
             * Como cada item do array está no formato '[nome x] - [SEXO x]' o que separa os
             * nomes e sexos é um traço ("-"). O array resultante do .split("-") vai ter na posição
             * [0] o nome e na posição [1] o sexo correspondente. Esses valores são salvos nas
             * variáveis nome e sexo respectivamente.
             */
            String nome = pessoa.split("-")[0].trim();
            String sexo = pessoa.split("-")[1].trim();

            /*
             * Se a chave com o sexo desta iteração já existir, puxamos a lista correspondente
             * e inserimos o nome na mesma.
             */
            if(pessoaMap.containsKey(sexo))
            {
                pessoaMap.get(sexo).add(nome);
            }
            /*
             * Se não, criamos uma nova lista e uma nova referencia no Map, com o sexo da iteração
             * e a lista de nomes correspondente
             */
            else
            {
                List<String> listaNomesPorSexo = new ArrayList<String>();
                listaNomesPorSexo.add(nome);
                pessoaMap.put(sexo, listaNomesPorSexo);
            }
        }

        /*
         * Por fim, imprimimos cada sexo que foi informado no console e os respectivos nomes que
         * tinham esse mesmo sexo.
         */
        for (String key : pessoaMap.keySet())
        {
            System.out.println("\nImprimindo os nomes do sexo: " + key + "\n");
            for(String nome : pessoaMap.get(key))
            {
                System.out.println(nome);
            }
        }
    }
}
