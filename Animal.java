import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira característica: (vertebrado/invertebrado): ");
        String class1 = scanner.nextLine().toLowerCase();
        
        System.out.println("Digite a segunda característica: (ave/mamifero/inseto/anelideo)");
        String class2 = scanner.nextLine().toLowerCase();

        System.out.println("Digite a terceira característica: (carnivoro/onivoro/herbivoro/hematofago)");
        String class3 = scanner.nextLine().toLowerCase();

        String animal = "";

        if (class1.equals("vertebrado")) {
            if (class2.equals("ave")) {
                if (class3.equals("carnivoro")) {
                    animal = "Águia";
                } else if (class3.equals("onivoro")) {
                    animal = "Pomba";
                }
                
            } else if (class2.equals("mamifero")) {
                if (class3.equals("onivoro")) {
                    animal = "Homem";
                    
                } else if (class3.equals("herbivoro")) {
                    animal = "Vaca";
                } 
            }

        } else if (class1.equals("invertebrado")) {
            if (class2.equals("inseto")) {
                if (class3.equals("hematofago")) {
                    animal = "pulga";
                

                } else if (class3.equals("herbivoro")) {
                    animal = "lagarta";
                    
                }
            } else if (class2.equals("anelideo")) {
                if (class3.equals("hematofago")) {
                    animal = "sanguessuga";
                    
                } else if (class3.equals("onivoro")) {
                    animal = "minhoca";
                    
                }
            }
        }      
        
        if (!animal.isEmpty()) {
            System.out.println("\nO animal é: " + animal);
        } else {
            System.out.println("\nCombinação de características inválida!");
        }
        scanner.close();
    }
}
