package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        // while
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
            // count += 1;
        }

        // do-while

        count = 0;
        do {
            System.out.println("Dentro do do-while " + count);
            count++;
        } while (count < 10);

        // for

        for (int i=0; i < 10; i++) {
            System.out.println("For "+i);
        }
    }
}
