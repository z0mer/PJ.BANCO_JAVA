package controller;
import DAO.GeralDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import view.GerenteCadastrar;
import view.ClienteLogin;
import view.ClienteDebito;
import view.ClienteDeposito;
import view.ClienteExtrato;
import view.ClienteMenu;
import view.ClienteSaldo;

public class ControllerLoginCliente {
    private ClienteLogin view;
    
    public ControllerLoginCliente(ClienteLogin view){
        this.view = view;
    }
    
     public void loginCliente(){
        Cliente cliente;
        cliente = new Cliente(null,view.getCpflb().getText(),view.getSenhapss().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            GeralDAO dao = new GeralDAO(conn);
            ResultSet res = dao.consultar(cliente);
            if(res.next()){
                JOptionPane.showMessageDialog(view, "Login Feito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");
                String senha = res.getString("senha");
                String valor = res.getString("valor");
                String conta = res.getString("conta");
                ClienteLogin viewCliente = new ClienteLogin(new Cliente(nome, cpf, senha, valor, conta));
                viewCliente.setVisible(true);
                view.setVisible(false);
            } else{
                JOptionPane.showMessageDialog(view, "Login não efetuado", "Erro", JOptionPane.ERROR_MESSAGE);
                
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
                
        }
    }
}
