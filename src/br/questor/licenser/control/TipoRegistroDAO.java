package br.questor.licenser.control;

import br.questor.licenser.model.TipoRegistro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TipoRegistroDAO extends TipoRegistro{
    
    public void insert() throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = DAO.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement ("INSERT INTO TBL_TIPO_REGISTRO (CD_ORGAO, DS_TIPO_REGISTRO, SG_TIPO_REGISTRO) VALUES (?,?,?)");
            ps.setInt(1, this.getCD_ORGAO());
            ps.setString(2, this.getDS_TIPO_REGISTRO());
            ps.setString(3, this.getSG_TIPO_REGISTRO());
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
            
            ps = con.prepareStatement("SELECT * FROM TBL_TIPO_REGISTRO ORDER BY CD_TIPO_REGISTRO");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
            System.out.println("Cód Registro: " + rs.getInt("CD_TIPO_REGISTRO"));
            System.out.println("Cód. Orgão: " + rs.getString("CD_ORGAO"));
            System.out.println("Descrição Registro: " + rs.getString("DS_TIPO_REGISTRO"));
            System.out.println("Sigla do Registro: " + rs.getString("SG_TIPO_REGISTRO"));
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
            
            ps = con.prepareStatement ("DELETE FROM TBL_TIPO_REGISTRO WHERE CD_TIPO_REGISTRO = ?");
            ps.setInt(1, this.getCD_TIPO_REGISTRO());
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