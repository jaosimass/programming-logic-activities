/*EX35 – Maior e Menor Venda
Uma empresa deseja saber qual foi o maior e o menor valor das
10 vendas feitas em um dia, admita não existirem valores iguais.
Elabore um programa que receba os 10 valores de vendas em um dia e
ao final exibir a que tem o maior e o menor valor. */


import java.util.Scanner;

public class MaiorMenorVWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        double venda;
        double maiorVenda = Double.MIN_VALUE;
        double menorVenda = Double.MAX_VALUE;
        
        while (contador <= 10) {
            System.out.print("Venda " + contador + ": R$ ");
            venda = scanner.nextDouble();
            if (venda > maiorVenda) {
                maiorVenda = venda;
            }
            if (venda < menorVenda) {
                menorVenda = venda;
            }

            contador++;
        }
        System.out.printf("Maior Venda do dia: R$ %.2f%n", maiorVenda);
        System.out.printf("Menor Venda do dia: R$ %.2f%n", menorVenda);
        scanner.close();

    }
}