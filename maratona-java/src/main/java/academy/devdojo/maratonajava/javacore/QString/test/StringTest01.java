package academy.devdojo.maratonajava.javacore.QString.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Lucas";
        String nome2 = "Lucas";
        nome1 = nome1.concat(" Sosa");
        System.out.println(nome1);
        System.out.println(nome1 == nome2);

        String nome3 = new String("Lucas");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
