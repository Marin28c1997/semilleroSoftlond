package interfaces.implementacion.notificaciones;

import javax.swing.JOptionPane;

import interfaces.implementacion.notificaciones.AClaseNotificaciones.AClaseNotificaciones;

public class CCorreoElectronico extends AClaseNotificaciones{

    public CCorreoElectronico(String destinatario) {
        super(destinatario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void enviarNotificaciones(String mensaje) {
    JOptionPane.showMessageDialog(null, "Enviando correo a: '" + getDestinatario()+"'\nMensaje: '" +mensaje+"'", "Correo Electrónico", 1);  
    }
    
}
