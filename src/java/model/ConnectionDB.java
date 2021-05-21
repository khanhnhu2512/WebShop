package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
  
public class ConnectionDB {
    private String userName = "sa";
    private String password = "1234";
    String connectionURL = "jdbc:sqlserver://KHANHNHU\\KHANHNHU:1433;"
            + "databaseName=Final;"
            + "user=" + userName
            + ";password=" + password + ";";

    Connection conn = null;
    private static final ConnectionDB instance = new ConnectionDB();
    private ConnectionDB(){}
    
    public Connection getConnection(){
        if(conn == null){
            return open();
        }
        return conn;
    }
    
    private Connection open(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionURL);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return conn;
    }
    
//    private void close() throws SQLException{
//        conn.close();
//    }
    
    public static ConnectionDB getInstance(){
        return instance;
    } 
    
    public static void main(String[] args) {
        Connection conn = ConnectionDB.getInstance().getConnection();
        if (conn != null) {
            System.out.println("Ket noi thanh cong");
        }else{
            System.out.println("Ket noi that bai");
        }
    }   
}