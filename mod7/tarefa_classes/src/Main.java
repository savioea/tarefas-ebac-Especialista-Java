import br.com.savioea.Caminhao;

public class Main {
    public static void main(String[] args) {

        // Classe que foi criada e documentada
        Caminhao caminhao1 = new Caminhao();
        caminhao1.setModelo("ACTROS EURO6");
        caminhao1.setMarca("Mercedes");
        caminhao1.setCor("Cinza");
        caminhao1.setNumeroDeEixos(3);


        // Usa o método mais atual
        caminhao1.imprimeCargaMaxima(caminhao1.getNumeroDeEixos());

        // Usa o método depreciado
        caminhao1.imprimeCargaMaxima();

        // Usa outro método com outra documentação
        System.out.println("O número total de eixos com a carreta é: " + caminhao1.numeroTotalDeEixos());
    }
}
