package academy.devdojo.maratonajava.javacore.GAssociacao.test;

import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");

        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);
        System.out.println("-----------------------------");
        jogador1.imprime();
        System.out.println("-----------------------------");
        time.imprime();
    }
}
