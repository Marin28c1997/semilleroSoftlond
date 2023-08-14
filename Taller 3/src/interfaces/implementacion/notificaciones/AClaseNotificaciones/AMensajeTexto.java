package interfaces.implementacion.notificaciones.AClaseNotificaciones;

import interfaces.contratos.INotificaciones.INotificaciones;

public abstract class AMensajeTexto implements INotificaciones{

    private int numero;

   public AMensajeTexto(int numero){
    this.numero = numero;
   }

public int getNumero() {
    return numero;
}
    
}
