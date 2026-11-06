import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        String otro;

        do {
            System.out.print("Nombre del producto: ");
            String nombre = teclado.nextLine();

            System.out.print("Precio: ");
            double precio = teclado.nextDouble();

            System.out.print("Cantidad disponible: ");
            int cantidad = teclado.nextInt();
            teclado.nextLine();

            double total = precio * cantidad;

            // true = modo append: no borra los registros anteriores
            try (BufferedWriter escritor =
                         new BufferedWriter(new FileWriter("productos.txt", true))) {
                escritor.write("Producto: " + nombre);
                escritor.newLine();
                escritor.write("Precio: $" + dinero(precio));
                escritor.newLine();
                escritor.write("Cantidad: " + cantidad);
                escritor.newLine();
                escritor.write("Valor total: $" + dinero(total));
                escritor.newLine();
                escritor.write("-----");
                escritor.newLine();
                System.out.println("Valor total: $" + dinero(total));
                System.out.println("Producto guardado en productos.txt");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo.");
            }

            System.out.print("¿Registrar otro producto? (s/n): ");
            otro = teclado.nextLine();
        } while (otro.equalsIgnoreCase("s"));

        teclado.close();
    }

    // Da formato de dinero con dos decimales
    static String dinero(double valor) {
        return String.format(Locale.US, "%.2f", valor);
    }
}
