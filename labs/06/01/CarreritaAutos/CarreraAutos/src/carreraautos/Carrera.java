/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreraautos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author conej
 */
public class Carrera extends Thread {
    private JLabel eti;
    private JframeAuto p; 
    
    public Carrera(JLabel eti, JframeAuto p){
        this.eti=eti;
        this.p=p;
    }
    @Override
    public void run(){
        int c1=0, c2=0, c3=0;
        while (true) {
                try {
                    sleep((int)(Math.random()*1000));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
                }
                c1=p.getlbl1().getLocation().x;
                c2=p.getlbl2().getLocation().x;
                c3=p.getlbl3().getLocation().x;
                if(c1<p.getlbl_barrera().getLocation().x-10&&c2<p.getlbl_barrera().getLocation().x-10&&c3<p.getlbl_barrera().getLocation().x-10){
                    
                    
                    
                    
                    
                    
                    
                    
                    eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                    p.repaint();
            }else
            {
                    break;
                    }
        }
        if (eti.getLocation().x>=p.getlbl_barrera().getLocation().x-10){
            if(c1>c2&&c1>c3){
                JOptionPane.showMessageDialog(null, "Gano 1");
            }else if(c2>c1&&c2>c3){
                JOptionPane.showMessageDialog(null, "Gano 2");
            }else if(c3>c1&&c3>c2){
                JOptionPane.showMessageDialog(null, "Gano 3");
            }else{
                
                JOptionPane.showMessageDialog(null, "Empate");
            }
            
        }
}
}