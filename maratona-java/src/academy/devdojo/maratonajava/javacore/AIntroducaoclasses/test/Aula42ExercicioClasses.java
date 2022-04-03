package academy.devdojo.maratonajava.javacore.AIntroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.AIntroducaoclasses.dominio.Carro;

public class Aula42ExercicioClasses {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Uno";
        carro.modelo = "Hatch";
        carro.ano = 1996;
        System.out.println("Nome: " + carro.nome +
                "Modelo: " + carro.modelo +
                "Ano: " + carro.ano);

        carro1.nome = "Fiesta";
        carro1.modelo = "Sedan";
        carro1.ano = 2010;
        System.out.println("Nome: " + carro1.nome +
                "Modelo: " + carro1.modelo +
                "Ano: " + carro1.ano);
    }
}
