package br.questor.licenser.test;

import br.questor.licenser.control.TipoRegistroDAO;

public class TipoRegistroDAOTest {
    public static void main(String[] args){
        try{
        TipoRegistroDAO trdao = new TipoRegistroDAO(); 
        trdao.select();
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
}
