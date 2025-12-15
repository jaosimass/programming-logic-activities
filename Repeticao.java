import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double somaLeituras = 0;
            final int QTD_LEITURAS = 4;
            String classificacaoLeitura;
            double glicose;

            for (int i = 1; i <= QTD_LEITURAS; i++) {
                System.out.print("Leitura " + i + ": ");
                glicose = sc.nextDouble();
                somaLeituras += glicose;
                if (glicose < 110) {
                    classificacaoLeitura = "Normal!";
                } else if (glicose >= 110 && glicose <= 125) {
                    classificacaoLeitura = "Alterada!";
                } else {
                    classificacaoLeitura = "Muito Alta!";
                }
                System.out.println("-> " + classificacaoLeitura);

            }
            String classificacaoMediaLeitura;
            double mediaGlicose = somaLeituras / QTD_LEITURAS;
            if (mediaGlicose < 110) {
                classificacaoMediaLeitura = "Normal!";
            } else if (mediaGlicose >= 110 && mediaGlicose <= 125) {
                classificacaoMediaLeitura = "Alterada!";
            } else {
                classificacaoMediaLeitura = "Muito Alta!";
            }
            System.out.println("Média Glicose -> " + mediaGlicose);
            System.out.println("Classificação da Média Glicose -> " + classificacaoMediaLeitura);

        }

    }

}