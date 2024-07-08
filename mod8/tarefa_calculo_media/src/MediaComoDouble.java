public class MediaComoDouble {
    public static void main(String[] args) {

        // Notas que foram tiradas ao longo do ano
        double nota1 = 10;
        double nota2 = 6;
        double nota3 = 7;
        double nota4 = 8;

        // Chamada do método que calcula a média
        double media = calculaMedia(nota1, nota2, nota3, nota4);

        System.out.println("A média das notas foi: " + media);
    }

    public static double calculaMedia(double nota1, double nota2, double nota3, double nota4)
    {
        double notaTotal = nota1 + nota2 + nota3 + nota4;
        double media = notaTotal / 4;
        return media;
    }
}
