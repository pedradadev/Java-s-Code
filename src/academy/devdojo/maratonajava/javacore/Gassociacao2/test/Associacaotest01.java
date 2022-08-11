package academy.devdojo.maratonajava.javacore.Gassociacao2.test;

import academy.devdojo.maratonajava.javacore.Gassociacao2.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao2.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao2.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao2.dominio.Seminario;

public class Associacaotest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das focas");
        Aluno aluno = new Aluno("Gabriel", 16);
        Professor professor = new Professor("Adriano", "Sistema da informação");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Como ser um programador melhor", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
