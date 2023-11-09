
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




//@author Juan Torres
 
public class Maquina extends javax.swing.JFrame {

    Slot1 s1;
    Slot2 s2;
    Slot3 s3;
    
    boolean respuesta1 = false;
    boolean respuesta2 = false;
    boolean respuesta3 = false;
    
    public Maquina() {
        initComponents();
        setTitle("Tragaperras.");
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(255,255,255));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Slot3 = new javax.swing.JLabel();
        Slot1 = new javax.swing.JLabel();
        Slot2 = new javax.swing.JLabel();
        aJugar = new javax.swing.JButton();
        EstadoDelJuego = new javax.swing.JTextField();
        Detener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        Slot3.setBackground(new java.awt.Color(255, 255, 255));
        Slot3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Íconos/7.png"))); // NOI18N
        Slot3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Slot1.setBackground(new java.awt.Color(255, 255, 255));
        Slot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Íconos/1.png"))); // NOI18N
        Slot1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Slot2.setBackground(new java.awt.Color(255, 255, 255));
        Slot2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Íconos/3.png"))); // NOI18N
        Slot2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        aJugar.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        aJugar.setText("¡JUGAR!");
        aJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aJugarActionPerformed(evt);
            }
        });

        EstadoDelJuego.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Detener.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        Detener.setText("DETENER");
        Detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(Slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(Slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(aJugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EstadoDelJuego))
                        .addGap(116, 116, 116)
                        .addComponent(Detener)
                        .addGap(98, 98, 98))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Detener, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(EstadoDelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aJugarActionPerformed
        
        int tiempoMs = 0;
        s1 = new Slot1(tiempoMs);
        s2 = new Slot2(tiempoMs);
        s3 = new Slot3(tiempoMs);
        respuesta1 = false;
        respuesta2 = false;
        respuesta3 = false;
        aJugar.setEnabled(false);
        s1.start();
        s2.start();
        s3.start();
        
    }//GEN-LAST:event_aJugarActionPerformed

    private void DetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetenerActionPerformed
        
        s1.stop();
        s2.stop();
        s3.stop();
        respuesta1=true;
        comprobarResultado();
        respuesta2=true;
        comprobarResultado();
        respuesta3=true;
        comprobarResultado();
        
    }//GEN-LAST:event_DetenerActionPerformed

    public static void main(String args[]) {
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Detener;
    private javax.swing.JTextField EstadoDelJuego;
    public static javax.swing.JLabel Slot1;
    public static javax.swing.JLabel Slot2;
    public static javax.swing.JLabel Slot3;
    private javax.swing.JButton aJugar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

private void comprobarResultado(){
    if(respuesta1 && respuesta2 && respuesta3){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Maquina.class.getName()).log(Level.SEVERE, null, ex);
        }
        aJugar.setEnabled(true);
        if(Slot1.getIcon().toString().equals(Slot2.getIcon().toString()) && Slot1.getIcon().toString().equals(Slot3.getIcon().toString())) {
            JOptionPane.showMessageDialog(null, "Felicitaciones, has ganado!");
            } else {
                JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");
            }
        }
    }
}