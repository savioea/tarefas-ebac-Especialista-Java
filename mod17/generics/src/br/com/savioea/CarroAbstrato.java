package br.com.savioea;

public abstract class CarroAbstrato {

    private int cavalos;
    private String modelo;
    private String cor;
    private String categoria;

    public CarroAbstrato(int cavalos, String modelo, String cor, String categoria) {
        this.cavalos = cavalos;
        this.modelo = modelo;
        this.cor = cor;
        this.categoria = categoria;
    }

    public int getCavalos() {
        return cavalos;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void acelerar(){
        System.out.println("O motor de " + this.cavalos + " cavalos está rocando!");
    }

    public void lavar(){
        System.out.println("A pintura na cor " + this.cor + " está brilhando!");
    }
}
