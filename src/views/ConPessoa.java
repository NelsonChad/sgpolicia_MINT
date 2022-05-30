/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.conectaBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DETEC_IT
 */
public class ConPessoa extends javax.swing.JDialog {

    /**
     * Creates new form ConPessoa
     */
    conectaBanco connect = new conectaBanco();

    public ConPessoa() {
        initComponents();
        pesqPessoa();
        btnFeichaTabela.setEnabled(false);
        this.setSize(904, 850);
        TabelaVit.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    public ConPessoa(java.awt.Frame dialog, boolean modal) {
        super(dialog, modal);
        initComponents();
        btnFeichaTabela.setEnabled(false);
        this.setSize(904, 850);
        pesqPessoa();
        TabelaVit.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPessoas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaOc = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaVit = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nOc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nVit = new javax.swing.JLabel();
        nAut = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPesc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pesqTodos = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaTodos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnAbrirTabela = new javax.swing.JButton();
        btnFeichaTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Pessoas/Autores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel6)
                .addContainerGap(627, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        TabelaPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Tipo Documento", "Nº Documento", "sexo", "Data/Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPessoasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaPessoas);
        if (TabelaPessoas.getColumnModel().getColumnCount() > 0) {
            TabelaPessoas.getColumnModel().getColumn(0).setMinWidth(4);
            TabelaPessoas.getColumnModel().getColumn(0).setPreferredWidth(4);
            TabelaPessoas.getColumnModel().getColumn(4).setMinWidth(3);
            TabelaPessoas.getColumnModel().getColumn(4).setPreferredWidth(3);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes da pessoa"));

        TabelaOc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaOc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaOcMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaOc);

        TabelaVit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TabelaVit);

        jLabel1.setText("Ocorrencias Registradas");

        jLabel2.setText("Vitimizacao");

        jLabel3.setText("Total de Ocorrencias:");

