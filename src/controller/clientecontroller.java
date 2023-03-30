package controller;

import model.clientes;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
// import java.sql.SQLException;
import util.ConnectionFactory;

/**
 *
 * @author kauan
 */
public class clientecontroller {


    //private int getValor;
    
    public void save( clientes c){
        
         String sql = "INSERT INTO CLIENTES (ID," 
                 + "NAME,"
                + " ENDEREÇO,"
                + " TELEFONE,"
                 + "DATAVEN,"
                 + "DATAENT,"
                 + "VALOR, "
                 + "NOME_VENDEDOR)"
                + "VALUES(?,?, ?, ?, ?, ?, ?, ?)";
    
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            
          
         connection = ConnectionFactory.getConnection(); 
         statement = connection.prepareStatement(sql);
         statement.setInt(1, c.getID());
         statement.setString(2, c.getNAME());
         statement.setString(3, c.getENDEREÇO());
         statement.setInt(4, c.getTELEFONE());
        statement.setDate(5, new Date (c.getDATAVEN().getTime()));
         statement.setDate(6, new Date (c.getDATAENT().getTime()));
         statement.setInt(7, c.getVALOR());
         statement.setString(8, c.getNOME_VENDEDOR());
         
         statement.execute();
             
        }catch(Exception ex){
          throw new RuntimeException("Erro ao salvar a tabela", ex);       
        }finally {
         ConnectionFactory.closeConnection(connection);
            
        }
        
        
    }
    
    
     public void update(clientes c ) {

        String sql = "UPDATE clientes SET  NAME = ?, ENDEREÇO = ?, TELEFONE = ?, DATAVEN = ?, DATAENT = ?, VALOR = ?, NOME_VENDEDOR = ? WHERE ID = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            
         connection = ConnectionFactory.getConnection(); 
         statement = connection.prepareStatement(sql);
      
         statement.setString(1, c.getNAME());
         statement.setString(2, c.getENDEREÇO());
         statement.setInt(3, c.getTELEFONE());
         statement.setDate(4, new Date (c.getDATAVEN().getTime()));
         statement.setDate(5, new Date (c.getDATAENT().getTime()));
         statement.setInt(6, c.getVALOR());
         statement.setString(7, c.getNOME_VENDEDOR());
         statement.setInt(8, c.getID());
         
         statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro em atualizar o projeto", ex);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexÃ£o", ex);
            }
        }
    }
     
       public List<clientes> getAll() {
        String sql = "SELECT * FROM clientes";

        List<clientes> Cliente = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);

            rset = stmt.executeQuery();

            //Enquanto existir dados no banco de dados, faï¿½a
            while (rset.next()) {

                clientes Clientes = new clientes();

                Clientes.setID(rset.getInt("ID"));
                Clientes.setNAME(rset.getString("NAME"));
                Clientes.setENDEREÇO(rset.getString("ENDEREÇO"));
                Clientes.setTELEFONE(rset.getInt("TELEFONE"));
                Clientes.setDATAVEN(rset.getDate("DATAVEN"));
                Clientes.setDATAENT(rset.getDate("DATAENT"));
                Clientes.setVALOR(rset.getInt("VALOR"));
                Clientes.setNOME_VENDEDOR(rset.getString("NOME_VENDEDOR"));
               
                Cliente.add(Clientes);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar os projetos", ex);
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexÃ£o", ex);
            }
        }
        return Cliente;
    }
     
      public void removeById(int ID) {

        String sql = "DELETE FROM clientes WHERE ID = ?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, ID);
            stmt.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar o projeto", ex);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexÃ£o", ex);
            }
        }

    }

    public List<clientes> getAll(int ID) throws SQLException {
        
         ResultSet rset = null;
        
        while (rset.next()) {
               clientes Clientes = new clientes();

             try {
                 Clientes.setID(rset.getInt("ID"));
             } catch (SQLException ex) {
                 Logger.getLogger(clientecontroller.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        }
        
    

 




