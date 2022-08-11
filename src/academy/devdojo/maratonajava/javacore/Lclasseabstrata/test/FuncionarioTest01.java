package academy.devdojo.maratonajava.javacore.Lclasseabstrata.test;

import academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami",5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gabriel",12000);
        System.out.println(desenvolvedor);
    }
}
