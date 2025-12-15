/*3. Validação de Dados de Cadastro (Estrutura de Repetição com Validação)

    Em 2025, o sistema de cadastro de novos usuários da FutureDev Academy exige rigorosa validação dos dados de entrada.
    Elabore um programa que solicite e valide o Nome e a Idade de um novo aluno. O programa deve:

1.	Para o Nome, só aceitar a entrada se ele tiver mais de 5 caracteres. Caso contrário, deve exibir uma mensagem
de erro e continuar pedindo o nome até que seja válido.
2.	Para a Idade, só aceitar a entrada se for um valor entre 16 e 99 anos (inclusive). Caso contrário, deve exibir
uma mensagem de erro e continuar pedindo a idade até que seja válida.
3.	Quando ambos os dados estiverem válidos, exibir a mensagem de cadastro concluído. */

import java.util.Scanner;

public class Ex03ValidacaoCadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade = 0;

        do {
            System.out.println("Digite seu nome (minimo 6 caracteres): ");
            nome = scanner.nextLine();
            if (nome.length() <= 5) {
                System.out.println("Nome muito curto. Tente novamente.");
            }
    } while (nome.length() <= 5);

        do{
            System.out.println("Digite sua idade(16 a 99 anos): ");
            idade = scanner.nextInt();
            if(idade < 16 || idade > 99)
            System.out.println("Idade inválida. Tente novamente");
        } while (idade < 16 || idade > 99);
        
        System.out.println("nome: " + nome );
        System.out.println("idade: " + idade );

        scanner.close();

}
}