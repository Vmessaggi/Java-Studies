public class ExercicioQuatro{
    public static String inverterPalavra(String palavra){
        var invertida = "";
        for (int i = palavra.length() - 1 ; i >= 0; i--){
            char letra = palavra.charAt(i);
            invertida = invertida + letra;
        }
        return invertida;
    }
    // OU
    //public static String inverterPalavra(String palavra) {
    //    var invertida = new StringBuilder();
    //    for (int i = palavra.length() - 1; i >= 0; i--) {
    //        invertida.append(palavra.charAt(i));
    //    }
    //    return invertida.toString();
    //} StringBuilder é mais eficiente que concatenar strings com + em loop — cada + cria um objeto String novo na memória.
    // Para loops pequenos não faz diferença, mas em produção com strings grandes é importante. Guarda isso para quando precisar.


    public static void main(String[] args){
        var palavra = "Java";
        var teste = inverterPalavra(palavra);
        System.out.println(teste);
    }
}