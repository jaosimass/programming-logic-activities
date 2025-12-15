import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("informe um numero: ");
            int numero1 = scanner.nextInt();
                System.out.println("informe o segundo número: ");
            int numero2 = scanner.nextInt();
            int soma = numero1 + numero2;
                System.out.println("a soma dos dois números é de: " + soma);

        scanner.close();
    }
}
