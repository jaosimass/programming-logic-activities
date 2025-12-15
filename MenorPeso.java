import java.util.Scanner;

public class MenorPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso;
        double menorPeso = 201;
        double maiorPeso = -1;

        while (true) { 
            System.out.print("Informe o seu peso (kg): ");
            peso = scanner.nextDouble();
            if (peso > 200) {
                break;
            }

            if (peso < menorPeso) {
                menorPeso = peso;
            }
            if (peso > maiorPeso) {
                maiorPeso = peso;
            }
                        
        }
        if (maiorPeso == -1) {
            System.out.println("Nenhum peso válido foi informado.");
        } else {
            System.out.println("Menor Peso " + menorPeso + "Kg");
            System.out.println("Maior Peso " + maiorPeso + "Kg");
        }
        scanner.close();

    }
}