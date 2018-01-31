package br.questor.licenser.test;

import br.questor.licenser.control.EntidadesValidadeDAO;

public class EntidadesValidadeDAOTest {
    public static void main(String[] args){
        try{
        EntidadesValidadeDAO evdao = new EntidadesValidadeDAO(); 
        evdao.delete();
        evdao.insert();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
}
