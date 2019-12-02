/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltnc.nhom3.view.employee;

import com.ltnc.nhom3.entity.Employee;
import com.ltnc.nhom3.service.EmployeeService;
import com.ltnc.nhom3.utility.ConstantHelper;
import com.ltnc.nhom3.utility.IOHandler;
import com.ltnc.nhom3.view.template.SectionTemplate;
import com.ltnc.nhom3.view.frmMainWindow;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class pnlForm extends javax.swing.JPanel {
    
    private EmployeeService employeeService;
    private Employee edittingEmployee;
    
    /**
     * Creates new form pnlDetail
     */
    public pnlForm(EmployeeService employeeService) {
        initComponents();
        this.employeeService = employeeService;
        frmMainWindow.rootFrame.getRootPane().setDefaultButton(btnSubmit);
        lblHeading.setText(ConstantHelper.EMPLOYEE_ADD_HEADING);
        txtUsername.setEditable(true);
    }
    
    public pnlForm(EmployeeService employeeService, int edittingId) {
        this(employeeService);
        txtUsername.setEditable(false);
        lblHeading.setText(ConstantHelper.EMPLOYEE_EDIT_HEADING);
        try {
            edittingEmployee = employeeService.findById(edittingId);
            displayInfoToForm();
        } catch (SQLException ex) {
            Logger.getLogger(pnlForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRoleRadioBtn = new javax.swing.ButtonGroup();
        groupGenderRadioBtn = new javax.swing.ButtonGroup();
        jPanel1 = SectionTemplate.getStyledPanel();
        lblHeading = new javax.swing.JLabel();
        btnGoBack = SectionTemplate.getStyledButton();
        jSeparator2 = SectionTemplate.getStyledSeparator();
        pnlForm = SectionTemplate.getStyledPanel();
        pnlLeft = SectionTemplate.getStyledPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pnlRight = SectionTemplate.getStyledPanel();
        txtFullname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtIdentityCard = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        rdoRole = new javax.swing.JRadioButton();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        jSeparator1 = SectionTemplate.getStyledSeparator();
        jPanel2 = SectionTemplate.getStyledPanel();
        btnReset = SectionTemplate.getStyledButton();
        btnSubmit = SectionTemplate.getStyledButton();

        setBackground(ConstantHelper.SECTION_PANEL_BG);
        setPreferredSize(new java.awt.Dimension(654, 596));

        lblHeading.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblHeading.setText("Thêm sản phẩm");

        btnGoBack.setText("Quay lại");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Họ tên:");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Địa chỉ:");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel23.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Số điện thoại:");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel24.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Vai trò:");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel26.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Số CMND:");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel27.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Tên tài khoản:");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel28.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Giới tính:");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel25.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel22)
                .addGap(26, 26, 26)
                .addComponent(jLabel23)
                .addGap(26, 26, 26)
                .addComponent(jLabel24)
                .addGap(26, 26, 26)
                .addComponent(jLabel25)
                .addGap(26, 26, 26)
                .addComponent(jLabel27)
                .addGap(26, 26, 26)
                .addComponent(jLabel28)
                .addGap(26, 26, 26)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFullname.setName(""); // NOI18N
        txtFullname.setPreferredSize(new java.awt.Dimension(6, 25));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setName(""); // NOI18N
        txtAddress.setPreferredSize(new java.awt.Dimension(6, 25));

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhone.setName(""); // NOI18N
        txtPhone.setPreferredSize(new java.awt.Dimension(6, 25));

        txtIdentityCard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdentityCard.setName(""); // NOI18N
        txtIdentityCard.setPreferredSize(new java.awt.Dimension(6, 25));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setName(""); // NOI18N
        txtUsername.setPreferredSize(new java.awt.Dimension(6, 25));

        rdoRole.setBackground(ConstantHelper.SECTION_PANEL_BG);
        groupRoleRadioBtn.add(rdoRole);
        rdoRole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoRole.setSelected(true);
        rdoRole.setText("Nhân viên");

        rdoMale.setBackground(ConstantHelper.SECTION_PANEL_BG);
        groupGenderRadioBtn.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoMale.setSelected(true);
        rdoMale.setText(ConstantHelper.EMPLOYEE_GENDER_MALE);
        rdoMale.setName(""); // NOI18N

        rdoFemale.setBackground(ConstantHelper.SECTION_PANEL_BG);
        groupGenderRadioBtn.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoFemale.setText(ConstantHelper.EMPLOYEE_GENDER_FEMALE);

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addComponent(rdoMale)
                        .addGap(10, 10, 10)
                        .addComponent(rdoFemale))
                    .addComponent(rdoRole)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentityCard, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoMale)
                    .addComponent(rdoFemale))
                .addGap(18, 18, 18)
                .addComponent(txtIdentityCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(rdoRole)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnGoBack))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGoBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHeading))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnGoBack, lblHeading});

        btnReset.setText("Đặt lại");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSubmit.setText("Gửi");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnReset))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        frmMainWindow.rootFrame.loadInSection(new pnlList(employeeService));
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        if (isEditMode()) displayInfoToForm();
        else {
            txtAddress.setText("");
            txtFullname.setText("");
            txtPhone.setText("");
            txtUsername.setText("");
            txtIdentityCard.setText("");
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String fullname = txtFullname.getText(), username = txtUsername.getText(),
                identityCard = txtIdentityCard.getText(), phone = txtPhone.getText();
        if (fullname.length() == 0 || username.length() == 0) {
            JOptionPane.showMessageDialog(frmMainWindow.rootFrame, ConstantHelper.EMPLOYEE_FILED_REQUIRED_MESSAGE);
            return;
        }
        if (IOHandler.isContainsNonNumberCharacter(phone) || IOHandler.isContainsNonNumberCharacter(identityCard)) {
            JOptionPane.showMessageDialog(frmMainWindow.rootFrame, ConstantHelper.EMPLOYEE_IDENTITY_CARD_PHONE_NUMBER_ONLY_MESSAGE);
            return;
        }
        try {
            if ((!isEditMode() && employeeService.findByUsername(username) == null)  || isEditMode() ) {
                boolean isMale = rdoMale.isSelected();
                Employee employee = new Employee();
                employee.setFullname(fullname);
                employee.setIndentityCard(identityCard);
                employee.setAddress(txtAddress.getText());
                employee.setPhone(phone);
                employee.setMale(isMale);
                employee.setAdmin(false);
                employee.setActive(true);
                if (isEditMode()) {
                    //edit
                    employee.setId(edittingEmployee.getId());
                    if (employeeService.updateInfo(employee)) {
                        JOptionPane.showMessageDialog(frmMainWindow.rootFrame, ConstantHelper.UPDATE_INFO_DONE_DIALOG_MESSAGE);
                        btnGoBackActionPerformed(evt);
                    }
                } else {
                    //add
                    String password = IOHandler.generatePassword(username);
                    employee.setUsername(username);
                    employee.setPassword(password);
                    if (employeeService.create(employee)) {
                        JOptionPane.showMessageDialog(frmMainWindow.rootFrame, String.format(ConstantHelper.EMPLOYEE_ADD_DONE_MESSAGE, username, password));
                        btnGoBackActionPerformed(evt);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(frmMainWindow.rootFrame, ConstantHelper.EMPLOYEE_USERNAME_HAS_EXISTED_MESSAGE);
                txtUsername.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(pnlForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup groupGenderRadioBtn;
    private javax.swing.ButtonGroup groupRoleRadioBtn;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JRadioButton rdoRole;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtIdentityCard;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private boolean isEditMode() {
        return edittingEmployee != null;
    }
    
    private void displayInfoToForm() {
        txtFullname.setText(edittingEmployee.getFullname());
        txtAddress.setText(edittingEmployee.getAddress());
        txtPhone.setText(edittingEmployee.getPhone());
        txtIdentityCard.setText(edittingEmployee.getIndentityCard());
        txtUsername.setText(edittingEmployee.getUsername());
        if (edittingEmployee.isMale()) 
            rdoMale.setSelected(true);
        else rdoFemale.setSelected(true);
    }
}
