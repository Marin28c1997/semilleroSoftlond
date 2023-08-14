package interfaces.implementacion.instrumentos;

import javax.swing.JOptionPane;

public class CViolin extends CInstrumentosMusicales {
    @Override
    public void tocar() {
        JOptionPane.showMessageDialog(null, "Soy un violin \uD83C\uDFBB y sueno 'ding ding'");
    }
}
