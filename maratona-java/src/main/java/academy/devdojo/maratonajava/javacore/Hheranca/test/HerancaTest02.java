package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

//00 - Bloco de inicializacao estático da super classe é executado quando a JVM carregar a classe pai
//01 - Bloco de inicializacao estático da sub classe é executado quado a JVM carregar a classe filha
//02 - Alocado espaco em memoria pro objeto da superclasse
//03 - Cada atributo de superclasse e criado e inicializado com valores default ou o que for passado
//04 - Bloco de inicializacao da superclasse e executado na ordem em que aparece
//05 - Construtor e executado da superclasse
//06 - Alocado espaco em memoria pro objeto da subclasse
//07 - Cada atributo de subclasse e criado e inicializado com valores dafault ou o que for passado
//08 - Bloco de inicializacao da superclasse e executado na ordem em que aparece
//09 - Construtor e executado na superclasse

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
