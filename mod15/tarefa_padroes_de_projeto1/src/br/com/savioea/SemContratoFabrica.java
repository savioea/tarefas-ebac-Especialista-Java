package br.com.savioea;

public class SemContratoFabrica extends Fabrica {

    @Override
    Carro retornaCarro(String modeloCarro) {
        if ("A".equals(modeloCarro)) {
            return new GolCarro("1.0", "Gasolina", "prata");
        } else {
            return null;
        }
    }
}
