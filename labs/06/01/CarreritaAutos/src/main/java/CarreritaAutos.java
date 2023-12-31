import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class CarreritaAutos extends Thread {
    
    private final JLabel carro;
    private Piques window;
    private final String nombreCarro;
    
    public CarreritaAutos (JLabel carro, Piques Window, String Nombre){
        this.carro = carro;
        this.window = window;
        this.nombreCarro = Nombre;
    }
    
    
    
    @Override
    public void run(){
        while(true){
            try{
                sleep((int) (Math.random()*1000));
            } catch (InterruptedException ex){
                Logger.getLogger(CarreritaAutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            if (carro.getLocation().x < window.getMeta().getLocation().x) {
                carro.setLocation(carro.getLocation().x, carro.getLocation().y);
                window.repaint();
            } else {
                System.out.println(nombreCarro);
                Piques.carreraFinalizada(nombreCarro);
                break;
            }
        }
    }
}
