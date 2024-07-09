package br.com.savioea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Definição do Scanner que lerá os valores
        Scanner leitorDoConsole = new Scanner(System.in);

        // Notas que foram tiradas ao longo do ano
        System.out.println("Digite a nota do primeiro bimestre: ");
        double nota1 = leitorDoConsole.nextDouble();
        System.out.println("Digite a nota do segundo bimestre: ");
        double nota2 = leitorDoConsole.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre: ");
        double nota3 = leitorDoConsole.nextDouble();
        System.out.println("Digite a nota do quarto bimestre: ");
        double nota4 = leitorDoConsole.nextDouble();

        // Chamada do método que calcula a média e imprime se houve aprovação
        calculaMedia(nota1, nota2, nota3, nota4);
    }

    public static void calculaMedia(double nota1, double nota2, double nota3, double nota4)
    {
        // soma todas as notas
        double notaTotal = nota1 + nota2 + nota3 + nota4;

        // divide o total da notas por 4
        double media = notaTotal / 4;

        if (media >= 7){
            System.out.println("Parabéns! O aluno foi APROVADO!");
        }
        else if (media >= 5){
            System.out.println("Atenção! O aluno foi para a RECUPERAÇÃO!");
        }
        else {
            System.out.println("Que pena! O aluno foi REPROVADO!");
        }
    }
}
