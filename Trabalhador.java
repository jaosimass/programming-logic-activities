import java.util.Scanner;

public class Trabalhador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("qual o valor do salário? ");
        double salario = scanner.nextDouble();
        
        if(salario < 1100){
            double salario1 = salario + (salario * 0.10);
            System.out.printf("o funcionário terá um salário de: R$ %.2f%n", salario1);

        } else if (salario >= 1100 && salario <= 2000){
            double salario2 = salario + (salario * 0.07);
            System.out.printf("o funcionário terá um salário de: R$ %.2f%n", salario2);

        } else {
            double salario3 = salario + (salario * 0.05);
            System.out.printf("o funcionário terá um salário de: R$ %.2f%n", salario3);

        }
        scanner.close();

    }
    
}
