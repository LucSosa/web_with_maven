package academy.devdojo.maratonajava.introducao;

public class Aula20EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoAComprarBebida = idade >= 18;

        if(isAutorizadoAComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcolica");
        }

        if(!isAutorizadoAComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcolica");
        }
    }
}
