/*2. Sistema de Pedidos de Lanchonete (Estrutura de Repetição e Decisão)

    A lanchonete "Quero Mais!" implementou um novo sistema de pedidos automatizado. O programa deve processar
o pedido de um cliente até que ele finalize a compra (digitando o código 0). Crie um programa que, para
cada item, receba o código e a quantidade vendida. Ao final, ele deve calcular o total por item e o total
geral do pedido.

Especificação	                                Código	                        Preço (R$)
Sanduíche Gourmet	                             100	                          18,50
Batata Chips	                                 101                 	           5,50
Suco Detox	                                     102                               9,00
Água Mineral	                                 103                               3,00

O sistema deve:
1.	Continuar solicitando código e quantidade até que o código 0 seja digitado.
2.	Ignorar códigos de produto inválidos (exibindo uma mensagem).
3.	Calcular e exibir o total de cada item e o Total Geral do pedido.*/

import java.util.Scanner;

public class Ex02SistemaDePedidos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int cod = 1;
       double valorCod = 0;
       double valorFinal = 0;
       int quantidade = scanner.nextInt();
       

        while (cod != 0) {
            System.out.println("digite o código do pedido: \n Sanduíche Gourmet = 100 \n Batata Chips = 101 \n Suco Detox = 102 \n Água Mineral = 103");
            cod = scanner.nextInt();
            valorCod = 0;
            valorFinal = valorFinal + valorCod;

            valorCod = valorCod ++;
            
        
            if (cod == 100) {
                System.out.println("quantidade: ");
                quantidade = scanner.nextInt();
                valorCod = quantidade * 18.50;
                
            } else if (cod == 101) {
                System.out.println("quantidade: ");
                quantidade = scanner.nextInt();
                valorCod = quantidade * 5.50;
                
            } else if (cod == 102) {
                System.out.println("quantidade: ");
                quantidade = scanner.nextInt();
                valorCod = quantidade * 9.00;
                
            } else if (cod == 103){
                System.out.println("quantidade: ");
                quantidade = scanner.nextInt();
                valorCod = quantidade * 3.00;

            } else if (cod == 0) {
                System.out.println("fim do programa!");
                    System.out.println(valorFinal);
                    break;

            }else {
                System.out.println("codigo invalido!");
            }
            System.out.println(valorCod);
        valorFinal = valorFinal + valorCod;


    }
    scanner.close();
    }
}