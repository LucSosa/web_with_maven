package academy.devdojo.maratonajava.javacore.BIntroducaoClasse02.test;

import academy.devdojo.maratonajava.javacore.BIntroducaoClasse02.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BIntroducaoClasse02.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 13;
        estudante02.sexo = 'M';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
    }
}
