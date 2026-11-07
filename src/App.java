
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
    }
}
