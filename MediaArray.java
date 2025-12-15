public class MediaArray {
    public static void main(String[] args) {
        double[] notas = {10.0, 9.0, 9.5};
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = 0;
        if (notas.length > 0) {
            media = soma / notas.length;
        }

        System.out.printf("A média das notas foi: %.2f%n", media);
    }

}
