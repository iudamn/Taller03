import java.io.FileWriter;
import java.io.IOException;

public class Eje {
    public static void main(String[] args) {

    }

    public static void inicio(){
        final String nombreDeArchivo = "./files/archivo.csv";
        crearArchivoCSV(nombreDeArchivo);
    }

    private static void crearArchivoCSV(String nombreDeArchivo) {
        // this also can be "\t" for tab delimitador
        crearArchivoCSV(nombreDeArchivo, ",");
    }

    private static void crearArchivoCSV(String file, String delim) {
        final String NEXT_LINE = "\n";
        try {
            FileWriter fw = new FileWriter(file);

            fw.append("testing").append(delim);
            fw.append("123").append(NEXT_LINE);

            fw.append("value1");
            fw.append(delim);
            fw.append("312");
            fw.append(NEXT_LINE);

            fw.append("anotherthing,888\n");

            fw.flush();
            fw.close();
        } catch (IOException e) {
            // Error al crear el archivo, por ejemplo, el archivo
            // está actualmente abierto.
            e.printStackTrace();
        }
    }
}
