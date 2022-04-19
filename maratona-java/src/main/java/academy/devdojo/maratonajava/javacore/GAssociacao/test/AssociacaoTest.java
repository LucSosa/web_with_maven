package academy.devdojo.maratonajava.javacore.GAssociacao.test;

import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.GAssociacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Aluno[] alunosParaSeminario = {aluno};
        Professor professor = new Professor("Barba Branca", "Pirata");
        Seminario seminario = new Seminario("One Piece", alunosParaSeminario, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
