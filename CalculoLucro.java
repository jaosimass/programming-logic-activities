import java.util.Scanner;

public class CalculoLucro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorCusto, valorVenda, lucro, lucroTotal = 0;
        int contador = 1;

        while (contador <= 5) {
            System.out.print("\nProduto " + contador + " - valor de custo: R$");
            valorCusto = scanner.nextDouble();
            
            System.out.print("\nProduto" + contador + " - valor de venda: R$");
            valorVenda = scanner.nextDouble();

            lucro = valorVenda - valorCusto;

            lucroTotal += lucro;

            System.out.println("Lucro do produto" + contador + ": R$ " + lucro);
            System.out.printf("\nO percentual do lucro foi de: %.2f%%%n", (lucro / valorCusto) * 100 / lucro );

            contador ++;
            
        }
        System.out.printf("\nLucro total dos 5 produtos: R$ %.2f%n", lucroTotal);

        scanner.close();
    }
}