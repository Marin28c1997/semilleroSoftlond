package interfaces.implementacion.instrumentos;

public class CInstrumentosMusicales {
    public void tocar(){};

   
        public static void hacerTocarInstrumentos(CInstrumentosMusicales[] instrumentos) {
            for (CInstrumentosMusicales instrumento : instrumentos) {
                instrumento.tocar();
            }
    
}
}