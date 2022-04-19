package academy.devdojo.maratonajava.introducao;

public class Aula38ArrayMultidimensionais {
    public static void main(String[] args) {
        int[][] arraInt = new int[3][];
        int[] array = {1, 2, 3};

        arraInt[0] = new int[2];
        arraInt[1] = array;
        arraInt[2] = new int[]{4, 5, 6, 7, 8, 9};

        int[][] arrayInteiro = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arraInt) {
            System.out.println("\n---");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n---------------------------");

        for (int[] arrayBase : arrayInteiro) {
            System.out.println("\n---");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

    }
}
