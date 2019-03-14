package Frames;

import Companies.Company;
import Companies.CompanySys;

public class DisplayPeopleFrame extends javax.swing.JFrame {

    public DisplayPeopleFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        display_TA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        person_id_TF = new javax.swing.JTextField();
        display_button = new javax.swing.JButton();
        display_company_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        company_name_TF = new javax.swing.JTextField();
        clear_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        remove_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        display_TA.setColumns(20);
        display_TA.setRows(5);
        jScrollPane1.setViewportView(display_TA);

        jLabel1.setText("Person Id: ");

        display_button.setText("Display a Person");
        display_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_buttonActionPerformed(evt);
            }
        });

        display_company_button.setText("Display in Specified Company");
        display_company_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_company_buttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Company Name:");

        clear_button.setText("Clear");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        remove_button.setText("Remove Person");
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(person_id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(company_name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(remove_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(display_company_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(display_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(person_id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(company_name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(display_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(display_company_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(remove_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_button)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void display_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_buttonActionPerformed

        try {
            String company_name, id;
            company_name = company_name_TF.getText();
            id = person_id_TF.getText();
            if (company_name == null) {
                display_TA.setText("\nPlease enter the company name!!!");
            } else if (id == null) {
                display_TA.setText("\nPlease enter the person id!!!");
            } else {
                Company temp = CompanySys.searchCompanyWithName(company_name);
                if (temp != null) {
                    if (temp.searchPerson(Integer.parseInt(id)) != null) {
                        display_TA.setText(temp.searchPerson(Integer.parseInt(id)).toString());
                    } else {
                        display_TA.setText("\nThere is no employee with id in this company!!!");
                    }
                } else {
                    display_TA.setText("\nEmployee could not found!!");
                }
            }
        } catch (NumberFormatException ex) {
            display_TA.setText("\nNumberFormatException!!");
        } catch (IllegalArgumentException ex) {
            display_TA.setText("\nIllegalArgumentException!!");
        }
    }//GEN-LAST:event_display_buttonActionPerformed

    private void display_company_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_company_buttonActionPerformed

        try {
            String company_name;
            company_name = company_name_TF.getText();
            if (company_name == null) {
                display_TA.setText("\nPlease Enter the Company Name!!");
            } else {
                Company temp = CompanySys.searchCompanyWithName(company_name);
                if (temp != null) {
                    display_TA.setText(temp.getEmployees().toString());
                } else {
                    display_TA.setText("\nCompany could not found!!!");
                }
            }
        } catch (NumberFormatException ex) {
            display_TA.setText("\nNumberFormatException!!");
        } catch (IllegalArgumentException ex) {
            display_TA.setText("\nIllegalArgumentException!!");
        }
    }//GEN-LAST:event_display_company_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        person_id_TF.setText("");
        display_TA.setText("");
        company_name_TF.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        person_id_TF.setText("");
        display_TA.setText("");
        company_name_TF.setText("");
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_buttonActionPerformed

        try {
            String company_name, id;
            company_name = company_name_TF.getText();
            boolean val;
            id = person_id_TF.getText();
            if (company_name == null) {
                display_TA.setText("\nPlease enter the company name!!!");
            } else if (id == null) {
                display_TA.setText("\nPlease enter the person id!!!");
            } else {
                Company temp = CompanySys.searchCompanyWithName(company_name);
                val = temp.removePerson(Integer.parseInt(id));
                if (val) {
                    display_TA.setText("\nPerson with id " + id + " is removed!!");
                } else {
                    display_TA.setText("\nPerson with id " + id + " could not be removed!!!");
                }
            }
        } catch (NumberFormatException ex) {
            display_TA.setText("\nNumberFormatException!!");
        } catch (IllegalArgumentException ex) {
            display_TA.setText("\nIllegalArgumentException!!");
        } catch (NullPointerException ex) {
            display_TA.setText("\nNullPointerException!!");
        }
    }//GEN-LAST:event_remove_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_button;
    private javax.swing.JTextField company_name_TF;
    private javax.swing.JTextArea display_TA;
    private javax.swing.JButton display_button;
    private javax.swing.JButton display_company_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField person_id_TF;
    private javax.swing.JButton remove_button;
    // End of variables declaration//GEN-END:variables
}
