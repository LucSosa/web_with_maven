package academy.devdojo.maratonajava.javacore.CsobreCargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobreCargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Samurai X", "TV", 12);
        anime.imprime();
    }
}
