package View;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginUI extends javax.swing.JFrame {

    private boolean mostrandoSenha = false;
    private char echoPadrao;

    public LoginUI() {
        initComponents();
        echoPadrao = jPasswordField1.getEchoChar();
        Seta2.setVisible(false);
        Obrigatorio.setVisible(false);
        JLabelObrigatorio.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        JPanelMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        PFP = new javax.swing.JLabel();
        SetaPFP = new javax.swing.JLabel();
        Seta2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        OlhoSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLabelObrigatorio = new javax.swing.JLabel();
        Obrigatorio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        JPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        JPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Acessar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JPanelMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 310, 50));

        PFP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/boy.jpg"))); // NOI18N
        JPanelMenu.add(PFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        SetaPFP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/seta.png"))); // NOI18N
        SetaPFP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetaPFP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetaPFPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SetaPFPMouseEntered(evt);
            }
        });
        JPanelMenu.add(SetaPFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 56, -1));

        Seta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/seta2.png"))); // NOI18N
        Seta2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Seta2MouseClicked(evt);
            }
        });
        JPanelMenu.add(Seta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 56, 60));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setToolTipText("Informe o usuário");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        JPanelMenu.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 330, 40));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setToolTipText("Informe a senha");
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        JPanelMenu.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 330, 40));

        OlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/olho.png"))); // NOI18N
        OlhoSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        OlhoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OlhoSenhaMouseClicked(evt);
            }
        });
        JPanelMenu.add(OlhoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/perfil-de-usuario.png"))); // NOI18N
        JPanelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        JPanelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 330, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        JPanelMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 330, 10));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/LOGOGOAT.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, 140));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Não possui conta ? ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 207, 86));
        jLabel5.setText("Inscreva-se");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 40));

        JPanelMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 340, 740));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/LogoSample_ByTailorBrands.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 200));

        JLabelObrigatorio.setForeground(new java.awt.Color(204, 0, 0));
        JLabelObrigatorio.setText("Campo obrigatório*");
        JPanelMenu.add(JLabelObrigatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        Obrigatorio.setForeground(new java.awt.Color(204, 0, 0));
        Obrigatorio.setText("Campo obrigatório*");
        JPanelMenu.add(Obrigatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Selecione:");
        JPanelMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, 20));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Professor");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelMenu.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, 20));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Aluno");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanelMenu.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetaPFPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetaPFPMouseClicked
        ImageIcon Icon = new ImageIcon(getClass().getResource("../foto/menina.jpg"));
        PFP.setIcon(Icon);
        Seta2.setVisible(true);
        SetaPFP.setVisible(false);
    }//GEN-LAST:event_SetaPFPMouseClicked

    private void SetaPFPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetaPFPMouseEntered

    }//GEN-LAST:event_SetaPFPMouseEntered

    private void Seta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seta2MouseClicked
        ImageIcon Iconn = new ImageIcon(getClass().getResource("../foto/boy.jpg"));
        PFP.setIcon(Iconn);
        Seta2.setVisible(false);
        SetaPFP.setVisible(true);
    }//GEN-LAST:event_Seta2MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.BLACK);
        jButton1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.WHITE);

    }//GEN-LAST:event_jButton1MouseExited

    private void OlhoSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlhoSenhaMouseClicked
        if (mostrandoSenha) {
            jPasswordField1.setEchoChar(echoPadrao);
            OlhoSenha.setIcon(new ImageIcon(getClass().getResource("/foto/olho.png")));
        } else {
            jPasswordField1.setEchoChar((char) 0);
            OlhoSenha.setIcon(new ImageIcon(getClass().getResource("/foto/olhoaberto.png")));
        }
        mostrandoSenha = !mostrandoSenha;
    }//GEN-LAST:event_OlhoSenhaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CamposObrigatorios();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        CRADASTO cad = new CRADASTO();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Interface in = new Interface();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    public void CamposObrigatorios() {

        String email = jTextField1.getText();
        String senha = jPasswordField1.getText();

        if (email.trim().isEmpty() && senha.trim().isEmpty()) {
            JLabelObrigatorio.setVisible(true);
            Obrigatorio.setVisible(true);
        } else if (email.trim().isEmpty()) {
            JLabelObrigatorio.setVisible(true);
            Obrigatorio.setVisible(false);
        } else if (senha.trim().isEmpty()) {
            Obrigatorio.setVisible(true);
            JLabelObrigatorio.setVisible(false);
        } else {
            Interface inter = new Interface();
            inter.setVisible(true);
            dispose();
            Obrigatorio.setVisible(false);
            JLabelObrigatorio.setVisible(false);
        }
    }

    /**
     *
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelObrigatorio;
    private javax.swing.JPanel JPanelMenu;
    private javax.swing.JLabel Obrigatorio;
    private javax.swing.JLabel OlhoSenha;
    private javax.swing.JLabel PFP;
    private javax.swing.JLabel Seta2;
    private javax.swing.JLabel SetaPFP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
