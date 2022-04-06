package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//1 . Order LightNovel by title
//2 . Retrieve the first 3 titles light novels with price less than 4
public class StreamTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getName));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getName());
            }
            if (titles.size() >= 3) break;
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
