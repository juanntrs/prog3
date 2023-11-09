import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Slot1 extends Thread{
    private int tiempo;
    
    public Slot1(int milisegundos){
        this.tiempo = milisegundos;
    }
    
    public void run() {
        while (true) {
            int numero = (int) (Math.random() * (8) + 1);
            String ruta = "src\\Íconos\\" + numero + ".png";
            ImageIcon imageIcon = new ImageIcon(ruta);
            Maquina.Slot1.setIcon(imageIcon);
            try {
                Thread.sleep(this.tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Slot1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
