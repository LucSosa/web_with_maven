package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(
            List.of(new Barco("Lancha"), new Barco("Iate")));
    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco disponível...");
        Barco Barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco:" + Barco);
        System.out.println("Barcos disponíveis para alugar:");
        System.out.println(barcosDisponiveis);
        return Barco;
    }
    public void retornarBarcoAlugado(Barco Barco){
        System.out.println("Devolvendo Barco " + Barco);
        barcosDisponiveis.add(Barco);
        System.out.println("Barcos Disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
