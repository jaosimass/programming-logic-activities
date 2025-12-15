import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número para ver sua tabuada");
        int num = scanner.nextInt() ;
        int contador = 1;

        while ( contador <= 10 ) {
            System.out.println(num + " X " + contador + " = " + (num * contador));
            contador++;

        }
        scanner.close();
    }
}
