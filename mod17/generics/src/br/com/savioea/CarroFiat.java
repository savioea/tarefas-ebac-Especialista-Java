package br.com.savioea;

public class CarroFiat extends CarroAbstrato{

    public CarroFiat(int cavalos, String modelo, String cor, String categoria) {
        super(cavalos, modelo, cor, categoria);
    }

    @Override
    public void acelerar(){
        System.out.println("Esse clássico " + super.getModelo() + " equipado com um motor Fiat de " + this.getCavalos() +
                " cavalos está dominando as pistas!");
    }
}