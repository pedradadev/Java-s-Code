package academy.devdojo.maratonajava.javacore.Ucolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Pedrada");
        nomes2.add("Adriano");
        nomes.add("Henrique");
//        nomes.remove(0);

        nomes.addAll(nomes2);
        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("----------------");

//        int size = nomes.size();
//        for(int i = 0; i < size; i++){
//            System.out.println(nomes.get(i));
//        }

        System.out.println("-----------------");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
