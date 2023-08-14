package interfaces.contratos.ICuentas;

public interface ICuentasBanco {
    public void retirar(int cantidad);
    public void depositar(int cantidad);
    int saldo();
}
