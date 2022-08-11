package academy.devdojo.maratonajava.javacore.Gassociacao2.dominio;

public class Seminario {
    private String nome;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String nome, Local local) {
        this.nome = nome;
        this.local = local;
    }

    public Seminario(String nome, Aluno[] alunos, Local local) {
        this.nome = nome;
        this.alunos = alunos;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
