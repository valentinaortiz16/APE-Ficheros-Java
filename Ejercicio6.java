import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        double acumulado = 0;

        try (BufferedWriter escritor =
                     new BufferedWriter(new FileWriter("ventas.txt", true))) {

            while (true) {
                System.out.print("Producto (escriba fin para terminar): ");
                String nombre = teclado.nextLine();
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Precio: ");
                double precio = teclado.nextDouble();
                System.out.print("Cantidad vendida: ");
                int cantidad = teclado.nextInt();
                teclado.nextLine();

                double subtotal = precio * cantidad;
                double descuento = 0;
                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }
                double total = subtotal - descuento;
                acumulado += total;

                System.out.println("Subtotal: $" + dinero(subtotal));
                System.out.println("Descuento: $" + dinero(descuento));
                System.out.println("Total a pagar: $" + dinero(total));

                escritor.write("Producto: " + nombre
                        + " | Subtotal: $" + dinero(subtotal)
                        + " | Descuento: $" + dinero(descuento)
                        + " | Total: $" + dinero(total));
                escritor.newLine();
            }

            escritor.write("TOTAL ACUMULADO DE VENTAS: $"
                    + dinero(acumulado));
            escritor.newLine();
            System.out.println("Total acumulado de ventas: $"
                    + dinero(acumulado));

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }

        teclado.close();
    }

    // Da formato de dinero con dos decimales
    static String dinero(double valor) {
        return String.format(Locale.US, "%.2f", valor);
    }
}
