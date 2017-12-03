/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.artcenter.gui;

import br.rj.macae.femass.artcenter.controle.MaterialControle;
import br.rj.macae.femass.artcenter.controle.OrdemServicoControle;
import br.rj.macae.femass.artcenter.entidade.Cliente;
import br.rj.macae.femass.artcenter.entidade.Equipamento;
import br.rj.macae.femass.artcenter.entidade.Material;
import br.rj.macae.femass.artcenter.entidade.OrdemServico;
import br.rj.macae.femass.artcenter.entidade.OrdemServico_Material;
import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YMoraes
 */
public class GuiOS extends javax.swing.JInternalFrame {

    /**
     * Creates new form guiClient
     */
    public GuiOS() {
        initComponents();
        setResizable(false);

        setTitle("Manter Ordens de serviço");
        DefaultListModel model = new DefaultListModel();
        lstMateriais.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOS = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        pNovo = new javax.swing.JPanel();
        txtData = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        lbProjeto = new javax.swing.JLabel();
        txtProjeto = new javax.swing.JTextField();
        txtTecnico = new javax.swing.JTextField();
        lbTecnico = new javax.swing.JLabel();
        lbComentario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        cboCliente = new javax.swing.JComboBox();
        lbData2 = new javax.swing.JLabel();
        cboEquipamento = new javax.swing.JComboBox();
        lbData3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstMateriais = new javax.swing.JList();
        lbComentario1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRmv = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbData4 = new javax.swing.JLabel();
        cboMaterial = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        lbData5 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        txtUn = new javax.swing.JTextField();
        lbData6 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tblOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data", "Projeto", "Tecnico", "Comentario", "Cliente", "Equipamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOS.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblOS);
        if (tblOS.getColumnModel().getColumnCount() > 0) {
            tblOS.getColumnModel().getColumn(0).setResizable(false);
            tblOS.getColumnModel().getColumn(1).setResizable(false);
            tblOS.getColumnModel().getColumn(2).setResizable(false);
            tblOS.getColumnModel().getColumn(3).setResizable(false);
        }

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAtualizar.setForeground(new java.awt.Color(102, 102, 102));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        pNovo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nova OS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        lbData.setText("Data:");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        lbProjeto.setText("Projeto");

        lbTecnico.setText("Tecnico:");

        lbComentario.setText("Comentario:");

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane2.setViewportView(txtComentario);

        lbData2.setText("Cliente:");

        lbData3.setText("Equipamento:");

        jScrollPane3.setViewportView(lstMateriais);

        lbComentario1.setText("Materiais:");

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRmv.setText("-");
        btnRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lbData4.setText("Material:");

        lbData5.setText("Qtd:");

        lbData6.setText("Un:");

