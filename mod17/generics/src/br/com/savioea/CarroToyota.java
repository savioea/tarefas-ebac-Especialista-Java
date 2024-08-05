package br.com.savioea;

public class CarroToyota extends CarroAbstrato{

    public CarroToyota(int cavalos, String modelo, String cor, String categoria) {
        super(cavalos, modelo, cor, categoria);
    }

    @Override
    public void acelerar(){
        System.out.println("Esse tecnológico " + super.getModelo() + " equipado com um motor Toyota de " + this.getCavalos() +
                " cavalos está ganhando velocidade!");
    }
}