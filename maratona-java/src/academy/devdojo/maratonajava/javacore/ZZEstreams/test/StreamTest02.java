package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1 . Order LightNovel by title
//2 . Retrieve the first 3 titles light novels with price less than 4
public class StreamTest02 {
    private static List<LightNovel> lightNovels =
            new ArrayList<>(List.of(
                    new LightNovel("Tensei Shittara", 8.99),
                    new LightNovel("Overload", 3.99),
                    new LightNovel("Violet Evergarden", 5.99),
                    new LightNovel("No Game no Life", 2.99),
                    new LightNovel("Fullmetal Alchemist", 5.99),
                    new LightNovel("Kumo Desuga", 1.99),
                    new LightNovel("Monogatari", 5.99)
            ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getName))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getName)
                .collect(Collectors.toList());
        System.out.println(titles);
    }
}
