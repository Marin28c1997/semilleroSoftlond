package interfaces.implementacion.empleado;

import javax.swing.JOptionPane;

import interfaces.contratos.ISalario.ISalarioEmpleado;

public class CEmpleadoHora implements ISalarioEmpleado {

    private String nombre;
    private double horaTrabajadas;
    private double pagoPorHora;

    public CEmpleadoHora(String nombre, double horaTrabajadas, double pagoPorHora) {
        this.nombre = nombre;
        this.horaTrabajadas = horaTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public void calcularSalario() {
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+"\nTipo de empleado: 'Por hora'"+"\nHoras trabajadas: "+horaTrabajadas+"\nPago por hora: "+pagoPorHora +"\nSueldo: "+(pagoPorHora*horaTrabajadas), "Salario Por Hora",1);
    }

}
