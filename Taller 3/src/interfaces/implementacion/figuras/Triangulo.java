package interfaces.implementacion.figuras;

import interfaces.contratos.IFiguras.IFigurasGeometricas;

public class Triangulo implements IFigurasGeometricas {

    private double base;
    private double altura;
    private double lado;

    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 3 ;
    }

    public double getLado() {
        return lado;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

}