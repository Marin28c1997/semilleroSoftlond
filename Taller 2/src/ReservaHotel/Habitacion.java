package ReservaHotel;

class Habitacion {
    private int numero;
    private Cliente cliente;

    public Habitacion(int numero) {
        this.numero = numero;
        this.cliente = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean disponible() {
        return cliente == null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void reservar(Cliente cliente) {
        this.cliente = cliente;
    }

    public void cancelarReserva(Cliente cliente) {
        if (this.cliente != null && this.cliente.equals(cliente)) {
            this.cliente = null;
        }
    }
    
    
}
