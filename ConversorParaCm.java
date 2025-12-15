import java.util.Scanner;

public class ConversorParaCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite uma quantidade de metros: ");
        double metros = scanner.nextDouble();
        double centimetros =   metros * 100;
        System.out.printf("convertendo para centímetros, fica: %.2f%n", centimetros);
        scanner.close();
    }
}
