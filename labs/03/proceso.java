/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animation;

import static java.lang.Thread.sleep;
import java.awt.Color;
import javax.swing.*;

public class proceso implements Runnable {
    public boolean iterar;
    public JButton rojo;
    public JButton amarillo;
    public JButton verde;
    public JTextField texto;
    public int contador=0, temp1=0, temp2=0, temp3=0, temp4=0;
   
    public proceso(JButton entrada1, JButton entrada2, JButton entrada3, JTextField entrada4){
        this.rojo=entrada1;
        this.amarillo=entrada2;
        this.verde=entrada3;
        this.texto=entrada4;
    }

    @Override
    public void run() {
        while (iterar){
            contador++;
            if (contador>=1 && contador<=20){
                temp1++;
                texto.setText(" "+temp1);
            }
            if(contador==1){
                rojo.setBackground(Color.red);
                amarillo.setBackground(Color.black);
                verde.setBackground(Color.black);
            }
            
            
            if(contador>20 && contador<=23){
                temp2++;
                texto.setText(" "+temp2);
            }
             if(contador==20){
                rojo.setBackground(Color.black);
                amarillo.setBackground(Color.yellow);
                verde.setBackground(Color.black);
            }
             
             
             if(contador>23 && contador<=48){
                temp3++;
                texto.setText(" "+temp3);
            }
             if(contador==23){
                rojo.setBackground(Color.black);
                amarillo.setBackground(Color.black);
                verde.setBackground(Color.green);
            }
            
             
            if(contador>48 && contador<=51){
                temp4++;
                texto.setText(" "+temp4);
            }
             if(contador==48){
                rojo.setBackground(Color.black);
                amarillo.setBackground(Color.yellow);
                verde.setBackground(Color.black);
            }
            if(contador==52){
                contador=0;
                temp1=0;
                temp2=0;
                temp3=0;
                temp4=0;
            }
            try{
                sleep(1000);
            }catch (Exception e){}
        }
    }
    
    public void start(){
        iterar=true;
        new Thread(this).start();
    }
    
}
