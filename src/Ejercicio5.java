import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear la matriz 4x4
        int[][] matriz = new int[4][4];
        
        System.out.println("Ingresa los elementos de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento en fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la diagonal principal
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}

