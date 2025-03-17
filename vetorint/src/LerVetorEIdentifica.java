import java.util.Random;
import java.util.Scanner;

public class LerVetorEIdentifica {
    public static void main(String[] args) {
        // Criando o vetor com 10 elementos inteiros positivos aleatórios
        int[] vetor = new int[10];
        Random random = new Random();

        // Preenchendo o vetor com números inteiros aleatórios entre 1 e 100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        }

        // Exibindo os elementos do vetor
        System.out.println("Vetor gerado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Chamando o método para encontrar o menor e maior número
        encontrarMenorEMaior(vetor);

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

    // Método para encontrar e exibir o menor e o maior número do vetor
    public static void encontrarMenorEMaior(int[] vetor) {
        int menor = vetor[0];
        int maior = vetor[0];

        // Percorrendo o vetor para encontrar o menor e o maior número
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        // Exibindo os resultados
        System.out.println("O menor número do vetor é: " + menor);
        System.out.println("O maior número do vetor é: " + maior);
    }
}
