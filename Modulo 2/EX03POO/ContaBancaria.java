package EX03POO;

public class ContaBancaria implements Pagavel{
    private double saldo;
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void pagar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }
}