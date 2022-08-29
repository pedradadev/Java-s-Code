package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;   // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("5");
        boolean verdadeiro = Boolean.parseBoolean("tRuE");
        System.out.printf(String.valueOf(verdadeiro));

        System.out.printf(String.valueOf(Character.isDigit('a')));
        System.out.printf(String.valueOf(Character.isLetterOrDigit('!')));
        System.out.printf(String.valueOf(Character.isUpperCase('A')));
        System.out.printf(String.valueOf(Character.isLowerCase('a')));
        System.out.printf(String.valueOf(Character.toUpperCase('a')));
        System.out.printf(String.valueOf(Character.toLowerCase('A')));

        System.out.printf("---------------------");
    }
}
