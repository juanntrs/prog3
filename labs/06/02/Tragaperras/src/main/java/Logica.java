
import java.util.logging.Level;
import java.util.logging.Logger;




public class Logica extends Thread {

    @Override
    public void run(){
        int a;
        for(int i=1; i<=100 ; i++){
            a= (int)(Math.random() * 9) + 1;
            System.out.println(a);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}