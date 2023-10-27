/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vacunasgrupo18.Vistas;


import java.awt.Color;
import javax.swing.JOptionPane;
import vacunasgrupo18.AccesoADatos.CiudadanoData;
import vacunasgrupo18.Entidades.Ciudadano;

/**
 *
 * @author lucia
 */
public class RegistrarCiudadano extends javax.swing.JInternalFrame {

    CiudadanoData cData = new CiudadanoData();
    Ciudadano cActual = null;
            
    public RegistrarCiudadano() {
        initComponents();
        setBounds(135, 5, 425, 425);
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

        jLabel1 = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtdni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jctrabajo = new javax.swing.JComboBox<>();
        jbRegistrar = new javax.swing.JButton();
        jtEpatologia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jrSi = new javax.swing.JRadioButton();
        jrNo = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registo del Ciudadano");

        jLabel1.setText("Nombre y Apellido:");

        jLabel2.setText("DNI:");

        jtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtdniKeyTyped(evt);
            }
        });

        jLabel3.setText("Email:");

        jLabel4.setText("Celular:");

        jLabel5.setText("Patología:");

        jLabel6.setText("Ambito de Trabajo:");

        jctrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Salud", "Educación", "Fuerzas Armadas", "Otros" }));

        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jtEpatologia.setEnabled(false);

        jLabel7.setText("Especifique Patologia:");

        jrSi.setText("Si");
        jrSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrSiActionPerformed(evt);
            }
        });

        jrNo.setText("No");
        jrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNoActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbRegistrar))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtnombre)
                                    .addComponent(jtEmail)
                                    .addComponent(jtCelular)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscar)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrSi)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrNo))
                                    .addComponent(jtEpatologia, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jctrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrSi)
                    .addComponent(jrNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtEpatologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jctrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrar)
                    .addComponent(jbNuevo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        
        try{
            
            Integer dni = Integer.parseInt(jtdni.getText());
            String nombre = jtnombre.getText();
            String email = jtEmail.getText();
            String celular = jtCelular.getText();
            String trabajo = jctrabajo.getSelectedItem().toString();
            String PatologiaSi = jtEpatologia.getText();
            String PatologiaNo = "Ninguna";

        
        if(nombre.isEmpty() || trabajo.isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Complete los campos obligatorios");
            return;
   
        }
        
         if(jrSi.isSelected() && PatologiaSi.isEmpty()){
                
                JOptionPane.showMessageDialog(this, "Especifique la patología");
                return;
                
            } 
        
        
        if((cActual==null && jrSi.isSelected())){
            
            cActual = new Ciudadano(dni, nombre, email, celular, PatologiaSi, trabajo);
            cData.guardarCiudadano(cActual);
            
        }else if(cActual==null && jrNo.isSelected()){
            
            cActual = new Ciudadano(dni, nombre, email, celular, PatologiaNo,  trabajo);
            cData.guardarCiudadano(cActual);
            
        }else {
            
            cActual.setDni(dni);
            cActual.setNombreCompleto(nombre);
            cActual.setEmail(email);
            cActual.setCelular(celular);
            
            if(jrNo.isSelected()){
                
                cActual.setPatologia(PatologiaNo);
                  
            } else{
                
                cActual.setPatologia(PatologiaSi);
                
            }
            
            cActual.setAmbitoTrabajo(trabajo);
            cData.modificarCiudadano(cActual);
            
        }
        
        

        }catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this, "Debe ingresar un dni valido");
            
        }
        
        
        
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jrSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrSiActionPerformed
        
        jtEpatologia.setEnabled(true);
        jrNo.setSelected(false);
        
    }//GEN-LAST:event_jrSiActionPerformed

    private void jrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNoActionPerformed
        
        jtEpatologia.setText("");
        jtEpatologia.setEnabled(false);
        jrSi.setSelected(false);
        
    }//GEN-LAST:event_jrNoActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
        limpiarCampos();
        cActual = null;
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        Integer dni = Integer.parseInt(jtdni.getText());
        
        cActual = cData.buscarCiudadanoPorDni(dni);
        
        String patologia = null;
        
        if(cActual != null){
            
            jtnombre.setText(cActual.getNombreCompleto());
            jtEmail.setText(cActual.getEmail());
            jtCelular.setText(cActual.getCelular());
            jctrabajo.setSelectedItem(cActual.getAmbitoTrabajo());

            patologia = cActual.getPatologia();
            
            if(patologia.equals("Ninguna")){
                
                  jrNo.setSelected(true);
                
            } else{
                
                jrSi.setSelected(true);
                jtEpatologia.setEnabled(true);
                 jtEpatologia.setText(cActual.getPatologia());
                 
                
            }
            
            
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtdniKeyTyped
      
        if(jtdni.getText().length() >= 8)
    {
        evt.consume();
    }
        
    }//GEN-LAST:event_jtdniKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JComboBox<String> jctrabajo;
    private javax.swing.JRadioButton jrNo;
    private javax.swing.JRadioButton jrSi;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtEpatologia;
    private javax.swing.JTextField jtdni;
    private javax.swing.JTextField jtnombre;
    // End of variables declaration//GEN-END:variables

public void limpiarCampos(){
        
        jtnombre.setText("");
        jtEmail.setText("");
        jtCelular.setText("");
        jctrabajo.setSelectedItem("");
        jtEpatologia.setText("");
        jtdni.setText("");
        jrSi.setSelected(false);
        jrNo.setSelected(false);
        jtEpatologia.setEnabled(false);
        
    }


}
