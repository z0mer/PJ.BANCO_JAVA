package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;
import model.Gerente;

public class GeralDAO {
    private Connection conn;

    public GeralDAO(Connection conn) {
        this.conn = conn;
    }

    public void inserirCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (cpf, senha, valor, tipo_conta) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.setString(2, cliente.getSenha());
            statement.setDouble(3, cliente.getValor());
            statement.setString(4, cliente.getTipoConta());
            statement.execute();
            conn.close();
        }
    }

    public ResultSet consultarCliente(Cliente cliente) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE cpf = ? AND senha = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.setString(2, cliente.getSenha());
            statement.execute();
            return statement.getResultSet();
            return resultado;
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
            conn.close();
        }
    }

    public void removerCliente(Cliente cliente) throws SQLException {
        String sql = "DELETE FROM cliente WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.execute();
            conn.close();
        }
    }

    public void inserirGerente(Gerente gerente) throws SQLException {
        String sql = "INSERT INTO gerente (cpf) VALUES (?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, gerente.getCpf());
            statement.execute();
            conn.close();
        }
    }

    public ResultSet consultarGerente(Gerente gerente) throws SQLException {
        String sql = "SELECT * FROM gerente WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, gerente.getCpf());
            statement.execute();
            return statement.getResultSet();
            return resultado;
        }
    }

    public void atualizarGerente(Gerente gerente) throws SQLException {
        
    }

    public void removerGerente(Gerente gerente) throws SQLException {
        String sql = "DELETE FROM gerente WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, gerente.getCpf());
            statement.execute();
            conn.close();
        }
    }

    public void debitarContaSalario(Cliente cliente) throws SQLException {
        String tipoConta = cliente.getTipoConta();

        if (tipoConta.equalsIgnoreCase("Salario")) {
            double saldoAtual = consultarSaldoContaSalario(cliente);
            double valorDebitoComTaxa = cliente.getValor() * 1.05;

            if (saldoAtual >= valorDebitoComTaxa) {
                double novoSaldo = saldoAtual - valorDebitoComTaxa;
                atualizarSaldoContaSalario(cliente, novoSaldo);
                adicionarRegistroDebitoContaSalario(cliente, valorDebitoComTaxa);
            } else {
                throw new SQLException("Saldo insuficiente para realizar o débito na conta salário.");
            }
        } else {
            throw new SQLException("Operação de débito não permitida para este tipo de conta.");
        }
    }

    private double consultarSaldoContaSalario(Cliente cliente) throws SQLException {
        String sql = "SELECT saldo FROM contasalario WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.execute();
            ResultSet resultado = statement.getResultSet();
            if (resultado.next()) {
                return resultado.getDouble("saldo");
            } else {
                throw new SQLException("Cliente não encontrado.");
            }
        }
    }

    private void atualizarSaldoContaSalario(Cliente cliente, double novoSaldo) throws SQLException {
        String sql = "UPDATE contasalario SET saldo = ? WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setDouble(1, novoSaldo);
            statement.setString(2, cliente.getCpf());
            statement.execute();
        }
    }

    private void adicionarRegistroDebitoContaSalario(Cliente cliente, double valorDebito) throws SQLException {
        String sql = "INSERT INTO historico_debitos_contasalario (cpf_cliente, valor_debito) VALUES (?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.setDouble(2, valorDebito);
            statement.execute();
        }
    }

    public void debitarContaCorrente(Cliente cliente) throws SQLException {
        String tipoConta = cliente.getTipoConta();

        if (tipoConta.equalsIgnoreCase("Corrente")) {
            double saldoAtual = consultarSaldoContaCorrente(cliente);
            double valorDebitoComTaxa = cliente.getValor() * 1.01; // 1% de taxa

            double limiteContaCorrente = consultarLimiteContaCorrente(cliente);

            if (saldoAtual - valorDebitoComTaxa >= -limiteContaCorrente) {
                double novoSaldo = saldoAtual - valorDebitoComTaxa;
                atualizarSaldoContaCorrente(cliente, novoSaldo);
                adicionarRegistroDebitoContaCorrente(cliente, valorDebitoComTaxa);
            } else {
                throw new SQLException("Saldo insuficiente para realizar o débito na conta corrente.");
            }
        } else {
            throw new SQLException("Operação de débito não permitida para este tipo de conta.");
        }
    }

    public void debitarContaPoupanca(Cliente cliente) throws SQLException {
        String tipoConta = cliente.getTipoConta();

        if (tipoConta.equalsIgnoreCase("Poupanca")) {
            double saldoAtual = consultarSaldoContaPoupanca(cliente);
            double valorDebito = cliente.getValor();

            if (saldoAtual - valorDebito >= 0) {
                double novoSaldo = saldoAtual - valorDebito;
                atualizarSaldoContaPoupanca(cliente, novoSaldo);
                adicionarRegistroDebitoContaPoupanca(cliente, valorDebito);
            } else {
                throw new SQLException("Saldo insuficiente para realizar o débito na conta poupança.");
            }
        } else {
            throw new SQLException("Operação de débito não permitida para este tipo de conta.");
        }
    }

    private double consultarSaldoContaCorrente(Cliente cliente) throws SQLException {
        String sql = "SELECT saldo FROM contacorrente WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.execute();
            ResultSet resultado = statement.getResultSet();
            if (resultado.next()) {
                return resultado.getDouble("saldo");
            } else {
                throw new SQLException("Cliente não encontrado.");
            }
        }
    }

    private double consultarLimiteContaCorrente(Cliente cliente) throws SQLException {
        String sql = "SELECT limite FROM contacorrente WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.execute();
            ResultSet resultado = statement.getResultSet();
            if (resultado.next()) {
                return resultado.getDouble("limite");
            } else {
                throw new SQLException("Limite não encontrado para a conta corrente.");
            }
        }
    }

    private void atualizarSaldoContaCorrente(Cliente cliente, double novoSaldo) throws SQLException {
        String sql = "UPDATE contacorrente SET saldo = ? WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setDouble(1, novoSaldo);
            statement.setString(2, cliente.getCpf());
            statement.execute();
        }
    }

    private void adicionarRegistroDebitoContaCorrente(Cliente cliente, double valorDebito) throws SQLException {
        String sql = "INSERT INTO historico_debitos_contacorrente (cpf_cliente, valor_debito) VALUES (?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.setDouble(2, valorDebito);
            statement.execute();
        }
    }

    private double consultarSaldoContaPoupanca(Cliente cliente) throws SQLException {
        String sql = "SELECT saldo FROM contapoupanca WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.execute();
            ResultSet resultado = statement.getResultSet();
            if (resultado.next()) {
                return resultado.getDouble("saldo");
            } else {
                throw new SQLException("Cliente não encontrado.");
            }
        }
    }

    private void atualizarSaldoContaPoupanca(Cliente cliente, double novoSaldo) throws SQLException {
        String sql = "UPDATE contapoupanca SET saldo = ? WHERE cpf = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setDouble(1, novoSaldo);
            statement.setString(2, cliente.getCpf());
            statement.execute();
        }
    }

    private void adicionarRegistroDebitoContaPoupanca(Cliente cliente, double valorDebito) throws SQLException {
        String sql = "INSERT INTO historico_debitos_contapoupanca (cpf_cliente, valor_debito) VALUES (?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.setDouble(2, valorDebito);
            statement.execute();
        }
    }
}