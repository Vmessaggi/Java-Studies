package EX03POO;

public class Main {
    public static void main(String[] args) {
        Pagavel[] meios = new Pagavel[2];
        meios[0] = new CartaoCredito(500.0);
        meios[1] = new ContaBancaria(200.0);

        for (Pagavel p : meios) {
            p.pagar(150.0);
            System.out.printf("Saldo restante: R$ %.2f%n", p.getSaldo());
        }
    }
}
