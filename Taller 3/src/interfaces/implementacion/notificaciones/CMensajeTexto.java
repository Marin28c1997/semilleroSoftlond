package interfaces.implementacion.notificaciones;

import javax.swing.JOptionPane;

import interfaces.implementacion.notificaciones.AClaseNotificaciones.AMensajeTexto;



public class CMensajeTexto extends AMensajeTexto{

    public CMensajeTexto(int numero) {
        super(numero);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void enviarNotificaciones(String mensaje) {
        JOptionPane.showMessageDialog(null, "Enviando mensaje de texto al número: '"+getNumero()+"'\nMensaje: '"+ mensaje+"'", "Mensaje de texto", 1);
    }
    
}
