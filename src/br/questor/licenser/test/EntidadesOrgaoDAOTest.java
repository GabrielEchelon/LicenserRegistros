package br.questor.licenser.test;

import br.questor.licenser.control.EntidadesOrgaoDAO;

public class EntidadesOrgaoDAOTest {
    public static void main(String[] args){
        try{
        EntidadesOrgaoDAO eodao = new EntidadesOrgaoDAO(); 
        eodao.select();
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
}
