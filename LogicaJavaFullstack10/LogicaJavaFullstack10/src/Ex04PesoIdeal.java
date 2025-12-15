/*4. ⚖️ Verificação de Peso Ideal por Gênero (Estrutura de Decisão)

    O nutricionista Dr. Vitalis utiliza uma nova fórmula simplificada para calcular o peso ideal dos seus pacientes,
baseada na altura e no gênero.
Desenvolva um programa que receba a Altura (double) e o Gênero (char: 'M' para Masculino, 'F' para Feminino).
    O programa deve calcular o peso ideal e informar se o paciente está no peso ideal, precisa engordar, ou precisa
emagrecer, considerando a tolerância de ±2 Kg do peso ideal.

Gênero	                  Fórmula do Peso Ideal 
Masculino	              (72.7 * altura) - 58
Feminino	              (62.1 * altura) - 44.7        */


import java.util.Scanner;

public class Ex04PesoIdeal {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Informe o gênero ('M' para Masculino, 'F' para Feminino): ");
            char genero = scanner.next().toUpperCase().charAt(0);

            double pesoIdeal = 0.0;
            boolean generoValido = true;

            if (genero == 'M') {
                
                System.out.print("Informe a altura (ex: 1.75): ");
                double altura = scanner.nextDouble();
                
                pesoIdeal = (72.7 * altura) - 58;

            } else if (genero == 'F') {

                System.out.print("Informe a altura (ex: 1.65): ");
                double altura = scanner.nextDouble();

                pesoIdeal = (62.1 * altura) - 44.7;

            } else {
                System.out.println("ERRO: Gênero inválido. Use 'M' ou 'F'.");
                generoValido = false;
            }

            if (generoValido) {
                
                System.out.print("Informe o peso atual (Kg): ");
                double pesoAtual = scanner.nextDouble();

                double limiteInferior = pesoIdeal - 2.0;
                double limiteSuperior = pesoIdeal + 2.0;

                System.out.printf("\nSeu peso ideal é: %.2f Kg\n", pesoIdeal);
                System.out.printf("Faixa de peso ideal (tolerância ± 2 Kg): %.2f Kg a %.2f Kg\n", limiteInferior, limiteSuperior);

                if (pesoAtual >= limiteInferior && pesoAtual <= limiteSuperior) {
                    
                    System.out.println("RESULTADO: Parabéns! Você está no peso ideal.");
                    
                } else if (pesoAtual < limiteInferior) {
                    
                    double diferenca = limiteInferior - pesoAtual;
                    System.out.printf("RESULTADO: Você precisa engordar. Diferença mínima: %.2f Kg\n", diferenca);
                    
                } else { 
                    
                    double diferenca = pesoAtual - limiteSuperior;
                    System.out.printf("RESULTADO: Você precisa emagrecer. Diferença mínima: %.2f Kg\n", diferenca);
                }
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro na leitura dos dados. Certifique-se de usar ponto ou vírgula conforme a configuração do seu sistema.");
        }
    }
}

//essa eu fiz boa parte sozinho, mas tive que pesquisar no google como utilizar algumas coisas, aí depois de muito tempo tentando(umas duas horas só nessa questao KKKKKKKK) aí eu usei o gemini, ele pôs o catch e deu a ideia do genero valido como booleano