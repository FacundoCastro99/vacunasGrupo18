/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vacunasgrupo18.Vistas;

/**
 *
 * @author lucia
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(958, 520);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        registrarCiudadano = new javax.swing.JButton();
        registrarCita = new javax.swing.JButton();
        laboYVacu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        laboYVacu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel2.setBackground(new java.awt.Color(0, 51, 255));

        registrarCiudadano.setBackground(new java.awt.Color(0, 51, 204));
        registrarCiudadano.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        registrarCiudadano.setForeground(new java.awt.Color(255, 255, 255));
        registrarCiudadano.setText("Registrar Ciudadano");
        registrarCiudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCiudadanoActionPerformed(evt);
            }
        });

        registrarCita.setBackground(new java.awt.Color(0, 51, 204));
        registrarCita.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        registrarCita.setForeground(new java.awt.Color(255, 255, 255));
        registrarCita.setText("Registrar Cita");
        registrarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCitaActionPerformed(evt);
            }
        });

        laboYVacu.setBackground(new java.awt.Color(0, 51, 204));
        laboYVacu.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        laboYVacu.setForeground(new java.awt.Color(255, 255, 255));
        laboYVacu.setText("Agregar Laboratorio");
        laboYVacu.setActionCommand("Agregar Laboratorios");
        laboYVacu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboYVacuActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 51, 204));
        salir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vacunasgrupo18/Recursos/pandemiaImagen2.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(756, 473));

        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        laboYVacu1.setBackground(new java.awt.Color(0, 51, 204));
        laboYVacu1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        laboYVacu1.setForeground(new java.awt.Color(255, 255, 255));
        laboYVacu1.setText("Agregar Vacunas");
        laboYVacu1.setActionCommand("Agregar Laboratorios");
        laboYVacu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboYVacu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarCiudadano)
                            .addComponent(laboYVacu, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(laboYVacu1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrarCiudadano)
                .addGap(18, 18, 18)
                .addComponent(registrarCita)
                .addGap(18, 18, 18)
                .addComponent(laboYVacu)
                .addGap(18, 18, 18)
                .addComponent(laboYVacu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salir)
                .addGap(18, 18, 18))
            .addComponent(escritorio)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarCiudadanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCiudadanoActionPerformed
        
        escritorio.repaint();
        RegistrarCiudadano ciu = new RegistrarCiudadano();
        ciu.setVisible(true);
        escritorio.add(ciu);
        escritorio.moveToFront(ciu);
        
    }//GEN-LAST:event_registrarCiudadanoActionPerformed

    private void laboYVacuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laboYVacuActionPerformed
        
        escritorio.repaint();
        AgregarLaboratorio lab = new AgregarLaboratorio();
        lab.setVisible(true);
        escritorio.add(lab);
        escritorio.moveToFront(lab);
        
    }//GEN-LAST:event_laboYVacuActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void registrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCitaActionPerformed
        
        escritorio.repaint();
        RegistrarCita cita = new RegistrarCita();
        cita.setVisible(true);
        escritorio.add(cita);
        escritorio.moveToFront(cita);
        
    }//GEN-LAST:event_registrarCitaActionPerformed

    private void laboYVacu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laboYVacu1ActionPerformed
        escritorio.repaint();
        AgregarVacunas AgreVac = new AgregarVacunas();
        AgreVac.setVisible(true);
        escritorio.add(AgreVac);
        escritorio.moveToFront(AgreVac);
    }//GEN-LAST:event_laboYVacu1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton laboYVacu;
    private javax.swing.JButton laboYVacu1;
    private java.awt.Panel panel2;
    private javax.swing.JButton registrarCita;
    private javax.swing.JButton registrarCiudadano;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
