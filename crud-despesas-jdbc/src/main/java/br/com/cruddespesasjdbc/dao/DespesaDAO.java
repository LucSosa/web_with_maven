package br.com.cruddespesasjdbc.dao;

import br.com.cruddespesasjdbc.infra.ConnectionFactory;
import br.com.cruddespesasjdbc.model.Categoria;
import br.com.cruddespesasjdbc.model.Despesa;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class DespesaDAO implements IDespesaDAO{
    @Override
    public Despesa save(Despesa despesa) {
        try (Connection conn = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO Despesas (descricao, valor, data, categoria) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3, java.sql.Date.valueOf(despesa.getData()));
            preparedStatement.setString(4, despesa.getCategoria().toString());

            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

            long generatedId = resultSet.getLong("id");
            despesa.setId(generatedId);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Despesa update(Despesa despesa) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Despesa> findAll() {
        return null;
    }

    @Override
    public Optional<Despesa> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Despesa> findByCategoria(Categoria categoria) {
        return null;
    }
}
