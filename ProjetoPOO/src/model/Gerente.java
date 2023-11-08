package model;

public class Gerente {
  private String cpf, senha;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }

  public Gerente(String cpf, String senha){
    this.cpf = cpf;
    this.senha = senha;
  }

  public Gerente(){

  }

}
