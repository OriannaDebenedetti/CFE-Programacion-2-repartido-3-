import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro", "Juan"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá un nombre para buscar: ");
        String buscar = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El nombre " + buscar + " se encuentra en el arreglo.");
        } else {
            System.out.println("El nombre " + buscar + " no se encuentra en el arreglo.");
        }
    }
}

