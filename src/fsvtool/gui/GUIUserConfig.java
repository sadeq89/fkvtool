/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fsvtool.gui;

import fsvtool.controller.UserConfigController;
import fsvtool.persistance.IUser;

/**
 *
 * @author Sadeq
 */
public class GUIUserConfig extends javax.swing.JFrame {

    private UserConfigController controller;

    /**
     * Creates new form UserProperties
     */
    public GUIUserConfig(UserConfigController c) {
        this.controller = c;
        initComponents();
    }

    // Get methods for reading textfield,combobox and radiobutton values:
    public String getBenutzername() {
        return this.tfBenutzername.getText();
    }

    public void setBenutzername(String username) {
        this.tfBenutzername.setText(username);
    }

    public String getFirstname() {
        return this.tfVorname.getText();
    }

    public void setFirstname(String firstname) {
        this.tfVorname.setText(firstname);
    }

    public String getSurname() {
        return this.tfName.getText();
    }

    public void setSurname(String name) {
        this.tfName.setText(name);
    }

    public String getTel() {

        return this.tfTel.getText();
    }

    public void setTel(String tel) {
        this.tfTel.setText(tel);
    }

    public String getEMail() {
        return this.tfEMail.getText();
    }

    public void setEMail(String email) {
        this.tfEMail.setText(email);
    }

    public int getFussballStrength() throws VerifyError {
        if (this.rbFbSehrGut.isSelected()) {
            return IUser.SKILL_VALUE_GREAT;
        } else if (this.rbFbMittel.isSelected()) {
            return IUser.SKILL_VALUE_MIDDLE;
        } else if (this.rbFbNichtSoGut.isSelected()) {
            return IUser.SKILL_VALUE_BAD;
        }
        throw new VerifyError("Nothing was selected.");
    }

    public void setFussballStrength(int fussballstrength) {
        switch (fussballstrength) {
            case IUser.SKILL_VALUE_GREAT:
                this.rbFbSehrGut.setSelected(true);
                break;
            case IUser.SKILL_VALUE_MIDDLE:
                this.rbFbMittel.setSelected(true);
                break;
            case IUser.SKILL_VALUE_BAD:
                this.rbFbNichtSoGut.setSelected(true);
                break;
        }
    }
    
    public int getHandballStrength() throws VerifyError {
        if (this.rbHbSehrGut.isSelected()) {
            return IUser.SKILL_VALUE_GREAT;
        } else if (this.rbHbMittel.isSelected()) {
            return IUser.SKILL_VALUE_MIDDLE;
        } else if (this.rbHbNichtSoGut.isSelected()) {
            return IUser.SKILL_VALUE_BAD;
        }
        throw new VerifyError("Nothing was selected.");
    }
  public void setHandballStrength(int fussballstrength) {
        switch (fussballstrength) {
            case IUser.SKILL_VALUE_GREAT:
                this.rbHbSehrGut.setSelected(true);
                break;
            case IUser.SKILL_VALUE_MIDDLE:
                this.rbHbMittel.setSelected(true);
                break;
            case IUser.SKILL_VALUE_BAD:
                this.rbHbNichtSoGut.setSelected(true);
                break;
        }
    }
  
    public int getVolleyballStrength() throws VerifyError {
        if (this.rbVbSehrGut.isSelected()) {
            return IUser.SKILL_VALUE_GREAT;
        } else if (this.rbVbMittel.isSelected()) {
            return IUser.SKILL_VALUE_MIDDLE;
        } else if (this.rbVbNichtSoGut.isSelected()) {
            return IUser.SKILL_VALUE_BAD;
        }
        throw new VerifyError("Nothing was selected.");
    }
    
