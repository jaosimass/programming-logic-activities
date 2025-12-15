import java.util.Scanner;

public class MaiorMenorVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vendas;
        double menorVenda = Double.MAX_VALUE;
        double maiorVenda = -1;
        for (int i = 1; i <= 10; i++) {

            System.out.print("Valor do " + i + "º dia de vendas: ");
            vendas = scanner.nextDouble();

            if (vendas < menorVenda) {
                menorVenda = vendas;
            }
            if (vendas > maiorVenda) {
                maiorVenda = vendas;
            }
            
        }
        System.out.printf("Maior Venda do dia: R$ %.2f%n", maiorVenda);
        System.out.printf("Menor Venda do dia: R$ %.2f%n", menorVenda);
        scanner.close();

    }
}