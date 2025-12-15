/*1. Cálculo de Reajuste Salarial com Base no Risco de Mercado (Estrutura de Decisão)

    A empresa TechFuture Labs decidiu reajustar o salário de seus desenvolvedores com base no
seu nível de experiência e a faixa salarial atual, para combater o risco de perda de 
talentos para a concorrência em 2025. O salário mínimo atual é de R$ 1.518,00.
Crie um programa que receba o salário atual de um colaborador (em double) e aplique
o reajuste conforme a tabela abaixo:

Faixa Salarial (Salário Atual)	                 Percentual de Aumento
Até R$ 3.500,00 (inclusive)	                            12%
De R$ 3.500,01 até R$ 8.000,00 (inclusive)	             8%
Acima de R$ 8.000,00	                                 5%

O programa deve calcular e exibir:
1.	O salário original.
2.	O percentual de aumento aplicado.
3.	O valor do aumento.
4.	O novo salário reajustado.*/

import java.util.Scanner;

public class Ex01ReajusteSalarial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o valor do sálario: ");
            double salario = scanner.nextDouble();
            double novoSalario = 0;

            if (salario >= 1518.00 && salario <= 3500.00 ) {
                System.out.println("o salário atual é: " + salario );

                double valorAumento1 = salario * 0.12;
                novoSalario = salario + valorAumento1;
                System.out.println("o funcionário terá um aumento de 12% ("+ valorAumento1 + ") ");
                System.out.println("novo salário = " + novoSalario);
                
            } else if (salario > 3500.00 && salario <= 8000.00) {
                System.out.println("o salário atual é: " + salario );

                double valorAumento2 = salario * 0.08;
                novoSalario = salario + valorAumento2;
                System.out.println("o funcionário terá um aumento de 8% ("+ valorAumento2 + ") ");
                System.out.println("novo salário = " + novoSalario);
                
                
            } else if (salario > 8000.00 ) {
                System.out.println("o salário atual é: " + salario );

                double valorAumento3 = salario * 0.05;
                novoSalario = salario + valorAumento3;
                System.out.println("o funcionário terá um aumento de 5% ("+ valorAumento3 + ") ");
                System.out.println("novo salário = " + novoSalario);
                
            } else {
                System.out.println("salário inválido!");
            }

            scanner.close();
            }
        }
    
    

