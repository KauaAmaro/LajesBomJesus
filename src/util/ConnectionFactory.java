/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author kauan
 */
public class ConnectionFactory {
    
    public static  final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/agenda";
    public static final String USER = "root";
    public static final String PASS = "";
    
     public static Connection getConnection(){
     
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
            
        } catch ( Exception ex) {
            throw new RuntimeException("Erro na Conexao", ex);
        }
         
     } 
     
     public static void closeConnection(Connection connection){
         
         if(connection != null){
             try {
                 connection.close();
             } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
             }
         }
     
     }

    
    
}