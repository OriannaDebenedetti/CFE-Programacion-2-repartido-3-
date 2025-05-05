import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();

        // Crear una matriz 3x3
        int[][] matriz = new int[3][3];

        // Llenar la matriz con números aleatorios entre 1 y 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(9) + 1;  // Números entre 1 y 9
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        // Calcular la suma de cada fila
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma fila " + (i + 1) + ": " + sumaFila);
        }
    }
}
