package academy.devdojo.maratonajava.javacore.GAssociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Previsao do futuro: ");
        System.out.println("Digite sua pergunta: ");
        String pergunta = scanner.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
