/*6. Análise de Temperaturas em uma Semana (Utilizando Array)

    O centro de meteorologia ClimaTech 2025 monitorou a temperatura de uma cidade durante uma semana (7 dias).
    Crie um programa em Java que use um Array de 7 posições para armazenar as temperaturas médias diárias
(em graus Celsius, inteiros) de segunda a domingo. O programa deve:

1.	Receber as 7 temperaturas do usuário.
2.	Armazenar as temperaturas no array.
3.	Ao final, percorrer o array para calcular e exibir:
o	A Maior temperatura registrada.
o	A Menor temperatura registrada.
o	A Soma total das temperaturas.
o	A Média Aritmética das temperaturas.*/

import java.util.Scanner;

public class Ex06AnaliseTemperaturaArray {
    
    public static void main(String[] args) {

        final int NUMERO_DIAS = 7;
        int[] temperaturas = new int[NUMERO_DIAS];
        
        int maiorTemperatura; 
        int menorTemperatura;
        int somaTemperaturas = 0; 

        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < NUMERO_DIAS; i++) {
                
                System.out.printf("Informe a temperatura do dia %d/%d (°C - inteiro): ", i + 1, NUMERO_DIAS);
                temperaturas[i] = scanner.nextInt();
            }

            maiorTemperatura = temperaturas[0];
            menorTemperatura = temperaturas[0];
            
            
            for (int temperatura : temperaturas) {
                
                somaTemperaturas += temperatura;
                
                if (temperatura > maiorTemperatura) {
                    maiorTemperatura = temperatura;
                }
                
                if (temperatura < menorTemperatura) {
                    menorTemperatura = temperatura;
                }
            }
            
            double mediaTemperaturas = (double) somaTemperaturas / NUMERO_DIAS;

            System.out.printf("1. Maior temperatura registrada: %d °C\n", maiorTemperatura);
            System.out.printf("2. Menor temperatura registrada: %d °C\n", menorTemperatura);
            System.out.printf("3. Soma total das temperaturas: %d °C\n", somaTemperaturas);
            System.out.printf("4. Média Aritmética das temperaturas: %.2f °C\n", mediaTemperaturas);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida.");
        }
    }
}