import java.util.Scanner;

public class SistemaMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nota 1º unidade: ");
        double numero1 = scanner.nextDouble();
        System.out.println("nota 2º unidade: ");
        double numero2 = scanner.nextDouble();
        System.out.println("nota 3º unidade: ");
        double numero3 = scanner.nextDouble();
        System.out.println("nota 4º unidade: ");
        double numero4 = scanner.nextDouble();
        double media = (numero1 + numero2 + numero3 + numero4)/4;

        System.out.printf("sua média foi de: %.2f%n", media );

        scanner.close();
    }
}