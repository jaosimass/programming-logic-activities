import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor 1/3: ");
        int valor1 = scanner.nextInt();
        System.out.print("Informe o valor 2/3: ");
        int valor2 = scanner.nextInt();
        System.out.print("informe o valor 3/3: ");
        int valor3 = scanner.nextInt();

        int maior = valor1;
        int menor = valor1;

        if(valor2 > valor1){
            maior = valor2;
        }
        if(valor3 > maior){
            maior = valor3;
        }
        if(valor2 < menor){
            menor = valor2;
        }
        if (valor3 < menor){
            menor = valor3;
        }
        System.out.println("O menor valor informado foi: " + menor);
        System.out.print("O maior valor informado foi: " + maior);
        scanner.close();
    }
}
