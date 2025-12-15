import java.util.Scanner;

public class TicketMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double venda;
        int contador = 1;

        while (contador <= 7) {
            System.out.print("\nDigite as vendas do " + contador + "º dia: ");
            venda = scanner.nextDouble();
            soma += venda; // ou soma = soma + nota;
            contador++; // ou contador = contador +1;
            
        }
        double media = soma/(contador - 1);
        System.out.printf("O Total de Vendas calculado foi: R$ %.2f%n", soma);
        System.out.printf("O Ticket Médio calculado foi: R$ %.2f%n", media);
        scanner.close();
    }
}