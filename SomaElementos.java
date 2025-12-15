public class SomaElementos {
    public static void main(String[] args) {
        int[] numeros = {33, 15, 20, 25};

        int soma = 0;
        for (int i : numeros) {
            soma += i;
        }
        System.out.println("A soma dos elementos é: " + soma);
    }
    
}
