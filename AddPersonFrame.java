package Frames;

import Companies.CompanySys;
import Companies.Company;
import Person.Worker;
import Person.Manager;

public class AddPersonFrame extends javax.swing.JFrame {

    AddCompanyFrame comp_frame = null;

    public AddPersonFrame() {
        initComponents();
        emp_panel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name_TF = new javax.swing.JTextField();
        surname_TF = new javax.swing.JTextField();
        age_TF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id_TF = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        employee_RB = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        man_panel = new javax.swing.JPanel();
        id_dep = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        manager_id_TF = new javax.swing.JTextField();
        manager_dept_TF = new javax.swing.JTextField();
        emp_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        job_TF = new javax.swing.JTextField();
        manager_Name_TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        company_name_TF = new javax.swing.JTextField();
        info_label = new javax.swing.JLabel();
        clear_button = new javax.swing.JButton();
        manager_RB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Name :");

        jLabel3.setText("Surname: ");

        jLabel4.setText("Age: ");

        surname_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surname_TFActionPerformed(evt);
            }
        });

        jLabel1.setText("Id :");

        id_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_TFActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        buttonGroup1.add(employee_RB);
        employee_RB.setText("Employee");
        employee_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_RBActionPerformed(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        man_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)), "Manager"));

        id_dep.setText("Department Id: ");

        jLabel8.setText("Department Name: ");

        manager_dept_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_dept_TFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout man_panelLayout = new javax.swing.GroupLayout(man_panel);
        man_panel.setLayout(man_panelLayout);
        man_panelLayout.setHorizontalGroup(
            man_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(man_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(man_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, man_panelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(man_panelLayout.createSequentialGroup()
                        .addComponent(id_dep)
                        .addGap(21, 21, 21)))
                .addGroup(man_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manager_id_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(manager_dept_TF))
                .addGap(35, 35, 35))
        );
        man_panelLayout.setVerticalGroup(
            man_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(man_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(man_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_dep)
                    .addComponent(manager_id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(man_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(manager_dept_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(man_panel);

        emp_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Employee"));

        jLabel6.setText("Manager Name: ");

        jLabel7.setText("Job: ");

        manager_Name_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_Name_TFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emp_panelLayout = new javax.swing.GroupLayout(emp_panel);
        emp_panel.setLayout(emp_panelLayout);
        emp_panelLayout.setHorizontalGroup(
            emp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emp_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(emp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(job_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manager_Name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        emp_panelLayout.setVerticalGroup(
            emp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emp_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emp_panelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emp_panelLayout.createSequentialGroup()
                        .addComponent(manager_Name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(emp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(job_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.add(emp_panel);

        jLabel5.setText("Company Name: ");

        clear_button.setText("Clear");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(manager_RB);
        manager_RB.setSelected(true);
        manager_RB.setText("Manager");
        manager_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_RBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(age_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(surname_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_TF))
                                .addGap(39, 39, 39)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(company_name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(manager_RB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(employee_RB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(info_label, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surname_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(company_name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manager_RB)
                    .addComponent(employee_RB))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(info_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void surname_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surname_TFActionPerformed
    }//GEN-LAST:event_surname_TFActionPerformed

    private void manager_Name_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_Name_TFActionPerformed
    }//GEN-LAST:event_manager_Name_TFActionPerformed

    private void id_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_TFActionPerformed
    }//GEN-LAST:event_id_TFActionPerformed

    private void employee_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_RBActionPerformed
        emp_panel.setVisible(true);
        man_panel.setVisible(false);
    }//GEN-LAST:event_employee_RBActionPerformed

    private void manager_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_RBActionPerformed
        emp_panel.setVisible(false);
        man_panel.setVisible(true);
    }//GEN-LAST:event_manager_RBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        id_TF.setText("");
        name_TF.setText("");
        surname_TF.setText("");
        age_TF.setText("");
        manager_Name_TF.setText("");
        job_TF.setText("");
        manager_dept_TF.setText("");
        manager_id_TF.setText("");
        company_name_TF.setText("");
        info_label.setText("");
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        try {
            String name, surname;
            int age, id;
            String company_name;

            String manager_dept;
            int manager_id;
            String manager_name, job;

            company_name = company_name_TF.getText();
            Company temp;
            temp = CompanySys.searchCompanyWithName(company_name);
            if (temp != null) {

                name = name_TF.getText();
                surname = surname_TF.getText();
                age = Integer.parseInt(age_TF.getText());
                id = Integer.parseInt(id_TF.getText());

                if (manager_RB.isSelected()) {
                    manager_id = Integer.parseInt(manager_id_TF.getText());
                    manager_dept = manager_dept_TF.getText();

                    Manager x = new Manager(id, name, surname, age, manager_id, manager_dept);
                    temp.addPerson(x);
                    temp.setNumberOfEmployee(temp.getNumberofEmployee()+1);
                    info_label.setText("Manager is added!");
                }
                if (employee_RB.isSelected()) {
                    manager_name = manager_Name_TF.getText();
                    job = job_TF.getText();

                    Worker x = new Worker(id, name, surname, age, manager_name, job);
                    temp.addPerson(x);
                    temp.setNumberOfEmployee(temp.getNumberofEmployee()+1);
                    info_label.setText("Employee is added!");
                }

            } else {
                info_label.setText("Company is not found!!");
            }
        } catch (NumberFormatException ex) {
            info_label.setText("\nNumberFormatException!!");
        } catch (IllegalArgumentException ex) {
            info_label.setText("\nIllegalArgumentException!!");
        }

    }//GEN-LAST:event_addActionPerformed

    private void manager_dept_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_dept_TFActionPerformed
    }//GEN-LAST:event_manager_dept_TFActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        id_TF.setText("");
        name_TF.setText("");
        surname_TF.setText("");
        age_TF.setText("");
        manager_Name_TF.setText("");
        job_TF.setText("");
        manager_dept_TF.setText("");
        manager_id_TF.setText("");
        company_name_TF.setText("");
        info_label.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField age_TF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_button;
    private javax.swing.JTextField company_name_TF;
    private javax.swing.JPanel emp_panel;
    private javax.swing.JRadioButton employee_RB;
    private javax.swing.JTextField id_TF;
    private javax.swing.JLabel id_dep;
    private javax.swing.JLabel info_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField job_TF;
    private javax.swing.JPanel man_panel;
    private javax.swing.JTextField manager_Name_TF;
    private javax.swing.JRadioButton manager_RB;
    private javax.swing.JTextField manager_dept_TF;
    private javax.swing.JTextField manager_id_TF;
    private javax.swing.JTextField name_TF;
    private javax.swing.JTextField surname_TF;
    // End of variables declaration//GEN-END:variables
}
