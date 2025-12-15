import java.util.Scanner;

public class ConversorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua idade em número de dias: ");
        int idadeDias = scanner.nextInt();

        int anos = idadeDias / 365;
        int resto = idadeDias % 365;
        
        int meses = resto / 30;
        int dias = resto % 30;

        if (anos > 0 ) {
            System.out.println(anos + " ano(s)");
            
        }

        if (meses > 0) {
            System.out.println(meses + " mes(es)");
            
        }

        if (dias > 0) {
            System.out.println(dias + " dia(s)");
            
        }

        scanner.close();
    }
}
