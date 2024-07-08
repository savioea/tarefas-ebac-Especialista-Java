package br.com.savioea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Definição do Scanner que lerá os valores do console
        Scanner leitorDoConsole = new Scanner(System.in);

        // Leitura do console: numero que será convertido para wrapper
        System.out.println("Digite um valor numérico: ");
        int numero = leitorDoConsole.nextInt();

        // Conversão por Autoboxing
        Integer numeroWrapper = numero;

        // Impressão do wrapper no console
        System.out.println("Parabéns!! O número convertido para Wrapper foi: " + numeroWrapper);
    }
}