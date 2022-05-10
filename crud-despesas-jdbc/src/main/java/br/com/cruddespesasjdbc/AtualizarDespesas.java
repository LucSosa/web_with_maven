package br.com.cruddespesasjdbc;

import br.com.cruddespesasjdbc.dao.DespesaDAO;
import br.com.cruddespesasjdbc.model.Categoria;
import br.com.cruddespesasjdbc.model.Despesa;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizarDespesas {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa> optionalDespesa = dao.findById(5L);
        Despesa despesa = optionalDespesa.get();

        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

        despesa.setDescricao("Gasto com dentista");
        despesa.setData(LocalDate.of(2021, 6, 14));
        despesa.setValor(250);
        despesa.setCategoria(Categoria.OUTROS);

        dao.update(despesa);
    }
}
