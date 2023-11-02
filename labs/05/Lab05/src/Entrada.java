import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrada {
    private List<Venezolanos> venezolanos;
    
    public Entrada(){
        muertos = new ArrayList<>();
        cargarDesdeArchivo();
    }
    
    private void cargarDesdeArchivo(){
        try (Scanner scanner = new Scanner(new File("muertes.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosVen = scanner.nextLine().split(",");
                Venezolanos temp = new Venezolanos(datosVen[2], datosVen[7], Integer.parseInt(datosVen[8]));
                venezolanos.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
}
