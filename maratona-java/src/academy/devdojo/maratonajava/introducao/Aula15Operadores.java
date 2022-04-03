package academy.devdojo.maratonajava.introducao;

public class Aula15Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado01 = numero01 + numero02;
        double resultado02 = numero01 - numero02;
        double resultado03 = numero01 * numero02;
        double resultado04 = numero01 / (double) numero02;

        System.out.println(resultado01);
        System.out.println(resultado02);
        System.out.println(resultado03);
        System.out.println(resultado04);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDifetenteQueVinte " + isDezDiferenteQueVinte);

        // &&(AND) ||(OR) !(NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println("Esta Dentro da Lei Maior que 30? " + isDentroDaLeiMaiorQue30);
        System.out.println("Esta Dentro da Lei Maior que 30? " + isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPS = 5000F;
        boolean isPsCincoCompravel = valorTotalContaCorrente > valorPS || valorTotalContaPoupanca > valorPS;
        System.out.println("Posso comprar um PS5?" + isPsCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println("Seu bonus é: " + bonus);
        bonus -= 1000;
        System.out.println("Sobrou: " + bonus);
        bonus *= 2;
        System.out.println("Sua aplicação: " + bonus);
        bonus /= 2;
        System.out.println("Juros: " + bonus);
        bonus %= 2;
        System.out.println("Sobrou: " + bonus);

        //incrementa
        int contador = 0;
        contador +=1;
        System.out.println(contador);
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        ++contador;
        --contador;
        System.out.println(contador);
    }

}
