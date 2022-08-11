package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        long numeroGrande = 10000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0F;
        byte idadeByte = 12;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'G';
        String nome = "Gabriel";

        System.out.println("A idade é "+age+" anos");
        System.out.println(falso);
        System.out.println("Primeira letra do meu nome é "+caractere);
        System.out.println(salarioFloat);
        System.out.println("Oi meu nome é "+nome);
    }
}
