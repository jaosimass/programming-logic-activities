import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade em estoque: ");
        int produto = scanner.nextInt();
        if(produto < 10){
            System.out.println("O produto deve ser reabastecido.");
        }else{
            System.out.println("Estoque suficiente! Sem necessidade de reabastecimento.");
        }
        scanner.close();
    }
}
