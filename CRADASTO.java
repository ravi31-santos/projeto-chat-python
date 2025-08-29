package View;

import Model.aluno;
import java.sql.SQLException;
import DAO.AlunoDAO;
import java.awt.Color;
import javax.swing.JOptionPane;

public class CRADASTO extends javax.swing.JFrame {

    public String Nome;

    public CRADASTO() {
        initComponents();
        JButtonCad.setEnabled(false);
        JButtonCad.setForeground(Color.red);
        JButtonCad.setOpaque(true);
        JButtonCad.setContentAreaFilled(true);
        JButtonCad.setFocusPainted(false);
        JButtonCad.setBorderPainted(false);
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTxtNome = new javax.swing.JTextField();
        JTxtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JRbtProf = new javax.swing.JRadioButton();
        JRbtAluno = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        JButtonCad = new javax.swing.JButton();
        JCheckTermos = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        JPssSenha = new javax.swing.JPasswordField();
        JPssConfirmarSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        JLabelLerMais = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtUnidade = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        JTxtNome.setBackground(new java.awt.Color(255, 255, 255));
        JTxtNome.setForeground(new java.awt.Color(0, 0, 0));
        JTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTxtNomeActionPerformed(evt);
            }
        });

        JTxtEmail.setBackground(new java.awt.Color(255, 255, 255));
        JTxtEmail.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-Mail");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha");

        JRbtProf.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(JRbtProf);
        JRbtProf.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        JRbtProf.setForeground(new java.awt.Color(255, 255, 255));
        JRbtProf.setText("Professor");
        JRbtProf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JRbtAluno.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(JRbtAluno);
        JRbtAluno.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        JRbtAluno.setForeground(new java.awt.Color(255, 255, 255));
        JRbtAluno.setText("Aluno");
        JRbtAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Selecione:");

        JButtonCad.setBackground(new java.awt.Color(0, 102, 255));
        JButtonCad.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        JButtonCad.setForeground(new java.awt.Color(255, 255, 255));
        JButtonCad.setText("Cadastrar");
        JButtonCad.setBorder(null);
        JButtonCad.setBorderPainted(false);
        JButtonCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonCadMouseClicked(evt);
            }
        });
        JButtonCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCadActionPerformed(evt);
            }
        });

        JCheckTermos.setBackground(new java.awt.Color(0, 0, 0));
        JCheckTermos.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        JCheckTermos.setForeground(new java.awt.Color(255, 255, 255));
        JCheckTermos.setText("Aceito os termos de uso.");
        JCheckTermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCheckTermosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Confirmar");

        JPssSenha.setBackground(new java.awt.Color(255, 255, 255));
        JPssSenha.setForeground(new java.awt.Color(0, 0, 0));

        JPssConfirmarSenha.setBackground(new java.awt.Color(255, 255, 255));
        JPssConfirmarSenha.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        JLabelLerMais.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        JLabelLerMais.setForeground(new java.awt.Color(255, 255, 255));
        JLabelLerMais.setText("Ler mais.");
        JLabelLerMais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLabelLerMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelLerMaisMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Unidade");

        jTxtUnidade.setBackground(new java.awt.Color(255, 255, 255));
        jTxtUnidade.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Já possui conta ?");

        jLabel7.setBackground(new java.awt.Color(0, 153, 255));
        jLabel7.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Entre.");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/LogoSample_ByTailorBrands.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGap(197, 197, 197)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(JCheckTermos)
                            .addGap(165, 165, 165)
                            .addComponent(JLabelLerMais))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JRbtProf)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JRbtAluno)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JButtonCad, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                            .addComponent(JPssConfirmarSenha)
                            .addComponent(JPssSenha)
                            .addComponent(jTxtUnidade)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JPssSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JPssConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTxtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JRbtProf)
                    .addComponent(JRbtAluno))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCheckTermos)
                    .addComponent(JLabelLerMais))
                .addGap(45, 45, 45)
                .addComponent(JButtonCad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTxtNomeActionPerformed

    }//GEN-LAST:event_JTxtNomeActionPerformed

    private void JCheckTermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCheckTermosActionPerformed
        Termos();
    }//GEN-LAST:event_JCheckTermosActionPerformed

    private void JButtonCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonCadMouseClicked

    }//GEN-LAST:event_JButtonCadMouseClicked

    private void JButtonCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadActionPerformed
        try {
            cadAluno();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      
    }//GEN-LAST:event_JButtonCadActionPerformed

    private void JLabelLerMaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelLerMaisMouseClicked
      
        
    }//GEN-LAST:event_JLabelLerMaisMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       LoginUI lui = new LoginUI();
       lui.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void cadAluno() throws SQLException {
        String nome = JTxtNome.getText();
        String email = JTxtEmail.getText();
        int senha = Integer.parseInt(JPssSenha.getText());
        int confSenha = Integer.parseInt(JPssConfirmarSenha.getText());
        String unidade = jTxtUnidade.getText();
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.cadastrarAluno(nome, email, senha, confSenha, unidade);
    }

    public void Termos() {

        if (JCheckTermos.isSelected()) {
            JButtonCad.setEnabled(true);
            JButtonCad.setBackground(new Color(0,102,255));
            JButtonCad.setForeground(Color.WHITE);
            // JButtonCad.setCursor(Cursor.HAND_CURSOR);
        } else {
            JButtonCad.setEnabled(false);
            JButtonCad.setForeground(Color.cyan);
        }

    }
    
   

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRADASTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRADASTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRADASTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRADASTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRADASTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCad;
    private javax.swing.JCheckBox JCheckTermos;
    private javax.swing.JLabel JLabelLerMais;
    private javax.swing.JPasswordField JPssConfirmarSenha;
    private javax.swing.JPasswordField JPssSenha;
    private javax.swing.JRadioButton JRbtAluno;
    private javax.swing.JRadioButton JRbtProf;
    private javax.swing.JTextField JTxtEmail;
    private javax.swing.JTextField JTxtNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxtUnidade;
    // End of variables declaration//GEN-END:variables
}
