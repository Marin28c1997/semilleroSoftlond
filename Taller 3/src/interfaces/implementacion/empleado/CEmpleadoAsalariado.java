package interfaces.implementacion.empleado;

import javax.swing.JOptionPane;

import interfaces.contratos.ISalario.ISalarioEmpleado;

public class CEmpleadoAsalariado implements ISalarioEmpleado {

    private String nombre;
    private double auxioTransporte;
    private long salario;

    public CEmpleadoAsalariado(String nombre, double auxioTransporte, long salario) {
        this.nombre = nombre;
        this.auxioTransporte = auxioTransporte;
        this.salario = salario;
    }

    @Override
    public void calcularSalario() {
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\nTipo de empleado: 'Asalariado'" + "\nSalario base: " + salario+ "\nAuxilio de transporte: " + auxioTransporte + "\nSueldo: " +(auxioTransporte+salario),"Salario Asalariado",1);
    }

}
