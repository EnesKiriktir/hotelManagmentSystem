
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RestaurantScreen extends javax.swing.JFrame {
    static Hotel hotel;
    Customer customer;
    Calendar cal ;
    
    public RestaurantScreen(Hotel hotel,Customer customer,Calendar cal) {
        initComponents();
        this.hotel = hotel;
        this.customer = customer;
        this.cal = cal;
        // filling Jtable with the menu of the restaurant
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        for ( int i = 0 ; i<hotel.getRestaurant().getMenu().size();i++ ){
            Object [] food = {hotel.getRestaurant().getMenu().get(i).getType(),
                hotel.getRestaurant().getMenu().get(i).getName(),hotel.getRestaurant().getMenu().get(i).getPrice()};
            model.addRow(food);
        }   
        
    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        selectbutton = new javax.swing.JButton();
        orderbutton = new javax.swing.JButton();
        menutype = new javax.swing.JLabel();
        menufood = new javax.swing.JLabel();
        menuprice = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        image_icon = new javax.swing.JLabel();

        setTitle("Restaurant");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 240, 240));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jScrollPane1.setBackground(new java.awt.Color(0, 204, 204));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Food", "Price"
            }
        ));
        menuTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(menuTable);

        selectbutton.setText("Select Food");
        selectbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbuttonActionPerformed(evt);
            }
        });

        orderbutton.setText("Order");
        orderbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderbuttonActionPerformed(evt);
            }
        });

        menutype.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        menutype.setForeground(new java.awt.Color(0, 51, 255));

        menufood.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        menufood.setForeground(new java.awt.Color(0, 51, 255));

        menuprice.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        menuprice.setForeground(new java.awt.Color(0, 0, 255));

        messageLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectbutton)
                            .addComponent(orderbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(185, 185, 185)
                .addComponent(image_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(menutype, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(menufood, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(menuprice, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(selectbutton)
                        .addGap(18, 18, 18)
                        .addComponent(orderbutton)
                        .addGap(14, 14, 14)
                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(image_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menutype)
                    .addComponent(menufood)
                    .addComponent(menuprice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // selecting a food from JTable
    private void selectbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbuttonActionPerformed
        messageLabel.setText("");
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        int selected_row = menuTable.getSelectedRow();
        
        if(selected_row == -1){
            menutype.setText("");
            menufood.setText("");
            menuprice.setText("");
        }
        else{
            menutype.setText(model.getValueAt(selected_row, 0).toString());
            menufood.setText(model.getValueAt(selected_row, 1).toString());
            menuprice.setText(model.getValueAt(selected_row, 2).toString());
        }
        
    }//GEN-LAST:event_selectbuttonActionPerformed
    // ordering
    private void orderbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderbuttonActionPerformed
        if(!menutype.getText().equals("") && !menufood.getText().equals("")
                && !menuprice.getText().equals("")){
            int selected_row = menuTable.getSelectedRow();
            hotel.getRestaurant().order(customer, selected_row,cal);
            messageLabel.setText("Selected Food ordered");
            menutype.setText("");
            menufood.setText("");
            menuprice.setText("");
        }
        else{
            String message = "Please select a food first...";
            JOptionPane.showMessageDialog(this, message);
        }
        
        
        
    }//GEN-LAST:event_orderbuttonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        image_icon.setIcon(new ImageIcon(getClass().getResource("icons\\restaurant.png")));
    }//GEN-LAST:event_formWindowOpened

    
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
            java.util.logging.Logger.getLogger(RestaurantScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new RestaurantScreen(hotel,customer).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image_icon;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menuTable;
    private javax.swing.JLabel menufood;
    private javax.swing.JLabel menuprice;
    private javax.swing.JLabel menutype;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton orderbutton;
    private javax.swing.JButton selectbutton;
    // End of variables declaration//GEN-END:variables
}
