import java.io.PrintWriter;
import java.io.IOException;

public class EscribirMeses {
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        try (PrintWriter pw = new PrintWriter("Meses.txt")) {
            for (String mes : meses) {
                pw.println(mes);
            }
            System.out.println("EXITO: Se creó el arrchivo correctamente");
        }

        catch (IOException e) {
            System.err.println("ERROR: No se creo el archivo: " + e.getMessage());
        }
    }
}