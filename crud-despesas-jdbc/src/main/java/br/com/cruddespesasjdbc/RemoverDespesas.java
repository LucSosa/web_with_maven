package br.com.cruddespesasjdbc;

import br.com.cruddespesasjdbc.dao.DespesaDAO;

public class RemoverDespesas {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();

        dao.delete(3L);
    }
}
