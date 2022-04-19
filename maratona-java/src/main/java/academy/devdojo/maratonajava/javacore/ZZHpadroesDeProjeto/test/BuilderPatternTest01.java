package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Lucas")
                .lastName("Sosa")
                .userName("viradoNoJiraya")
                .email("lucas.sosa@devdojo")
                .build();
        System.out.println(build);
    }
}
