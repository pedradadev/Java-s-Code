package academy.devdojo.maratonajava.javacore.Vgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Gabriel");
        lista.add("Adriano");

        for(String o : lista){
            System.out.println(o);
        }
    }
}
