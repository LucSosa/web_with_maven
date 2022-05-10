package br.com.cruddespesasjdbc.dao;

import br.com.cruddespesasjdbc.infra.ConnectionFactory;
import br.com.cruddespesasjdbc.model.Categoria;
import br.com.cruddespesasjdbc.model.Despesa;

import javax.swing.text.html.Option;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DespesaDAO implements IDespesaDAO {
    @Override
    public Despesa save(Despesa despesa) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO Despesas (descricao, valor, data, categoria) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3, java.sql.Date.valueOf(despesa.getData()));
            preparedStatement.setString(4, despesa.getCategoria().toString());

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

            Long generatedId = resultSet.getLong("id");
            despesa.setId(generatedId);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return despesa;
    }

    @Override
    public Despesa update(Despesa despesa) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE Despesas SET descricao = ?, valor = ?, data = ?, categoria = ? WHERE id = ?;";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3, java.sql.Date.valueOf(despesa.getData()));
            preparedStatement.setString(4, despesa.getCategoria().toString());
            preparedStatement.setLong(5, despesa.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return despesa;
    }

    @Override
    public void delete(Long id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "DELETE FROM Despesas WHERE id = ?;";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Despesa> findAll() {
        String sql = "SELECT id, descricao, data, valor, categoria FROM Despesas";

        List<Despesa> despesas = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("id");
                String descricao = rs.getString("descricao");
                LocalDate data = rs.getDate("data").toLocalDate();
                double valor = rs.getDouble("valor");
                Categoria categoria = Categoria.valueOf(rs.getString("categoria"));

                Despesa despesa = new Despesa(id, descricao, data, valor, categoria);
                despesas.add(despesa);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return despesas;
    }

    @Override
    public Optional<Despesa> findById(Long id) {
        String sql = "SELECT id, descricao, data, valor, categoria FROM Despesas WHERE id = ?";

        Despesa despesa = null;
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                long primaryKey = rs.getLong("id");
                String descricao = rs.getString("descricao");
                LocalDate data = rs.getDate("data").toLocalDate();
                double valor = rs.getDouble("valor");
                Categoria categoria = Categoria.valueOf(rs.getString("categoria"));

                despesa = new Despesa(primaryKey, descricao, data, valor, categoria);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.ofNullable(despesa);
    }

    @Override
    public List<Despesa> findByCategoria(Categoria categoria) {
        String sql = "SELECT id, descricao, data, valor, categoria FROM Despesas WHERE categoria = ?";

        List<Despesa> despesas = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, categoria.toString());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("id");
                String descricao = rs.getString("descricao");
                LocalDate data = rs.getDate("data").toLocalDate();
                double valor = rs.getDouble("valor");
                Categoria categoriaBuscada = Categoria.valueOf(rs.getString("categoria"));

                Despesa despesa = new Despesa(id, descricao, data, valor, categoriaBuscada);
                despesas.add(despesa);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return despesas;
    }
}
