package br.com.cruddespesasjdbc;

import br.com.cruddespesasjdbc.dao.DespesaDAO;
import br.com.cruddespesasjdbc.model.Categoria;
import br.com.cruddespesasjdbc.model.Despesa;

import java.time.LocalDate;

/*
 Link para auxiliar a criação de um banco de dados
 */

public class Aplication {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa();
        despesa.setDescricao("Hortifrute");
        despesa.setCategoria(Categoria.ALIMENTAÇÃO);
        despesa.setValor(80);
        despesa.setData(LocalDate.of(2021, 4, 12));

        Despesa despesaInserida = dao.save(despesa);
        System.out.println("Foi inserida a despesa com id:" + despesaInserida.getId());
    }
}
