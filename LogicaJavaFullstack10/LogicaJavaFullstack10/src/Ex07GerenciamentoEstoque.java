/*7. Gerenciamento de Estoque de Produtos (Utilizando ArrayList)

    A loja de eletrônicos InovaStock precisa de um sistema básico para gerenciar a entrada de novos produtos no estoque.
    Crie um programa em Java que utilize um ArrayList de Strings para armazenar os nomes dos produtos que chegam. O programa deve:

1.	Permitir ao usuário inserir o nome de um produto por vez.
2.	Continuar a pedir nomes de produtos até que o usuário digite a palavra "FIM" (em qualquer combinação de maiúsculas/minúsculas).
3.	Após a entrada, percorrer a lista para exibir:
o	A Lista Completa de todos os produtos cadastrados.
o	O Número Total de produtos cadastrados (tamanho do ArrayList).*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07GerenciamentoEstoque {
    
    public static void main(String[] args) {

        List<String> estoque = new ArrayList<>();
        String nomeProduto;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println(" CADASTRO DE PRODUTOS ");
            System.out.println("Digite o nome do produto (ou FIM para encerrar):");
            
            
            nomeProduto = scanner.nextLine().trim(); 

            while (!nomeProduto.equalsIgnoreCase("FIM")) {
                
                estoque.add(nomeProduto);
                
                System.out.print("Próximo Produto (ou FIM): ");
                nomeProduto = scanner.nextLine().trim();
            }
            
            

            System.out.println("\n--- RELATÓRIO ---");
            
            System.out.println("Produtos Cadastrados:");
            
            System.out.println(estoque); 
            
            System.out.printf("Total de Produtos: %d\n", estoque.size());

        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a entrada de dados.");
        }
    }
}