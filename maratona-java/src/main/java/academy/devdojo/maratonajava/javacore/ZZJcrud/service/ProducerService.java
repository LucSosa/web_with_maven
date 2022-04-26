package academy.devdojo.maratonajava.javacore.ZZJcrud.service;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static Scanner scanner = new Scanner(System.in);

    public static void buildMenu(int op){
        switch (op) {
            case 1:
        }
    }

    private static void findByName(String name){
        List<Producer> producers = ProducerRepository.findByName(name);
        for (int i = 0; i < producers.size(); i++) {
            System.out.printf("[%d] - %s", i, producers.get(i).getName());
        }
    }
}
