import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import interfaces.contratos.IAnimal.IAnimal;
import interfaces.contratos.ICartas.ICartas;
import interfaces.contratos.IDibujable.IDibujable;
import interfaces.contratos.IFiguras.IFigurasGeometricas;
import interfaces.contratos.ISalario.ISalarioEmpleado;
import interfaces.implementacion.animal.CGato;
import interfaces.implementacion.animal.COveja;
import interfaces.implementacion.animal.CPollito;
import interfaces.implementacion.cartas.CBlackJack;
import interfaces.implementacion.cartas.CCartaPoker;
import interfaces.implementacion.cartas.CCartaUno;
import interfaces.implementacion.animal.CPerro;
import interfaces.implementacion.cuentas.CCuentaAhorro;
import interfaces.implementacion.cuentas.CCuentaCorriente;
import interfaces.implementacion.empleado.CEmpleadoAsalariado;
import interfaces.implementacion.empleado.CEmpleadoHora;
import interfaces.implementacion.figuras.Circulo;
import interfaces.implementacion.figuras.Cuadrado;
import interfaces.implementacion.figuras.Triangulo;
import interfaces.implementacion.figurasDibujables.CCirculo;
import interfaces.implementacion.figurasDibujables.CCuadrado;
import interfaces.implementacion.figurasDibujables.CRectangulo;
import interfaces.implementacion.figurasDibujables.CTriangulo;
import interfaces.implementacion.figurasDibujables.Lienzo;
import interfaces.implementacion.instrumentos.CGuitarra;
import interfaces.implementacion.instrumentos.CInstrumentosMusicales;
import interfaces.implementacion.instrumentos.CPiano;
import interfaces.implementacion.instrumentos.CTambores;
import interfaces.implementacion.instrumentos.CViolin;
import interfaces.implementacion.notificaciones.CCorreoElectronico;
import interfaces.implementacion.notificaciones.CMensajeTexto;
import interfaces.implementacion.notificaciones.CNotificacionesPush;
import interfaces.implementacion.tienda.CAutomoviles;
import interfaces.implementacion.tienda.CElectrodomesticos;
import interfaces.implementacion.tienda.CLibros;
import interfaces.implementacion.tienda.CMotocicleta;
import interfaces.implementacion.tienda.CRopa;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * 1. Figuras geométricas: Crea una jerarquía de clases que representan
         * diferentes figuras geométricas, como círculos, triángulos y cuadrados.
         * Utiliza una interfaz para definir métodos comunes como cálculo de área y
         * perímetro. Cada figura debe tener su propia implementación de estos métodos.
         */

        // Se crea figuras para sus respectivos calculos
        // Circulo circulo1 = new Circulo(8.5);
        // JOptionPane.showMessageDialog(null, "Figura: Círculo \nRadio: "+
        // circulo1.getRadio()+ "\nÁrea: "+ circulo1.calcularArea()
        // +"\nPerímetro:"+circulo1.calcularPerimetro(), "Cálculo del área y perímetro",
        // 1);

        // Cuadrado cuadrado1 = new Cuadrado(6.6f);
        // JOptionPane.showMessageDialog(null, "Figura: Cuadrado \nLado: "+
        // cuadrado1.getLado()+ "\nÁrea: "+ cuadrado1.calcularArea()
        // +"\nPerímetro:"+cuadrado1.calcularPerimetro(), "Cálculo del área y
        // perímetro", 1);

        // Triangulo triangulo1 = new Triangulo(5, 8.2, 6.4);
        // JOptionPane.showMessageDialog(null, "Figura: Triángulo \nAltura: "+
        // triangulo1.getAltura()+"\nBase: "+ triangulo1.getBase()+"\nLado:
        // "+triangulo1.getLado()+ "\nÁrea: "+ triangulo1.calcularArea()
        // +"\nPerímetro:"+triangulo1.calcularPerimetro(), "Cálculo del área y
        // perímetro", 1);

        // ________________________________________________________________________________________
        /*
         * 2. Sistema de notificaciones: Diseña un sistema de notificaciones que pueda
         * manejar varios tipos de notificaciones, como correos electrónicos, mensajes
         * de texto y notificaciones push. Crea una interfaz que defina un método enviar
         * y clases abstractas para cada tipo de notificación. Luego, implementa las
         * clases concretas para cada tipo de notificación.
         */

        // Se crea notificaciones para cada necesidad

        // CCorreoElectronico correo1 = new CCorreoElectronico("marin28c@gmail.com");
        // correo1.enviarNotificaciones("Hola, ¿Cómo está?");

        // CMensajeTexto mensajeTexto1 = new CMensajeTexto(2305648);
        // mensajeTexto1.enviarNotificaciones("Eres seleccionado para ganar dinero desde
        // casa");

        // CNotificacionesPush push1 = new CNotificacionesPush("Facebook");
        // push1.enviarNotificaciones("Tiene una sugerencia de amistad de Luis");
        // ______________________________________________________________________________________________________________________
        /*
         * 3. Banco y cuentas: Desarrolla un sistema bancario que incluya una interfaz
         * para representar cuentas bancarias y métodos para depositar y retirar dinero.
         * Crea una clase abstracta que implemente parte de la lógica común de las
         * cuentas, y luego implementa clases concretas para diferentes tipos de
         * cuentas, como cuentas de ahorro y cuentas corrientes.
         */

        // CCuentaAhorro cAhorro= new CCuentaAhorro(50000);
        // cAhorro.depositar(10000);
        // cAhorro.retirar(60000);

        // CCuentaCorriente cCorriente = new CCuentaCorriente(50000, 40000);
        // cCorriente.depositar(20000);
        // cCorriente.retirar(80000);

        // _______________________________________________________________________________________________________________
        /*
         * 4. Juego de cartas: Crea un juego de cartas en el que puedas representar
         * diferentes tipos de cartas (por ejemplo, cartas de póker) utilizando una
         * jerarquía de clases y una interfaz. La interfaz podría definir métodos como
         * mostrarCarta y valorNumerico. Luego, implementa clases para los diferentes
         * tipos de cartas y para la baraja
         */
        // ____________________________________________________________________________________________________________________

        /*
         * 5. Tienda en línea: Construye un sistema básico para una tienda en línea.
         * Crea una interfaz para representar productos y métodos como calcularPrecio
         * y mostrarDetalles. Luego, implementa clases abstractas para diferentes
         * categorías de productos (electrónica, ropa, libros, etc.) y clases concretas
         * para productos específicos en cada categoría.
         */

        // CRopa ropa = new CRopa("Ropa", 4, 4, "Adidas");
        // ropa.mostrarDetalles();

        // CMotocicleta moto = new CMotocicleta("Motocicleta", 3600000, 1, "Pulsar
        // 200");
        // moto.mostrarDetalles();

        // CLibros libro = new CLibros("Libro", 250000, 1, "Cien años de soledad");
        // libro.mostrarDetalles();

        // CElectrodomesticos electrodomestico = new CElectrodomesticos("Lavadora",
        // 2000000, 2, "Samsung");
        // electrodomestico.mostrarDetalles();

        // CAutomoviles automovil = new CAutomoviles("Automóvil", 2500000, 1,
        // "Renault");
        // automovil.mostrarDetalles();

        // ___________________________________________________________________________________________
        /*
         * 6. Animales y sonidos: Crea una jerarquía de clases que representen
         * diferentes tipos de animales, como perros, gatos y pájaros. Cada clase de
         * animal debe tener un método hacerSonido() que imprima el sonido
         * característico del animal. Luego, crea un array de animales y recorre el
         * array llamando al método hacerSonido() en cada uno. Esto demuestra cómo el
         * polimorfismo permite tratar objetos de diferentes clases de manera uniforme.
         */

        // List<IAnimal> animales = new ArrayList<>();
        // IAnimal perro = new CPerro();
        // IAnimal gato = new CGato();
        // IAnimal oveja = new COveja();
        // IAnimal pajaro = new CPollito();

        // animales.add(perro);
        // animales.add(gato);
        // animales.add(oveja);
        // animales.add(pajaro);

        // for (IAnimal iAnimal : animales) {
        // iAnimal.hacerSonido();
        // }

        // ____________________________________________________________________________________________
        /*
         * 7. Formas geométricas y áreas: Utiliza la jerarquía de clases de formas
         * geométricas que creaste en el ejercicio anterior (con interfaces y clases
         * abstractas). Agrega un método calcularArea() a la interfaz de las formas y
         * luego implementa este método en las clases concretas. Crea un array de formas
         * y calcula el área de cada una utilizando polimorfismo.
         * //
         */
        // ArrayList<IFigurasGeometricas> figurasGeometricas = new ArrayList<>();

        // IFigurasGeometricas circulo = new Circulo(5);
        // IFigurasGeometricas triangulo = new Triangulo(6.5, 5, 9);
        // IFigurasGeometricas cuadrado = new Cuadrado(6.5);

        // figurasGeometricas.add(circulo);
        // figurasGeometricas.add(triangulo);
        // figurasGeometricas.add(cuadrado);

        // for (IFigurasGeometricas iFigurasGeometricas : figurasGeometricas) {
        // if (iFigurasGeometricas instanceof Circulo) {
        // JOptionPane.showMessageDialog(null, "Figura: Círculo \nÁrea: "+
        // circulo.calcularArea() +"\nPerímetro:"+circulo.calcularPerimetro(), "Cálculo
        // del área y perímetro", 1);
        // }
        // if (iFigurasGeometricas instanceof Triangulo) {
        // JOptionPane.showMessageDialog(null, "Figura: Triángulo \nÁrea: "+
        // triangulo.calcularArea() +"\nPerímetro:"+triangulo.calcularPerimetro(),
        // "Cálculo del área y perímetro", 1);
        // }

        // if (iFigurasGeometricas instanceof Cuadrado) {
        // JOptionPane.showMessageDialog(null, "Figura: Cuadrado \nÁrea: "+
        // cuadrado.calcularArea() +"\nPerímetro:"+cuadrado.calcularPerimetro(),
        // "Cálculo del área y perímetro", 1);
        // }
        // }

        // _____________________________________________________________________________________________

        /*
         * 8. Empleados y salarios: Crea una jerarquía de clases para representar
         * diferentes tipos de empleados, como asalariados y por horas. Cada clase debe
         * tener un método para calcular el salario. Utiliza el polimorfismo para
         * calcular el salario de diferentes tipos de empleados en un array.
         */

        // List <ISalarioEmpleado> empleados = new ArrayList<>();

        // CEmpleadoHora empleadoHora = new CEmpleadoHora("Luis", 20, 30);

        // CEmpleadoAsalariado empleadoAsalariado = new CEmpleadoAsalariado("Luis", 600,
        // 12000);

        // empleados.add(empleadoAsalariado);
        // empleados.add(empleadoHora);

        // for (ISalarioEmpleado iSalarioEmpleado : empleados) {
        // iSalarioEmpleado.calcularSalario();
        // }

        // ________________________________________________________________________________________________________
        /*
         * 9. Instrumentos musicales: Diseña una jerarquía de clases para instrumentos
         * musicales, como guitarras, pianos y violines. Cada instrumento debe tener un
         * método tocar() que imprima cómo suena. Luego, crea un método que acepte un
         * arreglo de instrumentos y los haga tocar a todos utilizando polimorfismo.
         */

        // CInstrumentosMusicales[] instrumentosMusicales= {
        // new CGuitarra(),
        // new CPiano(),
        // new CTambores(),
        // new CViolin()
        // };
        // CInstrumentosMusicales.hacerTocarInstrumentos(instrumentosMusicales);

        // __________________________________________________________________________________________
        /*
         * 10. Figuras en un lienzo: Crea una interfaz llamada Dibujable que tenga un
         * método dibujar() y una clase abstracta Figura que implemente esta interfaz.
         * Luego, implementa diferentes clases de figuras (círculos, rectángulos, etc.)
         * que extiendan la clase Figura. Crea una clase Lienzo que tenga un arreglo de
         * objetos Dibujable y, utilizando polimorfismo, llama al método dibujar() en
         * cada objeto.
         */

        // IDibujable[] figuras = {
        // new CCirculo(),
        // new CTriangulo(),
        // new CCuadrado(),
        // new CRectangulo()
        // };
        // Lienzo.dibujarElementos(figuras);
        List<ICartas> bajara = new ArrayList<>();
        
        CCartaPoker poker = new CCartaPoker("diamante", "5");
        CBlackJack blackJack = new CBlackJack("corazon", 2);
        CCartaUno uno = new CCartaUno("verde", 4);
        
        bajara.add(poker);
        bajara.add(blackJack);
        bajara.add(uno);

        for (ICartas iCartas : bajara) {
            iCartas.mostrarCarta();
        }
    }
}
