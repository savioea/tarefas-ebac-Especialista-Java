package br.com.savioea;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends CarroAbstrato> listaDeCarros = new ArrayList<>();

        CarroAbstrato civic = new CarroHonda(100, "Civic", "preto", "Sedan");
        CarroAbstrato corolla = new CarroToyota(90, "Corolla", "branco", "Sedan");
        CarroAbstrato uno = new CarroFiat(75, "Uno", "prata", "Hatch");

        List<CarroAbstrato> listaDeCarrosMutavel = new ArrayList<>();

        listaDeCarrosMutavel.add(civic);
        listaDeCarrosMutavel.add(corolla);
        listaDeCarrosMutavel.add(uno);

        listaDeCarros = listaDeCarrosMutavel;

        for(CarroAbstrato carro : listaDeCarros){
            carro.acelerar();
        }
    }
}
