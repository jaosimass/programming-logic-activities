import java.util.Scanner;

public class DescontoVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("informe o valor da compra: ");
        double compra = scanner.nextDouble();
        double compraDesconto;

        if (compra > 500){
            double desconto = compra * 0.10;
            compraDesconto = compra - desconto;
            System.out.printf("Desconto de 10%% aplicado! Total a pagar R$ %.2f%n", compraDesconto); 
        } else {
            compraDesconto = compra;
            System.out.printf("Compra abaixo de R$ 500,00, não foi possível aplicar o desconto.Total a pagar %.2f%n", compraDesconto );
        }
        scanner.close();
    }
}
