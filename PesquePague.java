import java.util.Scanner;

public class PesquePague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o peso pescado: ");
        double peso = scanner.nextDouble();


        if(peso > 50){
        double excesso = peso - 50;
        double multa = excesso * 4;
        System.out.printf("a o excesso foi de %f Kg e a multa é de R$ %.2f%n", excesso, multa);
        } else {
            System.out.println("Peso nos padrões!");
        }
        scanner.close();

    }
    
}
