package academy.devdojo.maratonajava.introducao;

public class Aula22EstruturasCondicionais {
    public static void main(String[] args) {
        double salario = 6000;
        //doar se salario > 5000
        String resultado = salario > 5000 ? "Eu vou vou doar 500 pro DevDojo"
                : "Ainda nao tenho como doar";
        System.out.println(resultado);

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >=18 categoria adulto
        int idade = 17;
        String categoria = idade < 15 ? "categoria infantil"
                : idade >= 15 && idade <18 ? "categoria juvenil"
                : "categoria adulto";
        System.out.println(categoria);
    }
}
