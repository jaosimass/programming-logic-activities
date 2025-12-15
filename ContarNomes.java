public class ContarNomes {
    public static void main(String[] args) {
        String[] nomes = {"João", "Maria", "João", "Ana", "João"};
        int contador = 0;
        for (String i : nomes) {
            if (i.equals("João")) {
                contador++;
                
            }
            
        }
        System.out.println("O nome João aparece: " + contador + " vezes.");
    }
}
