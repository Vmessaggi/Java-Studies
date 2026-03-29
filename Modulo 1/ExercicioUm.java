public class ExercicioUm {  // ← PascalCase
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        double media = calcularMedia(7.5, 8.0, 9.5);
        System.out.println("Média: " + String.format("%.2f", media));
    }
}

//java usa PascalCase como padrão, Snake_case seria exericio_um, padrao utilizado para python