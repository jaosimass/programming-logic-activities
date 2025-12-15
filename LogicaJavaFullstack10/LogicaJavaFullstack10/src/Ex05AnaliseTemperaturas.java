/*5. Análise de Temperaturas Anuais (Estrutura de Repetição)

    O centro de meteorologia local, Clima-2025, precisa analisar as temperaturas registradas ao longo de um período.
    Crie um programa que receba a temperatura média diária (em °C) durante 15 dias. O programa deve armazenar esses
valores e, ao final, calcular e exibir:

1.	A Maior temperatura registrada.
2.	A Menor temperatura registrada.
3.	A Média das temperaturas.*/

import java.util.Scanner;

public class Ex05AnaliseTemperaturas {

    public static void main(String[] args) {
        
        final int NUMERO_DE_DIAS = 15;
        
        try (Scanner scanner = new Scanner(System.in)) {

            double somaTemperaturas = 0.0;
            double maiorTemperatura = Double.MIN_VALUE; 
            double menorTemperatura = Double.MAX_VALUE; 

            for (int dia = 1; dia <= NUMERO_DE_DIAS; dia++) {
                
                System.out.printf("Informe a temperatura média do dia %d/%d (°C): ", dia, NUMERO_DE_DIAS);
                double temperaturaAtual = scanner.nextDouble();

                somaTemperaturas += temperaturaAtual;

                
                if (temperaturaAtual > maiorTemperatura) {
                    maiorTemperatura = temperaturaAtual;
                }

                if (temperaturaAtual < menorTemperatura) {
                    menorTemperatura = temperaturaAtual;
                }
            }

            double mediaTemperaturas = somaTemperaturas / NUMERO_DE_DIAS;

            System.out.printf("1. Maior temperatura registrada: %.2f °C\n", maiorTemperatura);
            System.out.printf("2. Menor temperatura registrada: %.2f °C\n", menorTemperatura);
            System.out.printf("3. Média das temperaturas: %.2f °C\n", mediaTemperaturas);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida.");
        }
    }
}

//aqui eu pesquisei como usava o "Double.MIN_VALUE e o Double.MAX_VALUE" procurei primeiro se tinha uma forma de otimizar o que fizemos na atividade de "maior numero", essa foi uma das opções que me apareceu, achei a mais utilizavel nesse caso e mais facil tambem, pesquisei e apliquei.