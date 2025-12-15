import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o nome do produto? ");
        String nomeCurso = scanner.nextLine();
        System.out.print("valor atual do produto: ");
        double valorAtual = scanner.nextDouble();
        double valorNovo = valorAtual - (valorAtual * 0.045);
        System.out.printf("O novo valor do produto %s é: %.2f%n", nomeCurso, valorNovo);

        scanner.close();
    }
    
}
