package ReservaHotel;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Reserva {
    public static void reservas() {
        HashMap<String, Hotel> hoteles = new HashMap<>();

        Hotel hotel1 = new Hotel("Hotel Playa Media (****)", 10);
        Hotel hotel2 = new Hotel("Hotel Playa Alta (*****)", 8);
        Hotel hotel3 = new Hotel("Hotel Playa Baja (***)", 8);
        hoteles.put("Hotel Playa Alta (*****)", hotel2);
        hoteles.put("Hotel Playa Media (****)", hotel1);
        hoteles.put("Hotel Playa Baja (***)", hotel3);

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Por favor ingrese la opción que más desee:\n1. RESERVAR HABITACIÓN \n2. MOSTRAR RESERVAS DE LOS HOTELES \n3. CANCELAR RESERVA \n4. SALIR",
                    "Bienvenido a la reserva de hoteles", 1));

            switch (opcion) {
                case 1:
                    String nombreEmpresa = JOptionPane.showInputDialog(null,
                            "Por favor ingrese el nombre de la empresa",
                            "Bienvenido a la reserva de hoteles", 1);

                    String nombreCliente = JOptionPane.showInputDialog(null,
                            "Por favor ingrese el nombre del reservador",
                            "Bienvenido a la reserva de hoteles", 1);

                    String cedulaCliente = JOptionPane.showInputDialog(null,
                            "Por favor ingrese el número de cédula",
                            "Bienvenido a la reserva de hoteles", 1);

                    StringBuilder mensaje = new StringBuilder("Por favor seleccione un hotel:\n");
                    int contador = 1;

                    for (String nombreHotel : hoteles.keySet()) {
                        mensaje.append(contador).append(". ").append(nombreHotel).append("\n");
                        contador++;
                    }

                    String opcionSeleccionada = JOptionPane.showInputDialog(null, mensaje.toString(),
                            "Seleccionar hotel",
                            JOptionPane.INFORMATION_MESSAGE);

                    int opcionHotel = Integer.parseInt(opcionSeleccionada.substring(0, 1));
                    String nombreHotelElegido = (String) hoteles.keySet().toArray()[opcionHotel - 1];
                    Hotel hotelElegido = hoteles.get(nombreHotelElegido);
                    ArrayList<Habitacion> disponibles = hotelElegido.getHabitacionesDisponibles();

                    StringBuilder mensajeHabitacion = new StringBuilder(
                            "Habitaciones disponibles en " + nombreHotelElegido + ":\n");

                    for (Habitacion habitacion : disponibles) {
                        mensajeHabitacion.append(habitacion.getNumero()).append(". Habitación ")
                                .append(habitacion.getNumero()).append("\n");
                    }

                    String opcionHabitacion = (String) JOptionPane.showInputDialog(
                            null,
                            mensajeHabitacion.toString(),
                            "Seleccionar habitación",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            null,
                            null);

                    int numHabitacion = Integer.parseInt(opcionHabitacion.split("\\.")[0]);

                    Cliente cliente = new Cliente(nombreCliente, cedulaCliente);
                    hotelElegido.reservarHabitacion(numHabitacion, cliente);
                    break;

                case 2:
                    for (Hotel hotel : hoteles.values()) {
                        hotel.mostrarInfoReservas();
                    }
                    break;
                    case 3:
                    int numHabitacionCancelar = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Por favor ingrese el número de habitación a cancelar:",
                        "Cancelar reserva",
                        JOptionPane.QUESTION_MESSAGE
                    ));
                
                    String cedulaClienteCancelar = JOptionPane.showInputDialog(
                        null,
                        "Por favor ingrese la cédula del cliente para cancelar la reserva:",
                        "Cancelar reserva",
                        JOptionPane.QUESTION_MESSAGE
                    );
                
                    Cliente clienteCancelar = new Cliente(null, cedulaClienteCancelar);
                
                    StringBuilder mensajeCancelar = new StringBuilder("Por favor seleccione un hotel:\n");
                    int contadorCancelar = 1;
                
                    for (String nombreHotel : hoteles.keySet()) {
                        mensajeCancelar.append(contadorCancelar).append(". ").append(nombreHotel).append("\n");
                        contadorCancelar++;
                    }
                
                    String opcionHotelCancelar = JOptionPane.showInputDialog(null, mensajeCancelar.toString(),
                        "Seleccionar hotel para cancelar reserva",
                        JOptionPane.INFORMATION_MESSAGE);
                
                    int opcionCan = Integer.parseInt(opcionHotelCancelar.substring(0, 1));
                    String nombreHotelCancelar = (String) hoteles.keySet().toArray()[opcionCan - 1];
                    Hotel hotelCancelar = hoteles.get(nombreHotelCancelar);
                
                
                    hotelCancelar.cancelarReservaHabitacion(numHabitacionCancelar, clienteCancelar);
                
                    JOptionPane.showMessageDialog(
                        null,
                        "¡Cancelaste la reserva!",
                        "Cancelar reserva",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                
                
                case 4:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor elija una opción válida.");
            }
        } while (opcion != 4);
    }
}
