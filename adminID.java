import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class adminID extends javax.swing.JFrame {

    public adminID() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CreateAccountB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addB = new javax.swing.JButton();
        deleteT = new javax.swing.JTextField();
        deleteB = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        updateB = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        moviesT = new javax.swing.JList<>();
        showB = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Hobo Std", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 204));
        jLabel1.setText("Movie Tickets");

        CreateAccountB.setBackground(new java.awt.Color(153, 255, 204));
        CreateAccountB.setFont(new java.awt.Font("Dungeon", 1, 18)); // NOI18N
        CreateAccountB.setForeground(new java.awt.Color(0, 102, 102));
        CreateAccountB.setText("Logout");
        CreateAccountB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add a Movie:");

        addT.setBackground(new java.awt.Color(0, 153, 153));
        addT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addT.setForeground(new java.awt.Color(153, 255, 204));
        addT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Delete a Movie:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Update a Movie:");

        addB.setText("Add");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        deleteT.setBackground(new java.awt.Color(0, 153, 153));
        deleteT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deleteT.setForeground(new java.awt.Color(153, 255, 204));
        deleteT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        text1.setBackground(new java.awt.Color(0, 153, 153));
        text1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(153, 255, 204));
        text1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        updateB.setText("Update");
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("All Movies");

        text2.setBackground(new java.awt.Color(0, 153, 153));
        text2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(153, 255, 204));
        text2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        moviesT.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        moviesT.setForeground(new java.awt.Color(0, 102, 102));
        jScrollPane4.setViewportView(moviesT);

        showB.setBackground(new java.awt.Color(153, 255, 204));
        showB.setFont(new java.awt.Font("Dungeon", 1, 18)); // NOI18N
        showB.setForeground(new java.awt.Color(0, 102, 102));
        showB.setText("Show List");
        showB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addT, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteT, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showB, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreateAccountB, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(deleteT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateB)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateAccountB)
                    .addComponent(showB))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void database(String add, String data){
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticket_management_system","root","");
            Statement st = (Statement)con.createStatement();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(add);
            pst.setString(1,data);
            pst.execute();
            con.close();    
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
    }
    private void CreateAccountBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountBActionPerformed
        this.dispose();
        JOptionPane.showMessageDialog(this, "Loggged Out");
        new First_Page().setVisible(true);
    }//GEN-LAST:event_CreateAccountBActionPerformed

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        if(this.addB.getText().equals(""))
            JOptionPane.showMessageDialog(this, "There Have no Input");
        else {
            database("INSERT INTO `movies`(`movie_list`) VALUES (?)", addT.getText());
            JOptionPane.showMessageDialog(rootPane, "Added a Movie: "+addT.getText());
            addT.setText("");
        }
    }//GEN-LAST:event_addBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        database("DELETE FROM `movies` WHERE movies.movie_list = ?",deleteT.getText());
        JOptionPane.showMessageDialog(addT, "Deleted "+deleteT.getText());
        deleteT.setText("");
    }//GEN-LAST:event_deleteBActionPerformed

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        database("UPDATE `movies` SET `movie_list`=? WHERE movie_list=('"+text1.getText()+"')",text2.getText());
        JOptionPane.showMessageDialog(addT, "Updated Successfully");
    }//GEN-LAST:event_updateBActionPerformed

    private void showBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBActionPerformed
        DefaultListModel dlm = new DefaultListModel();
        int i=1;
        try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticket_management_system","root","");
                Statement st = (Statement)con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM `movies`");
                while(rs.next()){
                   dlm.addElement("Movie "+i+": "+rs.getString(1));
                   i++;
                }
                moviesT.setModel(dlm);
                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        
    }//GEN-LAST:event_showBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccountB;
    private javax.swing.JButton addB;
    private javax.swing.JTextField addT;
    private javax.swing.JButton deleteB;
    private javax.swing.JTextField deleteT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> moviesT;
    private javax.swing.JButton showB;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables
}
