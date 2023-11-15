package ProjetoPOO;
import view.TelaInicial;
import DAO.GeralDAO;
import DAO.Conexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.SQLException;

public class ProjetoPOO {
    
    public static void main(String[] args) {
        TelaInicial viewTelaInicial = new TelaInicial();
        viewTelaInicial.setVisible(true);
    }
    
}
