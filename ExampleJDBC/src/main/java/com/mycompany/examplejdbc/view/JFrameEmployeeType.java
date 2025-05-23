/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.examplejdbc.view;

import com.mycompany.examplejdbc.controllers.EmployeeTypeController;
import com.mycompany.examplejdbc.controllers.IEmployeeTypeController;
import com.mycompany.examplejdbc.model.EmployeeType;
import com.mycompany.examplejdbc.utils.MessageUtils;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Fecha: 03/04/2025
 * @author JuanJo
 */
public class JFrameEmployeeType extends javax.swing.JFrame {
    private IEmployeeTypeController employeeTypeController = new EmployeeTypeController();

    /**
     * Creates new form JFrameEmployeeType
     */
    public JFrameEmployeeType() {
        initComponents();
        fillTable();
    }
    
    public void fillTable(){
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTableEmployeeType.setModel(model);
            model.addColumn("Id");
            model.addColumn("Descripcion");
            
            String[] rows = new String[2];
            List <EmployeeType> types = employeeTypeController.findAll();
            for (EmployeeType type : types) {
                rows[0] = String.valueOf(type.getId());
                rows[1] = type.getDescript();
                model.addRow(rows);
            }
        } 
        catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
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

        jLabelTitle = new javax.swing.JLabel();
        jLabelDescript = new javax.swing.JLabel();
        jTextFieldDescript = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jButtonModify = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployeeType = new javax.swing.JTable();
        jLabelHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setText("Crear tipo de empleado");

        jLabelDescript.setText("Descripcion:");

        jButtonCreate.setBackground(new java.awt.Color(51, 255, 51));
        jButtonCreate.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCreate.setText("Crear");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jLabelId.setText("Id:");

        jButtonModify.setBackground(new java.awt.Color(51, 255, 255));
        jButtonModify.setForeground(new java.awt.Color(0, 0, 0));
        jButtonModify.setText("Modificar");
        jButtonModify.setEnabled(false);
        jButtonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(255, 51, 51));
        jButtonDelete.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDelete.setText("Eliminar");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClean.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClean.setForeground(new java.awt.Color(0, 0, 0));
        jButtonClean.setText("Limpiar");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jTableEmployeeType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableEmployeeType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeTypeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployeeType);

        jLabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/examplejdbc/view/home.png"))); // NOI18N
        jLabelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelHome)
                .addGap(168, 168, 168)
                .addComponent(jLabelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCreate)
                        .addGap(84, 84, 84)
                        .addComponent(jButtonModify)
                        .addGap(83, 83, 83)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jButtonClean))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelId)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDescript)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDescript, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabelHome)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescript)
                    .addComponent(jTextFieldDescript, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonModify)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClean))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        clear();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        try {
            EmployeeType employeeType = new EmployeeType();
            employeeType.setDescript(jTextFieldDescript.getText().toUpperCase());
            employeeTypeController.insert(employeeType);
            MessageUtils.showInfoMessage("Tipo de empleado creado exitosamente");
            fillTable();
            clear();
        } 
        catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jTableEmployeeTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeTypeMouseClicked
        int rowSelected = jTableEmployeeType.getSelectedRow();
        if(rowSelected != -1)
        {
            String idSelected = jTableEmployeeType.getValueAt(rowSelected, 0).toString();
            String descriptSelected = jTableEmployeeType.getValueAt(rowSelected, 1).toString();
            
            jTextFieldId.setText(idSelected);
            jTextFieldDescript.setText(descriptSelected);
            jButtonClean.setEnabled(false);
            jButtonDelete.setEnabled(true);
            jButtonModify.setEnabled(true);
        }
    }//GEN-LAST:event_jTableEmployeeTypeMouseClicked

    private void jButtonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyActionPerformed
        try {
            EmployeeType employeeType = new EmployeeType();
            employeeType.setId(Integer.parseInt(jTextFieldId.getText()));
            employeeType.setDescript(jTextFieldDescript.getText().toUpperCase());
            employeeTypeController.update(employeeType);
            MessageUtils.showInfoMessage("Tipo de empleado modificado exitosamente");
            fillTable();
            clear();
        } 
        catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonModifyActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int option = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de eliminar este empleado?",
                                                                    "Confirmacion", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION)
            {
                employeeTypeController.delete(Integer.parseInt(jTextFieldId.getText()));
                MessageUtils.showInfoMessage("Tipo de empleado eliminado exitosamente");
                fillTable();
                clear();
            }
            
        } 
        catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        JFrameHome view = new JFrameHome();
        view.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabelHomeMouseClicked

    public void clear(){
        jTextFieldId.setText("");
        jTextFieldDescript.setText("");
        jTableEmployeeType.clearSelection();
        jButtonCreate.setEnabled(true);
        jButtonModify.setEnabled(false);
        jButtonDelete.setEnabled(false);
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployeeType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEmployeeType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonModify;
    private javax.swing.JLabel jLabelDescript;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployeeType;
    private javax.swing.JTextField jTextFieldDescript;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables
}
