package interfaces.implementacion.cuentas.AClaseCuentaBanco;

import javax.swing.JOptionPane;

import interfaces.contratos.ICuentas.ICuentasBanco;

public class ACuentaBancaria implements ICuentasBanco{

    private int saldo;

    public ACuentaBancaria(int saldo){
        this.saldo = saldo;
    }

    @Override
    public void retirar(int cantidad) {
      if (cantidad % 10000 == 0 && cantidad >= 10000) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Retiro realizado\nCantidad: " + cantidad + "\nSaldo actual: " + saldo, "Retirar saldo", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para retirar esa cantidad, por favor deposita dinero en su cuenta", "Error de retiro", 0);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor ingrese valores enteros positivos multiplos de 10000", "Error de retiro", 0);

      }
    }

    @Override
    public void depositar(int cantidad) {
       if (cantidad % 10000 == 0 && cantidad >= 10000) {
        saldo += cantidad;
        JOptionPane.showMessageDialog(null, "Deposito realizado\nCantidad: "+cantidad+"\nSaldo actual: "+saldo, "Deposito de dinero", 1);
      } else {
        JOptionPane.showMessageDialog(null, "Por favor ingrese valores enteros positivos multiplos de 10000", "Error de deposito", 0);

      } 
    }

    @Override
    public int saldo() {
       return getSaldo();
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
   
    
}
