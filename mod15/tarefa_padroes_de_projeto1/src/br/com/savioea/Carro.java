package br.com.savioea;

public class Carro {

    private String motor;
    private String combustivel;
    private String cor;

    public Carro(String motor, String combustivel, String cor) {
        this.motor = motor;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void ligar(){
        System.out.println("Ligando o carro " + getClass().getSimpleName().replace("Carro",""));
        System.out.println("O motor " + motor + " a " + combustivel + " deu a partida e está pronto para correr!");
    }
    public void lavar(){
        System.out.println("O carro foi lavado, e a cor " + cor.toLowerCase() + " está brilhando!");
    }
    public void visitarMecanico(){
        System.out.println("O carro foi verificado pelo mecânico. Está tudo certo!");
    }
    public void abastecer(){
        System.out.println("O carro está sendo abastecido com " + combustivel.toLowerCase() + ".");
    }
}
