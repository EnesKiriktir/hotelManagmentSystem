
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CustomerScreen extends javax.swing.JFrame {

    Hotel hotel;
    HotelManagement hms;
    Customer customer;
    Calendar cal;
    String currentDate;

    public CustomerScreen(Hotel hotel, Customer customer) {
        initComponents();
        this.hotel = hotel;
        this.customer = customer;
        cal = Calendar.getInstance();
        updateDate(cal);
    }
    public CustomerScreen(Hotel hotel,Customer customer,Calendar cal){
        initComponents();
        this.hotel=hotel;
        this.customer=customer;
        this.cal=cal;
        updateDate(cal);
    }
    public void updateDate(Calendar cal){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = cal.getTime();
        currentDate =dateFormat.format(date);
        dateLabel.setText(currentDate); 
    }
    public void nextDay(Calendar cal){
       
       cal.add(Calendar.DATE, 1);
       updateDate(cal);
       if(customer.getBookingInfo()!=null && customer.IsCheckedIn()&& cal.after(customer.getBookingInfo().getEndDate())){
           JOptionPane.showMessageDialog(this, "Your reservation has expired! Thanks for choosing us. "+cal.getTime());
           hms= new HotelManagement();
           
           hms.checkOut(customer.getBookingInfo(), cal);
       }
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        restaurantbutton = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        checkInButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        nextDayButton = new javax.swing.JButton();
        dateLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        billButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reception");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        restaurantbutton.setText("Restaurant");
        restaurantbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantbuttonActionPerformed(evt);
            }
        });

        bookButton.setText("Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        checkInButton.setText("Check In");
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        dateLabel.setBackground(new java.awt.Color(0, 0, 0));
        dateLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));

        nextDayButton.setText("Next Day");
        nextDayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextDayButtonActionPerformed(evt);
            }
        });

        dateLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateLabel2.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel2.setText("Date:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restaurantbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextDayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(dateLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restaurantbutton)
                    .addComponent(bookButton)
                    .addComponent(checkInButton)
                    .addComponent(checkOutButton)
                    .addComponent(dateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(nextDayButton)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setToolTipText("");

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operation", "Amount", "Date", "Payment"
            }
        ));
        jScrollPane2.setViewportView(billTable);

        billButton.setText("Show my Bills");
        billButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billButtonActionPerformed(evt);
            }
        });

        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billButton)
                    .addComponent(payButton)
                    .addComponent(logOutButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restaurantbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantbuttonActionPerformed
        RestaurantScreen rsc = new RestaurantScreen(hotel, customer,cal);
        rsc.setVisible(true);
    }//GEN-LAST:event_restaurantbuttonActionPerformed

    private void billButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) billTable.getModel();
        model.getDataVector().removeAllElements();
        for (int i = 0; i < customer.getBillList().size(); i++) {
            Object[] bills = {customer.getBillList().get(i).getOperationName(), customer.getBillList().get(i).getAmount(),
                customer.getBillList().get(i).getDate(), customer.getBillList().get(i).isPaid()};
            model.addRow(bills);
        }
    }//GEN-LAST:event_billButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) billTable.getModel();
        int selected_row = billTable.getSelectedRow();

        if (selected_row == -1) {
            if (billTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "List is empty!", "Fail", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a bill to pay!", "Fail", JOptionPane.WARNING_MESSAGE);
            }
        } else {

            for (int i = 0; i < customer.getBillList().size(); i++) {
                if (!customer.getBillList().get(selected_row).isPaid()) {
                    customer.getBillList().get(selected_row).setPaid(true);
                    hotel.setIncome(hotel.getIncome() + Double.valueOf(model.getValueAt(selected_row, 1).toString()));
                    JOptionPane.showMessageDialog(this, "Bill has been paid successfully!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "This bill has already been paid!", "Fail", JOptionPane.WARNING_MESSAGE);
                    break;
                }
            }
        }
    }//GEN-LAST:event_payButtonActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        BookSc bsc = new BookSc(hotel,customer,cal);
        bsc.setVisible(true);
    }//GEN-LAST:event_bookButtonActionPerformed

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed
       if(customer.getBookingInfo()==null)
          JOptionPane.showMessageDialog(this, "You have no booking record!", "Fail", JOptionPane.WARNING_MESSAGE);
       else{
           if(customer.IsCheckedIn()){
               JOptionPane.showMessageDialog(this, "You have already been checked in!", "Fail", JOptionPane.WARNING_MESSAGE); 
               return;
           }
           
           hms = new HotelManagement();
           if(hms.checkIn(customer.getBookingInfo(), cal)){
               customer.setIsCheckedIn(true);
               JOptionPane.showMessageDialog(this, "Checking In is successfull!");
           }
                
           else{
             JOptionPane.showMessageDialog(this, "You have not checked in on time!", "Fail", JOptionPane.WARNING_MESSAGE);
             customer.setBookingInfo(null);
             customer.setIsBooked(false);
           }
       }
    }//GEN-LAST:event_checkInButtonActionPerformed

    private void nextDayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextDayButtonActionPerformed
        nextDay(cal);
    }//GEN-LAST:event_nextDayButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        if(!customer.IsCheckedIn()){
          JOptionPane.showMessageDialog(this, "You have not checked in!", "Fail", JOptionPane.WARNING_MESSAGE);
          return;
        }
        else{
            hms= new HotelManagement();
            hms.checkOut(customer.getBookingInfo(), cal);
            JOptionPane.showMessageDialog(this, "You have checked out successfully!");
        }
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        setVisible(false);
        LogInScreen log= new LogInScreen(cal);
        log.setVisible(true);
        
    }//GEN-LAST:event_logOutButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(CustomerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billButton;
    private javax.swing.JTable billTable;
    private javax.swing.JButton bookButton;
    private javax.swing.JButton checkInButton;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton nextDayButton;
    private javax.swing.JButton payButton;
    private javax.swing.JButton restaurantbutton;
    // End of variables declaration//GEN-END:variables
}
