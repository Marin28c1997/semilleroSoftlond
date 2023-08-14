package interfaces.implementacion.animal;

import javax.swing.JOptionPane;

import interfaces.contratos.IAnimal.IAnimal;

public class CGato  implements IAnimal{

    @Override
    public void hacerSonido() {
    JOptionPane.showMessageDialog(null, "Soy un gato y hago 'miao miao'", null, 1);    
    }
    
}
