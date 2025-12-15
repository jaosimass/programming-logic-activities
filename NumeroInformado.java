import java.util.Scanner;

public class NumeroInformado {

    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um número inteiro da sua escolha: ");
        int numero = scanner.nextInt();
 
        System.out.println("o número escolhido foi: " + numero);
        scanner.close();
    }
}