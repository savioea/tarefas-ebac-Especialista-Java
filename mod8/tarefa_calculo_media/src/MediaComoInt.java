public class MediaComoInt {
    public static void main(String[] args) {

        // Notas que foram tiradas ao longo do ano
        int nota1 = 10;
        int nota2 = 6;
        int nota3 = 7;
        int nota4 = 8;

        // Chamada do método que calcula a média
        int media = calculaMedia(nota1, nota2, nota3, nota4);

        System.out.println("A média das notas foi: " + media);
    }

    public static int calculaMedia(int nota1, int nota2, int nota3, int nota4)
    {
        int notaTotal = nota1 + nota2 + nota3 + nota4;
        int media = notaTotal / 4;
        return media;
    }
}
