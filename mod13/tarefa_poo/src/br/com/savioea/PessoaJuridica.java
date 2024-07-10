package br.com.savioea;

public class PessoaJuridica extends Pessoa{

    private String nomeFantasia;
    private long cnpj;
    private String cnae;
    private Double porcentagemLucro;

    public PessoaJuridica(String nome, Double renda, String nomeFantasia, long cnpj, String cnae, Double porcentagemLucro) {
        super.setNome(nome);
        super.setRenda(renda);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.cnae = cnae;
        this.porcentagemLucro = porcentagemLucro;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public Double getPorcentagemLucro() {
        return porcentagemLucro;
    }

    public void setPorcentagemLucro(Double porcentagemLucro) {
        this.porcentagemLucro = porcentagemLucro;
    }

    @Override
    public void pagarImpostoDeRenda() {
        Double lucroTotal = (super.getRenda() * this.porcentagemLucro);

        System.out.println("A pessoa jurídica: " + super.getNome() + " teve um lucro de: R$" + lucroTotal +
                "\ne pagou um total de: R$" + (lucroTotal * 0.15) + " de imposto de Renda" );
    }
}
