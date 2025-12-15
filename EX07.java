import java.util.Arrays;
import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                numeros[i] = scanner.nextInt();
            }

            Arrays.sort(numeros);

            System.out.println("Array ordenado:");
            for (int i : numeros) {
                System.out.println(i);

            }
            System.out.println("Array em ordem crescente: " + Arrays.toString(numeros));
        }
    }
    
}
