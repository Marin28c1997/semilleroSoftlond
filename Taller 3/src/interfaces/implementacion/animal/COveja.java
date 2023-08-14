package interfaces.implementacion.animal;

import javax.swing.JOptionPane;

import interfaces.contratos.IAnimal.IAnimal;

public class COveja implements IAnimal{

    @Override
    public void hacerSonido() {
        JOptionPane.showMessageDialog(null, "Soy un oveja y hago 'bee'", null, 1);
    }
    
}
