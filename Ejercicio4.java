import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try (BufferedWriter escritor =
                     new BufferedWriter(new FileWriter("estudiantes.txt"))) {

            for (int i = 1; i <= 3; i++) {
                System.out.println("Estudiante " + i);

                System.out.print("Nombre: ");
                String nombre = teclado.nextLine();

                System.out.print("Calificación: ");
                String calificacion = teclado.nextLine();

                // Cada estudiante ocupa dos líneas
                escritor.write(nombre);
                escritor.newLine();
                escritor.write(calificacion);
                escritor.newLine();
            }

            System.out.println("Datos guardados en estudiantes.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }

        teclado.close();
    }
}
