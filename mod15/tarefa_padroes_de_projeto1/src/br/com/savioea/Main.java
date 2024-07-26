package br.com.savioea;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("A", true);
        Fabrica factory = getFactory(cliente);
        Carro carro = factory.criar(cliente.getModeloCarro());
        carro.ligar();
    }

    private static Fabrica getFactory(Cliente cliente) {
        if (cliente.temContrato()) {
            return new ContratoFabrica();
        } else {
            return new SemContratoFabrica();
        }
    }
}
