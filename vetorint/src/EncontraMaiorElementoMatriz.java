import java.util.Random;

public class EncontraMaiorElementoMatriz {
        public static void main(String[] args) {
            // Criando a matriz 5x5 de inteiros
            int[][] matriz = new int[5][5];
            Random random = new Random();

            // Preenchendo a matriz com números inteiros aleatórios entre -100 e 100
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    matriz[i][j] = random.nextInt(201) - 100; // Gera um número entre -100 e 100
                }
            }

            // Exibindo a matriz gerada
            System.out.println("Matriz gerada:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            // Encontrando o maior elemento da matriz
            int maior = matriz[0][0];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                }
            }

            // Exibindo o maior elemento da matriz
            System.out.println("O maior elemento da matriz é: " + maior);
        }
    }
