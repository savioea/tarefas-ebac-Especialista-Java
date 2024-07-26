package br.com.savioea;

public class Cliente {

    private String modeloCarro;
    private boolean temContrato;

    public Cliente(String modeloCarro, boolean temContrato) {
        this.modeloCarro= modeloCarro;
        this.temContrato = temContrato;
    }
    public boolean temContrato() {
        return temContrato;
    }
    public String getModeloCarro() {
        return modeloCarro;
    }
}
