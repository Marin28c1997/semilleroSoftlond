package interfaces.implementacion.notificaciones.AClaseNotificaciones;

import interfaces.contratos.INotificaciones.INotificaciones;

public abstract class AClaseNotificaciones implements INotificaciones {
    private String destinatario;

    public AClaseNotificaciones(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }
}