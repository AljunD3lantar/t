/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import LoginSignup.Login;
import ReceiptMaker.receiptmaker;
import config.Session;
import javax.swing.JOptionPane;



public class adminWindow extends javax.swing.JFrame {

    
    public adminWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fullN = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        users = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
<<<<<<< HEAD
        reserve = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Schedule = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Foodmenu = new javax.swing.JButton();
=======
        jLabel7 = new javax.swing.JLabel();
        customerReceipt = new javax.swing.JButton();
>>>>>>> cb6cecda88f028850a703f216c95baf7db600dbb

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("ADMIN WINDOW");

        Logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Logout.setText("LOGOUT");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                .addComponent(Logout)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Logout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        fullN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fullN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullN.setText("ADMIN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-admin-96 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fullN, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fullN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 470));

<<<<<<< HEAD
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-reviews-100.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 100, 100));

=======
>>>>>>> cb6cecda88f028850a703f216c95baf7db600dbb
        users.setText("USERS");
        users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActionPerformed(evt);
            }
        });
        jPanel1.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-100.png"))); // NOI18N
<<<<<<< HEAD
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 100, 100));

        reserve.setText("Reserve");
        reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveActionPerformed(evt);
            }
        });
        jPanel1.add(reserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, 40));
=======
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 100, 100));
>>>>>>> cb6cecda88f028850a703f216c95baf7db600dbb

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-100.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 100, 100));

<<<<<<< HEAD
        Schedule.setText("Schedule");
        Schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleActionPerformed(evt);
            }
        });
        jPanel1.add(Schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 80, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-100.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 100, 100));

        Foodmenu.setText("Food Menu");
        Foodmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodmenuActionPerformed(evt);
            }
        });
        jPanel1.add(Foodmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 100, 40));
=======
        customerReceipt.setText("Make a Receipt");
        customerReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerReceiptActionPerformed(evt);
            }
        });
        jPanel1.add(customerReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, 40));
>>>>>>> cb6cecda88f028850a703f216c95baf7db600dbb

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActionPerformed
        userWindows ads = new userWindows();
        ads.setVisible(true);
        ads.pack();
        ads.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_usersActionPerformed

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "Select an Option...",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
        Login ads = new Login();
        ads.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        if(sess.getUserID() == 0){
            JOptionPane.showMessageDialog(null, "No account, Login First!");
            Login ads = new Login();
            ads.setVisible(true);
            this.dispose();
        }else{
            fullN.setText(""+sess.getFullname());
        }
    }//GEN-LAST:event_formWindowActivated

<<<<<<< HEAD
    private void reserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveActionPerformed
        customerReservation cr = new customerReservation();
        cr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reserveActionPerformed

    private void ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScheduleActionPerformed

    private void FoodmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FoodmenuActionPerformed

    
=======
    private void customerReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerReceiptActionPerformed
           receiptmaker rm = new receiptmaker();
           rm.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_customerReceiptActionPerformed

    /**
     * @param args the command line arguments
     */
>>>>>>> cb6cecda88f028850a703f216c95baf7db600dbb
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
            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Foodmenu;
    private javax.swing.JLabel Logout;
<<<<<<< HEAD
    private javax.swing.JButton Schedule;
    public javax.swing.JLabel fullN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
=======
    private javax.swing.JButton customerReceipt;
    public javax.swing.JLabel fullN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
>>>>>>> cb6cecda88f028850a703f216c95baf7db600dbb
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton reserve;
    private javax.swing.JButton users;
    // End of variables declaration//GEN-END:variables
}
