public class ExercicioTres{
    public static int contarVogais(String palavra){
        palavra = palavra.toLowerCase();
        int v = 0;
        for (int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            if (letra == 'a' ||letra == 'e' ||letra == 'i' ||letra == 'o' ||letra == 'u'){
                v++;
            }
        }
        return v;
    }

    public static void main(String[] args){
        int vogais = contarVogais("Programacao");
        System.out.printf("A palavra possui %d vogais%n", vogais); //aqui aceita argumentos como %c %d %s e não pula linha
        System.out.println("A palavra possui " + vogais + " vogais");
        // ou
        System.out.println(String.format("A palavra possui %d vogais", vogais));
    }
}