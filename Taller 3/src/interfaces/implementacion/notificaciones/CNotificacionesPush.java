package interfaces.implementacion.notificaciones;

import javax.swing.JOptionPane;

import interfaces.implementacion.notificaciones.AClaseNotificaciones.ANotificacionesPush;

public class CNotificacionesPush extends ANotificacionesPush{

    public CNotificacionesPush(String webApp) {
        super(webApp);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void enviarNotificaciones(String mensaje) {
        JOptionPane.showMessageDialog(null, "La plataforma '"+getWebApp()+"' te ha enviado una notificación" + "\nNotificación: '"+mensaje+"'", "Notificaciones Push", 1);
    }
    
}
