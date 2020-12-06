package hospital.management.system.persistencia.postgresql;

import hospital.management.system.entidades.Enfermeiro;
import hospital.management.system.persistencia.EnfermeiroDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnfermeiroDAOPostgreSQL implements EnfermeiroDAO {
    
    private Connection conexao;
    
    private void abrirConexao() {
        try {
            conexao = DriverManager.getConnection("jdbc:postgresql://", "postgre", "");
        } catch (SQLException ex) {
            Logger.getLogger(EnfermeiroDAOPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fecharConexao() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnfermeiroDAOPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void inserir(Enfermeiro enfermeiro) {
        try {
            abrirConexao();
            
            String sql = "INSERT INTO enfermeiro (nome, cpf, telefone, funcao, horario, salario, registro, horarioPlantao) VALUES ('?', '?', '?', '?', '?', ?, ?, '?');";
            
            PreparedStatement pstm = conexao.prepareStatement(sql);
            
            pstm.setString(1, enfermeiro.getNome());
            pstm.setString(2, enfermeiro.getCpf());
            pstm.setString(3, enfermeiro.getTelefone());
            pstm.setString(4, enfermeiro.getFuncao());
            pstm.setString(5, enfermeiro.getHorario());
            pstm.setDouble(6, enfermeiro.getSalario());
            pstm.setInt(7, enfermeiro.getRegistro());
            pstm.setString(8, enfermeiro.getHorarioPlantao());
            
            pstm.execute();
            
            fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(EnfermeiroDAOPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editar(Enfermeiro enfermeiro) {
        try {
            abrirConexao();
            
            String sql = "UPDATE enfermeiroSET nome = ?, cpf = ?, telefone = ?, funcao = ?, horario = ?, salario = ?, registro = ?, horarioPlantao = ? WHERE  id = ?;";
            PreparedStatement pstm = conexao.prepareStatement(sql);
            
            pstm.setString(1, enfermeiro.getNome());
            pstm.setString(2, enfermeiro.getCpf());
            pstm.setString(3, enfermeiro.getTelefone());
            pstm.setString(4, enfermeiro.getFuncao());
            pstm.setString(5, enfermeiro.getHorario());
            pstm.setDouble(6, enfermeiro.getSalario());
            pstm.setInt(7, enfermeiro.getRegistro());
            pstm.setString(8, enfermeiro.getHorarioPlantao());
            pstm.setInt(9, enfermeiro.getId());
            
            pstm.execute();
            
            fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(EnfermeiroDAOPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean remover(int id) {
        try {
            abrirConexao();
            
            String sql = "DELETE FROM enfermeiro WHERE id = " + id + ";";
            
            conexao.createStatement().executeUpdate(sql);
            
            fecharConexao();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EnfermeiroDAOPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Enfermeiro getById(int id) {
        Enfermeiro enfermeiro = null;
        try {
            abrirConexao();
            
            String sql = "SELECT * FROM enfermeiro WHERE id = " + id + ";";
            
            ResultSet rs = conexao.createStatement().executeQuery(sql);
            
            if (rs.next()) {
                enfermeiro = new Enfermeiro();
                enfermeiro.setId(id);
                enfermeiro.setNome(rs.getString("nome"));
                enfermeiro.setCpf(rs.getString("cpf"));
                enfermeiro.setTelefone(rs.getString("telefone"));
                enfermeiro.setFuncao(rs.getString("funcao"));
                enfermeiro.setHorario(rs.getString("horario"));
                enfermeiro.setSalario(rs.getDouble("salario"));
                enfermeiro.setRegistro(rs.getInt("registro"));
                enfermeiro.setHorarioPlantao(rs.getString("horarioPlantao"));
            }
            rs.close();
            fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(EnfermeiroDAOPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enfermeiro;
    }

    @Override
    public List<Enfermeiro> listar() {
        List<Enfermeiro> lista = new ArrayList<Enfermeiro>();
        try {
            abrirConexao();
            
            String sql = "SELECT * FROM enfermeiro;";
            
            ResultSet rs = conexao.createStatement().executeQuery(sql);
            
            if (rs.next()) {
                Enfermeiro enfermeiro = new Enfermeiro();
                enfermeiro.setId(rs.getInt("id"));
                enfermeiro.setNome(rs.getString("nome"));
                enfermeiro.setCpf(rs.getString("cpf"));
                enfermeiro.setTelefone(rs.getString("telefone"));
                enfermeiro.setFuncao(rs.getString("funcao"));
                enfermeiro.setHorario(rs.getString("horario"));
                enfermeiro.setSalario(rs.getDouble("salario"));
                enfermeiro.setRegistro(rs.getInt("registro"));
                enfermeiro.setHorarioPlantao(rs.getString("horarioPlantao"));
                lista.add(enfermeiro);
            }
            rs.close();
            fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(EnfermeiroDAOPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}