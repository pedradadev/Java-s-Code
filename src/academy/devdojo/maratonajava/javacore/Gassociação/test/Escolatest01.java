package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Professor;

public class Escolatest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Konoha",professores);

        escola.imprime();
    }
}
