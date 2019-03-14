package Frames;

import Companies.Company;
import Companies.CompanySys;

public class DisplayCompaniesFrame extends javax.swing.JFrame {

    public DisplayCompaniesFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        company_type = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_TA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        display_all_button = new javax.swing.JButton();
        display_button = new javax.swing.JButton();
        id_TF = new javax.swing.JTextField();
        close_button = new javax.swing.JButton();
        technology_RB = new javax.swing.JRadioButton();
        medicine_RB = new javax.swing.JRadioButton();
        vehicle_RB = new javax.swing.JRadioButton();
        clear_button = new javax.swing.JButton();
        id_CB = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        display_TA.setColumns(20);
        display_TA.setRows(5);
        jScrollPane1.setViewportView(display_TA);

        jLabel1.setText("Id :");

        display_all_button.setText("Display All");
        display_all_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_all_buttonActionPerformed(evt);
            }
        });

        display_button.setText("Display");
        display_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_buttonActionPerformed(evt);
            }
        });

        id_TF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_TFMouseClicked(evt);
            }
        });

        close_button.setText("Close");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });

        company_type.add(technology_RB);
        technology_RB.setSelected(true);
        technology_RB.setText("Technology");

        company_type.add(medicine_RB);
        medicine_RB.setText("Medicine");

        company_type.add(vehicle_RB);
        vehicle_RB.setText("Vehicle");

        clear_button.setText("Clear");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(display_all_button)
                                .addGap(65, 65, 65)
                                .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(id_CB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(display_button))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(technology_RB)
                        .addGap(18, 18, 18)
                        .addComponent(medicine_RB)
                        .addGap(18, 18, 18)
                        .addComponent(vehicle_RB)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(technology_RB)
                    .addComponent(medicine_RB)
                    .addComponent(vehicle_RB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_CB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(display_button)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display_all_button)
                    .addComponent(clear_button)
                    .addComponent(close_button))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void display_all_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_all_buttonActionPerformed
        display_TA.setText("All Companies in the System\n");
        display_TA.append("--------------------------------------------");
        display_TA.append(CompanySys.getAllCompanies());
    }//GEN-LAST:event_display_all_buttonActionPerformed

    private void display_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_buttonActionPerformed

        try {
            String techPeople = CompanySys.getSelectedCompanies("Technology");
            String medicinePeople = CompanySys.getSelectedCompanies("Medicine");
            String vehiclePeople = CompanySys.getSelectedCompanies("Vehicle");

            if (id_CB.isSelected()) {
                int comp_id = Integer.parseInt(id_TF.getText());
                Company temp = CompanySys.searchCompany(comp_id);
                if (temp != null) {
                    display_TA.setText("\nCompany Informations\n");
                    display_TA.append("**************************");
                    display_TA.append(temp.toString());
                } else {
                    display_TA.setText("\nThere is no company with this id!!!");
                }
            } else if (technology_RB.isSelected()) {
                if (techPeople.equals("")) {
                    display_TA.setText("\nThere are no people working it Technology area.");
                } else {
                    display_TA.setText(techPeople);
                }
            } else if (medicine_RB.isSelected()) {
                if (medicinePeople.equals("")) {
                    display_TA.setText("\nThere are no people working it Medicine area.");
                } else {
                    display_TA.setText(medicinePeople);
                }
            } else if (vehicle_RB.isSelected()) {
                if (vehiclePeople.equals("")) {
                    display_TA.setText("\nThere are no people working it Vehicle area.");
                } else {
                    display_TA.setText(vehiclePeople);
                }
            }

        } catch (NumberFormatException ex) {
            display_TA.setText("\nNumberFormatException!!");
        } catch (IllegalArgumentException ex) {
            display_TA.setText("\nIllegalArgumentException!!");
        }
    }//GEN-LAST:event_display_buttonActionPerformed

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        display_TA.setText("");
        id_TF.setText("");
        dispose();
    }//GEN-LAST:event_close_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        display_TA.setText("");
        id_TF.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void id_TFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_TFMouseClicked

        id_CB.setSelected(true);
    }//GEN-LAST:event_id_TFMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_button;
    private javax.swing.JButton close_button;
    private javax.swing.ButtonGroup company_type;
    private javax.swing.JTextArea display_TA;
    private javax.swing.JButton display_all_button;
    private javax.swing.JButton display_button;
    private javax.swing.JCheckBox id_CB;
    private javax.swing.JTextField id_TF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton medicine_RB;
    private javax.swing.JRadioButton technology_RB;
    private javax.swing.JRadioButton vehicle_RB;
    // End of variables declaration//GEN-END:variables
}
