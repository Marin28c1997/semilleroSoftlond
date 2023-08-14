package interfaces.implementacion.instrumentos;

import javax.swing.JOptionPane;

public class CGuitarra extends CInstrumentosMusicales{
    
    @Override
    public void tocar(){
        JOptionPane.showMessageDialog(null, "Soy guitarra 🎸 y sueno 'pring pring'");
    }
}
