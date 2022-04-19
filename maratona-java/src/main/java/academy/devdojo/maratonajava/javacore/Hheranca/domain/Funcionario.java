package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização funcionario1");
    }

    {
        System.out.println("Dentro do bloco de inicialização funcionario2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.nome);
    }

    public void relatorioPagamento() {
        System.out.println("Nome:" + this.nome + "Recebeu: " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