        javax.swing.GroupLayout pNovoLayout = new javax.swing.GroupLayout(pNovo);
        pNovo.setLayout(pNovoLayout);
        pNovoLayout.setHorizontalGroup(
            pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNovoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNovoLayout.createSequentialGroup()
                        .addComponent(lbComentario)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pNovoLayout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addGap(6, 6, 6)
                        .addComponent(btnCancelar))
                    .addGroup(pNovoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pNovoLayout.createSequentialGroup()
                                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbData)
                                    .addComponent(lbProjeto)
                                    .addComponent(lbData2)
                                    .addComponent(lbData4)
                                    .addComponent(lbComentario1))
                                .addGap(31, 31, 31)
                                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pNovoLayout.createSequentialGroup()
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbTecnico)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pNovoLayout.createSequentialGroup()
                                        .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cboMaterial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cboCliente, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pNovoLayout.createSequentialGroup()
                                                .addComponent(lbData3)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pNovoLayout.createSequentialGroup()
                                                .addComponent(lbData5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbData6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        pNovoLayout.setVerticalGroup(
            pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNovoLayout.createSequentialGroup()
                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pNovoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbData)
                            .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbTecnico)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProjeto)
                    .addComponent(txtProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData2)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbData3)
                    .addComponent(cboEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbData6)
                        .addComponent(txtUn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd)
                        .addComponent(btnRmv))
                    .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbData4)
                        .addComponent(lbData5)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbComentario1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNovoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbComentario))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGravar)
                    .addComponent(btnCancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addGap(0, 947, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCampos();
        habilitarCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblOS.getSelectedRow() >= 0) {
            OrdemServicoControle controle = new OrdemServicoControle();
            Object valor = ((DefaultTableModel) tblOS.getModel()).getValueAt(tblOS.getSelectedRow(), 0);
            try {
            limparCampos();
            OrdemServico c = controle.getOrdemServicoPorId((Integer) valor);
            txtData.setText(c.getData());
            txtProjeto.setText(c.getProjeto());
            txtTecnico.setText(c.getTecnico());
            txtComentario.setText(c.getComentario());  
            cboCliente.setSelectedItem(c.getCliente());
            cboEquipamento.setSelectedItem(c.getEquipamento());

                habilitarCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.");
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblOS.getSelectedRow() >= 0) {
            OrdemServicoControle controle = new OrdemServicoControle();
            Object valor = ((DefaultTableModel) tblOS.getModel()).getValueAt(tblOS.getSelectedRow(), 0);
            try {
                OrdemServico c = controle.getOrdemServicoPorId((Integer) valor);
                controle.excluir(c);

                desabilitarCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela.");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        OrdemServicoControle controle = new OrdemServicoControle();

        try {
            OrdemServico c = new OrdemServico();
            c.setData(txtData.getText());
            c.setProjeto(txtProjeto.getText());
            c.setTecnico(txtTecnico.getText());
            c.setComentario(txtComentario.getText());
            c.setCliente((Cliente) cboCliente.getSelectedItem());
            c.setEquipamento((Equipamento) cboEquipamento.getSelectedItem());
            
            for(int i=0; i<lstMateriais.getModel().getSize();i++){            
            c.setMaterial((OrdemServico_Material) lstMateriais.getModel().getElementAt(i));
            }
            
            if (tblOS.getSelectedRow()>=0) {
                
                c.setId((Integer) tblOS.getValueAt(tblOS.getSelectedRow(), 0));
            }
            
            controle.gravar(c);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex2) {
            JOptionPane.showMessageDialog(this, ex2.getMessage());
        }

        limparCampos();
        desabilitarCampos();
        atualizarLista();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        atualizarLista();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizarLista();
        desabilitarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        desabilitarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        desabilitarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        OrdemServico_Material ri = new OrdemServico_Material();
        ri.setMaterial((Material)cboMaterial.getSelectedItem());        
        ri.setOs(null);
        ri.setQuantidade(Integer.parseInt(txtQtd.getText()));
        ri.setUnidade(txtUn.getText());
        DefaultListModel model = (DefaultListModel) lstMateriais.getModel();
        model.addElement(ri);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvActionPerformed
        
        if(lstMateriais.isSelectionEmpty()){
        JOptionPane.showMessageDialog(this, "Selecione um material da lista para excluir");
        return;
        }
        OrdemServico_Material ri = new OrdemServico_Material();
        
        DefaultListModel model = (DefaultListModel) lstMateriais.getModel();
        model.removeElementAt(lstMateriais.getSelectedIndex());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRmvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRmv;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cboCliente;
    private javax.swing.JComboBox cboEquipamento;
    private javax.swing.JComboBox cboMaterial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbComentario;
    private javax.swing.JLabel lbComentario1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbData2;
    private javax.swing.JLabel lbData3;
    private javax.swing.JLabel lbData4;
    private javax.swing.JLabel lbData5;
    private javax.swing.JLabel lbData6;
    private javax.swing.JLabel lbProjeto;
    private javax.swing.JLabel lbTecnico;
    private javax.swing.JList lstMateriais;
    private javax.swing.JPanel pNovo;
    private javax.swing.JTable tblOS;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtProjeto;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtTecnico;
    private javax.swing.JTextField txtUn;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        txtData.setText("");
        txtProjeto.setText("");
        txtTecnico.setText("");
        txtQtd.setText("");
        txtUn.setText("");
//        tblOS.clearSelection();
        lstMateriais.clearSelection();
        try {
            atualizarComboCliente();
            cboCliente.setSelectedIndex(-1);
            atualizarComboEquipamento();
            cboEquipamento.setSelectedIndex(-1);
            atualizarComboMaterial();
            cboMaterial.setSelectedIndex(-1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void habilitarCampos() {
        pNovo.setVisible(true);
        txtData.requestFocus(true);
        btnGravar.setVisible(true);
        btnCancelar.setVisible(true);
        tblOS.setEnabled(false);
    }

    private void desabilitarCampos() {
        pNovo.setVisible(false);
        btnGravar.setVisible(false);
        btnCancelar.setVisible(false);
        tblOS.setEnabled(true);

    }

    private void atualizarLista() {
        OrdemServicoControle controle = new OrdemServicoControle();
        try {
            controle.atualizarLista(tblOS);
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void atualizarComboCliente() throws SQLException {
        OrdemServicoControle controle = new OrdemServicoControle();
        List clientes = controle.listarClientes();
        cboCliente.removeAllItems();
        for(Object o:clientes){
            cboCliente.addItem(o);
        }
    }
    
        private void atualizarComboEquipamento() throws SQLException {
        OrdemServicoControle controle = new OrdemServicoControle();
        List equipamentos = controle.listarEquipamentos();
        cboEquipamento.removeAllItems();
        for(Object o:equipamentos){
            cboEquipamento.addItem(o);
        }
    }
        
        private void atualizarComboMaterial() {
        OrdemServicoControle controle = new OrdemServicoControle();
        List materiais;
        try {
            materiais = controle.listarMateriais();
            cboMaterial.removeAllItems();
             for(Object o:materiais){
                cboMaterial.addItem(o);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
       
    }


}
