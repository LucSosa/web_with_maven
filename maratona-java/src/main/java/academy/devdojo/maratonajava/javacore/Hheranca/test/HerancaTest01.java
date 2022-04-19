package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("96045-558");

        Pessoa pessoa = new Pessoa("Sosa");
        pessoa.setCpf("12345678912");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("--------------------------------------------");

        Funcionario funcionario = new Funcionario("Lucas");
        funcionario.setCpf("1232222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3500);
        funcionario.imprime();
    }
}
