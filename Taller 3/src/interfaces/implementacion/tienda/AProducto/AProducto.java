package interfaces.implementacion.tienda.AProducto;

import javax.swing.JOptionPane;

import interfaces.contratos.ITienda.IProductos;

public class AProducto implements IProductos{

    private String tipoProducto;
    private double precio;
    private int cantidad;
    private String marca;

    public AProducto(String tipoProducto, double precio, int cantidad, String marca){
        this.tipoProducto = tipoProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    @Override
    public void mostrarDetalles() {
       JOptionPane.showMessageDialog(null, "\nTipo de Producto: " + tipoProducto + "\nMarca: " +marca+"\nCantidad: "+cantidad+"\nPrecio: "+precio +"\nTotal: "+calcularPrecio(), "Detalle del producto", 1);
    
       if (cantidad > 0 && precio > 0) {
        JOptionPane.showMessageDialog(null,"Realizando compra...");
        JOptionPane.showMessageDialog(null,"Compra realizada");
    } else {
        JOptionPane.showMessageDialog(null,"Compra no realizada");
    }

    }

    @Override
    public double calcularPrecio() {
       return precio *cantidad;
    }
    
}
