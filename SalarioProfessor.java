import java.util.Scanner;

public class SalarioProfessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        int horas = scanner.nextInt();
        System.out.print("Informe o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        double salario = horas * valorHora;
        System.out.printf("o salário é: %.2f%n", salario, "R$");

        scanner.close();
        
    }
}