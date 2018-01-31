package br.questor.licenser.test;

import br.questor.licenser.control.LoginSenhaDAO;

public class LoginSenhaDAOTest {
    public static void main(String[] args){
        try{
            LoginSenhaDAO usdao = new LoginSenhaDAO();
            usdao.setDS_LOGIN("LUCAS");
            usdao.setDS_SENHA("123");
            usdao.select();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
