import java.util.Arrays;
import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tamanho = 6;
            int[] arrayOriginal = new int[tamanho];
            int[] arrayMultiplicar = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Numero " + (i + 1) + ": ");
                arrayOriginal[i] = scanner.nextInt();
            }
            System.out.print("Informe o núemro (escalar) pelo qual deseja multiplicar: ");
            int escalar = scanner.nextInt();

            for (int i = 0; i < tamanho; i++) {
                arrayMultiplicar[i] = arrayOriginal[i] * escalar;
                System.out.println(arrayMultiplicar[i]);
            }

            System.out.println("Novo Array " + Arrays.toString(arrayMultiplicar));

        }

    }
}