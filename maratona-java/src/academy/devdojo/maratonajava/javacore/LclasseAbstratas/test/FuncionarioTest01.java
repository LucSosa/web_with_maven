package academy.devdojo.maratonajava.javacore.LclasseAbstratas.test;

import academy.devdojo.maratonajava.javacore.LclasseAbstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LclasseAbstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.LclasseAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Lucas", 2700);
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
