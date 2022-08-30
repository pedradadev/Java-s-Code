package academy.devdojo.maratonajava.javacore.Tserialization.test;

import academy.devdojo.maratonajava.javacore.Tserialization.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Tserialization.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileStoreAttributeView;

public class SerializacaoTest01 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Gabriel Pedrada","123456789"); //Criando um Objeto para persistir
        Turma turma = new Turma("Maratona Java Virado No Jiraya");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){ // Persistindo o objeto criado, no caso em um arquivo.
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){ // Deserializando o obeto, lendo o objeto no arquivo.
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
           Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
