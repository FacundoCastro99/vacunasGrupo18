/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vacunasgrupo18.Vistas;

import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vacunasgrupo18.AccesoADatos.LaboratorioData;
import vacunasgrupo18.AccesoADatos.VacunaData;
import vacunasgrupo18.Entidades.Laboratorio;
import vacunasgrupo18.Entidades.Vacuna;

/**
 *
 * @author TV_MaxXx
 */
public class AgregarVacunas extends javax.swing.JInternalFrame {
    
    private LaboratorioData labData;
    VacunaData vacData = new VacunaData();
    Vacuna vacActual = null;
    private List <Laboratorio> listaLab;
    
    
    public AgregarVacunas() {
        initComponents();
        setBounds(135, 5, 425, 425);
        this.getContentPane().setBackground(new Color(0, 153, 255));
        
        labData = new LaboratorioData();
        listaLab = labData.listarLabs();
        
        cargarLaboratorios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNumSerie = new javax.swing.JTextField();
        jcMedida = new javax.swing.JComboBox<>();
        jdFechaCadu = new com.toedter.calendar.JDateChooser();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jcMarca = new javax.swing.JComboBox<>();

        setClosable(true);
        setResizable(true);

        jLabel2.setText("N° Serie de la Dosis");

        jLabel3.setText("Marca");

        jLabel4.setText("Medida");

        jLabel5.setText("Fecha Caducacion");

        jcMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "0.3", "0.5", "0.9" }));
        jcMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMedidaActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbGuardar)
                            .addComponent(jdFechaCadu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jcMedida, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtNumSerie, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 25, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jcMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jdFechaCadu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
        limpiarCampos();
        vacActual = null;
        
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jcMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMedidaActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       
        try{
            
            Integer numSerie = Integer.parseInt(jtNumSerie.getText());
            Laboratorio marca = (Laboratorio) jcMarca.getSelectedItem();
            String medida = jcMedida.getSelectedItem().toString();
            Double medida1 = Double.parseDouble(medida);
            Calendar cal = jdFechaCadu.getCalendar();
            Date input = cal.getTime();
            LocalDate fecha = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        
        if(marca.equals("") || medida.equals("")){
            
            JOptionPane.showMessageDialog(this, "Complete los campos obligatorios");
            return;
   
        }
        
        if(vacActual == null){
            
            vacActual = new Vacuna(numSerie, marca, medida1, fecha);
            vacData.guardarVacuna(vacActual);
            
        } else {
            
            vacActual.setNroSerieDosis(numSerie);
            vacActual.setLabMarca(marca);
            vacActual.setMedida(medida1);
            vacActual.setFechaCaduca(fecha);
            vacData.modificarVacuna(vacActual);
            
        }
        
        

        }catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de serie valido");
            ex.printStackTrace();
            
        } catch (SQLException ex) {
            Logger.getLogger(AgregarVacunas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JComboBox<Laboratorio> jcMarca;
    private javax.swing.JComboBox<String> jcMedida;
    private com.toedter.calendar.JDateChooser jdFechaCadu;
    private javax.swing.JTextField jtNumSerie;
    // End of variables declaration//GEN-END:variables

    public void cargarLaboratorios(){
        
        for(Laboratorio item: listaLab){
            
            jcMarca.addItem(item);
            
        }
    }

    public void limpiarCampos(){
        
        jtNumSerie.setText("");
        jcMarca.setSelectedItem(" ");
        jcMedida.setSelectedItem("");
        jdFechaCadu.setCalendar(null);
        
    }
}
