package br.questor.licenser.model;

import javax.swing.JTextField;

public class LoginSenha {
    
    protected String DS_LOGIN;
    protected String DS_SENHA;
    
    public LoginSenha(){
        this.DS_LOGIN = " ";
        this.DS_SENHA = " ";
    }
    
    public LoginSenha(String DS_LOGIN, String DS_SENHA){
        this.DS_LOGIN = DS_LOGIN;
        this.DS_SENHA = DS_SENHA;
    }

    public String getDS_LOGIN() {
        return DS_LOGIN;
    }

    public void setDS_LOGIN(String DS_LOGIN) {
        this.DS_LOGIN = DS_LOGIN;
    }

    public String getDS_SENHA() {
        return DS_SENHA;
    }

    public void setDS_SENHA(String DS_SENHA) {
        this.DS_SENHA = DS_SENHA;
    }
}
