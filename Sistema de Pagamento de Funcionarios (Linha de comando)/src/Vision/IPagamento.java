/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vision;

import controle.Pagamento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class IPagamento extends javax.swing.JFrame {

    Pagamento pagamento = new Pagamento();

    /**
     * Creates new form IPagamento
     */
    public IPagamento() throws IOException {
        initComponents();
        preencherTabelaFuncionario();
        todosRadio.setSelected(true);
    }

    void marcar() {
        int aux = tabelaFuncionario.getSelectedRow(); // erro
        if (tabelaFuncionario.getValueAt(aux, 14) == Boolean.TRUE) {
            tabelaFuncionario.setValueAt(Boolean.FALSE, aux, 14);
        } else {
            tabelaFuncionario.setValueAt(Boolean.TRUE, aux, 14);
        }

    }

    void marcarTodos() {
        for (int i = 0; i < tabelaFuncionario.getRowCount(); i++) {
            tabelaFuncionario.setValueAt(Boolean.TRUE, i, 14);
        }
    }

    void desmarcarTodos() {
        for (int i = 0; i < tabelaFuncionario.getRowCount(); i++) {
            tabelaFuncionario.setValueAt(Boolean.FALSE, i, 14);
        }
    }

    public void preencherTabelaFuncionario() throws IOException {
        DefaultTableModel funcionario = (DefaultTableModel) tabelaFuncionario.getModel();
        funcionario.setNumRows(0);
        String dadosFuncionario[];
        File arquivo = new File("Dados\\funcionarios");
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = br.readLine();
        while (linha != null) {
            dadosFuncionario = linha.split(";");
            funcionario.addRow(dadosFuncionario);
            linha = br.readLine();
        }
        br.close();
        fr.close();

    }

    void filtro() {
        for (int i = 0; i < tabelaFuncionario.getRowCount(); i++) {
            if (tabelaFuncionario.getValueAt(i, 13).equals("Inativo")) {
                DefaultTableModel funcionario = (DefaultTableModel) tabelaFuncionario.getModel();
                funcionario.removeRow(i);
                tabelaFuncionario.setModel(funcionario);

            }

        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        marcarButton = new javax.swing.JButton();
        desmacarButton = new javax.swing.JButton();
        pagarButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ativoRadio = new javax.swing.JRadioButton();
        todosRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "RG", "CPF", "Nº Titulo Eleitoral", "E-MAIL", "Telefone Fixo", "Telefone Celular", "Certficado de Resevista", "Data de Nascimento", "Data de Admissão", "Dependentes", "Estado Cívil", "Cargo", "Status", "Pagar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaFuncionario);
        if (tabelaFuncionario.getColumnModel().getColumnCount() > 0) {
            tabelaFuncionario.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(0).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(1).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(1).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(1).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(3).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(3).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(3).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(4).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(4).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(5).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(5).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(5).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(6).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(6).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(7).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(7).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(8).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(8).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(9).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(9).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(10).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(10).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(11).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(11).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(12).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(12).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(13).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(14).setMinWidth(50);
            tabelaFuncionario.getColumnModel().getColumn(14).setPreferredWidth(50);
            tabelaFuncionario.getColumnModel().getColumn(14).setMaxWidth(50);
        }

        marcarButton.setText("Marcar Todos");
        marcarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarButtonActionPerformed(evt);
            }
        });

        desmacarButton.setText("Desmacar Todos");
        desmacarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desmacarButtonActionPerformed(evt);
            }
        });

        pagarButton.setBackground(new java.awt.Color(51, 102, 255));
        pagarButton.setForeground(new java.awt.Color(255, 255, 255));
        pagarButton.setText("Pagar Selecionados");
        pagarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mostrar"));

        ativoRadio.setText("Ativos");
        ativoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativoRadioActionPerformed(evt);
            }
        });

        todosRadio.setText("Todos");
        todosRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ativoRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(todosRadio))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ativoRadio)
                .addComponent(todosRadio))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marcarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desmacarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(pagarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(marcarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desmacarButton)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pagarButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionarioMouseClicked
        // TODO add your handling code here:
        marcar();
    }//GEN-LAST:event_tabelaFuncionarioMouseClicked

    private void marcarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcarButtonActionPerformed
        // TODO add your handling code here:
        marcarTodos();
    }//GEN-LAST:event_marcarButtonActionPerformed

    private void desmacarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desmacarButtonActionPerformed
        // TODO add your handling code here:
        desmarcarTodos();
    }//GEN-LAST:event_desmacarButtonActionPerformed

    private void ativoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativoRadioActionPerformed
        // TODO add your handling code here:
        if (todosRadio.isSelected()) {
            todosRadio.setSelected(false);
            ativoRadio.setSelected(true);
            filtro();
        }
        if (!ativoRadio.isSelected()) {
            ativoRadio.setSelected(true);
            filtro();
        }

    }//GEN-LAST:event_ativoRadioActionPerformed

    private void todosRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosRadioActionPerformed
        // TODO add your handling code here:
        if (ativoRadio.isSelected()) {
            ativoRadio.setSelected(false);
            todosRadio.setSelected(true);
            try {
                preencherTabelaFuncionario();
            } catch (IOException ex) {
                Logger.getLogger(IPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (!todosRadio.isSelected()) {
            todosRadio.setSelected(true);
            try {
                preencherTabelaFuncionario();
            } catch (IOException ex) {
                Logger.getLogger(IPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_todosRadioActionPerformed

    private void pagarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarButtonActionPerformed
        DefaultTableModel funcionario = (DefaultTableModel) tabelaFuncionario.getModel();
        try {
            pagamento.pagar(funcionario);
        } catch (IOException ex) {
            Logger.getLogger(IPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Comprovantes gerados", "PAGAMENTO", 1);
    }//GEN-LAST:event_pagarButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ativoRadio;
    private javax.swing.JButton desmacarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton marcarButton;
    private javax.swing.JButton pagarButton;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JRadioButton todosRadio;
    // End of variables declaration//GEN-END:variables
}
