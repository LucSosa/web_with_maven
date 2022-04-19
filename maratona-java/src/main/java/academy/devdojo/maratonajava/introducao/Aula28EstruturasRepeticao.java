package academy.devdojo.maratonajava.introducao;

public class Aula28EstruturasRepeticao {
    public static void main(String[] args) {
        //imprima todos os numeros pares ate 1000000
        int milhao = 1000000;
        for (int n = 1; n <= milhao; n++){
            if (n%2 == 0){
                System.out.println(n);
            }
        }
    }
}
