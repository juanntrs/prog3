package Clases;

import Interfaz.Maquina;
import javax.swing.SwingUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Slot1 extends Thread {

    private int tiempo;
    private Maquina maquina;
    private volatile boolean ejecutar = true;

    public Slot1(int milisegundos, Maquina maquina) {
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
                    maquina.Slot1.setIcon(imageIcon);

                }
            });
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Slot1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void detener() {
        ejecutar = false;
    }
}
