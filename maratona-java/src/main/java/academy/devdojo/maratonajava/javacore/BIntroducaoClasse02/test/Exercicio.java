package academy.devdojo.maratonajava.javacore.BIntroducaoClasse02.test;

import academy.devdojo.maratonajava.javacore.BIntroducaoClasse02.dominio.Funcionario;

public class Exercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 1500, 1700});
        funcionario.imprimirDados();
        funcionario.getMedia();
    }
}
