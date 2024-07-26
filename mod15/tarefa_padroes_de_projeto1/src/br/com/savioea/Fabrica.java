package br.com.savioea;

public abstract class Fabrica {

    public Carro criar(String modeloCarro) {
        Carro carro = retornaCarro(modeloCarro);
        carro = preparaCarro(carro);
        return carro;
    }
    private Carro preparaCarro(Carro carro){
        carro.lavar();
        carro.visitarMecanico();
        carro.abastecer();
        return carro;
    }
    abstract Carro retornaCarro(String modeloCarro);
}
