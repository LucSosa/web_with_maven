package academy.devdojo.maratonajava.javacore.GAssociacao.test;

import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Brasil");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
