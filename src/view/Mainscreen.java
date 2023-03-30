/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.clientecontroller;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.clientes;
import util.TaskTableModel;

/**
 *
 * @author kauan
 */
public class Mainscreen extends javax.swing.JFrame {

    /**
     * Creates new form Mainscreen
     */
    
     DefaultListModel <clientes> clientesModel;
     TaskTableModel tasksModel;
    
    public Mainscreen() {
        initComponents();
        decorateTable();
        initDataController();
        initcomponetes();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jLabelprinc = new javax.swing.JLabel();
        jPanelSubtitle = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        jLabelAdicao = new javax.swing.JLabel();
        jPanelList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCadastro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanelTitle.setBackground(new java.awt.Color(51, 153, 255));
        jPanelTitle.setForeground(new java.awt.Color(0, 102, 102));

        jLabelprinc.setBackground(new java.awt.Color(255, 255, 255));
        jLabelprinc.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelprinc.setForeground(new java.awt.Color(255, 255, 255));
        jLabelprinc.setText("LAJE BOM JESUS");
        jLabelprinc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelprinc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelprinc)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanelSubtitle.setBackground(new java.awt.Color(255, 255, 255));

        jLabelClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelClientes.setText("CLIENTES CADASTRADOS");

        jLabelAdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/add (3).png"))); // NOI18N
        jLabelAdicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAdicaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelSubtitleLayout = new javax.swing.GroupLayout(jPanelSubtitle);
        jPanelSubtitle.setLayout(jPanelSubtitleLayout);
        jPanelSubtitleLayout.setHorizontalGroup(
            jPanelSubtitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubtitleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAdicao)
                .addContainerGap())
        );
        jPanelSubtitleLayout.setVerticalGroup(
            jPanelSubtitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubtitleLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelAdicao)
                .addContainerGap())
            .addGroup(jPanelSubtitleLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelList.setBackground(new java.awt.Color(255, 255, 255));

        jTableCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTableCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jTableCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NOME", "ENDEREÇO", "TELEFONE", "DATA DE VENDA", "DATA DE ENTREGA", "VALOR", "VENDEDOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCadastro.setGridColor(new java.awt.Color(255, 255, 255));
        jTableCadastro.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTableCadastro);

        javax.swing.GroupLayout jPanelListLayout = new javax.swing.GroupLayout(jPanelList);
        jPanelList.setLayout(jPanelListLayout);
        jPanelListLayout.setHorizontalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );
        jPanelListLayout.setVerticalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelAdicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAdicaoMouseClicked
        Cadastro cadastro = new Cadastro(this, rootPaneCheckingEnabled);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jLabelAdicaoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAdicao;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelprinc;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JPanel jPanelSubtitle;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCadastro;
    // End of variables declaration//GEN-END:variables

    public void decorateTable(){
    
        jTableCadastro.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14 ));
        jTableCadastro.getTableHeader().setBackground(new Color(51,153,255));
        
         jTableCadastro.setAutoCreateRowSorter(true);
    }
    
    public void initDataController(){
    clientecontroller c = new clientecontroller();
    clientes Cliente = new clientes();
    
    
    }
    
    public void initcomponetes(){
    clientesModel = new DefaultListModel<clientes>();
    loadclientes();
    
    tasksModel = new TaskTableModel();
    jTableCadastro.setModel(tasksModel);
    loadTask(12);
    
    }
    
    public void loadTask( int ID){
        
    clientecontroller clientecontroller = new clientecontroller();
    
    clientes cli = new clientes();
 try{
      List<clientes> Project = clientecontroller.getAll(ID);
      tasksModel.setTasks(Project);
 }
 catch(Exception e){
     JOptionPane.showMessageDialog(null, e.getMessage());
 }
    }
    
    public void loadclientes(){
          clientecontroller c = new clientecontroller();    
        List<clientes> Clientee = c.getAll();
        clientesModel.clear();
         
        
        for (int i =0; i < Clientee.size() -1; i++){
            
            clientes cliente = Clientee.get(i);
            
            clientesModel.addElement(cliente);
        
        }
                
    }
}


