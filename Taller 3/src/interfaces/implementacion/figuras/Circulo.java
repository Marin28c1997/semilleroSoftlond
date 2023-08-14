package interfaces.implementacion.figuras;

import interfaces.contratos.IFiguras.IFigurasGeometricas;

public class Circulo implements IFigurasGeometricas{

    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
  
    @Override
    public double calcularArea() {
        return Math.pow(radio, 2) * Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * 2 * radio;    
    }
    
}
