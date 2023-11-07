package controller;
import view.ClienteLogin;
import view.GerenteMenu;
import view.TelaInicial;

public class ControllerTelaInicial {
    private TelaInicial view;
    
    public ControllerTelaInicial(TelaInicial view) {
        this.view = view;
    }
 
    
    public void mostraTelaLoginCliente(){
        ClienteLogin viewClienteLogin = new ClienteLogin();
        viewClienteLogin.setVisible(true);
        
    }
    
    public void mostraTelaGerente(){
        GerenteMenu viewGerenteMenu = new GerenteMenu();
        viewGerenteMenu.setVisible(true);
    }
}