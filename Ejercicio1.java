import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            // Se crea el objeto File con el nombre del archivo
            File archivo = new File("curso.txt");

            // createNewFile() devuelve true si lo creó, false si ya existía
            if (archivo.createNewFile()) {
                System.out.println("El archivo se creó correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            // Se muestra el nombre del archivo
            System.out.println("Nombre del archivo: " + archivo.getName());

        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }
}
