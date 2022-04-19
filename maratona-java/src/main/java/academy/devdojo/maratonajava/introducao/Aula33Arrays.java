package academy.devdojo.maratonajava.introducao;

public class Aula33Arrays {
    public static void main(String[] args) {
        //byte, shor, int, long, float, e double = 0
        //char = '\u0000' ou ' '
        //boolean = false
        //string = null
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Bulma";
        nomes[2] = "Kuririn";

        //toda vez que alteramos o tamanho do array devemos compilar novamente o codigo
        //ou devemos trabalhar com arrays tipos objetos
        //o array nao pode alterar dinamicamente

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
