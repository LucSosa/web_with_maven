package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu o DevDojo é foda.");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-------------------------");

        Optional<String> nameOptional = findName("Lucas");
        String empty = nameOptional.orElse("EMPTY");//vai passar empty se n tiver e se tiver vai passar a String
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));//se tiver presente vai passar a String em maiusculo

    }
    private static Optional<String> findName(String name){
        List<String> list = List.of("Lucas", "Sosa");
        int i = list.indexOf(name);
        if (i != 1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
