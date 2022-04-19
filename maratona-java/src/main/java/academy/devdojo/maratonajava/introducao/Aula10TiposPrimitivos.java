package academy.devdojo.maratonajava.introducao;

public class Aula10TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = (int) 1000000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Um grande texto";
        var nome2 = "Goku";

        System.out.println("A idade é " + age);
        System.out.println(falso);
        System.out.println("Char: " + caractere);
        System.out.println(nome);
    }
}
