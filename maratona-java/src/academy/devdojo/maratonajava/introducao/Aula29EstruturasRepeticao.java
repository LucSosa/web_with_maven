package academy.devdojo.maratonajava.introducao;

public class Aula29EstruturasRepeticao {
    public static void main(String[] args) {
        //imprima os primeiros 2 numeros
        int valorMax = 50;
        for (int i = 0; i<= valorMax;i++) {
            if (i <= 25)
                break;
            System.out.println(i);
        }
    }
}
