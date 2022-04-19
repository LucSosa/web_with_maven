package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variavéis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula13TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Lucas Sosa Machado";
        String endereco = "Rua dos alfeiros";
        float salario = 3000.00F;
        String dataRecebimentoSalario = "05/02/2022";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco +
                "confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
