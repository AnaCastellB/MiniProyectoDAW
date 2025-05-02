import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerMeses {
    public static void main(String[] args) {
        File archivo = new File("Meses.txt");

        try (Scanner scanner = new Scanner(archivo)) {
            System.out.println("EXITO: Archivo encontrado");

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.err.println("ERROR: No se encontró el archivo " + archivo.getName());
            e.printStackTrace();
        }
    }
}