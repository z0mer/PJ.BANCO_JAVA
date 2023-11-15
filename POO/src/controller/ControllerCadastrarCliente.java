package controller;
import DAO.Conexao;
import DAO.GeralDAO;
import model.Gerente;
import view.GerenteCadastrar;

//public class ControllerCadastrarCliente {
//    private GerenteCadastrar view;
//    
//    public ControllerCadastrarCliente(GerenteCadastrar view) {
//        this.view = view;
//    }
//    
//    public void cadastraCliente (){
//        
//        String nome = view.getNome_cliente().getText();
//        String senha = view.getSenha_cliente().getText();
//        String valor = view.getValor_cliente().getText();
//        String cpf = view.getCpf_cliente().getText();
//        cpf = cpf.replaceAll("[^0-9]", "").replaceAll("[.,]", "");
//        
//        
//        double valor = Double.parseDouble(valor);
//        int cpf = Integer.parseInt(cpf);
//        
//        Gerente gerente = new Gerente(nome, senha, valor, cpf);
//        
//        try{
//            Connection conexao = new Conexao().getConnection();
//            GeralDAO geralDao = new GeralDAO(conexao);
//            geralDao
//            
//        }
//    }
//}
