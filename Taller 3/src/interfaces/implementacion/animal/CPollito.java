package interfaces.implementacion.animal;

import javax.swing.JOptionPane;

import interfaces.contratos.IAnimal.IAnimal;

public class CPollito implements IAnimal{

    @Override
    public void hacerSonido() {
        JOptionPane.showMessageDialog(null, "Soy un pollito y hago 'pio pio', si tengo hambre o frío", null, 1);
    }
    
}
