package Frames;

import Companies.Medicine;
import Companies.Technology;
import Companies.Vehicle;
import Companies.CompanySys;
import Person.Person;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class AddCompanyFrame extends javax.swing.JFrame {

    AddPersonFrame add_update = new AddPersonFrame();

    public AddCompanyFrame() {
        initComponents();
        tech_panel.setVisible(true);
        med_panel.setVisible(false);
        vehicle_panel.setVisible(false);
    }

    /* public void eventHandling() {
        
        name_vehicle_TF.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e) {
                if(name_vehicle_TF == KeyEvent.VK_ENTER)
            }
        });
    }
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        company_id_TF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        company_name_TF = new javax.swing.JTextField();
        number_of_employees_TF = new javax.swing.JTextField();
        foundation_type_TF = new javax.swing.JTextField();
        technology_RB = new javax.swing.JRadioButton();
        medicine_RB = new javax.swing.JRadioButton();
        vehicle_RB = new javax.swing.JRadioButton();
        add_company_button = new javax.swing.JButton();
        close_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        info_label = new javax.swing.JLabel();
        clear_button = new javax.swing.JButton();
        med_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tested = new javax.swing.JComboBox();
        numberOfProduct_TF = new javax.swing.JTextField();
        vehicle_panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vehicle_type_TF = new javax.swing.JTextField();
        name_vehicle_TF = new javax.swing.JTextField();
        tech_panel = new javax.swing.JPanel();
        market_share = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        market_share_TF = new javax.swing.JTextField();
        country_TF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Id : ");

        jLabel2.setText("Name :");

        jLabel3.setText("# of employees :");

        jLabel4.setText("Foundation Type :");

        buttonGroup1.add(technology_RB);
        technology_RB.setSelected(true);
        technology_RB.setText("Technology");
        technology_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technology_RBActionPerformed(evt);
            }
        });

        buttonGroup1.add(medicine_RB);
        medicine_RB.setText("Medicine");
        medicine_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicine_RBActionPerformed(evt);
            }
        });

        buttonGroup1.add(vehicle_RB);
        vehicle_RB.setText("Vehicle");
        vehicle_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_RBActionPerformed(evt);
            }
        });

        add_company_button.setText("Add");
        add_company_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_company_buttonActionPerformed(evt);
            }
        });

        close_button.setText("Close");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        clear_button.setText("Clear");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        med_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)), "Medicine"));

        jLabel5.setText("# of Products : ");

        jLabel6.setText("Tested on People: ");

        tested.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "True", "False" }));

        javax.swing.GroupLayout med_panelLayout = new javax.swing.GroupLayout(med_panel);
        med_panel.setLayout(med_panelLayout);
        med_panelLayout.setHorizontalGroup(
            med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(med_panelLayout.createSequentialGroup()
                .addGroup(med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tested, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numberOfProduct_TF))
                .addGap(0, 110, Short.MAX_VALUE))
        );
        med_panelLayout.setVerticalGroup(
            med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(med_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numberOfProduct_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(med_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tested, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        vehicle_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Vehicle")));

        jLabel7.setText("Type : ");

        jLabel8.setText("Name of Vehicle: ");

        name_vehicle_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name_vehicle_TFKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout vehicle_panelLayout = new javax.swing.GroupLayout(vehicle_panel);
        vehicle_panel.setLayout(vehicle_panelLayout);
        vehicle_panelLayout.setHorizontalGroup(
            vehicle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehicle_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(vehicle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(vehicle_panelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_vehicle_TF))
                    .addGroup(vehicle_panelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(52, 52, 52)
                        .addComponent(vehicle_type_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        vehicle_panelLayout.setVerticalGroup(
            vehicle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehicle_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vehicle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(vehicle_type_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vehicle_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(name_vehicle_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tech_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)), "Technology"));

        market_share.setText("Market Share :");

        country.setText("Country :");

        country_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                country_TFKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout tech_panelLayout = new javax.swing.GroupLayout(tech_panel);
        tech_panel.setLayout(tech_panelLayout);
        tech_panelLayout.setHorizontalGroup(
            tech_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tech_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tech_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(market_share)
                    .addComponent(country))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tech_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(market_share_TF)
                    .addComponent(country_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        tech_panelLayout.setVerticalGroup(
            tech_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tech_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tech_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(market_share)
                    .addComponent(market_share_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tech_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country)
                    .addComponent(country_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(info_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_company_button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tech_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(med_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vehicle_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(technology_RB)
                                    .addGap(18, 18, 18)
                                    .addComponent(medicine_RB)
                                    .addGap(18, 18, 18)
                                    .addComponent(vehicle_RB))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(number_of_employees_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foundation_type_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(company_id_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(company_name_TF))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(company_id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(company_name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_of_employees_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foundation_type_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(technology_RB)
                            .addComponent(medicine_RB)
                            .addComponent(vehicle_RB))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tech_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(med_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicle_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_company_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(info_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void technology_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technology_RBActionPerformed
        tech_panel.setVisible(true);
        med_panel.setVisible(false);
        vehicle_panel.setVisible(false);
    }//GEN-LAST:event_technology_RBActionPerformed

    private void medicine_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicine_RBActionPerformed
        tech_panel.setVisible(false);
        med_panel.setVisible(true);
        vehicle_panel.setVisible(false);    }//GEN-LAST:event_medicine_RBActionPerformed

    private void vehicle_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_RBActionPerformed
        tech_panel.setVisible(false);
        med_panel.setVisible(false);
        vehicle_panel.setVisible(true);
    }//GEN-LAST:event_vehicle_RBActionPerformed

    private void add_company_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_company_buttonActionPerformed

        try {
            String name, foundation_type;
            int id, numberOfEmployee;
            double market_share;
            String country;//technology
            int numberOfProducts;
            boolean testedOnPeople;//medicine
            String type, nameOfVehicle;//vehicle

            id = Integer.parseInt(company_id_TF.getText());
            name = company_name_TF.getText();
            numberOfEmployee = Integer.parseInt(number_of_employees_TF.getText());
            foundation_type = foundation_type_TF.getText();
            ArrayList<Person> employees = new ArrayList<Person>();

            if (technology_RB.isSelected()) {
                market_share = Double.parseDouble(market_share_TF.getText());
                country = country_TF.getText();

                Technology x = new Technology(id, name, numberOfEmployee, foundation_type, employees, market_share, country);
                if (CompanySys.addCompany(x)) {
                    info_label.setText("Company is added!!");
                } else {
                    info_label.setText("Company could not be added!!");
                }
            }

            if (medicine_RB.isSelected()) {
                numberOfProducts = Integer.parseInt(numberOfProduct_TF.getText());
                if (tested.getSelectedItem().toString().equalsIgnoreCase("True")) {
                    testedOnPeople = true;
                } else {
                    testedOnPeople = false;
                }

                Medicine x = new Medicine(id, name, numberOfEmployee, foundation_type, employees, numberOfProducts, testedOnPeople);
                if (CompanySys.addCompany(x)) {
                    info_label.setText("Company is added!!");
                } else {
                    info_label.setText("Company could not be added!!");
                }
            }

            if (vehicle_RB.isSelected()) {
                type = vehicle_type_TF.getText();
                nameOfVehicle = name_vehicle_TF.getText();

                Vehicle x = new Vehicle(id, name, numberOfEmployee, foundation_type, employees, type, nameOfVehicle);
                if (CompanySys.addCompany(x)) {
                    info_label.setText("Company is added!!");
                } else {
                    info_label.setText("Company could not be added!!");
                }
            }
        } catch (NumberFormatException ex) {
            info_label.setText("\nNumberFormatException!!");
        } catch (IllegalArgumentException ex) {
            info_label.setText("\nIllegalArgumentException!!");
        }
    }//GEN-LAST:event_add_company_buttonActionPerformed

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        company_id_TF.setText("");
        company_name_TF.setText("");
        number_of_employees_TF.setText("");
        foundation_type_TF.setText("");
        market_share_TF.setText("");
        country_TF.setText("");
        vehicle_type_TF.setText("");
        name_vehicle_TF.setText("");
        numberOfProduct_TF.setText("");
        info_label.setText("");
        dispose();
    }//GEN-LAST:event_close_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        company_id_TF.setText("");
        company_name_TF.setText("");
        number_of_employees_TF.setText("");
        foundation_type_TF.setText("");
        market_share_TF.setText("");
        country_TF.setText("");
        vehicle_type_TF.setText("");
        name_vehicle_TF.setText("");
        numberOfProduct_TF.setText("");
        info_label.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void name_vehicle_TFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_vehicle_TFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String name, foundation_type;
                int id, numberOfEmployee;
                double market_share;
                String country;//technology
                int numberOfProducts;
                boolean testedOnPeople;//medicine
                String type, nameOfVehicle;//vehicle

                id = Integer.parseInt(company_id_TF.getText());
                name = company_name_TF.getText();
                numberOfEmployee = Integer.parseInt(number_of_employees_TF.getText());
                foundation_type = foundation_type_TF.getText();
                ArrayList<Person> employees = new ArrayList<Person>();

                if (vehicle_RB.isSelected()) {
                    type = vehicle_type_TF.getText();
                    nameOfVehicle = name_vehicle_TF.getText();

                    Vehicle x = new Vehicle(id, name, numberOfEmployee, foundation_type, employees, type, nameOfVehicle);
                    if (CompanySys.addCompany(x)) {
                        info_label.setText("Company is added!!");
                    } else {
                        info_label.setText("Company could not be added!!");
                    }
                }
            } catch (NumberFormatException ex) {
                info_label.setText("\nNumberFormatException!!");
            } catch (IllegalArgumentException ex) {
                info_label.setText("\nIllegalArgumentException!!");
            }
        }
    }//GEN-LAST:event_name_vehicle_TFKeyPressed

    private void country_TFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_country_TFKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String name, foundation_type;
                int id, numberOfEmployee;
                double market_share;
                String country;//technology
                int numberOfProducts;
                boolean testedOnPeople;//medicine
                String type, nameOfVehicle;//vehicle

                id = Integer.parseInt(company_id_TF.getText());
                name = company_name_TF.getText();
                numberOfEmployee = Integer.parseInt(number_of_employees_TF.getText());
                foundation_type = foundation_type_TF.getText();
                ArrayList<Person> employees = new ArrayList<Person>();
                
                if (technology_RB.isSelected()) {
                market_share = Double.parseDouble(market_share_TF.getText());
                country = country_TF.getText();

                Technology x = new Technology(id, name, numberOfEmployee, foundation_type, employees, market_share, country);
                if (CompanySys.addCompany(x)) {
                    info_label.setText("Company is added!!");
                } else {
                    info_label.setText("Company could not be added!!");
                }
            }
                } catch (NumberFormatException ex) {
                info_label.setText("\nNumberFormatException!!");
            } catch (IllegalArgumentException ex) {
                info_label.setText("\nIllegalArgumentException!!");
            }
        }
        
    }//GEN-LAST:event_country_TFKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_company_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_button;
    private javax.swing.JButton close_button;
    private javax.swing.JTextField company_id_TF;
    private javax.swing.JTextField company_name_TF;
    private javax.swing.JLabel country;
    private javax.swing.JTextField country_TF;
    private javax.swing.JTextField foundation_type_TF;
    private javax.swing.JLabel info_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel market_share;
    private javax.swing.JTextField market_share_TF;
    private javax.swing.JPanel med_panel;
    private javax.swing.JRadioButton medicine_RB;
    private javax.swing.JTextField name_vehicle_TF;
    private javax.swing.JTextField numberOfProduct_TF;
    private javax.swing.JTextField number_of_employees_TF;
    private javax.swing.JPanel tech_panel;
    private javax.swing.JRadioButton technology_RB;
    private javax.swing.JComboBox tested;
    private javax.swing.JRadioButton vehicle_RB;
    private javax.swing.JPanel vehicle_panel;
    private javax.swing.JTextField vehicle_type_TF;
    // End of variables declaration//GEN-END:variables
}
