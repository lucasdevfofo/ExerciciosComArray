import java.util.Random;
public class SomaDeMatriz {

        public static void main(String[] args) {
            // Criando a matriz 3x3 de números reais positivos
            double[][] matriz = new double[3][3];
            Random random = new Random();

            // Preenchendo a matriz com números reais aleatórios entre 1 e 100
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = 1 + (100 - 1) * random.nextDouble(); // Gera um número entre 1 e 100
                }
            }

            // Exibindo a matriz
            System.out.println("Matriz gerada:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%.2f ", matriz[i][j]);
                }
                System.out.println();
            }

            // Calculando e exibindo a soma de cada linha
            for (int i = 0; i < 3; i++) {
                double soma = 0;
                for (int j = 0; j < 3; j++) {
                    soma += matriz[i][j];
                }
                System.out.printf("Soma dos elementos da linha %d: %.2f\n", i + 1, soma);
            }
        }
    }


