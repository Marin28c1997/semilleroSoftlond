package interfaces.implementacion.animal;

import javax.swing.JOptionPane;

import interfaces.contratos.IAnimal.IAnimal;

public class CPerro implements IAnimal{

    @Override
    public void hacerSonido() {
        JOptionPane.showMessageDialog(null, "Soy un perro y hago 'guau guau'", null, 1);
    }
    
}