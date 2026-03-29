package EX02POO;

public abstract class Forma{
    private String cor;

    public Forma(String cor){
        this.cor = cor;
    }

    public abstract double calcularArea();

    public String getCor(){
        return cor;
    }

    public void exibir(){
        System.out.printf("Forma %s | Área: %.2f%n", cor, calcularArea());
    }
}

