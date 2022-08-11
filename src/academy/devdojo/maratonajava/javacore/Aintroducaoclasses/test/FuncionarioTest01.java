package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gabriel");
        funcionario.setIdade(16);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprimeDados();

        System.out.println("Média "+funcionario.getMedia());
    }
}
