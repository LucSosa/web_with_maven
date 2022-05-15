package br.com.devdojo.web_with_maven.acao;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.infra.ConnectionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class RemoveDespesas implements Acao{
    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        Connection connection = ConnectionFactory.getConnection();
        DespesaDAO dao = new DespesaDAO(connection);
        dao.delete(Long.valueOf(id));
        return "/controladora?acao=ListaDespesas";

//        RequestDispatcher dispatcher = request.getRequestDispatcher("/controladora?acao=ListaDespesas");
//        dispatcher.forward(request, response);
    }
}
