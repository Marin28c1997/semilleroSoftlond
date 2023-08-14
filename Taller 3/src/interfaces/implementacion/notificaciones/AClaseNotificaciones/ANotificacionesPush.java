package interfaces.implementacion.notificaciones.AClaseNotificaciones;

import interfaces.contratos.INotificaciones.INotificaciones;

public abstract class ANotificacionesPush implements INotificaciones {

   private String webApp;

   public ANotificacionesPush(String webApp){
        this.webApp = webApp;
   }

public String getWebApp() {
    return webApp;
}
    
}
