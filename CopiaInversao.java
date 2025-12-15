public class CopiaInversao {
    public static void main(String[] args) {
        String[] nomes = {"João", "Maria", "Ana", "Pedro", "Luiz"};
        String[] nomesInvertidos = new String[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            nomesInvertidos[i] = nomes[nomes.length - 1 - i];
        }

        System.out.println("Array original:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\nArray invertido:");
        for (String nome : nomesInvertidos) {
            System.out.println(nome);
        }
    }
}