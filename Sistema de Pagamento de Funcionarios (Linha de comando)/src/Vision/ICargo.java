/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vision;

import controle.EscreverArquivo;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Felipe
 */
public class ICargo extends javax.swing.JFrame {

    EscreverArquivo escreverArquivo = new EscreverArquivo();
    String local = "Cargos";

    public ICargo() throws IOException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        inserirButton = new javax.swing.JButton();
        deletarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        Tabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cargoTable = new javax.swing.JTable();
        pesquisaCaixa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jpDados = new javax.swing.JPanel();
        cargoCaixa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idCaixa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salarioCaixa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        inserirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tag_blue_add.png"))); // NOI18N
        inserirButton.setText("Incluir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirButtonActionPerformed(evt);
            }
        });

        deletarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tag_blue_delete.png"))); // NOI18N
        deletarButton.setText("Excluir");
        deletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButtonActionPerformed(evt);
            }
        });

        limparButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CleanMyMac-1-icon.png"))); // NOI18N
        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Gerenciamento dos Cargos");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Tabela.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargos Registrados"));

        cargoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cargos", "Salarios (R$)", "Identificação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cargoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargoTableMouseClicked(evt);
            }
        });
        cargoTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cargoTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(cargoTable);
        if (cargoTable.getColumnModel().getColumnCount() > 0) {
            cargoTable.getColumnModel().getColumn(2).setResizable(false);
        }

        pesquisaCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaCaixaActionPerformed(evt);
            }
        });
        pesquisaCaixa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesquisaCaixaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaCaixaKeyReleased(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder_explore.png"))); // NOI18N

        javax.swing.GroupLayout TabelaLayout = new javax.swing.GroupLayout(Tabela);
        Tabela.setLayout(TabelaLayout);
        TabelaLayout.setHorizontalGroup(
            TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        TabelaLayout.setVerticalGroup(
            TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaCaixa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        cargoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoCaixaActionPerformed(evt);
            }
        });
        cargoCaixa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cargoCaixaKeyReleased(evt);
            }
        });

        jLabel1.setText("Nome:");

        idCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCaixaActionPerformed(evt);
            }
        });
        idCaixa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idCaixaKeyReleased(evt);
            }
        });

        jLabel4.setText("Identificação:");

        salarioCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioCaixaActionPerformed(evt);
            }
        });
        salarioCaixa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                salarioCaixaKeyReleased(evt);
            }
        });

        jLabel3.setText("Salário:");

        javax.swing.GroupLayout jpDadosLayout = new javax.swing.GroupLayout(jpDados);
        jpDados.setLayout(jpDadosLayout);
        jpDadosLayout.setHorizontalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargoCaixa)
                    .addComponent(idCaixa)
                    .addComponent(salarioCaixa)
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDadosLayout.setVerticalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cargoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salarioCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inserirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limparButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inserirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void preencherJtable() throws IOException {
        DefaultTableModel cargos = (DefaultTableModel) cargoTable.getModel();
        String dadosCargo[];
        File arquivo = new File("Dados\\cargos");
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        String cargo = br.readLine();
        while (cargo != null) {
            dadosCargo = cargo.split(";");
            cargos.addRow(dadosCargo);
            cargo = br.readLine();
        }
        br.close();
        fr.close();
    }

  
    private void inserirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirButtonActionPerformed
        if (cargoCaixa.getText() == null || idCaixa.getText() == null || salarioCaixa.getText() == null) {
            JOptionPane.showMessageDialog(null, "Favor preencha todos os campos");

        } else {
            DefaultTableModel cargos = (DefaultTableModel) cargoTable.getModel();
            cargos.addRow(new String[]{cargoCaixa.getText(), salarioCaixa.getText(), idCaixa.getText()});
            try {
                escreverArquivo.salvar(cargos, local);
            } catch (IOException ex) {
                Logger.getLogger(ICargo.class.getName()).log(Level.SEVERE, null, ex);
            }
            cargoCaixa.setText("");
            salarioCaixa.setText("");
            idCaixa.setText("");
        }


    }//GEN-LAST:event_inserirButtonActionPerformed
    void deletar() {
        DefaultTableModel dtm = (DefaultTableModel) cargoTable.getModel();
        if (cargoTable.getSelectedRow() >= 0) {
            dtm.removeRow(cargoTable.getSelectedRow());            
            cargoTable.setModel(dtm);
            try {
                escreverArquivo.salvar(dtm, local);
            } catch (IOException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }
    }
    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
        deletar();

    }//GEN-LAST:event_deletarButtonActionPerformed

    private void cargoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoCaixaActionPerformed

    private void idCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCaixaActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        // TODO add your handling code here:
        cargoCaixa.setText("");
        salarioCaixa.setText("");
        idCaixa.setText("");
    }//GEN-LAST:event_limparButtonActionPerformed

    private void salarioCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioCaixaActionPerformed

    private void pesquisaCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaCaixaActionPerformed

    private void pesquisaCaixaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaCaixaKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_pesquisaCaixaKeyPressed

    private void pesquisaCaixaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaCaixaKeyReleased
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_pesquisaCaixaKeyReleased

    private void cargoTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            deletar();
        }
    }//GEN-LAST:event_cargoTableKeyPressed

    private void cargoCaixaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoCaixaKeyReleased
    }//GEN-LAST:event_cargoCaixaKeyReleased
    private void idCaixaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idCaixaKeyReleased
    }//GEN-LAST:event_idCaixaKeyReleased
    private void salarioCaixaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salarioCaixaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioCaixaKeyReleased

    private void cargoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargoTableMouseClicked

    }//GEN-LAST:event_cargoTableMouseClicked
    void editar() {
        int aux = cargoTable.getSelectedRow();
        cargoCaixa.setText((String) cargoTable.getValueAt(aux, 0));
        idCaixa.setText((String) cargoTable.getValueAt(aux, 1));
        salarioCaixa.setText((String) cargoTable.getValueAt(aux, 2));
        
        idCaixa.setEnabled(false);
        limparButton.setEnabled(false);
        
        inserirButton.setText("Salvar");        
        deletarButton.setText("Cancelar");
        
    } 
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            preencherJtable();
        } catch (IOException ex) {
            Logger.getLogger(ICargo.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_formWindowOpened
    void filtrar() {
        TableRowSorter sorter = null;
        DefaultTableModel cargos = (DefaultTableModel) cargoTable.getModel();
        sorter = new TableRowSorter(cargos);
        cargoTable.setRowSorter(sorter);
        String text = pesquisaCaixa.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter(text));
            } catch (Exception ex) {
            }
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tabela;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cargoCaixa;
    private javax.swing.JTable cargoTable;
    private javax.swing.JButton deletarButton;
    private javax.swing.JTextField idCaixa;
    private javax.swing.JButton inserirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpDados;
    private javax.swing.JToggleButton limparButton;
    private javax.swing.JTextField pesquisaCaixa;
    private javax.swing.JTextField salarioCaixa;
    // End of variables declaration//GEN-END:variables
}
