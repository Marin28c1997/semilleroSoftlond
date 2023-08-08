import Calculadora.Calculadora;
import ConversorMoneda.Banco;
import ConversorMoneda.Conversor;
import RegistroAlumnos.SistemaAlumnos;
import ReservaHotel.Reserva;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * 1. Registro de Alumnos:
         * Crea una clase Alumno con propiedades como nombre, edad y calificaciones.
         * Luego, crea una clase SistemaAlumnos que permite agregar alumnos,asignar
         * calificaciones , calcular el promedio de sus calificaciones y mostrar la
         * información de cada alumno.
         * 
         */
        // SistemaAlumnos al1 = new SistemaAlumnos(null, 0, null, null);

        

        // --------------------------------------------------------------------------

        /*
         * 2. Conversor de Monedas:
         * Crea una clase ConversorMonedas que contenga métodos para convertir una
         * cantidad de dinero de una moneda a otra, por ejemplo, de dólares a euros o de
         * pesos a dólares.
         * 
         */
        // Banco.Opcion();

        // --------------------------------------------------------------------------

        /*
         * 3. Calculadora Simple:
         * Crea una clase Calculadora que contenga métodos para realizar operaciones
         * matemáticas básicas, como suma, resta, multiplicación y división.
         */
        // Calculadora.calculadoraBasica();

        // --------------------------------------------------------------------------

        /*
         * 4. Sistema de Reservas de Hotel:
         * Crear un sistema de reservas de hotel que permita a los clientes corporativos
         * reservar múltiples habitaciones en diferentes hoteles para hospedar a su
         * personal. Debes tener clases como Hotel, Habitación, Cliente, y Reserva.
         * Implementa métodos para listar habitaciones disponibles, realizar reservas y
         * cancelar reservas. Al final de la ejecución del programa debe mostrar la
         * siguiente info:
         */
        // Reserva.reservas();
    }

}
