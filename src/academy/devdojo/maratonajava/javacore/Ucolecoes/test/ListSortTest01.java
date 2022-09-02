package academy.devdojo.maratonajava.javacore.Ucolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(135.11);
        dinheiros.add(135.14);
        dinheiros.add(98.10);

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

        for (String manga : mangas){
            System.out.println(manga);
        }
    }
}
