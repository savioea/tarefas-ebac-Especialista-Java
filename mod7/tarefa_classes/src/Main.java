import br.com.savioea.Caminhao;

public class Main {
    public static void main(String[] args) {

        // Classe que foi criada e documentada
        Caminhao caminhao1 = new Caminhao();
        caminhao1.setModelo("ACTROS EURO6");
        caminhao1.setMarca("Mercedes");
        caminhao1.setCor("Cinza");
        caminhao1.setNumeroDeEixos(3);

        // Testando se os setters e getters funcionaram
        System.out.println("Modelo do caminhão: " + caminhao1.getModelo());
        System.out.println("Marca do caminhão: " + caminhao1.getMarca());
        System.out.println("Cor do caminhão: " + caminhao1.getCor());
        System.out.println("Número de Eixos do caminhão: " + caminhao1.getNumeroDeEixos());

        // Usa o método mais atual
        caminhao1.imprimeCargaMaxima(caminhao1.getNumeroDeEixos());

        // Usa o método depreciado
        caminhao1.imprimeCargaMaxima();

        // Usa outro método com outra documentação
        System.out.println("O número total de eixos com a carreta é: " + caminhao1.numeroTotalDeEixos());
    }
}
