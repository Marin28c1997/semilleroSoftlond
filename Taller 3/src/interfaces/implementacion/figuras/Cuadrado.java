package interfaces.implementacion.figuras;

import interfaces.contratos.IFiguras.IFigurasGeometricas;

public class Cuadrado implements IFigurasGeometricas{

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);  
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularPerimetro() {
    return 4 *lado;    
    }
    
}
