package EX03POO;

public class CartaoCredito implements Pagavel{
    private double limite;
    public CartaoCredito(double limite){
        this.limite = limite;
    }

    @Override
    public void pagar(double valor) {
        if(valor<=limite){
            limite -= valor;
        }
    }

    @Override
    public double getSaldo() {
        return limite;
    }

}
