package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto computador = new Computador("I7", 11000);
        Produto tomate = new Tomate("Gaucho", 5);
        Produto televisao = new Televisao("Samsung 50\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
