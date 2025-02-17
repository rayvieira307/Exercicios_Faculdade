package DAO;

import java.sql.*;
import java.util.List;

public abstract class GenericDAO<E, K> {

    // Método para obter a conexão com o banco de dados
    protected Connection getConnection() throws SQLException {
        // Substitua pela URL, usuário e senha corretos do seu banco de dados
        return DriverManager.getConnection("jdbc:derby://localhost:5432/loja", "postgres", "123456");
    }

    // Método para fechar a conexão
    protected void closeStatement(Statement st, Connection c1) throws SQLException {
        if (st != null) st.close();
        if (c1 != null) c1.close();
    }

    // Método para criar um Statement
    protected Statement getStatement(Connection c1) throws SQLException {
        return c1.createStatement();
    }

    public abstract List<E> obterTodos() throws SQLException;


    public abstract E obter(K chave) throws SQLException;


    public abstract void incluir(E entidade) throws SQLException;

    public abstract void alterar(E entidade) throws SQLException;


    public abstract void excluir(K chave) throws SQLException;
}