        jLabel5.setText("Total de Vitimizacao :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nOc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nVit, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nOc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nVit, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel4.setText("Todos autores:");

        txtPesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPescKeyTyped(evt);
            }
        });

        jLabel7.setText("Perquisar autores:");

        jButton1.setText("Ver Totas as Pessoas Registradas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(232, 42));

        jLabel8.setText("Pesquisar Pessoa:");

        pesqTodos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesqTodosKeyTyped(evt);
            }
        });

        tabelaTodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabelaTodos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesqTodos)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pesqTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setText("Fichar Tabela");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Totas as Pessoas do sistema:");

        btnAbrirTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setaD.png"))); // NOI18N
        btnAbrirTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTabelaActionPerformed(evt);
            }
        });

        btnFeichaTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setaE.png"))); // NOI18N
        btnFeichaTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeichaTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nAut, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesc, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbrirTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFeichaTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jLabel9))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nAut, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnFeichaTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirTabela)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPessoasMouseClicked
        // TODO add your handling code here:
        pescOcorrencia();
        pescVit();
        if (TabelaOc.getRowCount() == 0 && TabelaVit.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "nenuma Ocorrencia registrada para a pessoa", "Aviso", 2);
            nOc.setText("Nenhuma Ocorrencia");
            nVit.setText("Nenhuma Ocorrencia");
        } else if (nOc.getText().equals(0)) {
            nOc.setText("Nenhuma Ocorrencia");
        } else if (TabelaVit.getRowCount() == 0) {
            nVit.setText("Nenhuma Ocorrencia");
        }
        contar();
    }//GEN-LAST:event_TabelaPessoasMouseClicked

    private void TabelaOcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaOcMouseClicked
        // TODO add your handling code here:
        pescVit();

    }//GEN-LAST:event_TabelaOcMouseClicked

    private void txtPescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPescKeyTyped
        // TODO add your handling code here:
        try {
            connect.conexao();
            PreparedStatement pessoas = connect.conn.prepareStatement("select DISTINCT pessoa.Cod_pessoa,nome,tipo_doc,BI_passaport,sexo,data_nasc from Pessoa,autoria where pessoa.cod_pessoa = autoria.codigo_pessoa\n"
                    + "and pessoa.nome like ? ");

            pessoas.setString(1, "%" + txtPesc.getText() + "%");
            connect.rs = pessoas.executeQuery();

            DefaultTableModel model = (DefaultTableModel) TabelaPessoas.getModel();
            model.setNumRows(0);
            while (connect.rs.next()) {
                model.addRow(new Object[]{
                    connect.rs.getString("Cod_pessoa"),
                    connect.rs.getString("Nome"),
                    connect.rs.getString("Tipo_Doc"),
                    connect.rs.getString("BI_passaport"),
                    connect.rs.getString("Sexo"),
                    connect.rs.getString("Data_nasc"),});
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Contacte o Administrador" + erro);
            System.exit(0);
        }
    }//GEN-LAST:event_txtPescKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pescisarTodos();
        this.setSize(1250, 850);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setSize(904, 850);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAbrirTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTabelaActionPerformed
        // TODO add your handling code here:
        pescisarTodos();
        this.setSize(1250, 850);
        btnFeichaTabela.setEnabled(true);
        btnAbrirTabela.setEnabled(false);
    }//GEN-LAST:event_btnAbrirTabelaActionPerformed

    private void btnFeichaTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeichaTabelaActionPerformed
        // TODO add your handling code here:
        this.setSize(904, 850);
        btnAbrirTabela.setEnabled(true);
        btnFeichaTabela.setEnabled(false);
    }//GEN-LAST:event_btnFeichaTabelaActionPerformed

    private void pesqTodosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesqTodosKeyTyped
        // TODO add your handling code here:
        try {
            connect.conexao();
            PreparedStatement pessoas = connect.conn.prepareStatement("select pessoa.Cod_pessoa,nome,sexo from Pessoa where pessoa.nome like ? ");

            pessoas.setString(1, "%" + pesqTodos.getText() + "%");
            connect.rs = pessoas.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabelaTodos.getModel();
            model.setNumRows(0);
            while (connect.rs.next()) {
                model.addRow(new Object[]{
                    connect.rs.getString("Cod_pessoa"),
                    connect.rs.getString("Nome"),
                    connect.rs.getString("Sexo"),});
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Contacte o Administrador" + erro);
            System.exit(0);
        }
    }//GEN-LAST:event_pesqTodosKeyTyped

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaOc;
    private javax.swing.JTable TabelaPessoas;
    private javax.swing.JTable TabelaVit;
    private javax.swing.JButton btnAbrirTabela;
    private javax.swing.JButton btnFeichaTabela;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nAut;
    private javax.swing.JLabel nOc;
    private javax.swing.JLabel nVit;
    private javax.swing.JTextField pesqTodos;
    private javax.swing.JTable tabelaTodos;
    private javax.swing.JTextField txtPesc;
    // End of variables declaration//GEN-END:variables
