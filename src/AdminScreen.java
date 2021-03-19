

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminScreen extends javax.swing.JFrame {

    Hotel hotel;
    Employee employee;
    public AdminScreen(Hotel hotel,Employee employee) {
        initComponents();
        this.hotel = hotel;
        this.employee=employee;
        idText.setEditable(false);
        // if the employee has admin priority then admin radio button will be shown 
        if(employee.isAdmin())
            isAdmin_radio.setVisible(true);
        else           
            isAdmin_radio.setVisible(false);
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        deleteEmp1 = new javax.swing.JButton();
        empSurnameText1 = new javax.swing.JTextField();
        empCityText1 = new javax.swing.JTextField();
        empName1 = new javax.swing.JLabel();
        empTownText1 = new javax.swing.JTextField();
        empSurname1 = new javax.swing.JLabel();
        empStreetText1 = new javax.swing.JTextField();
        empCity1 = new javax.swing.JLabel();
        empPhoneText1 = new javax.swing.JTextField();
        empTown1 = new javax.swing.JLabel();
        empMailText1 = new javax.swing.JTextField();
        empStreet1 = new javax.swing.JLabel();
        empPhone1 = new javax.swing.JLabel();
        netIncomeText = new javax.swing.JLabel();
        empEmail1 = new javax.swing.JLabel();
        empPassword1 = new javax.swing.JLabel();
        addEmp1 = new javax.swing.JButton();
        empNameText1 = new javax.swing.JTextField();
        income = new javax.swing.JLabel();
        searchEmpButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        idText = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        updateButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        isAdmin_radio = new javax.swing.JRadioButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        deleteEmp1.setText("Delete Employee");
        deleteEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmp1ActionPerformed(evt);
            }
        });

        empName1.setText("Name");
        empName1.setToolTipText("");

        empSurname1.setText("Surname");

        empCity1.setText("City");

        empTown1.setText("Town");

        empStreet1.setText("Street");

        empPhone1.setText("Phone");

        netIncomeText.setForeground(new java.awt.Color(255, 0, 0));
        netIncomeText.setText("Income will be here");

        empEmail1.setText("E-Mail");

        empPassword1.setText("Password");

        addEmp1.setText("Add Employee");
        addEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmp1ActionPerformed(evt);
            }
        });

        income.setText("Income:");

        searchEmpButton.setText("List Employees");
        searchEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmpButtonActionPerformed(evt);
            }
        });

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "City", "Town", "Street", "Phone", "Email"
            }
        ));
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchTable);

        idLabel.setText("Id");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        isAdmin_radio.setText("Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(income)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(netIncomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(empSurname1)
                                .addComponent(empName1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(idLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(empSurnameText1)
                                .addComponent(empNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idText, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(isAdmin_radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empTown1)
                            .addComponent(empCity1)
                            .addComponent(empStreet1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empCityText1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empTownText1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(empStreetText1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empPassword1)
                            .addComponent(empEmail1)
                            .addComponent(empPhone1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empMailText1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empPhoneText1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(addEmp1)
                .addGap(18, 18, 18)
                .addComponent(deleteEmp1)
                .addGap(16, 16, 16)
                .addComponent(searchEmpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empName1)
                    .addComponent(empNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empCity1)
                    .addComponent(empCityText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empPhone1)
                    .addComponent(empPhoneText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empSurname1)
                    .addComponent(empSurnameText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empTown1)
                    .addComponent(empTownText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empEmail1)
                    .addComponent(empMailText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empPassword1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idLabel)
                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empStreet1)
                        .addComponent(empStreetText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(isAdmin_radio)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEmp1)
                    .addComponent(searchEmpButton)
                    .addComponent(updateButton)
                    .addComponent(addEmp1))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOutButton)
                    .addComponent(income)
                    .addComponent(netIncomeText))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // hotel's income
        netIncomeText.setText(String.valueOf(Hotel.getIncome()));
    }//GEN-LAST:event_formWindowOpened
    
    // adding an employee
    private void addEmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmp1ActionPerformed
        String password =  new String(passwordText.getPassword());
        boolean isAdmin=false;
        if(isAdmin_radio.isSelected())
            isAdmin=true;
        if (!empNameText1.getText().equals("") && !empSurnameText1.getText().equals("") && !empPhoneText1.getText().equals("")
                && !empMailText1.getText().equals("") && !empCityText1.getText().equals("") && !empTownText1.getText().equals("")
                && !empStreetText1.getText().equals("")
                &&!password.equals("")) {
            Employee e= new Employee(empNameText1.getText(), empSurnameText1.getText(),
                    new Address(empCityText1.getText(), empTownText1.getText(), empStreetText1.getText()), empPhoneText1.getText(), empMailText1.getText(),
                    new User(empMailText1.getText(), new String(passwordText.getPassword())), isAdmin);
            hotel.addPerson(e,hotel.getEmployeeList());
            JOptionPane.showMessageDialog(this, "Insertion is successfull!");
        } else {
            JOptionPane.showMessageDialog(this, "Please fill in the blanks!", "Fail", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_addEmp1ActionPerformed
    // deleting an employee
    private void deleteEmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmp1ActionPerformed
       
        if(!employee.isAdmin()){
            JOptionPane.showMessageDialog(this, "You have no permission to do this action!", "Fail", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int selected_row = searchTable.getSelectedRow();
        
        if(selected_row == -1){
            if(searchTable.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "List is empty!", "Fail", JOptionPane.WARNING_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select an employee", "Fail", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            
           for(int i = 0; i < hotel.getEmployeeList().size(); i++){
             if (hotel.getEmployeeList().get(i).getId()==Integer.valueOf(idText.getText())){
                hotel.deletePerson(i, hotel.getEmployeeList());
                JOptionPane.showMessageDialog(this, "Deletion is successfull!Refresh the table by clicking \"List button\"");
                break;
             }         
           } 
           
        }
    }//GEN-LAST:event_deleteEmp1ActionPerformed
    // listing all employees
    private void searchEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmpButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
        model.getDataVector().removeAllElements();
        
        for(int i=0 ; i<hotel.getEmployeeList().size();i++){
            Object[] attributes = {hotel.getEmployeeList().get(i).getId(),hotel.getEmployeeList().get(i).getFirstName(),
                hotel.getEmployeeList().get(i).getLastName(),hotel.getEmployeeList().get(i).getAddress().getCity(),
                hotel.getEmployeeList().get(i).getAddress().getTown(),hotel.getEmployeeList().get(i).getAddress().getStreet(),
                hotel.getEmployeeList().get(i).getPhone(),hotel.getEmployeeList().get(i).getEmail()};
            model.addRow(attributes);
            
        }
    }//GEN-LAST:event_searchEmpButtonActionPerformed

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
        
        int selected_row = searchTable.getSelectedRow();
        idText.setText(model.getValueAt(selected_row, 0).toString());
        empNameText1.setText(model.getValueAt(selected_row, 1).toString());
        empSurnameText1.setText(model.getValueAt(selected_row, 2).toString());
        empCityText1.setText(model.getValueAt(selected_row, 3).toString());
        empTownText1.setText(model.getValueAt(selected_row, 4).toString());
        empStreetText1.setText(model.getValueAt(selected_row, 5).toString());
        empPhoneText1.setText(model.getValueAt(selected_row, 6).toString());
        empMailText1.setText(model.getValueAt(selected_row, 7).toString());
        
        
        
    }//GEN-LAST:event_searchTableMouseClicked
    // updating an employee
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       
        if(!employee.isAdmin()){
            JOptionPane.showMessageDialog(this, "You have no permission to do this action!", "Fail", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int selected_row = searchTable.getSelectedRow();
        
        if(selected_row == -1){
            if(searchTable.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "List is empty!", "Fail", JOptionPane.WARNING_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select an employee", "Fail", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
           for(int i = 0; i < hotel.getEmployeeList().size(); i++){
             if (hotel.getEmployeeList().get(i).getId()==Integer.valueOf(idText.getText())){
                if(!empNameText1.getText().equals("")){
                    hotel.getEmployeeList().get(i).setFirstName(empNameText1.getText());
                }  
                if(!empSurnameText1.getText().equals("")){
                    hotel.getEmployeeList().get(i).setLastName(empSurnameText1.getText());
                }  
                if(!empCityText1.getText().equals("")){
                    hotel.getEmployeeList().get(i).getAddress().setCity(empCityText1.getText());
                } 
                if(!empTownText1.getText().equals("")){
                    hotel.getEmployeeList().get(i).getAddress().setTown(empTownText1.getText());
                }  
                if(!empStreetText1.getText().equals("")){
                    hotel.getEmployeeList().get(i).getAddress().setStreet(empStreetText1.getText());
                }  
                if(!empPhoneText1.getText().equals("")){
                    hotel.getEmployeeList().get(i).setPhone(empPhoneText1.getText());
                }   
                if(!empMailText1.getText().equals("")){
                    hotel.getEmployeeList().get(i).setEmail(empMailText1.getText());
                }   
                if(!empMailText1.getText().equals("")){
                    hotel.getEmployeeList().get(i).getUserInfo().setUserName(empMailText1.getText());
                }    
                String password = new String(passwordText.getPassword());
                if(!password.equals("")){
                    hotel.getEmployeeList().get(i).getUserInfo().setPassword(new String(passwordText.getPassword()));
                }
                if(isAdmin_radio.isSelected())
                    hotel.getEmployeeList().get(i).setAdmin(true);
                else
                    hotel.getEmployeeList().get(i).setAdmin(false); 
                    
                
                JOptionPane.showMessageDialog(this, "Update is successfull!Refresh the table by clicking \"List button\"");
                
                break;
             }         
           } 
           
        }
    }//GEN-LAST:event_updateButtonActionPerformed
    // log out 
    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        LogInScreen log = new LogInScreen(hotel);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmp1;
    private javax.swing.JButton deleteEmp1;
    private javax.swing.JLabel empCity1;
    private javax.swing.JTextField empCityText1;
    private javax.swing.JLabel empEmail1;
    private javax.swing.JTextField empMailText1;
    private javax.swing.JLabel empName1;
    private javax.swing.JTextField empNameText1;
    private javax.swing.JLabel empPassword1;
    private javax.swing.JLabel empPhone1;
    private javax.swing.JTextField empPhoneText1;
    private javax.swing.JLabel empStreet1;
    private javax.swing.JTextField empStreetText1;
    private javax.swing.JLabel empSurname1;
    private javax.swing.JTextField empSurnameText1;
    private javax.swing.JLabel empTown1;
    private javax.swing.JTextField empTownText1;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel income;
    private javax.swing.JRadioButton isAdmin_radio;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel netIncomeText;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton searchEmpButton;
    private javax.swing.JTable searchTable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
