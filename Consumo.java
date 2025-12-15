import java.util.Scanner;

public class Consumo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("distância percorrida pelo automóvel: ");
        String distancia = scanner.nextLine();
        System.out.printf("consumo pós %s km: ", distancia );
        double consumoCombustivel = scanner.nextDouble();
        double consumoMédio = Double.parseDouble(distancia) / consumoCombustivel;
        System.out.printf("consumo médio por Km/l é de: %.2f%n", consumoMédio );

        scanner.close();
    }
} 