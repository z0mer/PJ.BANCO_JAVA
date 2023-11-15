package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;
import model.Gerente;
import model.Pessoa;

public class GeralDAO {
    private Connection conn;

    public GeralDAO(Connection conn) {
        this.conn = conn;
    }

    
    public void inserirPessoa(Pessoa pessoa) throws SQLException {
        String sql = "INSERT INTO pessoa (nome, cpf) VALUES (?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getCpf());
            statement.execute();
        }
    }

    public ResultSet consultarPessoa(Pessoa pessoa) throws SQLException {
        String sql = "SELECT * FROM pessoa WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, pessoa.getCpf());
            statement.execute();
            return statement.getResultSet();
        }
    }

    public void atualizarPessoa(Pessoa pessoa) throws SQLException {
        String sql = "UPDATE pessoa SET nome = ? WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, pessoa.getNome());
            statement.setString(2, pessoa.getCpf());
            statement.execute();
        }
    }

    public void removerPessoa(Pessoa pessoa) throws SQLException {
        String sql = "DELETE FROM pessoa WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, pessoa.getCpf());
            statement.execute();
        }
    }

    public void inserirCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (cpf, senha, valor, tipo_conta) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.setString(2, cliente.getSenha());
            statement.setDouble(3, cliente.getValor());
            statement.setString(4, cliente.getTipoConta());
            statement.execute();
        }
    }

    public ResultSet consultarCliente(Cliente cliente) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE cpf = ? AND senha = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.setString(2, cliente.getSenha());
            statement.execute();
            return statement.getResultSet();
        }
    }

    public void atualizarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET senha = ?, valor = ?, tipo_conta = ? WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getSenha());
            statement.setDouble(2, cliente.getValor());
            statement.setString(3, cliente.getTipoConta());
            statement.setString(4, cliente.getCpf());
            statement.execute();
        }
    }

    public void removerCliente(Cliente cliente) throws SQLException {
        String sql = "DELETE FROM cliente WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.execute();
        }
    }

    public void inserirGerente(Gerente gerente) throws SQLException {
        String sql = "INSERT INTO gerente (cpf) VALUES (?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, gerente.getCpf());
            statement.execute();
        }
    }

    public ResultSet consultarGerente(Gerente gerente) throws SQLException {
        String sql = "SELECT * FROM gerente WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, gerente.getCpf());
            statement.execute();
            return statement.getResultSet();
        }
    }

    public void atualizarGerente(Gerente gerente) throws SQLException {

    }

    public void removerGerente(Gerente gerente) throws SQLException {
        String sql = "DELETE FROM gerente WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, gerente.getCpf());
            statement.execute();
        }
    }
}
