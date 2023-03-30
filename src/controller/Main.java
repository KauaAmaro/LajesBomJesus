/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;



import model.clientes;

/**
 *
 * @author kauan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        clientecontroller c = new clientecontroller();
        clientes Cliente = new clientes();
        
       
        Cliente.setNAME("malu");
        Cliente.setNOME_VENDEDOR("Kaa");
        Cliente.setENDEREÇO("Rua Joaquim Dias");
        Cliente.setTELEFONE(92380433);
     
       c.save(Cliente);      
       
  // c.removeById(6);
     
       
       
            
       
         
  //    List <cliente> clinte =  clientecontroller.getAll();
   //    System.out.println("Todos os clientes: " + clinte.size());
      
        
        
        
        
    }
    
}