    public void setVolleyballStrength(int fussballstrength) {
        switch (fussballstrength) {
            case IUser.SKILL_VALUE_GREAT:
                this.rbVbSehrGut.setSelected(true);
                break;
            case IUser.SKILL_VALUE_MIDDLE:
                this.rbVbMittel.setSelected(true);
                break;
            case IUser.SKILL_VALUE_BAD:
                this.rbVbNichtSoGut.setSelected(true);
                break;
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

        bgFussball = new javax.swing.ButtonGroup();
        bgHandball = new javax.swing.ButtonGroup();
        bgVolleyball = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfVorname = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfTel = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rbFbSehrGut = new javax.swing.JRadioButton();
        rbFbNichtSoGut = new javax.swing.JRadioButton();
        rbFbMittel = new javax.swing.JRadioButton();
        rbHbNichtSoGut = new javax.swing.JRadioButton();
        rbHbMittel = new javax.swing.JRadioButton();
        rbHbSehrGut = new javax.swing.JRadioButton();
        rbVbSehrGut = new javax.swing.JRadioButton();
        rbVbMittel = new javax.swing.JRadioButton();
        rbVbNichtSoGut = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        tfEMail = new javax.swing.JTextField();
        tfBenutzername = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fsvtool/background.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(jLayeredPane2.getMaximumSize());
        jLabel3.setMinimumSize(jLayeredPane2.getMinimumSize());
        jLabel3.setPreferredSize(getPreferredSize());
        jLabel3.setVerifyInputWhenFocusTarget(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Benutzereinstellungen");
        setResizable(false);

        jLayeredPane2.setMaximumSize(getMaximumSize());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Speichern");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(360, 510, 120, 40);
        jLayeredPane2.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Abbrechen");
        jButton2.setMaximumSize(new java.awt.Dimension(89, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(89, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(510, 510, 120, 40);
        jLayeredPane2.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Meine Einstellungen");
        jLabel4.setBounds(250, 10, 240, 20);
        jLayeredPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Benutzername");
        jLabel5.setBounds(180, 70, 90, 15);
        jLayeredPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Name");
        jLabel6.setBounds(180, 150, 80, 15);
        jLayeredPane2.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Tel");
        jLabel8.setBounds(180, 190, 60, 15);
        jLayeredPane2.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tfVorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVornameActionPerformed(evt);
            }
        });
        tfVorname.setBounds(370, 100, 160, 30);
        jLayeredPane2.add(tfVorname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tfName.setBounds(370, 140, 160, 30);
        jLayeredPane2.add(tfName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tfTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelActionPerformed(evt);
            }
        });
        tfTel.setBounds(370, 180, 160, 30);
        jLayeredPane2.add(tfTel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(160, 260, 460, 10);
        jLayeredPane2.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Mein Niveau");
        jLabel9.setBounds(250, 270, 220, 22);
        jLayeredPane2.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Fußball:");
        jLabel10.setBounds(180, 320, 60, 17);
        jLayeredPane2.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Handball:");
        jLabel11.setBounds(180, 390, 60, 17);
        jLayeredPane2.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Volleyball:");
        jLabel12.setBounds(180, 460, 70, 17);
        jLayeredPane2.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        rbFbSehrGut.setBackground(new java.awt.Color(255, 0, 0));
        bgFussball.add(rbFbSehrGut);
        rbFbSehrGut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbFbSehrGut.setText("Sehr Gut");
        rbFbSehrGut.setMaximumSize(new java.awt.Dimension(50, 25));
        rbFbSehrGut.setMinimumSize(new java.awt.Dimension(50, 25));
        rbFbSehrGut.setPreferredSize(new java.awt.Dimension(50, 25));
        rbFbSehrGut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFbSehrGutActionPerformed(evt);
            }
        });
        rbFbSehrGut.setBounds(300, 320, 90, 25);
        jLayeredPane2.add(rbFbSehrGut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bgFussball.add(rbFbNichtSoGut);
        rbFbNichtSoGut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbFbNichtSoGut.setText("Nicht so Gut");
        rbFbNichtSoGut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFbNichtSoGutActionPerformed(evt);
            }
        });
        rbFbNichtSoGut.setBounds(520, 320, 100, 23);
        jLayeredPane2.add(rbFbNichtSoGut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bgFussball.add(rbFbMittel);
        rbFbMittel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbFbMittel.setText("Mittel");
        rbFbMittel.setBounds(420, 320, 70, 23);
        jLayeredPane2.add(rbFbMittel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bgHandball.add(rbHbNichtSoGut);
        rbHbNichtSoGut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbHbNichtSoGut.setText("Nicht so Gut");
        rbHbNichtSoGut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHbNichtSoGutActionPerformed(evt);
            }
        });
        rbHbNichtSoGut.setBounds(520, 390, 100, 23);
        jLayeredPane2.add(rbHbNichtSoGut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bgHandball.add(rbHbMittel);
        rbHbMittel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbHbMittel.setText("Mittel");
        rbHbMittel.setBounds(420, 390, 70, 23);
        jLayeredPane2.add(rbHbMittel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bgHandball.add(rbHbSehrGut);
        rbHbSehrGut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbHbSehrGut.setText("Sehr Gut");
        rbHbSehrGut.setBounds(300, 390, 80, 23);
        jLayeredPane2.add(rbHbSehrGut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bgVolleyball.add(rbVbSehrGut);
        rbVbSehrGut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbVbSehrGut.setText("Sehr Gut");
        rbVbSehrGut.setBounds(300, 460, 80, 23);
        jLayeredPane2.add(rbVbSehrGut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bgVolleyball.add(rbVbMittel);
        rbVbMittel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbVbMittel.setText("Mittel");
        rbVbMittel.setBounds(420, 460, 70, 23);
        jLayeredPane2.add(rbVbMittel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bgVolleyball.add(rbVbNichtSoGut);
        rbVbNichtSoGut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbVbNichtSoGut.setText("Nicht so Gut");
        rbVbNichtSoGut.setBounds(520, 460, 100, 23);
        jLayeredPane2.add(rbVbNichtSoGut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setText("Email");
        jLabel13.setBounds(180, 230, 70, 15);
        jLayeredPane2.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tfEMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEMailActionPerformed(evt);
            }
        });
        tfEMail.setBounds(370, 220, 160, 30);
        jLayeredPane2.add(tfEMail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tfBenutzername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBenutzernameActionPerformed(evt);
            }
        });
        tfBenutzername.setBounds(370, 60, 160, 30);
        jLayeredPane2.add(tfBenutzername, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Vorname");
        jLabel14.setBounds(180, 110, 90, 15);
        jLayeredPane2.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fsvtool/background.png"))); // NOI18N
        jLabel2.setBounds(0, 0, 640, 570);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(552, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.controller.save();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelActionPerformed

    private void rbFbSehrGutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFbSehrGutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFbSehrGutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfVornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVornameActionPerformed

    private void rbFbNichtSoGutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFbNichtSoGutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFbNichtSoGutActionPerformed

    private void rbHbNichtSoGutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHbNichtSoGutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbHbNichtSoGutActionPerformed

    private void tfEMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEMailActionPerformed

    private void tfBenutzernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBenutzernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBenutzernameActionPerformed

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
            java.util.logging.Logger.getLogger(GUIUserConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIUserConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIUserConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIUserConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIUserConfig(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFussball;
    private javax.swing.ButtonGroup bgHandball;
    private javax.swing.ButtonGroup bgVolleyball;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbFbMittel;
    private javax.swing.JRadioButton rbFbNichtSoGut;
    private javax.swing.JRadioButton rbFbSehrGut;
    private javax.swing.JRadioButton rbHbMittel;
    private javax.swing.JRadioButton rbHbNichtSoGut;
    private javax.swing.JRadioButton rbHbSehrGut;
    private javax.swing.JRadioButton rbVbMittel;
    private javax.swing.JRadioButton rbVbNichtSoGut;
    private javax.swing.JRadioButton rbVbSehrGut;
    private javax.swing.JTextField tfBenutzername;
    private javax.swing.JTextField tfEMail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTel;
    private javax.swing.JTextField tfVorname;
    // End of variables declaration//GEN-END:variables
}
