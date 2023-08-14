package interfaces.implementacion.instrumentos;

import javax.swing.JOptionPane;

public class CTambores extends CInstrumentosMusicales{
    
  @Override
    public void tocar(){
        JOptionPane.showMessageDialog(null, "Soy un tambor \uD83E\uDD41 y sueno 'tan tan'");
    }  
}
