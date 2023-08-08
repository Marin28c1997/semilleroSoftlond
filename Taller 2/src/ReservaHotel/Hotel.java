package ReservaHotel;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones;

    public Hotel(String nombre, int numHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        for (int i = 1; i <= numHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        ArrayList<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.disponible()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public void reservarHabitacion(int numHabitacion, Cliente cliente) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numHabitacion && habitacion.disponible()) {
                habitacion.reservar(cliente);
                JOptionPane.showMessageDialog(null,"Reserva realizada:\nHabitación: " + numHabitacion + "\nHotel: " + nombre + "\nCliente: " + cliente.getNombre()+"\nCédula: "+ cliente.getCedula());
                return;
            }
        }
        JOptionPane.showMessageDialog(null,"La habitación " + numHabitacion + " no está disponible en " + nombre);
    }

    public void mostrarInfoReservas() {
        boolean reservaHotel = false;
        for (Habitacion habitacion : habitaciones) {

            if (!habitacion.disponible()) {
            reservaHotel = true;
                Cliente cliente = habitacion.getCliente();
                JOptionPane.showMessageDialog(null,"Habitación: " + habitacion.getNumero() + " \nCliente: " + cliente.getNombre() + "\nCédula: " + cliente.getCedula(), "Reservas en " + nombre ,1);
            }
        }

        if (!reservaHotel) {
            JOptionPane.showMessageDialog(
                null,
                "El hotel " + nombre+" no tiene reservas",
                "Error de reservas",0
            );
        }

    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    
    public Habitacion getHabitacionPorNumero(int numHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numHabitacion) {
                return habitacion;
            }
        }
        return null; // No se encontró la habitación con el número dado
    }
    
    public void cancelarReservaHabitacion(int numHabitacion, Cliente clienteCancelar) {
        Habitacion habitacion = getHabitacionPorNumero(numHabitacion);
        if (habitacion != null) {
            habitacion.cancelarReserva(clienteCancelar);
        }
    }
    
    
}