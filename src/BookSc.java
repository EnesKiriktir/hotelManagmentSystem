
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class BookSc extends javax.swing.JFrame {

    Hotel hotel;
    Customer customer;
    Calendar date;
    public BookSc(Hotel hotel, Customer customer,Calendar date) {
        initComponents();
        this.hotel = hotel;
        this.customer = customer;
        this.date = date;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        startDateLabel = new javax.swing.JLabel();
        endDateLabel = new javax.swing.JLabel();
        roomTypeLabel = new javax.swing.JLabel();
        roomViewLabel = new javax.swing.JLabel();
        single_radio = new javax.swing.JRadioButton();
        double_radio = new javax.swing.JRadioButton();
        view_radio = new javax.swing.JRadioButton();
        noview_radio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        startDay = new javax.swing.JTextField();
        startMonth = new javax.swing.JTextField();
        startYear = new javax.swing.JTextField();
        endDay = new javax.swing.JTextField();
        endMonth = new javax.swing.JTextField();
        endYear = new javax.swing.JTextField();
        findRoomButton = new javax.swing.JButton();
        check = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTextArea = new javax.swing.JTextArea();
        showBookButton = new javax.swing.JButton();
        image_icon = new javax.swing.JLabel();

        setTitle("Booking");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        startDateLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        startDateLabel.setText("Start Date");

        endDateLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        endDateLabel.setText("End Date");

        roomTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        roomTypeLabel.setText("Room Type");

        roomViewLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        roomViewLabel.setText("Sea View");

        buttonGroup1.add(single_radio);
        single_radio.setText("Single Room");

        buttonGroup1.add(double_radio);
        double_radio.setText("Double Room");

        buttonGroup2.add(view_radio);
        view_radio.setText("Yes");

        buttonGroup2.add(noview_radio);
        noview_radio.setText("No");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Day");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Month");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Year");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Day");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Month");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Year");

        findRoomButton.setText("Find Room");
        findRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findRoomButtonActionPerformed(evt);
            }
        });

        bookTextArea.setColumns(20);
        bookTextArea.setRows(5);
        jScrollPane1.setViewportView(bookTextArea);

        showBookButton.setText("Show My Booking Info");
        showBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(startDateLabel)
                .addGap(291, 291, 291)
                .addComponent(endDateLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(150, 150, 150)
                .addComponent(jLabel4)
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addComponent(jLabel6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(startDay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(startMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(startYear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(endDay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(endMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(endYear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomTypeLabel)
                    .addComponent(roomViewLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(single_radio)
                    .addComponent(view_radio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(double_radio)
                    .addComponent(noview_radio))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(check))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(findRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(showBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDateLabel)
                    .addComponent(endDateLabel))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(roomTypeLabel)
                        .addGap(27, 27, 27)
                        .addComponent(roomViewLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(single_radio)
                        .addGap(18, 18, 18)
                        .addComponent(view_radio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(double_radio)
                        .addGap(18, 18, 18)
                        .addComponent(noview_radio))
                    .addComponent(image_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(check)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(findRoomButton)
                    .addComponent(showBookButton))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void findRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findRoomButtonActionPerformed
        if (customer.IsBooked()) {
            JOptionPane.showMessageDialog(this, "You have already been booked!", "Fail", JOptionPane.WARNING_MESSAGE);
        } else {
            // if there is an empty text box to fill
            if (startDay.getText().trim().equals("") || startMonth.getText().trim().equals("") || startYear.getText().trim().equals("")
                    || endDay.getText().trim().equals("") || endMonth.getText().trim().equals("") || endYear.getText().trim().equals("")
                    || (!view_radio.isSelected() && !noview_radio.isSelected()) || (!single_radio.isSelected() && !double_radio.isSelected())) {
                JOptionPane.showMessageDialog(this, "Please fill in the blanks!", "Fail", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // formatting calendar to desired form
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            Calendar cal = Calendar.getInstance();
            String startDate = startDay.getText() + "." + startMonth.getText() + "." + startYear.getText();
            try {
                cal.setTime(df.parse(startDate));
            } catch (ParseException ex) {
                Logger.getLogger(BookSc.class.getName()).log(Level.SEVERE, null, ex);
            }
            Calendar cal2 = Calendar.getInstance();
            String endDate = endDay.getText() + "." + endMonth.getText() + "." + endYear.getText();
            try {
                cal2.setTime(df.parse(endDate));
            } catch (ParseException ex) {
                Logger.getLogger(BookSc.class.getName()).log(Level.SEVERE, null, ex);
            }
            // if the reservation's starting date has passed the current date
            if(!date.before(cal)){
                JOptionPane.showMessageDialog(this, "Start date has passed!", "Fail", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if (cal.after(cal2)) { //start date must come before end date
                JOptionPane.showMessageDialog(this, "Start Date cannot be earlier than end Date!", "Fail", JOptionPane.WARNING_MESSAGE);
                return;
            }
            HotelManagement hms = new HotelManagement();
            boolean isSeaView = false;
            if (view_radio.isSelected()) {
                isSeaView = true;
            } else if (noview_radio.isSelected()) {
                isSeaView = false;
            }
            if (single_radio.isSelected()) {
                if (hms.booking(customer, cal, cal2, "Single", isSeaView)) {
                    JOptionPane.showMessageDialog(this, "Booking is successfull");
                } else {
                    JOptionPane.showMessageDialog(this, "Booking is not successfull");
                }
            } else if (double_radio.isSelected()) {
                if (hms.booking(customer, cal, cal2, "Double", isSeaView)) {
                    JOptionPane.showMessageDialog(this, "Booking is successfull");
                } else {
                    JOptionPane.showMessageDialog(this, "Booking is not successfull");
                }
            }
        }
    }//GEN-LAST:event_findRoomButtonActionPerformed

    private void showBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBookButtonActionPerformed
        if(customer.getBookingInfo()!=null){
            String bookInfo = customer.getBookingInfo().toString();
            bookTextArea.setText(bookInfo);
        }
        else
          JOptionPane.showMessageDialog(this, "You have not booked yet!", "Fail", JOptionPane.WARNING_MESSAGE);  
        
    }//GEN-LAST:event_showBookButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       image_icon.setIcon(new ImageIcon(getClass().getResource("icons\\booking3.png"))); 
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
            java.util.logging.Logger.getLogger(BookSc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookSc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookSc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookSc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bookTextArea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel check;
    private javax.swing.JRadioButton double_radio;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField endDay;
    private javax.swing.JTextField endMonth;
    private javax.swing.JTextField endYear;
    private javax.swing.JButton findRoomButton;
    private javax.swing.JLabel image_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton noview_radio;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JLabel roomViewLabel;
    private javax.swing.JButton showBookButton;
    private javax.swing.JRadioButton single_radio;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JTextField startDay;
    private javax.swing.JTextField startMonth;
    private javax.swing.JTextField startYear;
    private javax.swing.JRadioButton view_radio;
    // End of variables declaration//GEN-END:variables
}
