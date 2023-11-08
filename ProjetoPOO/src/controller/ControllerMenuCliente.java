package controller;
import view.ClienteDebito;
import view.ClienteDeposito;
import view.ClienteExtrato;
import view.ClienteMenu;
import view.ClienteSaldo;


public class ControllerMenuCliente {
    private ClienteMenu view;
    
    public ControllerMenuCliente(ClienteMenu view) {
        this.view = view;
    }
    
    public void mostraDebitoCliente(){
        ClienteDebito viewClienteDebito = new ClienteDebito();
        viewClienteDebito.setVisible(true);
        
    }
    
        public void mostraDepositoCliente(){
        ClienteDeposito viewClienteDeposito = new ClienteDeposito();
        viewClienteDeposito.setVisible(true);
        
    }
    
        public void mostraSaldoCliente(){
            ClienteSaldo viewClienteSaldo = new ClienteSaldo();
            viewClienteSaldo.setVisible(true);
            
        }
        
        public void mostraExtratoCliente(){
            ClienteExtrato viewClienteExtrato = new ClienteExtrato();
            viewClienteExtrato.setVisible(true);
            
        }
}
