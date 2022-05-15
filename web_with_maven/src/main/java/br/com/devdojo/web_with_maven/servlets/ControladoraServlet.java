package br.com.devdojo.web_with_maven.servlets;

import br.com.devdojo.web_with_maven.acao.Acao;
import br.com.devdojo.web_with_maven.acao.AdicionaDespesas;
import br.com.devdojo.web_with_maven.acao.ListaDespesas;
import br.com.devdojo.web_with_maven.acao.RemoveDespesas;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controladora")
public class ControladoraServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try {
            String acaoNome = request.getParameter("acao");
            String pacote = "br.com.devdojo.web_with_maven.acao";

            System.out.println("A ação executada foi: " + acaoNome);

            Class classe = Class.forName(pacote + acaoNome);
            Acao acao = (Acao)classe.newInstance();

            String resultado = acao.executa(request, response);

            RequestDispatcher dispatcher = request.getRequestDispatcher(resultado);
            dispatcher.forward(request, response);
        } catch (ClassNotFoundException | InstantiationError | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

    }
}
