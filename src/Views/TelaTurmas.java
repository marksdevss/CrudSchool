package Views;

import DAOs.ProfessoresDAO;
import DAOs.TurmaDAO;
import Models.TurmasModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author msilva
 */
public class TelaTurmas extends javax.swing.JFrame {

    public TelaTurmas() {
        initComponents();
        ListarTurmas();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProfessorR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHorT = new javax.swing.JTextField();
        btnCadastrarT = new javax.swing.JButton();
        btnDeletarT = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTurmas = new javax.swing.JTable();
        btnCarregarL = new javax.swing.JButton();
        btnLimparC = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/monica.png"))); // NOI18N

        jLabel2.setText("Numero Turma:");

        txtIDT.setEditable(false);
        txtIDT.setEnabled(false);

        jLabel3.setText("Professor Responsavel:");

        jLabel4.setText("Ano Letivo:");

        jLabel5.setText("Codigo da turma:");

        jLabel6.setText("Horario de Aula:");

        btnCadastrarT.setBackground(new java.awt.Color(204, 255, 204));
        btnCadastrarT.setText("Cadastrar Turma");
        btnCadastrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTActionPerformed(evt);
            }
        });

        btnDeletarT.setBackground(new java.awt.Color(255, 153, 153));
        btnDeletarT.setText("Deletar Turma");
        btnDeletarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarTActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(51, 204, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        tblTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Prof Resp", "Ano letivo", "Codigo Turma","Horario de aula"
            }
        ));
        tblTurmas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblTurmasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblTurmas);

        btnCarregarL.setText("Carregar Linha");
        btnCarregarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarLActionPerformed(evt);
            }
        });

        btnLimparC.setText("Limpar Campos");
        btnLimparC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtProfessorR, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtHorT))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnCadastrarT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletarT)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btnCarregarL)
                .addGap(18, 18, 18)
                .addComponent(btnLimparC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProfessorR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtHorT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarT)
                    .addComponent(btnDeletarT)
                    .addComponent(btnAtualizar)
                    .addComponent(btnCarregarL)
                    .addComponent(btnLimparC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarLActionPerformed
        selecionarLinha();
    }//GEN-LAST:event_btnCarregarLActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        AtualizarTurmas();
        ListarTurmas();

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarTActionPerformed
        ExcluirTurmas();
    }//GEN-LAST:event_btnDeletarTActionPerformed

    private void btnCadastrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTActionPerformed

        cadastroTurmas();


    }//GEN-LAST:event_btnCadastrarTActionPerformed

    private void btnLimparCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCActionPerformed
        LimparCampos();

    }//GEN-LAST:event_btnLimparCActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        new TelaPrincipal().setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tblTurmasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblTurmasAncestorAdded

        TurmaDAO tdao = new TurmaDAO();

        tdao.ShowTurmas();


    }//GEN-LAST:event_tblTurmasAncestorAdded

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
            java.util.logging.Logger.getLogger(TelaTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTurmas().setVisible(true);
            }
        });
    }

    public void cadastroTurmas() {

        String id_turmas = txtIDT.getText();
        String profR = txtProfessorR.getText();
        String AnoL = txtAno.getText();
        String CT = txtCT.getText();
        String HoraT = txtHorT.getText();

        if (id_turmas.isEmpty() && profR.isEmpty() && AnoL.isEmpty() && CT.isEmpty() && HoraT.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {

            TurmasModel tm = new TurmasModel();

            tm.setProfessorResponsavel(profR);
            tm.setAnoLetivo(AnoL);
            tm.setCodigoTurma(CT);
            tm.setHorariodeAula(HoraT);

            TurmaDAO tdao = new TurmaDAO();
            tdao.CadastrarTurmas(tm);

            ListarTurmas();
        }
    }

    private void ListarTurmas() {

        try {

            TurmaDAO tdao = new TurmaDAO();

            DefaultTableModel tableModel = (DefaultTableModel) tblTurmas.getModel();

            tableModel.setNumRows(0);

            for (TurmasModel tm : tdao.ShowTurmas()) {

                tableModel.addRow(new Object[]{
                    tm.getnumeroTurma(),
                    tm.getProfessorResponsavel(),
                    tm.getAnoLetivo(),
                    tm.getCodigoTurma(),
                    tm.getHorariodeAula()
                });

            }
            tdao.ShowTurmas();
            tdao.DeletarTurmas();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "erro em mostrar Turmas: " + e);
        }

    }

    public void AtualizarTurmas() {

        int numero;
        String ProfessorResponsavell, AnoLetivo, CodigoTurmaa, HorariodeAulaa;

        numero = Integer.parseInt(txtIDT.getText());
        ProfessorResponsavell = txtProfessorR.getText();
        AnoLetivo = txtAno.getText();
        CodigoTurmaa = txtCT.getText();
        HorariodeAulaa = txtHorT.getText();

        TurmasModel tm = new TurmasModel();

        tm.setnumeroTurma(numero);
        tm.setProfessorResponsavel(ProfessorResponsavell);
        tm.setAnoLetivo(AnoLetivo);
        tm.setCodigoTurma(CodigoTurmaa);
        tm.setHorariodeAula(HorariodeAulaa);

        TurmaDAO tdao = new ProfessoresDAO();

        pdao.UpdateProfessores(pm);
    }

    public void ExcluirTurmas() {

        TurmaDAO tdao = new TurmaDAO();

        tdao.DeletarTurmas();

    }

    private void selecionarLinha() {
        // Selecionando a linha da tabela
        int carregar = tblTurmas.getSelectedRow();

        if (carregar < 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        } else {
            txtIDT.setText(tblTurmas.getModel().getValueAt(carregar, 0).toString());
            txtProfessorR.setText(tblTurmas.getModel().getValueAt(carregar, 1).toString());
            txtAno.setText(tblTurmas.getModel().getValueAt(carregar, 2).toString());
            txtCT.setText(tblTurmas.getModel().getValueAt(carregar, 3).toString());
            txtHorT.setText(tblTurmas.getModel().getValueAt(carregar, 4).toString());
        }
    }

    private void LimparCampos() {

        txtIDT.setText("");
        txtProfessorR.setText("");
        txtAno.setText("");
        txtCT.setText("");
        txtHorT.setText("");

        txtIDT.requestFocus();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrarT;
    private javax.swing.JButton btnCarregarL;
    private javax.swing.JButton btnDeletarT;
    private javax.swing.JButton btnLimparC;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTurmas;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCT;
    private javax.swing.JTextField txtHorT;
    private javax.swing.JTextField txtIDT;
    private javax.swing.JTextField txtProfessorR;
    // End of variables declaration//GEN-END:variables
}
