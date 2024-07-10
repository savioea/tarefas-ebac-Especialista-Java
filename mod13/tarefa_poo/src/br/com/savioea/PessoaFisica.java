package br.com.savioea;

public class PessoaFisica extends Pessoa{

    private char sexo;
    private int idade;
    private int cpf;

    public PessoaFisica(String nome, Double renda, char sexo ,int idade, int cpf) {
        super.setNome(nome);
        super.setRenda(renda);
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void pagarImpostoDeRenda() {

        System.out.println("A pessoa física: " + super.getNome() + " teve uma renda de: R$" + super.getRenda());

        if(this.getRenda() <= 2112)
        {
            System.out.println("e está isenta de imposto de Renda" );
        }
        else if (this.getRenda() <= 2868.65)
        {
            System.out.println("e pagou um total de: R$" + (super.getRenda() * 0.075) + " de imposto de Renda" );
        }
        else if (this.getRenda() <= 3751.05)
        {
            System.out.println("e pagou um total de: R$" + (super.getRenda() * 0.15) + " de imposto de Renda" );
        }
        else if (this.getRenda() <= 4664.68)
        {
            System.out.println("e pagou um total de: R$" + (super.getRenda() * 0.225) + " de imposto de Renda" );
        }
        else
        {
            System.out.println("e pagou um total de: R$" + (super.getRenda() * 0.275) + " de imposto de Renda" );
        }
    }
}
