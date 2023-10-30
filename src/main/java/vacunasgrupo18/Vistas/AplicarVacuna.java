/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vacunasgrupo18.Vistas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vacunasgrupo18.AccesoADatos.VacunaData;
import vacunasgrupo18.Entidades.Vacuna;

/**
 *
 * @author Leandro
 */
public class AplicarVacuna extends javax.swing.JInternalFrame {

    VacunaData vacData = new VacunaData();
    Vacuna vacActual = null;
    
    /**
     * Creates new form AplicarVacuna
     */
    public AplicarVacuna() {
        initComponents();
        setBounds(135, 5, 300, 200);
        this.getContentPane().setBackground(new Color(0, 153, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtNroSerie = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jblimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);

        jLabel1.setText("Nro de Serie");

        jtNroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNroSerieActionPerformed(evt);
            }
        });

        jButton1.setText("Aplicar Vacuna");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jblimpiar.setText("Nuevo");
        jblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jblimpiar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jblimpiar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed

        limpiarCampos();
        vacActual = null;
    }//GEN-LAST:event_jblimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            
        Integer numSerie = Integer.parseInt(jtNroSerie.getText());
        vacActual = vacData.buscarVacunaPorSerie(numSerie);
        vacActual.setColocada(true);
        
        
        if(vacActual == null){
            
            vacActual = new Vacuna(numSerie, vacActual.getLabMarca(),vacActual.getMedida(),vacActual.getFechaCaduca(),true);
            vacData.modificarVacuna(vacActual);
            
        } else {
            
            vacActual.setNroSerieDosis(numSerie);
            vacData.modificarVacuna(vacActual);
            
        }
           JOptionPane.showMessageDialog(null, "Vacuna Aplicada");

        
        } catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this, "Debe ingresar un Numero de serie Valido");
            
        } catch (SQLException ex) {
            Logger.getLogger(AplicarVacuna.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtNroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNroSerieActionPerformed
        try{
            
        Integer numSerie = Integer.parseInt(jtNroSerie.getText());
        vacActual = vacData.buscarVacunaPorSerie(numSerie);
        vacActual.setColocada(true);
        
        
        if(vacActual == null){
            
            vacActual = new Vacuna(numSerie, vacActual.getLabMarca(),vacActual.getMedida(),vacActual.getFechaCaduca(),vacActual.isColocada());
            vacData.modificarVacuna(vacActual);
            
        } else {
            
            vacActual.setNroSerieDosis(numSerie);
            vacData.modificarVacuna(vacActual);
            
        }
           JOptionPane.showMessageDialog(null, "Vacuna Aplicada");

        
        } catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this, "Debe ingresar un Numero de serie Valido");
            
        } catch (SQLException ex) {
            Logger.getLogger(AplicarVacuna.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }//GEN-LAST:event_jtNroSerieActionPerformed
public void limpiarCampos(){
        
        jtNroSerie.setText("");
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JTextField jtNroSerie;
    // End of variables declaration//GEN-END:variables
}
