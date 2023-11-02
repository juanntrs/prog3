import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Interfaz extends javax.swing.JFrame {

    Entrada entrada = new Entrada();
    
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Mujeres = new javax.swing.JRadioButton();
        Hombres = new javax.swing.JRadioButton();
        Todos = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Entrada de Venezolanos por año");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        botones.add(Mujeres);
        Mujeres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Mujeres.setText("Mujeres");
        Mujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MujeresActionPerformed(evt);
            }
        });

        botones.add(Hombres);
        Hombres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Hombres.setText("Hombres");

        botones.add(Todos);
        Todos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Todos.setText("Todos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("Filtro por género");

        jTextField1.setEditable(false);

        jLabel3.setText("estado:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Hombres, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Todos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(340, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(Mujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jLabel2)))
                    .addContainerGap(492, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Hombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Todos)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jLabel2)
                    .addGap(12, 12, 12)
                    .addComponent(Mujeres)
                    .addContainerGap(351, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[] venezolanosPorAnioTodos = entrada.venezolanosPorAnioTodos();
        int[] venezolanosPorAnioHombre = entrada.venezolanosPorAnioHombre();
        int[] aniosGraficar = new int[12];
        
        boolean[] botones = new boolean[]{Mujeres.isSelected(),Hombres.isSelected(),Todos.isSelected()};
        
        if(Mujeres.isSelected()){
            for(int i=0;i<12;i++){
                jTextField1.setText("bien");
                aniosGraficar[i]=venezolanosPorAnioTodos[i]-venezolanosPorAnioHombre[i];
            }
        }
        if(Hombres.isSelected()){
            for(int i=0;i<12;i++){
                aniosGraficar[i]=venezolanosPorAnioHombre[i];
                jTextField1.setText("bien");
            }
        }
        if(Todos.isSelected()){
            for(int i=0;i<12;i++){
                aniosGraficar[i]=venezolanosPorAnioTodos[i];
                jTextField1.setText("bien");
            }
        }else if(!Mujeres.isSelected() && !Hombres.isSelected() && !Todos.isSelected()){
            jTextField1.setText("error");
        } 
       
        //Barras
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        datos.setValue(aniosGraficar[0], "2012", "Año");
        datos.setValue(aniosGraficar[1], "2013", "Año");
        datos.setValue(aniosGraficar[2], "2014", "Año");
        datos.setValue(aniosGraficar[3], "2015", "Año");
        datos.setValue(aniosGraficar[4], "2016", "Año");
        datos.setValue(aniosGraficar[5], "2017", "Año");
        datos.setValue(aniosGraficar[6], "2018", "Año");
        datos.setValue(aniosGraficar[7], "2019", "Año");
        datos.setValue(aniosGraficar[8], "2020", "Año");
        datos.setValue(aniosGraficar[9], "2021", "Año");
        datos.setValue(aniosGraficar[10], "2022", "Año");
        datos.setValue(aniosGraficar[11], "2023", "Año");
        
        JFreeChart barras = ChartFactory.createBarChart("Venezolanos por año", "Año", "Venezolanos", datos, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel1 = new ChartPanel(barras);
        panel1.setMouseWheelEnabled(true);

        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(panel1, BorderLayout.NORTH);
        pack();
        repaint();
        
        //Pastel
        float prueba=0;
        for(int i=0;i<12;i++){
            prueba+=aniosGraficar[i];
        }
        
                
        DefaultPieDataset datos1 = new DefaultPieDataset();

        datos1.setValue("2012 (" + (aniosGraficar[0] * 100) / prueba + "%)", aniosGraficar[0]);
        datos1.setValue("2013 (" + (aniosGraficar[1] * 100) / prueba + "%)", aniosGraficar[1]);
        datos1.setValue("2014 (" + (aniosGraficar[2] * 100) / prueba + "%)", aniosGraficar[2]);
        datos1.setValue("2015 (" + (aniosGraficar[3] * 100) / prueba + "%)", aniosGraficar[3]);
        datos1.setValue("2016 (" + (aniosGraficar[4] * 100) / prueba + "%)", aniosGraficar[4]);
        datos1.setValue("2017 (" + (aniosGraficar[5] * 100) / prueba + "%)", aniosGraficar[5]);
        datos1.setValue("2018 (" + (aniosGraficar[6] * 100) / prueba + "%)", aniosGraficar[6]);
        datos1.setValue("2019 (" + (aniosGraficar[7] * 100) / prueba + "%)", aniosGraficar[7]);
        datos1.setValue("2020 (" + (aniosGraficar[8] * 100) / prueba + "%)", aniosGraficar[8]);
        datos1.setValue("2021 (" + (aniosGraficar[9] * 100) / prueba + "%)", aniosGraficar[9]);
        datos1.setValue("2022 (" + (aniosGraficar[10] * 100) / prueba + "%)", aniosGraficar[10]);
        datos1.setValue("2023 (" + (aniosGraficar[11] * 100) / prueba + "%)", aniosGraficar[11]);
        
        JFreeChart pastel = ChartFactory.createPieChart("Venezolanos por año", datos1, true, true, false);

        ChartPanel panel_temporal = new ChartPanel(pastel);
        panel_temporal.setMouseWheelEnabled(true);

        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(panel_temporal, BorderLayout.NORTH);

        pack();
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MujeresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MujeresActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Hombres;
    private javax.swing.JRadioButton Mujeres;
    private javax.swing.JRadioButton Todos;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
