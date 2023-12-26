/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author khalifardy
 */
public class Database {
    static final String DB_URL = "jdbc:mysql://localhost:3306/PBO_Praktikum";
    static final String DB_USER = "admin";
    static final String DB_PASS = "Ayu20021993";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public Database() throws SQLException{
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            stmt = conn.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),
                    "ConnectionError",JOptionPane.WARNING_MESSAGE);
            
        }
        
    }
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:"+e.getMessage()
                    ,"Communication Error",
                    JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Error:"+e.getMessage(),"Communication Error",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void query_update(String SQLString,String nama, String nim, String prodi, int id){
        try{
            PreparedStatement preparedStatement=conn.prepareStatement(SQLString);
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, nim);
            preparedStatement.setString(3, prodi);
            preparedStatement.setInt(4, id);
            
            preparedStatement.executeUpdate();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Error:"+e.getMessage(),"Communication Error",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void query_delete(String SQLString,int id){
        try{
            PreparedStatement preparedStatement=conn.prepareStatement(SQLString);
            preparedStatement.setInt(1, id); 
            preparedStatement.executeUpdate();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Error:"+e.getMessage(),"Communication Error",
                JOptionPane.WARNING_MESSAGE);
        }
    }

    public void closeConn(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
