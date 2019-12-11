
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi
 */
public class First_Page extends javax.swing.JFrame {

    /**
     * Creates new form First_Page
     */
    public First_Page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LoginAdminB = new javax.swing.JButton();
        LoginUserB = new javax.swing.JButton();
        gmailT = new javax.swing.JTextField();
        passT = new javax.swing.JPasswordField();
        CreateAccountB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Hobo Std", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 204));
        jLabel1.setText("Movie Tickets");

        LoginAdminB.setBackground(new java.awt.Color(153, 255, 204));
        LoginAdminB.setFont(new java.awt.Font("Dungeon", 1, 18)); // NOI18N
        LoginAdminB.setForeground(new java.awt.Color(0, 102, 102));
        LoginAdminB.setText("Login as Admin");
        LoginAdminB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginAdminBActionPerformed(evt);
            }
        });

        LoginUserB.setBackground(new java.awt.Color(153, 255, 204));
        LoginUserB.setFont(new java.awt.Font("Dungeon", 1, 18)); // NOI18N
        LoginUserB.setForeground(new java.awt.Color(0, 102, 102));
        LoginUserB.setText("Login as User");
        LoginUserB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUserBActionPerformed(evt);
            }
        });

        gmailT.setBackground(new java.awt.Color(0, 153, 153));
        gmailT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        gmailT.setForeground(new java.awt.Color(153, 255, 204));
        gmailT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        passT.setBackground(new java.awt.Color(0, 153, 153));
        passT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        passT.setForeground(new java.awt.Color(153, 255, 204));
        passT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CreateAccountB.setBackground(new java.awt.Color(153, 255, 204));
        CreateAccountB.setFont(new java.awt.Font("Dungeon", 1, 18)); // NOI18N
        CreateAccountB.setForeground(new java.awt.Color(0, 102, 102));
        CreateAccountB.setText("Create Account");
        CreateAccountB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gmailT, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LoginUserB, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passT, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LoginAdminB, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CreateAccountB, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addComponent(gmailT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginUserB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginAdminB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateAccountB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginAdminBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginAdminBActionPerformed
        if(gmailT.getText().equals("admin") && passT.getText().equals("admin"))
        {
            this.dispose();
            new adminID().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(gmailT, "Wrong Pass of Gmail!!");
            
    }//GEN-LAST:event_LoginAdminBActionPerformed
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    private void LoginUserBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUserBActionPerformed
        boolean test=false;
        if(gmailT.getText().equals("") || passT.getText().equals(""))
            JOptionPane.showMessageDialog(gmailT, "Empty Password or User ID!!");
        else
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticket_management_system","root","");
                st = (Statement)con.createStatement();
                rs  = st.executeQuery("SELECT * FROM user_data");
                String userId = gmailT.getText();
                String password = passT.getText();
                while(rs.next()){
                    if(rs.getString(3).equals(userId) && rs.getString(6).equals(password)){
                        user_class user;
                        user = new user_class(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                        new userID(user).setVisible(true);
                        this.dispose();
                        test = false;
                        break;
                        }
                    else 
                        test = true;
                    }
                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                if(test)
                    JOptionPane.showMessageDialog(gmailT, "Wrong User ID or Password.");
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(First_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }//GEN-LAST:event_LoginUserBActionPerformed

    private void CreateAccountBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountBActionPerformed
        this.dispose();
        new createID().setVisible(true);
    }//GEN-LAST:event_CreateAccountBActionPerformed

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
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccountB;
    private javax.swing.JButton LoginAdminB;
    private javax.swing.JButton LoginUserB;
    private javax.swing.JTextField gmailT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passT;
    // End of variables declaration//GEN-END:variables
}
