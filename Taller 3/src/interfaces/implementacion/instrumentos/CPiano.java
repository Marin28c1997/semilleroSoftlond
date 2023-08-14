package interfaces.implementacion.instrumentos;

import javax.swing.JOptionPane;

public class CPiano extends CInstrumentosMusicales{
    
    @Override
    public void tocar(){
        JOptionPane.showMessageDialog(null, "Soy un piano \uD83C\uDFB9 y sueno 'tun tun tun'");
    }  
}
