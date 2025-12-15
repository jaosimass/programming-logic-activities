import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um valor(1/3): ");
        int v1 = scanner.nextInt();
        System.out.print("digite um segundo valor(2/3): ");
        int v2 = scanner.nextInt();
        System.out.print("digite um último valor(3/3): ");
        int v3 = scanner.nextInt();

        int auxiliar;

        if(v1 < v2){
            auxiliar = v1;
            v1 = v2;
            v2 = auxiliar;
        }
        if (v2 < v3){
            auxiliar = v2;
            v2 = v3;
            v3 = auxiliar;
        }        
                if(v1 < v2){
            auxiliar = v1;
            v1 = v2;
            v2 = auxiliar;
        }    
            System.out.println("Números em ordem decrescente: "+ v1 + ", " + v2 + ", " + v3 + ". ");
            scanner.close();
    }
}
