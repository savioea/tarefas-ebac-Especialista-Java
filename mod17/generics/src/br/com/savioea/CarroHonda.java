package br.com.savioea;

public class CarroHonda extends CarroAbstrato {

    public CarroHonda(int cavalos, String modelo, String cor, String categoria) {
        super(cavalos, modelo, cor, categoria);
    }

    @Override
    public void acelerar(){
        System.out.println("Esse lindo " + super.getModelo() + " equipado com um motor Honda de " + this.getCavalos() +
                " cavalos está ganhando velocidade!");
    }
}
