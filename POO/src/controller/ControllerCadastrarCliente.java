import DAO.GeralDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Gerente;
import view.GerenteCadastrar;

public class ControllerCadastrarCliente {
    private GerenteCadastrar view;
    public ControllerCadastrarCliente(GerenteCadastrar view){
        this.view = view;
    }
    
    public void salvarCliente(){
        String nome = view.getLb_nome_cliente().getText();
        String cpf = view.getLb_cpf_cliente().getText();
        String senha = view.getLb_senha_cliente().getText();
        String valor = view.getLb_valor_cliente().getText();
        String conta = view.getLb_tipo_conta().getText();
        Gerente gerente = new Gerente(nome, cpf, senha, valor, conta);
        
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            GeralDAO dao = new GeralDAO(conn);
            dao.inserir(aluno);
            JOptionPane.showMessageDialog(view, "Cliente Cadastrado!","Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Falha na conexão!","Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}
