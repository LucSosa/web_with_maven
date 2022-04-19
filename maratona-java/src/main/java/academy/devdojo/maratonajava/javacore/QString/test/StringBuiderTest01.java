package academy.devdojo.maratonajava.javacore.QString.test;

public class StringBuiderTest01 {
    public static void main(String[] args) {
        String nome = "Lucas Sosa";
        nome.concat(" DevDojo");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Lucas Sosa");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
