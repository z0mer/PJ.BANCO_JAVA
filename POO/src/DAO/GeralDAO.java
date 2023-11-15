package DAO;
import model.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Gerente;

public class GeralDAO {
    private Connection conn;  

    public GeralDAO(Connection conn) {
        this.conn = conn;
    }
  
    public ResultSet consultarCliente (Cliente cliente) throws SQLException{
        String sql = "select * from cliente where cpf = '"+cliente.getCpf()+"' AND senha = '"+cliente.getSenha()+"'";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.setString(2, cliente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserirCliente(Cliente cliente) throws SQLException{
        String sql = "insert into cliente (cpf, senha) values ('"+cliente.getCpf()+"', '"+cliente.getSenha()+"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void atualizarCliente (Cliente cliente) throws SQLException{
        String sql = "update cliente set senha = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getSenha());
        statement.setString(2, cliente.getCpf());
        statement.execute();
        conn.close();
    }
    
    public void removerCliente (Cliente cliente) throws SQLException{
        String sql = "delete from cliente where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cliente.getCpf());
        statement.execute();
        conn.close();
    }
    
    public ResultSet consultarGerente (Gerente gerente) throws SQLException{
        String sql = "select * from gerente where cpf = '"+gerente.getCpf()+"' AND senha = '"+gerente.getSenha()+"'";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getCpf());
        statement.setString(2, gerente.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserirGerente(Gerente gerente) throws SQLException{
        String sql = "insert into gerente (cpf, senha) values ('"+gerente.getCpf()+"', '"+gerente.getSenha()+"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void atualizarGerente (Gerente gerente) throws SQLException{
        String sql = "update gerente set senha = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getSenha());
        statement.setString(2, gerente.getCpf());
        statement.execute();
        conn.close();
    }
    
    public void removerGerente (Gerente gerente) throws SQLException{
        String sql = "delete from gerente where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, gerente.getCpf());
        statement.execute();
        conn.close();
    }
    
}
