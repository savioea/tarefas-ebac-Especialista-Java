package br.com.savioea;

/**
 * Classe que representa um caminhão
 *
 * @version 1.1
 * @author Sávio Emerick
 */
public class Caminhao {

    // Propriedades
    private String modelo;
    private String marca;
    private String cor;
    private int numeroDeEixos;

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    // Métodos

    /**
     * Método que imprime a carga máxima que o caminhão pode carregar
     *
     * @deprecated
     * @see Caminhao#imprimeCargaMaxima(int numEixos)
     */
    public void imprimeCargaMaxima()
    {
        System.out.println("A carga máxima do caminhão é: 20T");
    }

    /**
     * Método que imprime a carga máxima que o caminhão pode carregar (Atualizada)
     *
     * @param numEixos
     */
    public void imprimeCargaMaxima(int numEixos)
    {
        System.out.println("A carga máxima do caminhão é: 20T");
        System.out.println("O numero de eixos é: " + numEixos);
    }

    /**
     * Método que faz o cálculo do número total de eixos do veículo
     *
     * @return Retorna o número de eixos do caminhão mais o número de eixos da carreta que está carregando
     */
    public int numeroTotalDeEixos()
    {
        return this.numeroDeEixos + 2;
    }

}
