import java.util.Scanner;

public class Parque {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            double barcaViking = 1.5;
            double elevatorOfDeath = 1.4;
            double finalKiller = 1.7;
            String continuar = "s";

            while(continuar.equals("s")){
             int contador = 0;
                System.out.print("\nInforme sua altura: ");
                double altura = scanner.nextDouble();
                System.out.println("Informe sua idade:\n");
                int idade = scanner.nextInt();

                if(altura >= barcaViking && idade >= 12){               
                contador += 1;
                }
                if(altura >= elevatorOfDeath && idade >= 14){               
                contador += 1;
                }
                if(altura >= finalKiller || idade >= 16){ 
                contador += 1;
                }
                System.out.println("Você pode utilizar: " + contador + " Brinquedos!");
                System.out.print("\nDeseja testar outra pessoa ? Digite S para continuar ou N para encerrar: ");
                continuar = scanner.next().toLowerCase();
            }
            System.out.println("\nFim do programa! ");
        }

    }
}