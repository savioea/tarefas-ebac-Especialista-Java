package br.com.savioea;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new PessoaFisica("Sávio", 5000.0, 'M', 22, 1000000000);
        pessoa1.pagarImpostoDeRenda();

        System.out.println("");

        Pessoa pessoa2 = new PessoaJuridica("Empresa LTDA", 20000000.0, "XPTO Empreendimentos", 10000000000100L, "00/000A", 0.2);
        pessoa2.pagarImpostoDeRenda();

    }
}
