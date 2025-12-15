import java.util.Scanner;
public class GeradorNumeros2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in) ;
       System.out.print("Digite um número inteiro: ");
       int numero = scanner.nextInt();
       //String resposta = "";

       for (int i = 1; i <= 6; i++) {
        System.out.print(numero + i + ", ");
        //resposta = resposta + (numero +i)+",";
        
       }
       scanner.close();
       //System.out.println(resposta);
    }
}