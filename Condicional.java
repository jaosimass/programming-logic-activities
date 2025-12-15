import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Informe sua idade: ");
            int idade = scan.nextInt();
            String classicacao;

            if (idade > 0 && idade <= 6) {
                classicacao = "Primeira infância.";
            } else if (idade > 6 && idade <= 12) {
                classicacao = "Pré Adolescente.";
            } else if (idade > 12 && idade <= 18) {
                classicacao = "Adolescente.";
            } else if (idade > 18 && idade <= 60) {
                classicacao = "Adulto.";
            } else if (idade > 60 && idade < 80) {
                classicacao = "Idoso.";
            } else if (idade >= 80) {
                classicacao = "Super Idoso.";
            } else {
                classicacao = "Idade Inválida.";
            }
            System.out.println(classicacao);
        }

    }
}