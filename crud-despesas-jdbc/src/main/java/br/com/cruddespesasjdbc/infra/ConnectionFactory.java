package br.com.cruddespesasjdbc.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory(){

    }

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc::mysql://localhost/despesasDb", "localhost", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
            //e.printStackTrace();
        }
    }
}
