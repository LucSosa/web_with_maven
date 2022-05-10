package br.com.cruddespesasjdbc;

import br.com.cruddespesasjdbc.dao.DespesaDAO;
import br.com.cruddespesasjdbc.model.Categoria;
import br.com.cruddespesasjdbc.model.Despesa;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/*
 Link para auxiliar a criação de um banco de dados
 */

public class ListarDespesas {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();

//        List<Despesa> despesas = dao.findAll();
//        for (Despesa despesa : despesas) {
//            System.out.println("Id: " + despesa.getId());
//            System.out.println("Descricao: " + despesa.getDescricao());
//            System.out.println("Valor: " + despesa.getValor());
//            System.out.println("------------------------------");
//        }
//
//        Optional<Despesa> despesaOptional = dao.findByCategoria(2L);
//        despesaOptional.ifPresent(despesa -> {
//            System.out.println("Id: " + despesa.getId());
//            System.out.println("Descricao: " + despesa.getDescricao());
//            System.out.println("Valor: " + despesa.getValor());
//            System.out.println("------------------------------");
//        });

        List<Despesa> despesa = dao.findByCategoria(Categoria.TRANSPORTE);
        for (Despesa despesas : despesa) {
            System.out.println("Id: " + despesas.getId());
            System.out.println("Descricao: " + despesas.getDescricao());
            System.out.println("Categoria: " + despesas.getCategoria());
            System.out.println("Valor: " + despesas.getValor());
            System.out.println("------------------------------");
        }
    }
}