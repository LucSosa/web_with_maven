package academy.devdojo.maratonajava.introducao;

public class Aula24EstruturasCondicionais {
    public static void main(String[] args) {
        //Salario < 35000 = taxa de 9.7%
        //Salario < 65000 && Salario > 35000 = taxa de 37.35%
        //Salario > 65000 = taxa de 49.3%
        double salario = 30000;
        double resultado;
        if (salario < 35000){
            resultado = salario * 0.097;
        }else if (salario < 65000 && salario > 35000) {
            resultado = salario * 0.3735;
        } else {
            resultado = salario * 0.493;
        }

        System.out.println(resultado);
    }
}
