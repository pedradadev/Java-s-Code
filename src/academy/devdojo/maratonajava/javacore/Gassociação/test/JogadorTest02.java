package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Brazil");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
