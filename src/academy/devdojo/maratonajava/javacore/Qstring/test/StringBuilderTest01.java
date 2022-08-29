package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Gabriel";
        nome.concat("Pedrada");
        nome = nome.substring(0,5);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Gabriel");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
