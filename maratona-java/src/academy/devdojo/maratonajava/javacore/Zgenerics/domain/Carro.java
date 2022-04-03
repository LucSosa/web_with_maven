package academy.devdojo.maratonajava.javacore.Zgenerics.domain;

public class Carro {
    private String Carro;

    public Carro(String carro) {
        Carro = carro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Carro='" + Carro + '\'' +
                '}';
    }
}
