import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int v1 = scanner.nextInt();
        System.out.print("Infome um segundo número inteiro: ");
        int v2 = scanner.nextInt();

        if (v1 > 10 ){
            int soma = v1 + v2;
            System.out.println("A soma dos números informados: " + soma);
        } else {

        int multiplicacao = v1 * v2;
        System.out.print("A multiplicação entre os números informados é igual a: " + multiplicacao);
            
        }
        scanner.close();
    }
    
}
