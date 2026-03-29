package EX02POO;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[2];
        formas[0] = new Retangulo("azul", 3.0, 4.0);
        formas[1] = new Circulo("vermelho", 5.0);

        for (Forma f : formas) {
            f.exibir();
        }
    }
}