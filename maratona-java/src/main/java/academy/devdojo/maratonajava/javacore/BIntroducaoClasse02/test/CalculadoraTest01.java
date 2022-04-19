package academy.devdojo.maratonajava.javacore.BIntroducaoClasse02.test;

import academy.devdojo.maratonajava.javacore.BIntroducaoClasse02.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando a calculadora Teste 01");
        calculadora.subtraiDoisNumeros();
    }
}
