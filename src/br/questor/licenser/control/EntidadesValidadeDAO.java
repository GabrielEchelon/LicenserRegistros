package br.questor.licenser.control;

import br.questor.licenser.model.EntidadesValidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EntidadesValidadeDAO extends EntidadesValidade{
    
    public void insert() throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = DAO.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement ("INSERT INTO TBL_ENTIDADES_VALIDADE (CD_ENTIDADE, CD_TIPO_REGISTRO, DS_REGISTRO, DT_VALIDADE)\n" +
"		SELECT TBLE.CD_ENTIDADE,\n" +
"		CASE \n" +
"			SUBSTRING(TBLEC.DS_COMENTARIO, CHARINDEX('#',TBLEC.DS_COMENTARIO)-3,3)\n" +
"			WHEN 'TR' THEN 1\n" +
"			WHEN 'CR' THEN 2\n" +
"			WHEN 'CRC' THEN 3\n" +
"			WHEN 'CLF' THEN 4 \n" +
"		END AS CD_TIPO_REGISTRO,\n" +
"		REPLACE(\n" +
"			CONCAT(\n" +
"				SUBSTRING(TBLEC.DS_COMENTARIO, CHARINDEX('-',TBLEC.DS_COMENTARIO)-9,9),'-',\n" +
"				SUBSTRING(TBLEC.DS_COMENTARIO, CHARINDEX('-',TBLEC.DS_COMENTARIO)+1,1)), '*', '') AS DS_REGISTRO,\n" +
"		CAST(SUBSTRING(TBLEC.DS_COMENTARIO, CHARINDEX('D-', TBLEC.DS_COMENTARIO)+2,10) AS DATE) AS DT_VALIDADE\n" +
"		FROM TBL_ENTIDADES TBLE\n" +
"		JOIN TBL_ENTIDADES_COMENTARIOS TBLEC ON TBLE.CD_ENTIDADE = TBLEC.CD_ENTIDADE\n" +
"		WHERE TBLEC.DS_COMENTARIO IN \n" +
"			(SELECT DS_COMENTARIO \n" +
"			FROM TBL_ENTIDADES_COMENTARIOS \n" +
"			WHERE  DS_COMENTARIO LIKE '%#%' AND DS_COMENTARIO IS NOT NULL);");
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
            
            ps = con.prepareStatement("SELECT * FROM TBL_ENTIDADES_VALIDADE ORDER BY CD_VALIDADE");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
            System.out.println("Cód. Validade: " + rs.getInt("CD_TIPO_REGISTRO"));
            System.out.println("Cód. Entidade: " + rs.getInt("CD_ENTIDADE"));
            System.out.println("Cód. Tipo Registro: " + rs.getInt("CD_TIPO_REGISTRO"));
            System.out.println("Descrição Registro: " + rs.getString("DS_REGISTRO"));
            System.out.println("Data de Validade: " + rs.getDate("DT_VALIDADE"));
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
            
            ps = con.prepareStatement ("DELETE FROM TBL_ENTIDADES_VALIDADE; \n" + 
"               DBCC CHECKIDENT('TBL_ENTIDADES_VALIDADE', RESEED, 0);");
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