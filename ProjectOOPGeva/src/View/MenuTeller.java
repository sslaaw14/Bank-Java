/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Nasabah;
import Controller.Controller;

/**
 *
 * @author USER
 */
public class MenuTeller extends javax.swing.JFrame {
    Controller controller = new Controller();
    private Nasabah nasabah;
    /**
     * Creates new form menuTeller
     */

    public MenuTeller(Nasabah nasabah) {
        initComponents();
        this.nasabah = nasabah;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTellerTrasnfer = new javax.swing.JButton();
        btnCekTeller = new javax.swing.JButton();
        btnSimpanUang = new javax.swing.JButton();
        btnLogOutTeller = new javax.swing.JButton();
        btnTarikUangTeller = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Menu Teller");

        btnTellerTrasnfer.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnTellerTrasnfer.setText("[1] Transfer");
        btnTellerTrasnfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTellerTrasnferActionPerformed(evt);
            }
        });

        btnCekTeller.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnCekTeller.setText("[2] Cek Saldo");
        btnCekTeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekTellerActionPerformed(evt);
            }
        });

        btnSimpanUang.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSimpanUang.setText("[4] Simpan Uang");
        btnSimpanUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanUangActionPerformed(evt);
            }
        });

        btnLogOutTeller.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnLogOutTeller.setText("Logout");
        btnLogOutTeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutTellerActionPerformed(evt);
            }
        });

        btnTarikUangTeller.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnTarikUangTeller.setText("[3] Tarik Uang");
        btnTarikUangTeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarikUangTellerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTellerTrasnfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCekTeller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSimpanUang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTarikUangTeller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogOutTeller)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTellerTrasnfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTarikUangTeller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanUang)
                    .addComponent(btnCekTeller, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnLogOutTeller)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTellerTrasnferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTellerTrasnferActionPerformed
        controller.TransferTeller(nasabah);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnTellerTrasnferActionPerformed

    private void btnLogOutTellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutTellerActionPerformed
        controller.logoutTeller();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnLogOutTellerActionPerformed

    private void btnCekTellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekTellerActionPerformed
        controller.SaldoViewTeller(nasabah);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCekTellerActionPerformed

    private void btnSimpanUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanUangActionPerformed
        controller.SimpanUang(nasabah);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSimpanUangActionPerformed

    private void btnTarikUangTellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarikUangTellerActionPerformed
        controller.TarikUangTeller(nasabah);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnTarikUangTellerActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuTeller().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCekTeller;
    private javax.swing.JButton btnLogOutTeller;
    private javax.swing.JButton btnSimpanUang;
    private javax.swing.JButton btnTarikUangTeller;
    private javax.swing.JButton btnTellerTrasnfer;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
