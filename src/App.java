
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = leerValidarCantidad(scanner);

        int[] tiempos = new int[n];

        cargarTiempos(scanner, tiempos);

        scanner.close();

    }

    
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
    } 

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
    public static int contarMenoresQue(int[] arreglo, double limite) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < limite) {
                contador++;
            }
        }
        return contador;
    }

    
    public static double calcularPromedio(int suma, int totalElementos) {
        if (totalElementos == 0) {
            return 0.0;
        }
        return (double) suma / totalElementos;
    }

    
    public static int buscarMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

   
    public static int buscarPrimeraPosicionMenor(int[] arreglo, int menor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == menor) {
                return i + 1; 
            }
        }
        return -1;
    }

    public static void mostrarResumen(int[] arreglo, int cant20a200, int cantMayores200, int suma, double promedio, int menor, int cantMenoresPromedio, int primeraPosMenor) {
       
        System.out.println(" RESUMEN DE MONITOREO DE RED ");
        
        System.out.println("Listado de tiempos registrados:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("  Medición " + (i + 1) + ": " + arreglo[i] + " ms");
        }
        
        System.out.println("1. Mediciones entre 20 y 200 ms: " + cant20a200);
        System.out.println("2. Mediciones superiores a 200 ms: " + cantMayores200);
        System.out.println("3. Tiempo total acumulado: " + suma + " ms");
        System.out.println("4. Promedio de tiempo de respuesta: " + promedio + " ms");
        System.out.println("5. Menor tiempo registrado: " + menor + " ms");
        System.out.println("6. Mediciones con tiempo inferior al promedio: " + cantMenoresPromedio);
        System.out.println("7. Primera aparición del menor tiempo: Medición número " + primeraPosMenor);
       
 
    }
} 
}
