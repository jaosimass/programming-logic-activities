import java.util.Scanner;

public class ImpostosCasal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a renda do homem: ");
        double rendaHomem = scanner.nextDouble();
        System.out.print("\nInforme a renda da mulher: ");
        double rendaMulher = scanner.nextDouble();

        double rendaConjunta = rendaHomem + rendaMulher;
        double percentualImposto;
        double valorImposto;
        double rendaLiquida;

        if (rendaConjunta <= 900){
            percentualImposto = 0;
        } else if (rendaConjunta <= 1500){
            percentualImposto = 0.10;
        } else if (rendaConjunta <= 2500){
            percentualImposto = 0.15;
        } else {
            percentualImposto = 0.25;
        }

        valorImposto = rendaConjunta * percentualImposto;
        rendaLiquida = rendaConjunta - valorImposto;

        System.out.printf("Renda Conjunta: R$ %.2f%n", rendaConjunta);
        System.out.printf("Percentual do Imposto: %.0f%%%n", percentualImposto * 100);
        System.out.printf("Valor do Imposto a pagar: R$ %.2f%n", valorImposto );
        System.out.printf("Renda Líquida: R$ %.2f%n", rendaLiquida );
        scanner.close();


    }
}
