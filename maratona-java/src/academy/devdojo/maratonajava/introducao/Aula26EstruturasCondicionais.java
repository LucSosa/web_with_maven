package academy.devdojo.maratonajava.introducao;

public class Aula26EstruturasCondicionais {
    public static void main(String[] args) {
        //dados os valores de 1 a 7, imprima se e dia util ou semana
        int dia = 5;

        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("Data invalida");
                break;
        }
    }
}
