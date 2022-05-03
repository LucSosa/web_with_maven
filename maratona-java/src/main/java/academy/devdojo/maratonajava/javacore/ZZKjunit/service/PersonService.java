package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.Oexception.runtime.test.RuntimeExceptionTest02;
import academy.devdojo.maratonajava.javacore.ZZKjunit.domain.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }
}
