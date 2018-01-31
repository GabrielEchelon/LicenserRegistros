package br.questor.licenser.control;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    
    public static void init(String stringTipoDB)
    {
        
    }
    
    public static Connection getConnection() throws Exception{

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        return DriverManager.getConnection("jdbc:sqlserver://localhost:391;database=nGestao","sa","FGH567!");
    }
    
    public static String formatException (Throwable thr) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter (sw);
        thr.printStackTrace (pw);
        return sw.toString();
    }
}