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
                Venezolanos temp = new Venezolanos( Integer.parseInt(datosVen[5]), Integer.parseInt(datosVen[4]), Integer.parseInt(datosVen[0]), Integer.parseInt(datosVen[7]));
                venezolanos.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de inmigrantes: " + e.getMessage());
        }
    }
    
    public int[] venePorGenero(){
        int venePorGenero[]=new int [2];
        int i=0;
        while (i<venezolanos.size()){
            Venezolanos temp = venezolanos.get(i);
            
            temp.masculino += temp.masculino;
            temp.femenino += temp.femenino;
        }
        return venePorGenero();
    }
    
    public int[]venePorAnio(){
        int veneAnio[] = new int [8];
        int i=0;
        while(i<venezolanos.size()){
            Venezolanos temp = venezolanos.get(i);
            
            switch (temp,anio){
                case "2012": veneAnio[0] += ();
            }
        }
    }
    
}
