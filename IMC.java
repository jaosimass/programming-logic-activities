import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            String continuar;

            do{
            System.out.println("Diga sua altura: ");
            double altura = scanner.nextDouble();
            System.out.println("Diga seu peso: ");
            double peso = scanner.nextDouble();
            double imc = peso / (altura * altura);
            String situacao;

            if (imc < 20.0) {
                situacao = "abaixo do peso";
                
            } else if (imc < 25.0) {
                situacao = "dentro do peso";
                
            } else if (imc < 30.0) {
                situacao = "sobrepeso";
                
            } else if (imc < 40.0) {
                situacao = "obeso";
                
            } else {
                situacao = "obeso mórbido";
            }

            System.out.println("sua situação é: " + situacao);

            System.out.println("\n deseja calcular o IMC de outra pessoa? (S) / (N)");
            continuar = scanner.next();
        
            
        } while ( continuar.equalsIgnoreCase("S"));

            System.out.println("Programa encerrado.");
    }
}
}