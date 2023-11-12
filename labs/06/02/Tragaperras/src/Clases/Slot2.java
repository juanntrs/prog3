package Clases;

import Interfaz.Maquina;
import javax.swing.SwingUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Slot2 extends Thread {

    private int tiempo;
    private Maquina maquina;
    private volatile boolean ejecutar = true;

    public Slot2(int milisegundos, Maquina maquina) {
        this.tiempo = milisegundos;
        this.maquina = maquina;
    }

    public void run() {
        while (ejecutar) {
            int num = (int) (Math.random() * (8) + 1);
            String ruta = "src\\Imagenes\\" + num + ".png";
            ImageIcon imageIcon = new ImageIcon(ruta);

            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    maquina.Slot2.setIcon(imageIcon);

                }
            });
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Slot2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void detener() {
        ejecutar = false;
    }
}
