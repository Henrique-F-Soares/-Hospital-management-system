/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system.telas;

import hospital.management.system.entidades.Internacao;
import hospital.management.system.persistencia.InternacaoDAO;
import hospital.management.system.persistencia.arquivo.InternacaoDAOImplArq;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rener
 */
public class JPanelInternacao extends javax.swing.JPanel {
    InternacaoDAO internacaodao = new InternacaoDAOImplArq();
    /**
     * Creates new form JPanelInternacao
     */
    public JPanelInternacao() {
        initComponents();
        carregarTabela();
    }
    
     private void carregarTabela(){
        List<Internacao> internacoes = internacaodao.listar();
        DefaultTableModel modeloTabela = (DefaultTableModel) jTable.getModel();
        int qntLinhas = modeloTabela.getRowCount();
        
        
        for (int i = 0; i < qntLinhas; i++) {
            modeloTabela.removeRow(0);
        }
        for (Internacao internacao: internacoes){
          Object[] linha = new Object[5];
          linha[0]= internacao.getId();
          linha[1]= internacao.getData_de_entrada();
          linha[2]= internacao.getHorario_de_entrada();
          linha[3]= internacao.getData_de_saida();
          linha[4]= internacao.getHorario_de_saida();
          
          modeloTabela.addRow(linha);
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

        jLabelId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelHorario_de_entradaa = new javax.swing.JLabel();
        jLabelData_de_saida = new javax.swing.JLabel();
        jLabelHorario_de_saida = new javax.swing.JLabel();
        jLabelMedicacao = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldData_de_entrada = new javax.swing.JTextField();
        jTextFieldHorario_de_entrada = new javax.swing.JTextField();
        jTextFieldData_de_saida = new javax.swing.JTextField();
        jTextFieldHorario_de_saida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMedicacao = new javax.swing.JTextArea();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        jLabelId.setText("Id:");

        jLabel2.setText("Data de Entrada:");

        jLabelHorario_de_entradaa.setText("Horário de entrada:");

        jLabelData_de_saida.setText("Data de Saída");

        jLabelHorario_de_saida.setText("Horário de Saída");

        jLabelMedicacao.setText("Medicação:");

        jTextFieldData_de_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldData_de_entradaActionPerformed(evt);
            }
        });

        jTextFieldHorario_de_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHorario_de_entradaActionPerformed(evt);
            }
        });

        jTextFieldData_de_saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldData_de_saidaActionPerformed(evt);
            }
        });

        jTextFieldHorario_de_saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHorario_de_saidaActionPerformed(evt);
            }
        });

        jTextAreaMedicacao.setColumns(20);
        jTextAreaMedicacao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMedicacao);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar campos");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data de Entrada", "Horario de Entrada", "Data de Saida", "Horario de Saida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelHorario_de_entradaa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldHorario_de_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldData_de_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelHorario_de_saida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldHorario_de_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelData_de_saida)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldData_de_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMedicacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLimpar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jLabel2)
                    .addComponent(jLabelData_de_saida)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldData_de_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldData_de_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHorario_de_entradaa)
                    .addComponent(jLabelHorario_de_saida)
                    .addComponent(jTextFieldHorario_de_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHorario_de_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMedicacao)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonLimpar))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldData_de_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldData_de_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldData_de_entradaActionPerformed

    private void jTextFieldHorario_de_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHorario_de_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHorario_de_entradaActionPerformed

    private void jTextFieldData_de_saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldData_de_saidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldData_de_saidaActionPerformed

    private void jTextFieldHorario_de_saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHorario_de_saidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHorario_de_saidaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Internacao internacao = new Internacao();
        
        internacao.setId(Integer.parseInt(jTextFieldId.getText()));
        internacao.setData_de_entrada(jTextFieldData_de_entrada.getText());
        internacao.setHorario_de_entrada(jTextFieldHorario_de_entrada.getText());
        internacao.setData_de_saida(jTextFieldData_de_saida.getText());
        internacao.setHorario_de_saida(jTextFieldHorario_de_saida.getText());
        internacao.setMedicacao(jTextAreaMedicacao.getText());
        if(internacaodao.getById(internacao.getId())==null){
            internacaodao.inserir(internacao);
        } else {
            internacaodao.editar(internacao);
        }
        jButtonLimparActionPerformed(evt);
        carregarTabela();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldId.setText("");
        jTextFieldData_de_entrada.setText("");
        jTextFieldHorario_de_entrada.setText("");
        jTextFieldData_de_saida.setText("");
        jTextFieldHorario_de_saida.setText("");
        jTextAreaMedicacao.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int linha = jTable.getSelectedRow();
        if (linha!=-1){
            int id = (int)jTable.getValueAt(linha, 0);
            Internacao leito = internacaodao.getById(id);
            
            jTextFieldId.setText(leito.getId()+"");
            jTextFieldData_de_entrada.setText(leito.getData_de_entrada());
            jTextFieldHorario_de_entrada.setText(leito.getHorario_de_entrada());
            jTextFieldData_de_saida.setText(leito.getData_de_saida());
            jTextFieldHorario_de_saida.setText(leito.getHorario_de_saida());
            jTextAreaMedicacao.setText(leito.getMedicacao());
        } 
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int[] linhas = jTable.getSelectedRows();
        for (int pos: linhas) {
            int id = (int) jTable.getValueAt(pos, 0);
            internacaodao.remover(id);
        }
        carregarTabela();
    }//GEN-LAST:event_jButtonExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelData_de_saida;
    private javax.swing.JLabel jLabelHorario_de_entradaa;
    private javax.swing.JLabel jLabelHorario_de_saida;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMedicacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextAreaMedicacao;
    private javax.swing.JTextField jTextFieldData_de_entrada;
    private javax.swing.JTextField jTextFieldData_de_saida;
    private javax.swing.JTextField jTextFieldHorario_de_entrada;
    private javax.swing.JTextField jTextFieldHorario_de_saida;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables
}