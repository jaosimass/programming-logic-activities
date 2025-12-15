import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro referente ao seu saque: R$");
        int valor = scanner.nextInt();
        int valorOriginal = valor;

        int nota100 = valor / 100;
        valor %= 100;

        int nota50 = valor / 50;
        valor %= 50;

        int nota20 = valor / 20;
        valor %= 20;

        int nota10 = valor / 10;
        valor %= 10;

        int nota5 = valor / 5;
        valor %= 5;

        int nota2 = valor / 2;
        valor %= 2;

        int nota1 = valor;
        System.out.println("o valor original informado foi: " + valorOriginal);

        if (nota100 > 0) {
            System.out.println(nota100 + "nota(as) de R$ 100,00");
            
        }

        if (nota50 > 0) {
            System.out.println(nota50 + "nota(as) de R$ 50,00");
            
        }

        if (nota20 > 0) {
            System.out.println(nota20 + "nota(as) de R$ 20,00");
            
        }

        if (nota10 > 0) {
            System.out.println(nota10 + "nota(as) de R$ 10,00");
            
        }

        if (nota5 > 0) {
            System.out.println(nota5 + "nota(as) de R$ 5,00");
            
        }

        if (nota2 > 0) {
            System.out.println(nota2 + "nota(as) de R$ 2,00");
            
        }
        
        if (nota1 > 0) {
            System.out.println(nota1 + "nota(as) de R$ 1,00");

        }
        scanner.close();
    }
}
