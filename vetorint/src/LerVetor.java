import java.util.Random;
import java.util.Scanner;


public class LerVetor {
    public static void main(String[] args) {
            int[] vetor = new int[10];
            Random random = new Random();

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = random.nextInt(100) + 1; // Gera um número entre 1 e 100
            }

            // Exibindo os elementos do vetor
            System.out.println("Vetor gerado: ");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();

            // Criando o scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário um valor para procurar no vetor
            System.out.print("Digite um valor inteiro para procurar no vetor: ");
            int valorProcurado = scanner.nextInt();

            // Procurando o valor no vetor
            boolean encontrado = false;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == valorProcurado) {
                    System.out.println("O valor " + valorProcurado + " foi encontrado no índice " + i);
                    encontrado = true;
                    break; // Sai do loop após encontrar o valor
                }
            }

            // Se o valor não foi encontrado
            if (!encontrado) {
                System.out.println("O valor " + valorProcurado + " não existe no vetor.");
            }

            // Fechar o scanner
            scanner.close();
        }
    }


