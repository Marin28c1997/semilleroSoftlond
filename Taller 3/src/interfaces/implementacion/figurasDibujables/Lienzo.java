package interfaces.implementacion.figurasDibujables;

import interfaces.contratos.IDibujable.IDibujable;

public class Lienzo implements IDibujable{

    public void dibujar(){};

    public static void dibujarElementos(IDibujable[] figuras) {
        for (IDibujable dibujarFiguras : figuras) {
            dibujarFiguras.dibujar();
        }
    }
}