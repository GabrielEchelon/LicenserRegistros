package br.questor.licenser.control;

import br.questor.licenser.model.LoginSenha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginSenhaDAO extends LoginSenha{
    
    public void select() throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = DAO.getConnection();
            con.setAutoCommit(false);
            
            ps = con.prepareStatement("SELECT DS_LOGIN, DS_SENHA FROM TBL_USUARIOS WHERE DS_LOGIN = ? AND DS_SENHA = ?");
            ps.setString(1, this.getDS_LOGIN());
            ps.setString(2, this.getDS_SENHA());
            ps.executeQuery();
            
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
            System.out.println("Usuario: " + rs.getString("DS_LOGIN"));
            System.out.println("Senha: " + rs.getString("DS_SENHA"));
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
    public LoginSenha findByLoginSenha(String DS_LOGIN, String DS_SENHA) throws SQLException, Exception {
        boolean  boo = false;
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = DAO.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement("SELECT DS_LOGIN, DS_SENHA FROM TBL_USUARIOS WHERE DS_USUARIO = ? AND DS_SENHA = ?");
            ps.setString(1, DS_LOGIN);
            ps.setString(2, DS_SENHA);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                LoginSenha ls = new LoginSenha();
                ls.setDS_LOGIN(rs.getString("DS_LOGIN"));
                ls.setDS_SENHA(rs.getString("DS_SENHA"));
                return ls; 
            }
            else {
                return null;
            }
            
            
        } catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            if (con != null){
                try{
                    con.close();
                } catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        }

    }
}