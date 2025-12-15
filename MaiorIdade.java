import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int menorIdade = 201;
        int maiorIdade = -1;

        while (true) { 
            System.out.print("Informe a sua idade: ");
            idade = scanner.nextInt();
            if (idade == 100) {
                break;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
                        
        }
        if (maiorIdade == -1) {
            System.out.println("Nenhum peso válido foi informado.");
        } else {
            System.out.println("Menor idade " + menorIdade );
            System.out.println("Maior idade " + maiorIdade );
        }
        scanner.close();

    }
}