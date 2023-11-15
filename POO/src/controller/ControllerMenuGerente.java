package controller;
import view.GerenteCadastrar;
import view.GerenteCriarContas;
import view.GerenteExcluirConta;
import view.GerenteExibirSaldoContas;
import view.GerenteMenu;

public class ControllerMenuGerente {
    private GerenteMenu view;
    
    public ControllerMenuGerente(GerenteMenu view){
        this.view = view;
    }
    
    public void mostraCadastro(){
        GerenteCadastrar viewGerenteCadastrar = new GerenteCadastrar();
        viewGerenteCadastrar.setVisible(true);
    }
    
    public void mostraExcluir(){
        GerenteExcluirConta viewGerenteExcluirConta = new GerenteExcluirConta();
        viewGerenteExcluirConta.setVisible(true);
    }
    
    public void mostraCriar(){
        GerenteCriarContas viewGerenteCriarContas = new GerenteCriarContas();
        viewGerenteCriarContas.setVisible(true);
    }
    
    public void mostraExibir(){
        GerenteExibirSaldoContas viewGerenteExibirSaldoContas = new GerenteExibirSaldoContas();
        viewGerenteExibirSaldoContas.setVisible(true);
    }
}
