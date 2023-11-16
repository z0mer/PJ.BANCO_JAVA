package model;

public class Cliente extends Pessoa {
    private String senha;
    private double valor;
    private String tipoConta;

    public Cliente(String nome, String cpf, String senha, double valor, String tipoConta) {
        super(nome, cpf);
        this.senha = senha;
        this.valor = valor;
        this.tipoConta = tipoConta;
    }

    /*public Cliente(Object object, String text, String text0) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Cliente(String nome, String cpf, String senha, String valor, String conta) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getLimite() {
        return 1000.0; 
    }
}
