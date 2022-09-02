package academy.devdojo.maratonajava.javacore.Ucolecoes.test;

import academy.devdojo.maratonajava.javacore.Ucolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","Iphone");
        Smartphone s2 = new Smartphone("1ABC1","Iphone");
        System.out.println(s1.equals(s2));              // Verificando se s1 é igual(equals) s2 , a sobrescrita está no metodo da classe smartphone

    }
}
