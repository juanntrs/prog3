package Interfaz;

import Clases.Slot1;
import Clases.Slot2;
import Clases.Slot3;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Maquina extends javax.swing.JFrame {

    Slot1 s1;
    Slot2 s2;
    Slot3 s3;

    boolean respuesta1 = false;
    boolean respuesta2 = false;
    boolean respuesta3 = false;

    public Maquina() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Juego Tragamonedas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Detener2 = new javax.swing.JButton();
        Detener3 = new javax.swing.JButton();
        Detener1 = new javax.swing.JButton();
        Slot3 = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        Slot2 = new javax.swing.JLabel();
        Slot1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Mensaje = new javax.swing.JTextField();
        DetenerTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Detener2.setBackground(new java.awt.Color(255, 0, 0));
        Detener2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Detener2.setText("DETENER");
        Detener2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Detener2ActionPerformed(evt);
            }
        });
        jPanel1.add(Detener2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 150, 40));

        Detener3.setBackground(new java.awt.Color(255, 0, 0));
        Detener3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Detener3.setText("DETENER");
        Detener3.setToolTipText("");
        Detener3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Detener3ActionPerformed(evt);
            }
        });
        jPanel1.add(Detener3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 150, 40));

        Detener1.setBackground(new java.awt.Color(255, 0, 0));
        Detener1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Detener1.setText("DETENER");
        Detener1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Detener1ActionPerformed(evt);
            }
        });
        jPanel1.add(Detener1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 150, 40));

        Slot3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.png"))); // NOI18N
        Slot3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));
        jPanel1.add(Slot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 150, 150));

        Iniciar.setBackground(new java.awt.Color(0, 255, 0));
        Iniciar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Iniciar.setText("¡A JUGAR!");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 260, 40));

        Slot2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N
        Slot2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));
        jPanel1.add(Slot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 150, 150));

        Slot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        Slot1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 3));
        jPanel1.add(Slot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 150, 150));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRAGAMONEDAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        Mensaje.setEditable(false);
        Mensaje.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 550, 50));

        DetenerTodos.setBackground(new java.awt.Color(255, 0, 51));
        DetenerTodos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DetenerTodos.setText("DETENER TODOS");
        DetenerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetenerTodosActionPerformed(evt);
            }
        });
        jPanel1.add(DetenerTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        Mensaje.setText(" ");
        
        int tiempoMilisegundos = 0;
        s1 = new Slot1(tiempoMilisegundos, this);
        s2 = new Slot2(tiempoMilisegundos, this);
        s3 = new Slot3(tiempoMilisegundos, this);
        respuesta1 = false;
        respuesta2 = false;
        respuesta3 = false;
        Iniciar.setEnabled(false);
        s1.start();
        s2.start();
        s3.start();
    }//GEN-LAST:event_IniciarActionPerformed

    private void Detener1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Detener1ActionPerformed
        s1.detener();
        respuesta1 = true;
        comprobarResultado();
    }//GEN-LAST:event_Detener1ActionPerformed

    private void Detener2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Detener2ActionPerformed
        s2.detener();
        respuesta2 = true;
        comprobarResultado();
    }//GEN-LAST:event_Detener2ActionPerformed

    private void Detener3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Detener3ActionPerformed
        s3.detener();
        respuesta3 = true;
        comprobarResultado();
    }//GEN-LAST:event_Detener3ActionPerformed

    private void DetenerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetenerTodosActionPerformed
        s1.detener();
        respuesta1 = true;
        comprobarResultado();
        
        s2.detener();
        respuesta2 = true;
        comprobarResultado();
        
        s3.detener();
        respuesta3 = true;
        comprobarResultado();
    }//GEN-LAST:event_DetenerTodosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Detener1;
    private javax.swing.JButton Detener2;
    private javax.swing.JButton Detener3;
    private javax.swing.JButton DetenerTodos;
    private javax.swing.JButton Iniciar;
    private javax.swing.JTextField Mensaje;
    public javax.swing.JLabel Slot1;
    public javax.swing.JLabel Slot2;
    public javax.swing.JLabel Slot3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void comprobarResultado() {
        if (respuesta1 && respuesta2 && respuesta3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Maquina.class.getName()).log(Level.SEVERE, null, ex);
            }
            Iniciar.setEnabled(true);
            if (Slot1.getIcon().toString().equals(Slot2.getIcon().toString()) && Slot1.getIcon().toString().equals(Slot3.getIcon().toString())) {
                Mensaje.setText("¡Ganó el premio mayor!\n¡FELICITACIONES!");
            }else if(Slot1.getIcon().toString().equals(Slot2.getIcon().toString()) 
            || Slot1.getIcon().toString().equals(Slot3.getIcon().toString()) 
            || Slot2.getIcon().toString().equals(Slot3.getIcon().toString())){
                Mensaje.setText("¡Uy casi!\n¡SIGUE INTENTÁNDOLO!");
            } else {
                Mensaje.setText("¡SIGUE JUGANDO PARA OBTENER EL PREMIO MAYOR!");
            }
        }

    }
}
