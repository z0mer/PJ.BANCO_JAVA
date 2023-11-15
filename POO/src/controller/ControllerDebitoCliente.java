import DAO.GeralDAO;
import model.Cliente;

public class ControllerDebitoCliente

    private GeralDAO dao;

    public ControllerDebitoCliente(GeralDAO dao) {
        this.dao = dao;
    }

    public void debito() {
        try {
            String cpf = obterCpfDaInterface();
            String senha = obterSenhaDaInterface();
            double valor = obterValorDaInterface();
            String tipoConta = obterTipoContaDaInterface();

            Cliente cliente = new Cliente(null, cpf, senha, valor, tipoConta);

            dao.insertBancoDeDados(cliente);

            if (tipoConta.equalsIgnoreCase("Salario")) {
                double saldoAtual = dao.consultarSaldoContaSalario(cliente);
                double valorDebitoComTaxa = valor * 1.05;

                if (saldoAtual - valorDebitoComTaxa >= 0) {
                    dao.debitarContaSalario(cliente, valorDebitoComTaxa);
                    dao.adicionarRegistroDebitoContaSalario(cliente, valorDebitoComTaxa);
                    exibirMensagem("Débito realizado com sucesso.");
                } else {
                    exibirErro("Saldo insuficiente para realizar o débito na conta salário.");
                }
            } else if (tipoConta.equalsIgnoreCase("Corrente")) {
                // Lógica para conta corrente
                double saldoAtual = dao.consultarSaldoContaCorrente(cliente);
                double valorDebitoComTaxa = valor * 1.01; // 1% de taxa

                if (saldoAtual - valorDebitoComTaxa >= -cliente.getLimite()) {
                    dao.debitarContaCorrente(cliente, valorDebitoComTaxa);
                    dao.adicionarRegistroDebitoContaCorrente(cliente, valorDebitoComTaxa);
                    exibirMensagem("Débito realizado com sucesso.");
                } else {
                    exibirErro("Saldo insuficiente para realizar o débito na conta corrente.");
                }
            } else {
                exibirMensagem("Cadastro realizado com sucesso.");
            }
        } catch (SQLException e) {
            exibirErro("Erro no débito: " + e.getMessage());
        }
    }
}
