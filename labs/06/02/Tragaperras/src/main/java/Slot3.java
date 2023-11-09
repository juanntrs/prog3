import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Slot3 extends Thread{
    private int tiempo;
    
    public Slot3(int milisegundos){
        this.tiempo = milisegundos;
    }
    
    public void run() {
        while (true) {
            int numero = (int) (Math.random() * (8) + 1);
            String ruta = "src\\Íconos\\" + numero + ".png";
            ImageIcon imageIcon = new ImageIcon(ruta);
            Maquina.Slot3.setIcon(imageIcon);
            try {
                Thread.sleep(this.tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Slot3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
