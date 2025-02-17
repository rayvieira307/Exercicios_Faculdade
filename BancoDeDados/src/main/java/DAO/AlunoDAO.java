package DAO;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO extends GenericDAO<Aluno2, String> {

    @Override
    public List<Aluno2> obterTodos() throws SQLException {
        List<Aluno2> lista = new ArrayList<>();
        Connection c1 = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            c1 = getConnection();
            st = getStatement(c1);
            rs = st.executeQuery("SELECT * FROM ALUNO");

            while (rs.next()) {
                Aluno2 aluno = new Aluno2(
                        rs.getString("MATRICULA"),
                        rs.getString("NOME"),
                        rs.getInt("ENTRADA")
                );
                lista.add(aluno);
            }
        } finally {
            closeStatement(st, c1);
        }

        return lista;
    }

    @Override
    public Aluno2 obter(String chave) throws SQLException {
        Aluno2 aluno = null;
        Connection c1 = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            c1 = getConnection();
            String sql = "SELECT * FROM ALUNO WHERE MATRICULA = ?";
            ps = c1.prepareStatement(sql);
            ps.setString(1, chave);
            rs = ps.executeQuery();

            if (rs.next()) {
                aluno = new Aluno2(
                        rs.getString("MATRICULA"),
                        rs.getString("NOME"),
                        rs.getInt("ENTRADA")
                );
            }
        } finally {
            closeStatement(ps, c1);
        }

        return aluno;
    }

    @Override
    public void incluir(Aluno2 aluno) throws SQLException {
        Connection c1 = null;
        PreparedStatement ps = null;

        try {
            c1 = getConnection();
            String sql = "INSERT INTO ALUNO (MATRICULA, NOME, ENTRADA) VALUES (?, ?, ?)";
            ps = c1.prepareStatement(sql);
            ps.setString(1, aluno.matricula);
            ps.setString(2, aluno.nome);
            ps.setInt(3, aluno.ano);
            ps.executeUpdate();
        } finally {
            closeStatement(ps, c1);
        }
    }

    @Override
    public void alterar(Aluno2 aluno) throws SQLException {
        Connection c1 = null;
        PreparedStatement ps = null;

        try {
            c1 = getConnection();
            String sql = "UPDATE ALUNO SET NOME = ?, ENTRADA = ? WHERE MATRICULA = ?";
            ps = c1.prepareStatement(sql);
            ps.setString(1, aluno.nome);
            ps.setInt(2, aluno.ano);
            ps.setString(3, aluno.matricula);
            ps.executeUpdate();
        } finally {
            closeStatement(ps, c1);
        }
    }

    @Override
    public void excluir(String chave) throws SQLException {
        Connection c1 = null;
        PreparedStatement ps = null;

        try {
            c1 = getConnection();
            String sql = "DELETE FROM ALUNO WHERE MATRICULA = ?";
            ps = c1.prepareStatement(sql);
            ps.setString(1, chave);
            ps.executeUpdate();
        } finally {
            closeStatement(ps, c1);
        }
    }
}
