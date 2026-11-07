
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


    public static int leerValidarCantidad(Scanner scanner) {
        int cantidad;
        do {
            System.out.print("Ingrese la cantidad de mediciones (entre 3 y 20): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                System.out.print("Ingrese la cantidad de mediciones (entre 3 y 20): ");
                scanner.next();
            }
            cantidad = scanner.nextInt();
            if (cantidad < 3 || cantidad > 20) {
                System.out.println("Error: La cantidad de mediciones debe estar entre 3 y 20.");
            }
        } while (cantidad < 3 || cantidad > 20);
        return cantidad;

        public static boolean esTiempoValido(int tiempo) {
        return tiempo >= 20 && tiempo <= 500;
    } /

    public static void cargarTiempos(Scanner scanner, int[] arreglo) {
        System.out.println("\n--- Ingreso de Tiempos de Respuesta ---");
        for (int i = 0; i < arreglo.length; i++) {
            int tiempo;
            do {
                System.out.print("Ingrese el tiempo de la medición " + (i + 1) + " (20 a 500 ms): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un valor numérico entero.");
                    System.out.print("Ingrese el tiempo de la medición " + (i + 1) + " (20 a 500 ms): ");
                    scanner.next();
                }
                tiempo = scanner.nextInt();
                if (!esTiempoValido(tiempo)) {
                    System.out.println("Error: El tiempo debe estar entre 20 y 500 ms. Intente nuevamente.");
                }
            } while (!esTiempoValido(tiempo));
            arreglo[i] = tiempo;
        }
    }

    public static int calcularSuma(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }
     
    public static int contarEnRango(int[] arreglo, int min, int max) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= min && arreglo[i] <= max) {
                contador++;
            }
        }
        return contador;
    }
     
    public static int contarMayoresQue(int[] arreglo, int limite) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > limite) {
                contador++;
            }
        }
        return contador;
    }



    }
}
