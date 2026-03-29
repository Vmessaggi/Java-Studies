public class ExercicioCinco {
    public static String inverterPalavra(String palavra, char letra) {
        var invertida = new StringBuilder();
        for(int i = 0; i < palavra.length(); i++){
            invertida.append(palavra.charAt(i));
            if (palavra.charAt(i) == letra){
                for (int j = palavra.length() - 1; j > i;j--){
                    invertida.append(palavra.charAt(j));
                }
                break;
            }
        }

        return invertida.toString();
    }

    public static void main(String[] args){
        var palavra = "Macaco";
        var letra = 'c';
        var resultado = inverterPalavra(palavra, letra);
        System.out.println(resultado);
    }
}

//O programa deve ler uma ‘string’, e a partir da primeira identificação de um determinado caracter deve inverter o que vem depois.
//Exemplo: Macaco, onde delimitador é o "c", então o ‘output’ deve ser "Macoca".