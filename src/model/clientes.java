
package model;

import java.util.Date;

/**
 *
 * @author kauan
 */
public class clientes {
    
    private int ID;
    private String NAME;
    private String ENDEREÇO;
    private int TELEFONE;
    private Date DATAVEN;
    private Date DATAENT;
    private int VALOR;
    private String NOME_VENDEDOR;

    public clientes(int Id, String Name, String Endereco, int Telefone, Date DataVenda, Date DataEntrega, int Valor, String NomeVendedor) {
        this.ID = ID;
        this.NAME = NAME;
        this.ENDEREÇO = ENDEREÇO;
        this.TELEFONE = TELEFONE;
        this.DATAVEN = DATAVEN;
        this.DATAENT = DATAENT;
        this.VALOR = VALOR;
        this.NOME_VENDEDOR = NOME_VENDEDOR;
    }

    /**
     *
     */
    public clientes() {
        this.ID = ID;
        this.NAME = NAME;
        this.ENDEREÇO = ENDEREÇO;
        this.TELEFONE = TELEFONE;
        this.DATAVEN = DATAVEN;
        this.DATAENT = DATAENT;
        this.VALOR = VALOR;
        this.NOME_VENDEDOR = NOME_VENDEDOR;
        
         this.DATAVEN = new Date();
         this.DATAENT = new Date();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getENDEREÇO() {
        return ENDEREÇO;
    }

    public void setENDEREÇO(String ENDERECO) {
        this.ENDEREÇO = ENDERECO;
    }

    public int getTELEFONE() {
        return TELEFONE;
    }

    public void setTELEFONE(int TELEFONE) {
        this.TELEFONE = TELEFONE;
    }

    public Date getDATAVEN() {
        return DATAVEN;
    }

    public void setDATAVEN(Date DATAVEN) {
        this.DATAVEN = DATAVEN;
    }

    public Date getDATAENT() {
        return DATAENT;
    }

    public void setDATAENT(Date DATAENT) {
        this.DATAENT = DATAENT;
    }

    public int getVALOR() {
        return VALOR;
    }

    public void setVALOR(int VALOR) {
        this.VALOR = VALOR;
    }

    public String getNOME_VENDEDOR() {
        return NOME_VENDEDOR;
    }

    public void setNOME_VENDEDOR(String NOME_VENDEDOR) {
        this.NOME_VENDEDOR = NOME_VENDEDOR;
    }

    
  



    
    
    
    
}

