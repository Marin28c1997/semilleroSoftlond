package interfaces.implementacion.cuentas;

import javax.swing.JOptionPane;

import interfaces.implementacion.cuentas.AClaseCuentaBanco.ACuentaBancaria;

public class CCuentaCorriente extends ACuentaBancaria {

    private int sobreGiro;

    public CCuentaCorriente(int saldo, int sobreGiro) {
        super(saldo);
        // TODO Auto-generated constructor stub
        this.sobreGiro = sobreGiro;
    }

    @Override
    public void retirar(int cantidad){
        if (cantidad % 10000 == 0 && cantidad >= 10000 && (saldo()+sobreGiro)>= cantidad) {
            int saldoConSobreGiro = saldo() - cantidad;
            if (saldoConSobreGiro < 0){
                JOptionPane.showMessageDialog(null, "Retiro realizado con sobre giro\nCantidad de retiro: "+cantidad+"\nCantidad de sobre giro: "+sobreGiro, "Retirar saldo con sobre giro", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Retiro realizado\nCantidad de retiro: "+cantidad+"\nSaldo actual:"+saldoConSobreGiro, "Retirar saldo", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores enteros positivos multiplos de 10000", "Error de retiro", 0);
        }
        
        super.retirar(cantidad); // Llamada al método de la clase base
    }
    
    
}
