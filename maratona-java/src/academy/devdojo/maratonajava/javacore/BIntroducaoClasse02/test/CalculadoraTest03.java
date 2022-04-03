package academy.devdojo.maratonajava.javacore.BIntroducaoClasse02.test;

import academy.devdojo.maratonajava.javacore.BIntroducaoClasse02.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);

    }
}
