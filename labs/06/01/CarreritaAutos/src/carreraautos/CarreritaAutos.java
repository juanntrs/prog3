package carreraautos;




import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JSlider;


public class CarreritaAutos extends Thread {

    private JLabel carro;
    private Piques window;
    private JSlider velocidad = null;
    private String nombreCarro;

    public CarreritaAutos(JLabel carro, Piques window, String Nombre ) {
        this.carro = carro;
        this.window = window;
        this.nombreCarro = Nombre;
        
    }

    public CarreritaAutos(JLabel carro, Piques window, String Nombre, JSlider velocidad) {
        this.carro = carro;
        this.window = window;
        this.velocidad = velocidad;
        this.nombreCarro = Nombre;
    }
    
    

    @Override
    public void run() {
        while (true) {
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(CarreritaAutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            int velocidadCarro = velocidad != null ? velocidad.getValue() : 10;
            
            if (carro.getLocation().x < window.getMeta().getLocation().x - velocidadCarro) {
                carro.setLocation(carro.getLocation().x + velocidadCarro, carro.getLocation().y);
                window.repaint();
            } else {
                System.out.println(nombreCarro);
                window.carreraFinalizada(nombreCarro);
                break;
            }
        }
    }
}
