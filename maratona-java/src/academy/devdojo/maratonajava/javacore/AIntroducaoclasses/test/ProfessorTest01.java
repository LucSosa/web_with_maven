package academy.devdojo.maratonajava.javacore.AIntroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.AIntroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
    }
}
