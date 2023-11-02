import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Entrada {

    private List<Venezolano> venezolanos;

    public Entrada() {
        venezolanos = new ArrayList<>();
        cargarDesdeArchivo();
    }

    private void cargarDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("venezolanos.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosVenezolanos = scanner.nextLine().split(",");
                Venezolano temp = new Venezolano(Integer.parseInt(datosVenezolanos[0]), Integer.parseInt(datosVenezolanos[5]), Integer.parseInt(datosVenezolanos[7]));
                venezolanos.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
    
    public int[] venezolanosPorAnioTodos(){
        int venezolanosAnio[] = new int [12];
        int i=0;
        while (i<venezolanos.size()){
            Venezolano temp = venezolanos.get(i);
            
            switch (temp.anio) {
                case 2012:
                    venezolanosAnio[0] += temp.total;
                    break;
                case 2013:
                    venezolanosAnio[1] += temp.total;
                    break;
                case 2014:
                    venezolanosAnio[2] += temp.total;
                    break;
                case 2015:
                    venezolanosAnio[3] += temp.total;
                    break;
                case 2016:
                    venezolanosAnio[4] += temp.total;
                    break;
                case 2017:
                    venezolanosAnio[5] += temp.total;
                    break;
                case 2018:
                    venezolanosAnio[6] += temp.total;
                    break;
                case 2019:
                    venezolanosAnio[7] += temp.total;
                    break;
                case 2020:
                    venezolanosAnio[8] += temp.total;
                    break;
                case 2021:
                    venezolanosAnio[9] += temp.total;
                    break;
                case 2022:
                    venezolanosAnio[10] += temp.total;
                    break;
                case 2023:
                    venezolanosAnio[11] += temp.total;
                    break;
                default:
                    break;
            }
            i++;
        }
        return venezolanosAnio;
    }
    
    public int[] venezolanosPorAnioHombre() {
        int venezolanosAnio[] = new int[12];
        int i = 0;
        while (i < venezolanos.size()) {
            Venezolano temp = venezolanos.get(i);

            switch (temp.anio) {
                case 2012:
                    venezolanosAnio[0] += temp.hombres;
                    break;
                case 2013:
                    venezolanosAnio[1] += temp.hombres;
                    break;
                case 2014:
                    venezolanosAnio[2] += temp.hombres;
                    break;
                case 2015:
                    venezolanosAnio[3] += temp.hombres;
                    break;
                case 2016:
                    venezolanosAnio[4] += temp.hombres;
                    break;
                case 2017:
                    venezolanosAnio[5] += temp.hombres;
                    break;
                case 2018:
                    venezolanosAnio[6] += temp.hombres;
                    break;
                case 2019:
                    venezolanosAnio[7] += temp.hombres;
                    break;
                case 2020:
                    venezolanosAnio[8] += temp.hombres;
                    break;
                case 2021:
                    venezolanosAnio[9] += temp.hombres;
                    break;
                case 2022:
                    venezolanosAnio[10] += temp.hombres;
                    break;
                case 2023:
                    venezolanosAnio[11] += temp.hombres;
                    break;
                default:
                    break;
            }
            i++;
        }
        return venezolanosAnio;
    }
    
    
}
