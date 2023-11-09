import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Slot2 extends Thread{
    private int tiempo;
    
    public Slot2(int milisegundos){
        this.tiempo = milisegundos;
    }
    
    public void run() {
        while (true) {
            int numero = (int) (Math.random() * (8) + 1);
            String ruta = "src\\Íconos\\" + numero + ".png";
            ImageIcon imageIcon = new ImageIcon(ruta);
            Maquina.Slot2.setIcon(imageIcon);
            try {
                Thread.sleep(this.tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Slot2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
