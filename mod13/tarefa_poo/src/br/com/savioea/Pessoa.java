package br.com.savioea;

public abstract class Pessoa {

    // Todos os tipos de pessoas (PF ou PJ) tem seu nome e sua renda
    private String nome;
    private Double renda;

    //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    // todos os tipos de pessoa tem que pagar IR, algumas PFs são isentas
    public abstract void pagarImpostoDeRenda();
}
