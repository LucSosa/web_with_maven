package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest15 {
    private static List<LightNovel> lightNovels =
            new ArrayList<>(List.of(
                    new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
                    new LightNovel("Overload", 10.99, Category.FANTASY),
                    new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
                    new LightNovel("No Game no Life", 2.99, Category.FANTASY),
                    new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
                    new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
                    new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
                    new LightNovel("Monogatari", 4.00, Category.ROMANCE)
            ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        //Map<Category, List<Promotion>>
        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toList())));
        System.out.println(collect1);

        //Map<Category, Set<Promotion>> Não há repetição
        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect2);

        Map<Category, LinkedHashSet<Promotion>> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect3);
    }

    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
