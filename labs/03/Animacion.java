
package animation;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Animacion extends JFrame implements Runnable{
    
    int altoV=500;
    int anchoV=500;
    Image img;
    Thread hilo;
    int incremento=0;
    
    public static void main(String [] args){
        new Animacion().setVisible(true);
    }


    public Animacion (){
        setSize(altoV,anchoV);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Animación");
        hilo= new Thread(this);
        Toolkit herramienta=Toolkit.getDefaultToolkit();
        img=herramienta.getImage(getClass().getResource("/animation/max.png"));
        hilo.start();
    }

    @Override
    public void paint(Graphics g) {
       Graphics2D g2D;
       g2D= (Graphics2D)g;
       int mx=(incremento%9)*80;
       g2D.drawImage(img,200,200,200+80,200+140,mx,0,mx+80,140, null,this);
       repaint();
    }

    
    
    
    @Override
    public void run() {
      while (true){
          try {
              Thread.sleep(70); //tiempo que dura una imagen antes de pasar a la siguiente
          } catch (InterruptedException ex) {
              Logger.getLogger(Animacion.class.getName()).log(Level.SEVERE, null, ex);
          }
          incremento=incremento+1;
      }
    }
}