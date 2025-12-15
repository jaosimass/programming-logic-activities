import java.util.Scanner;

public class CrescimentoPop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a população do país A: ");
        double popA = scanner.nextDouble();

        System.out.print("Informe a população do país B: ");
        double popB = scanner.nextDouble();

        int anos = 0;

        while (popA < popB) {
            popA += popA * 0.03;
            popB += popB * 0.015;

            anos++;
        }
        System.out.println("\nSerão necessário " + anos + " anos para que isso aconteça.");
        scanner.close();


    }
}