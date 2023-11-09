//@author Juan Torres
 
public class Tragadolares extends Thread {

@Override
public void run(){
    int a;
    a = (int) Math.random();
    
    for(int i=1; i<=8 ; i++){
        System.out.println(a);
    }
}
    
}
