package br.com.savioea;

public class ContratoFabrica extends Fabrica {

    @Override
    Carro retornaCarro(String modeloCarro) {
        if ("A".equals(modeloCarro)) {
            return new BmwCarro("V8", "Alcool", "preta");
        } else {
            return null;
        }
    }
}
