import java.util.Scanner;

public class Media02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite sua primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("digite sua segunda nota: ");
        float nota2 = scanner.nextFloat();

        double media = (nota1 + nota2) / 2;
        
        System.out.printf("a média das notas de Lógica de programação foi: %.2f%n", media );
    scanner.close();
    }
}
