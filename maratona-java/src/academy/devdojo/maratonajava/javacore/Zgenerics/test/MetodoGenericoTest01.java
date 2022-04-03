package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComumObjeto(new Barco("Canoa Marota"));
    }
    private static <T> List<T> criarArrayComumObjeto(T t){
        return List.of(t);
    }
}
