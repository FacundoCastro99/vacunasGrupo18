
package vacunasgrupo18.Entidades;

import java.util.Properties;
import javax.swing.JOptionPane;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;
        
        
        
public class CitaConsignada {

    public static void main(String[] args) {
        String mail = JOptionPane.showInputDialog("Digite el correo al enviar el mensaje");
        int x=JOptionPane.showConfirmDialog(null,"Desea enviar correo..","Enviar correo", JOptionPane.PLAIN_MESSAGE);
        
        if (x==0) {
            transfer_to_email(mail);
                JOptionPane.showMessageDialog(null,"Que tenga un buen dia" );
                      
        }else{
            JOptionPane.showConfirmDialog(null,"Gracias por utilizar la Aplicacion");
            
        }
    }

public static void transfer_to_email(String Correo){

    String correoEnvia = "123.roberto.barrios@gmail.com";
    String contraseña = "ztsp ahrl fvlk exob";
    String mensaje = "DNI:         ,Proxima Dosis:       ,Fecha:      ,Hora:     , Lugar: ";
    
    Properties objetoPEC = new Properties();// se crea el objeto objetoPEC del tipo Properties (PEC para envio de correo)
    
    objetoPEC.put("mail.smtp.host","smtp.gmail.com");
    objetoPEC.setProperty("mail.smtp.starttls.enable","true");
    objetoPEC.put("mail.smtp.port","587");
    objetoPEC.setProperty("mail.smtp.port","587");
    objetoPEC.put("mail.smtp.user",correoEnvia);
    objetoPEC.setProperty("mail.smtp.auth", "true");
    
        //crea un objeto sesion
        Session sesion = Session.getDefaultInstance(objetoPEC);
        // se crea otro objeto mail
        MimeMessage mail = new MimeMessage(sesion);
        // creo otro objeto mail  y llama al otro objeto sesion
    
            try {
                mail.setFrom(new InternetAddress(correoEnvia));
                mail.addRecipient(Message.RecipientType.TO, new InternetAddress(Correo));
                mail.setSubject("Turno Confirmado Vacunacion: COVID");
                mail.setText(mensaje);
                
                Transport transporte =  sesion.getTransport("smtp");
                //creo otro objeto transporte
                transporte.connect(correoEnvia,contraseña);
                transporte.sendMessage(mail,mail.getRecipients(Message.RecipientType.TO));
                transporte.close();
                
                JOptionPane.showMessageDialog(null,"El correo se envio CORRECTAMENTE");
                      
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null,"Error de envio de CORREO...\n" + ex);
    }
        
    
  }
     
    }