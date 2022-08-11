package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // TIPOS DE INICIAÇÃO
        // byte, short, int, long, float e double = 0
        // char '\u0000 ' '
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Gabriel";
        nomes[1] = "Maria";
        nomes[2] = "Adriano";
        nomes[3] = "Lucila";

        // Pode ser ultilizado tanto o espaco alocado na memoria ou o nome da variavel .lenght
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
     }
}