private void pesqPessoa() {
        try {
            connect.conexao();
            PreparedStatement pessoas1 = connect.conn.prepareStatement("select * from Pessoa WHERE NOT EXISTS "
                    + "(SELECT * from vitimizacao WHERE vitimizacao.codigo_pessoa_vi t= pessoa.cod_pessoa)");

            PreparedStatement pessoas = connect.conn.prepareStatement("select DISTINCT pessoa.Cod_pessoa,nome,tipo_doc,BI_passaport,sexo,data_nasc from Pessoa,autoria where pessoa.cod_pessoa = autoria.codigo_pessoa");
            connect.rs = pessoas.executeQuery();

            DefaultTableModel model = (DefaultTableModel) TabelaPessoas.getModel();
            model.setNumRows(0);
            while (connect.rs.next()) {
                model.addRow(new Object[]{
                    connect.rs.getString("Cod_pessoa"),
                    connect.rs.getString("Nome"),
                    connect.rs.getString("Tipo_Doc"),
                    connect.rs.getString("BI_passaport"),
                    connect.rs.getString("Sexo"),
                    connect.rs.getString("Data_nasc"),});
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Contacte o Administrador" + erro);
            System.exit(0);
        }

        nAut.setText("" + TabelaPessoas.getRowCount());
    }

    private void pescOcorrencia() {
        TabelaOc.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Código da ocorrência", "Tipo de Ocorrência", "Causa", "Data"}
        )//Linhas ineditaveis:
        {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        }//fim
        );
        TabelaOc.getColumnModel().getColumn(0).setPreferredWidth(20);
        TabelaOc.getColumnModel().getColumn(1).setPreferredWidth(200);
        TabelaOc.getColumnModel().getColumn(2).setPreferredWidth(150);
        TabelaOc.getColumnModel().getColumn(3).setPreferredWidth(50);
        /*TabelaOc.getColumnModel().getColumn(4).setPreferredWidth(100);
         TabelaOc.getColumnModel().getColumn(5).setPreferredWidth(100);
         TabelaOc.getColumnModel().getColumn(6).setPreferredWidth(100);*/
        TabelaOc.getColumnModel().getColumn(0).setResizable(false);
        TabelaOc.getColumnModel().getColumn(1).setResizable(false);
        TabelaOc.getColumnModel().getColumn(2).setResizable(false);
        TabelaOc.getColumnModel().getColumn(3).setResizable(false);
        /*TabelaOc.getColumnModel().getColumn(4).setResizable(false);
         TabelaOc.getColumnModel().getColumn(5).setResizable(false);
         TabelaOc.getColumnModel().getColumn(6).setResizable(false);*/
        TabelaOc.getTableHeader().setReorderingAllowed(false);
        //jTablePesquisa.setAutoResizeMode(jTablePesquisa.AUTO_RESIZE_OFF);
        TabelaOc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        try {
            String ocorrencia = "" + TabelaPessoas.getValueAt(TabelaPessoas.getSelectedRow(), 0);

            PreparedStatement oc = connect.conn.prepareStatement("Select Ocorrencia.Cod_Ocorrencia, data, hora,Descricao,causas From autoria\n"
                    + "inner join Ocorrencia on Autoria.codigo_ocorrencia=ocorrencia.cod_ocorrencia\n"
                    + "inner join Pessoa on Autoria.codigo_pessoa=Pessoa.cod_pessoa\n"
                    + "where  Pessoa.cod_pessoa='" + ocorrencia + "'");

            ResultSet resultado = oc.executeQuery();
            resultado.next();

            connect.rs = oc.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TabelaOc.getModel();
            model.setNumRows(0);
            while (connect.rs.next()) {
                model.addRow(new Object[]{
                    connect.rs.getString("Cod_Ocorrencia"),
                    connect.rs.getString("descricao"),
                    connect.rs.getString("Causas"),
                    //connect.rs.getString("D.Nome"),
                    //connect.rs.getString("R.nr_Danos"),
                    connect.rs.getString("Data"),
                    connect.rs.getString("Hora"),});
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a descrição\n! Contacte o administrador do sistema 1\n" + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pescVit() {

        TabelaVit.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Nome", "Tipo do documento", "Nº do documento", "Apelido", "Data de Nascimento", "Sexo", "Nacionalidade",
                    "Local de residência", "Bairro",
                    "Quarteirão", "Casa Nº", "Profissão"}
        )//Linhas ineditaveis:
        {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        }//fim
        );
        TabelaVit.getColumnModel().getColumn(0).setPreferredWidth(150);
        TabelaVit.getColumnModel().getColumn(1).setPreferredWidth(150);
        TabelaVit.getColumnModel().getColumn(2).setPreferredWidth(180);
        TabelaVit.getColumnModel().getColumn(3).setPreferredWidth(100);
        TabelaVit.getColumnModel().getColumn(4).setPreferredWidth(150);
        TabelaVit.getColumnModel().getColumn(5).setPreferredWidth(50);
        TabelaVit.getColumnModel().getColumn(6).setPreferredWidth(110);
        TabelaVit.getColumnModel().getColumn(8).setPreferredWidth(130);
        TabelaVit.getColumnModel().getColumn(9).setPreferredWidth(60);
        TabelaVit.getColumnModel().getColumn(10).setPreferredWidth(60);
        TabelaVit.getColumnModel().getColumn(11).setPreferredWidth(100);

        TabelaVit.getColumnModel().getColumn(0).setResizable(false);
        TabelaVit.getColumnModel().getColumn(1).setResizable(false);
        TabelaVit.getColumnModel().getColumn(2).setResizable(false);
        TabelaVit.getColumnModel().getColumn(3).setResizable(false);
        TabelaVit.getColumnModel().getColumn(4).setResizable(false);
        TabelaVit.getColumnModel().getColumn(5).setResizable(false);
        TabelaVit.getColumnModel().getColumn(6).setResizable(false);
        TabelaVit.getColumnModel().getColumn(7).setResizable(false);
        TabelaVit.getColumnModel().getColumn(8).setResizable(false);
        TabelaVit.getColumnModel().getColumn(9).setResizable(false);
        TabelaVit.getColumnModel().getColumn(10).setResizable(false);
        TabelaVit.getColumnModel().getColumn(11).setResizable(false);

        //jTablePesquisa.setAutoResizeMode(jTablePesquisa.AUTO_RESIZE_OFF);
        TabelaVit.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        try {

            String ocorrencia = "" + TabelaOc.getValueAt(TabelaOc.getSelectedRow(), 0);

            PreparedStatement oc = connect.conn.prepareStatement("Select Pessoa.Nome,Tipo_Doc,BI_Passaport,Apelido,Data_Nasc,Sexo,Nacionalidade,Provincia_Nasc,Distrito_Cidade_Nasc,\n"
                    + "Provincia_resid,profissao,Bairro_resid,Quarteirao_resid,Av_rua_resid,nr_resid From Vitimizacao\n"
                    + "inner join Pessoa on vitimizacao.codigo_pessoa_vit=pessoa.cod_pessoa\n"
                    + "inner join Ocorrencia on vitimizacao.codigo_ocorrencia_vit=ocorrencia.cod_Ocorrencia\n"
                    + "where ocorrencia.cod_Ocorrencia='" + ocorrencia + "'");

            ResultSet resultado = oc.executeQuery();
            resultado.next();

            connect.rs = oc.executeQuery();

            DefaultTableModel model = (DefaultTableModel) TabelaVit.getModel();
            model.setNumRows(0);
            while (connect.rs.next()) {
                model.addRow(new Object[]{
                    connect.rs.getString("Nome"),
                    connect.rs.getString("Tipo_Doc"),
                    connect.rs.getString("BI_Passaport"),
                    connect.rs.getString("Apelido"),
                    connect.rs.getString("Data_Nasc"),
                    connect.rs.getString("Sexo"),
                    connect.rs.getString("Nacionalidade"),
                    connect.rs.getString("Provincia_resid"),
                    connect.rs.getString("Bairro_resid"),
                    connect.rs.getString("Quarteirao_resid"),
                    connect.rs.getString("nr_resid"),
                    connect.rs.getString("profissao"),});
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a descrição\n! Contacte o administrador do sistema 2\n" + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void contar() {
        nOc.setText("" + TabelaOc.getRowCount());
        nVit.setText("" + TabelaVit.getRowCount());
    }

    private void pescisarTodos() {
        tabelaTodos.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Nome", "Sexo"}
        ) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        });

        tabelaTodos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabelaTodos.getColumnModel().getColumn(1).setPreferredWidth(180);
        tabelaTodos.getColumnModel().getColumn(2).setPreferredWidth(20);

        tabelaTodos.getColumnModel().getColumn(0).setResizable(false);
        tabelaTodos.getColumnModel().getColumn(1).setResizable(false);
        tabelaTodos.getColumnModel().getColumn(2).setResizable(false);
        try {
            connect.conexao();
            PreparedStatement TodasPessoas = connect.conn.prepareStatement("select pessoa.Cod_pessoa,nome,sexo from Pessoa");
            connect.rs = TodasPessoas.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabelaTodos.getModel();
            model.setNumRows(0);
            while (connect.rs.next()) {
                model.addRow(new Object[]{
                    connect.rs.getString("Cod_pessoa"),
                    connect.rs.getString("Nome"),
                    connect.rs.getString("Sexo"),});
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Contacte o Administrador" + erro);
            System.exit(0);
        }
    }
}
