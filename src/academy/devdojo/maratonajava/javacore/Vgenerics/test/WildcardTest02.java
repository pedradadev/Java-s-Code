package academy.devdojo.maratonajava.javacore.Vgenerics.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WildcardTest02  {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro(" "));
        cachorros.add(new Cachorro(" "));
        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato());
        gatos.add(new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);


        // O uso de Generics faz-se necessário para evitar casts excessivos e erros que podem ser encontrados em tempo de compilação, antes mesmo de ir para a produção e é util para times de desenvolvedores para o codigo ficar mais limpo e legivel, como um exemplo na linha abaixo
        // Se o uso de generics na criação de listas nao fossem necessarios poderia ter muitas duvida na hora da legibilidade e erro em tempo de compilação
        // List<> nomes = new ArrayList<>()

        // List<String> nomes = new ArrayList<>()

        // O generics só aceita dentro dele Objetos, não aceita tipos primitivos, Aceita por exemplo, String Integer Double e Long, mas existem algumas siglas padronizadas por convenção entre os desenvolvedores Java:
        // E - Elemento
        // K - Chave
        // N - Número
        // T - Tipo
        // V - Valor

        List<Cachorro> cachorroList = criarArrayComUmObjeto(new Cachorro("Cachorro Thor"));
        System.out.println(cachorroList);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }




    private static void printConsulta(List<? extends Animal> animals){              // List<? extends Animal> Significa que essa lista só pode conter SubClasses que extende de Animal, no caso Cachorro e Gato
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals){          // List<? super Animal> Significa que Essa lista só pode conter SuperClasses de Animal, no caso Object
        animals.add(new Cachorro(" "));
        animals.add(new Gato());

    }
}
