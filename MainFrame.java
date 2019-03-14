package Frames;

public class MainFrame extends javax.swing.JFrame {

    AddCompanyFrame addCompany = new AddCompanyFrame();
    DisplayCompaniesFrame displayComps = new DisplayCompaniesFrame();
    AddPersonFrame add_update = new AddPersonFrame();
    DisplayPeopleFrame dis_empls = new DisplayPeopleFrame();

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        company_button = new javax.swing.JButton();
        info_label = new javax.swing.JLabel();
        display_company = new javax.swing.JButton();
        update_person = new javax.swing.JButton();
        displayAll_emp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        company_button.setText("Add Company");
        company_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company_buttonActionPerformed(evt);
            }
        });

        display_company.setText("Display All Companies or A Company");
        display_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_companyActionPerformed(evt);
            }
        });

        update_person.setText("Add Person Information");
        update_person.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_personActionPerformed(evt);
            }
        });

        displayAll_emp.setText("Display All People or A Person");
        displayAll_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAll_empActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(company_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(display_company, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_person, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayAll_emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(info_label, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(company_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(display_company, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update_person, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayAll_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(info_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void company_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company_buttonActionPerformed
        addCompany.setVisible(true);
        info_label.setText("");
    }//GEN-LAST:event_company_buttonActionPerformed

    private void display_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_companyActionPerformed
        if (Companies.CompanySys.companyList.isEmpty()) {
            info_label.setText("First, enter company to display!!!");
        } else {
            displayComps.setVisible(true);
        }
    }//GEN-LAST:event_display_companyActionPerformed

    private void update_personActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_personActionPerformed
        if (Companies.CompanySys.companyList.isEmpty()) {
            info_label.setText("First, add company to enter a person!!!");
        } else {
            add_update.setVisible(true);
        }
    }//GEN-LAST:event_update_personActionPerformed

    private void displayAll_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAll_empActionPerformed
        if (Companies.CompanySys.companyList.isEmpty()) {
            info_label.setText("First, enter company info, then add person to display them!!!");
        } else {
            dis_empls.setVisible(true);
        }
    }//GEN-LAST:event_displayAll_empActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton company_button;
    private javax.swing.JButton displayAll_emp;
    private javax.swing.JButton display_company;
    private javax.swing.JLabel info_label;
    private javax.swing.JButton update_person;
    // End of variables declaration//GEN-END:variables
}
