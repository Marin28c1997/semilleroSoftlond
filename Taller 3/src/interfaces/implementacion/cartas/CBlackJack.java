package interfaces.implementacion.cartas;

import javax.swing.JOptionPane;

import interfaces.contratos.ICartas.ICartas;

public class CBlackJack implements ICartas{
    private String tipo;
    private int valor;

    public CBlackJack(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public void mostrarCarta() {
           JOptionPane.showMessageDialog(null, valor + " de " +tipo,"Carta de Black Jack",1);
    }

    @Override
    public int valorNumerico() {
        return valor;
    }
}
