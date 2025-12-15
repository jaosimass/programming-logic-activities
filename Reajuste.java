import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("valor atual do curso: ");
        double valorCurso = scanner.nextDouble();

        double valorNovoCurso = valorCurso *1.075;
        scanner.close();
        System.out.printf("o curso %s passará a custar R$ %.2f%n", nomeCurso, valorNovoCurso);

    }
    
}
