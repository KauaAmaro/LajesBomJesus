/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.clientes;

/**
 *
 * @author kauan
 */
public class TaskTableModel  extends AbstractTableModel {

    String[] Column = {"Nome", "Endereço", "Telefone", "Data Venda", "Data Entrada", "Valor", "Vendedor", "Editar", "Excluir"};
    List<clientes> tasks = new ArrayList();
    
    @Override
    public int getRowCount() {
       return tasks.size();
        
    }

    @Override
    public int getColumnCount() {
        return Column.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 1:
                
                return tasks.get(rowIndex).getNAME();
                
                
                case 2:  
                return tasks.get(rowIndex).getENDEREÇO();
               
                case 3:  
                
             return tasks.get(rowIndex).getTELEFONE();
                
                case 4:  
                
                return tasks.get(rowIndex).getDATAVEN();
                
                case 5:  
                
                return tasks.get(rowIndex).getDATAENT();
                
                case 7:  
                
                return tasks.get(rowIndex).getVALOR();
                
                case 8:  
                
               return tasks.get(rowIndex).getNOME_VENDEDOR();
               
                case 9:  
                
               return "";
               
                case 10:  
                
               return "";
               
                default:
                    return "Dados não encontrados";
        }
        
              
        
    }

    public String[] getColumn() {
        return Column;
    }

    public List<clientes> getTasks() {
        return tasks;
    }

    public void setTasks(List<clientes> tasks) {
        this.tasks = tasks;
    }
    
    
}          
                
        
    
    

   
        