/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewGUI;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
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

        jLabel1 = new javax.swing.JLabel();
        MPetugas = new javax.swing.JButton();
        Mgudang = new javax.swing.JButton();
        Mpenyedia = new javax.swing.JButton();
        Mbarang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inventaris Peminjaman Barang");

        MPetugas.setText("PETUGAS");
        MPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPetugasActionPerformed(evt);
            }
        });

        Mgudang.setText("GUDANG");
        Mgudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MgudangActionPerformed(evt);
            }
        });

        Mpenyedia.setText("PENYEDIA");
        Mpenyedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MpenyediaActionPerformed(evt);
            }
        });

        Mbarang.setText("BARANG");
        Mbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MbarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mpenyedia, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(Mbarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mgudang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mpenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Mbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mgudang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MpenyediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MpenyediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MpenyediaActionPerformed

    private void MgudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MgudangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MgudangActionPerformed

    private void MbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MbarangActionPerformed

    private void MPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MPetugasActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuUtama().setVisible(true);
//            }
//        });
//    }
    public JButton getMPetugas() {
        return MPetugas;
    }

    public void setMPetugas(JButton MPetugas) {
        this.MPetugas = MPetugas;
    }

    public JButton getMbarang() {
        return Mbarang;
    }

    public void setMbarang(JButton Mbarang) {
        this.Mbarang = Mbarang;
    }

    public JButton getMgudang() {
        return Mgudang;
    }

    public void setMgudang(JButton Mgudang) {
        this.Mgudang = Mgudang;
    }

    public JButton getMpenyedia() {
        return Mpenyedia;
    }

    public void setMpenyedia(JButton Mpenyedia) {
        this.Mpenyedia = Mpenyedia;
    }

    public void addListener(ActionListener e) {
        MPetugas.addActionListener(e);
        Mbarang.addActionListener(e);
        Mgudang.addActionListener(e);
    }

    public void ViewErrorMsg(String errMsg) {
        JOptionPane.showConfirmDialog(this, errMsg);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MPetugas;
    private javax.swing.JButton Mbarang;
    private javax.swing.JButton Mgudang;
    private javax.swing.JButton Mpenyedia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
