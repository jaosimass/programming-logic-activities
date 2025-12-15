import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Digite o número de meses: ");
        int meses = scanner.nextInt();

        double taxaJuros = 0.05;

        double valorJuros = valorEmprestimo * taxaJuros * meses;
        double totalPagar = valorEmprestimo + valorJuros;

        System.out.printf("total a pagar pós %d meses: R$ %.2f%n ", meses, totalPagar);
        scanner.close();
    }
    
}
