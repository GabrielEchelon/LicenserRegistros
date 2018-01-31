package br.questor.licenser.control;

import br.questor.licenser.model.EntidadesOrgao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EntidadesOrgaoDAO extends EntidadesOrgao{
    
    public void insert() throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = DAO.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement ("INSERT INTO TBL_ENTIDADES_ORGAO (DS_ORGAO, SG_ORGAO) VALUES (?,?)");
            ps.setString(1, this.getDS_ORGAO());
            ps.setString(2, this.getSG_ORGAO());
            ps.executeUpdate();

            con.commit();

        }
        catch(Exception ex){
            con.rollback();
        }
        finally{
            if(ps != null){
                ps.close();
            }
            if(con != null){
              con.close();
            }
        }
    }
        
    public void select() throws Exception{
        Connection con = DAO.getConnection();
        PreparedStatement ps = null;
        try{
            con = DAO.getConnection();
            con.setAutoCommit(false);
            
            ps = con.prepareStatement("SELECT * FROM TBL_ENTIDADES_ORGAO ORDER BY CD_ORGAO");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
            System.out.println("Cód Orgão: " + rs.getInt("CD_ORGAO"));
            System.out.println("Descrição Orgão: " + rs.getString("DS_ORGAO"));
            System.out.println("Sigla Orgão: " + rs.getString("SG_ORGAO"));
            System.out.println("");
            }
            rs.close();
            con.commit();
        }
        catch(Exception ex){
            con.rollback();
        }
        finally{
            if(ps != null){
                ps.close();
            }
            if(con != null){
              con.close();
            }
        }      
    }
    
    public void delete() throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = DAO.getConnection();
            con.setAutoCommit(false);
            
            ps = con.prepareStatement ("DELETE FROM TBL_ENTIDADES_ORGAO WHERE CD_ORGAO = ?");
            ps.setInt(1, this.getCD_ORGAO());
            ps.executeUpdate();
            con.commit();
        }
        catch(Exception ex){
            con.rollback();
        }
        finally{
            if(ps != null){
                ps.close();
            }
            if(con != null){
              con.close();
            }
        }
    }
}