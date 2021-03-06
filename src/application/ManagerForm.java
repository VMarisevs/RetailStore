/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ManagerForm.java
 *
 * Created on 27-Jan-2013, 13:50:27
 */

package application;

import validation.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.io.PrintWriter;
import java.text.DecimalFormat;
/**
 *
 * @author Evilguy
 */
public class ManagerForm extends javax.swing.JFrame {

    //creating a list of manager objects
    ArrayList<Manager> managerList = new ArrayList<Manager>();
    //creating a variable manager
    Manager varManager = new Manager();
    //managers identificator
    int managerID = 0;
    //swing list
    DefaultListModel managerListInfo = new DefaultListModel();

    DecimalFormat df = new DecimalFormat("0.00");
    /** Creates new form ManagerForm */
    public ManagerForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstManagerList = new javax.swing.JList(managerListInfo);
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlManagerInformation = new javax.swing.JPanel();
        txtPPSNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        lblPPSNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        cboxCity = new javax.swing.JComboBox();
        cboxGender = new javax.swing.JComboBox();
        btnSaveAs = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlPayrollCalculation = new javax.swing.JPanel();
        txtDateOfHire = new javax.swing.JTextField();
        txtStandardSalary = new javax.swing.JTextField();
        txtExtraPayPerYear = new javax.swing.JTextField();
        lblDateOfHire = new javax.swing.JLabel();
        lblStandardSalary = new javax.swing.JLabel();
        lblExtraPayPerYear = new javax.swing.JLabel();
        txtSalaryPerYear = new javax.swing.JTextField();
        txtSalaryPerWeek = new javax.swing.JTextField();
        lblSalaryPerYear = new javax.swing.JLabel();
        lblSalaryPerWeek = new javax.swing.JLabel();
        btnCalculatePayroll = new javax.swing.JButton();
        btnSaveInformationToFile = new javax.swing.JButton();
        btnSavePayroll = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tAreaInfo = new javax.swing.JTextArea();

        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        lstManagerList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstManagerList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstManagerListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstManagerList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 50, 160, 310);

        pnlManagerInformation.setLayout(null);

        txtPPSNumber.setText("1234567H");
        txtPPSNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPPSNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPPSNumberKeyTyped(evt);
            }
        });
        pnlManagerInformation.add(txtPPSNumber);
        txtPPSNumber.setBounds(120, 30, 130, 20);

        txtName.setText("Vladislavs");
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        pnlManagerInformation.add(txtName);
        txtName.setBounds(120, 60, 130, 20);

        txtSurname.setText("Manager");
        txtSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSurnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurnameKeyTyped(evt);
            }
        });
        pnlManagerInformation.add(txtSurname);
        txtSurname.setBounds(120, 90, 130, 20);

        txtAddress.setText("127 new castle");
        pnlManagerInformation.add(txtAddress);
        txtAddress.setBounds(120, 150, 130, 20);

        txtDateOfBirth.setText("07/12/1989");
        txtDateOfBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateOfBirthKeyTyped(evt);
            }
        });
        pnlManagerInformation.add(txtDateOfBirth);
        txtDateOfBirth.setBounds(120, 210, 130, 20);

        lblPPSNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPPSNumber.setText("PPS Number:");
        pnlManagerInformation.add(lblPPSNumber);
        lblPPSNumber.setBounds(10, 30, 100, 20);

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");
        pnlManagerInformation.add(lblName);
        lblName.setBounds(10, 60, 100, 20);

        lblSurname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSurname.setText("Surname:");
        pnlManagerInformation.add(lblSurname);
        lblSurname.setBounds(10, 90, 100, 20);

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");
        pnlManagerInformation.add(lblGender);
        lblGender.setBounds(10, 120, 100, 20);

        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress.setText("Address:");
        pnlManagerInformation.add(lblAddress);
        lblAddress.setBounds(10, 150, 100, 20);

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City:");
        pnlManagerInformation.add(lblCity);
        lblCity.setBounds(10, 180, 100, 20);

        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateOfBirth.setText("Date of birth:");
        pnlManagerInformation.add(lblDateOfBirth);
        lblDateOfBirth.setBounds(10, 210, 100, 20);

        cboxCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dublin", "Cork", "Limerick", "Galway", "Waterford", "Drogheda", "Kilkenny", "Wexford", "Sligo", "Clonmel", "Co.Dublin", "Co.Cork", "Co.Limerick", "Co.Galway", "Co.Waterford", "Co.Drogheda", "Co.Kilkenny", "Co.Wexford", "Co.Sligo", "Co.Clonmel" }));
        pnlManagerInformation.add(cboxCity);
        cboxCity.setBounds(120, 180, 130, 20);

        cboxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        pnlManagerInformation.add(cboxGender);
        cboxGender.setBounds(120, 120, 130, 20);

        btnSaveAs.setText("Save As");
        btnSaveAs.setMaximumSize(new java.awt.Dimension(80, 30));
        btnSaveAs.setMinimumSize(new java.awt.Dimension(80, 30));
        btnSaveAs.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAsActionPerformed(evt);
            }
        });
        pnlManagerInformation.add(btnSaveAs);
        btnSaveAs.setBounds(50, 250, 80, 30);

        btnSave.setText("Save");
        btnSave.setMaximumSize(new java.awt.Dimension(80, 30));
        btnSave.setMinimumSize(new java.awt.Dimension(80, 30));
        btnSave.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlManagerInformation.add(btnSave);
        btnSave.setBounds(130, 250, 80, 30);

        btnCancel.setText("Cancel");
        btnCancel.setMaximumSize(new java.awt.Dimension(80, 30));
        btnCancel.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCancel.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlManagerInformation.add(btnCancel);
        btnCancel.setBounds(210, 250, 80, 30);
        pnlManagerInformation.add(jPanel2);
        jPanel2.setBounds(0, -20, 10, 10);

        jTabbedPane1.addTab("Manager Information", pnlManagerInformation);

        pnlPayrollCalculation.setLayout(null);

        txtDateOfHire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateOfHireKeyTyped(evt);
            }
        });
        pnlPayrollCalculation.add(txtDateOfHire);
        txtDateOfHire.setBounds(240, 90, 100, 20);

        txtStandardSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStandardSalaryKeyTyped(evt);
            }
        });
        pnlPayrollCalculation.add(txtStandardSalary);
        txtStandardSalary.setBounds(240, 120, 100, 20);

        txtExtraPayPerYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExtraPayPerYearKeyTyped(evt);
            }
        });
        pnlPayrollCalculation.add(txtExtraPayPerYear);
        txtExtraPayPerYear.setBounds(240, 150, 100, 20);

        lblDateOfHire.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateOfHire.setText("Date of hire:");
        pnlPayrollCalculation.add(lblDateOfHire);
        lblDateOfHire.setBounds(90, 90, 130, 20);

        lblStandardSalary.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStandardSalary.setText("Standard salary:");
        pnlPayrollCalculation.add(lblStandardSalary);
        lblStandardSalary.setBounds(90, 120, 130, 20);

        lblExtraPayPerYear.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblExtraPayPerYear.setText("Extra pay per year:");
        pnlPayrollCalculation.add(lblExtraPayPerYear);
        lblExtraPayPerYear.setBounds(90, 150, 130, 20);

        txtSalaryPerYear.setEditable(false);
        pnlPayrollCalculation.add(txtSalaryPerYear);
        txtSalaryPerYear.setBounds(240, 180, 100, 20);

        txtSalaryPerWeek.setEditable(false);
        pnlPayrollCalculation.add(txtSalaryPerWeek);
        txtSalaryPerWeek.setBounds(240, 210, 100, 20);

        lblSalaryPerYear.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryPerYear.setText("Salary per year:");
        pnlPayrollCalculation.add(lblSalaryPerYear);
        lblSalaryPerYear.setBounds(120, 180, 100, 20);

        lblSalaryPerWeek.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalaryPerWeek.setText("Salary per week:");
        pnlPayrollCalculation.add(lblSalaryPerWeek);
        lblSalaryPerWeek.setBounds(120, 210, 100, 20);

        btnCalculatePayroll.setText("Calculate");
        btnCalculatePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculatePayrollActionPerformed(evt);
            }
        });
        pnlPayrollCalculation.add(btnCalculatePayroll);
        btnCalculatePayroll.setBounds(130, 250, 110, 40);

        btnSaveInformationToFile.setText("Save to file");
        btnSaveInformationToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveInformationToFileActionPerformed(evt);
            }
        });
        pnlPayrollCalculation.add(btnSaveInformationToFile);
        btnSaveInformationToFile.setBounds(240, 250, 110, 40);

        btnSavePayroll.setText("Save");
        btnSavePayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePayrollActionPerformed(evt);
            }
        });
        pnlPayrollCalculation.add(btnSavePayroll);
        btnSavePayroll.setBounds(20, 250, 110, 40);

        jTabbedPane1.addTab("Payroll Calculation", pnlPayrollCalculation);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 30, 370, 330);

        tAreaInfo.setBackground(new java.awt.Color(0, 0, 0));
        tAreaInfo.setColumns(20);
        tAreaInfo.setEditable(false);
        tAreaInfo.setFont(new java.awt.Font("Courier New", 0, 12));
        tAreaInfo.setForeground(new java.awt.Color(204, 204, 204));
        tAreaInfo.setRows(5);
        jScrollPane2.setViewportView(tAreaInfo);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 370, 560, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPPSNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPPSNumberKeyTyped
        // TODO add your handling code here:
        datavalidation.ppsValidation(evt);
    }//GEN-LAST:event_txtPPSNumberKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        datavalidation.nameValidation(evt);
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyTyped
        // TODO add your handling code here:
        datavalidation.nameValidation(evt);
    }//GEN-LAST:event_txtSurnameKeyTyped

    private void txtDateOfBirthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateOfBirthKeyTyped
        // TODO add your handling code here:
        datavalidation.dateValidation(evt);
    }//GEN-LAST:event_txtDateOfBirthKeyTyped

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        autocorrection.nameCorrection(txtName);
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtSurnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyReleased
        // TODO add your handling code here:
        autocorrection.nameCorrection(txtSurname);
    }//GEN-LAST:event_txtSurnameKeyReleased

    private void txtPPSNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPPSNumberKeyReleased
        // TODO add your handling code here:
        autocorrection.ppsCorrection(txtPPSNumber);
    }//GEN-LAST:event_txtPPSNumberKeyReleased

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // erase all fields
        txtPPSNumber.setText("");
        txtName.setText("");
        txtSurname.setText("");
        txtAddress.setText("");
        txtDateOfBirth.setText("");
        cboxGender.setSelectedIndex(0);
        cboxCity.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        /*
        txtPPSNumber
        txtName
        txtSurname
        cboxGender
        txtAddress
        cboxCity
        txtDateOfBirth
        */

        varManager.setPPSNumbers(txtPPSNumber.getText());
        varManager.setName(txtName.getText());
        varManager.setSurname(txtSurname.getText());
        varManager.setGender(cboxGender.getSelectedIndex());
        varManager.setAddress(txtAddress.getText());
        varManager.setCity(cboxCity.getSelectedIndex());
        varManager.setDoB(txtDateOfBirth.getText());

        if (!(txtPPSNumber.getText().isEmpty())
                && !(txtName.getText().isEmpty())
                && !(txtSurname.getText().isEmpty())
                && !(txtAddress.getText().isEmpty())
                && (varManager.checkDob(txtDateOfBirth.getText()))){

            //trying to update the object in array list
            //if cause an error it creates a new object
            try{
                managerList.set(managerID, varManager);
            }catch (Exception e){
                managerList.add(varManager);
            }

            //trying to update the element in swing jList
            //if caused an error it creates new element
            try{
            managerListInfo.setElementAt(varManager.getName() + " " + varManager.getSurname(), managerID);
            }catch (Exception e){
            managerListInfo.addElement(varManager.getName() + " " + varManager.getSurname());
            }

            //writing some information to log area
            tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"Manager with name: "+ varManager.getName()
                + " " + varManager.getSurname() + ", has been saved to array. With ID " + managerID);
        } else {
            tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"Can not save the information, please fill all information");
        }
        varManager = new Manager();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAsActionPerformed
        // TODO add your handling code here:
        varManager.setPPSNumbers(txtPPSNumber.getText());
        varManager.setName(txtName.getText());
        varManager.setSurname(txtSurname.getText());
        varManager.setGender(cboxGender.getSelectedIndex());
        varManager.setAddress(txtAddress.getText());
        varManager.setCity(cboxCity.getSelectedIndex());
        varManager.setDoB(txtDateOfBirth.getText());

        managerID = managerList.size();
        if (!(txtPPSNumber.getText().isEmpty())
                && !(txtName.getText().isEmpty())
                && !(txtSurname.getText().isEmpty())
                && !(txtAddress.getText().isEmpty())
                && (varManager.checkDob(txtDateOfBirth.getText()))){

            //trying to update the object in array list
            //if cause an error it creates a new object
            
                managerList.add(managerID, varManager);
            

            //trying to update the element in swing jList
            //if caused an error it creates new element
           // lstManagerList.clearSelection();
           
            
            managerListInfo.addElement(varManager.getName() + " " + varManager.getSurname());
            

            //writing some information to log area
            tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"Manager with name: "+ varManager.getName()
                + " " + varManager.getSurname() + ", has been saved to array. With ID " + managerID);
                
        } else {
            tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"Can not save the information, please fill all information");
            
        }
        varManager = new Manager();
    }//GEN-LAST:event_btnSaveAsActionPerformed

    private void lstManagerListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstManagerListValueChanged
        // TODO add your handling code here:
        varManager = new Manager();
        managerID = lstManagerList.getSelectedIndex();
        varManager = managerList.get(managerID);
        //print out the information about manager
        txtPPSNumber.setText(varManager.getPPSNumber());
        txtName.setText(varManager.getName());
        txtSurname.setText(varManager.getSurname());
        cboxGender.setSelectedIndex(varManager.getGender());
        txtAddress.setText(varManager.getAddress());
        cboxCity.setSelectedIndex(varManager.getCity());
        txtDateOfBirth.setText(varManager.getDoB());
        //print out the information about manager's payroll
        txtDateOfHire.setText(varManager.getDateOfHire());
        txtStandardSalary.setText(df.format(varManager.getStandardSalary()));
        txtExtraPayPerYear.setText(df.format(varManager.getExtraPerYear()));
        //clear the information about salary
        txtSalaryPerYear.setText("");
        txtSalaryPerWeek.setText("");
       

    }//GEN-LAST:event_lstManagerListValueChanged

    private void btnSavePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePayrollActionPerformed
        // TODO add your handling code here:


        try{
        varManager = managerList.get(managerID);
        varManager.setDateOfHire(txtDateOfHire.getText());
        varManager.setStandardSalary(txtStandardSalary.getText());
        varManager.setExtraPerYear(txtExtraPayPerYear.getText());

        if (!(txtDateOfHire.getText().isEmpty())
                && !(txtStandardSalary.getText().isEmpty())
                && !(txtExtraPayPerYear.getText().isEmpty())){
        managerList.set(managerID, varManager);
        tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"payroll information has been updated. To manager with this " + managerID + " ID.");
        } else {
            tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"Can not save the information, please fill all information about payroll");

        }
        varManager = new Manager();
        } catch (Exception e){
        tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"Can not save the information, please please select a person from list");
        }
    }//GEN-LAST:event_btnSavePayrollActionPerformed


    private void btnCalculatePayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculatePayrollActionPerformed
        // TODO add your handling code here:
        try {
        btnSavePayroll.doClick();
        varManager = managerList.get(managerID);

        txtSalaryPerYear.setText(df.format(varManager.getSalaryPerYear()));
        txtSalaryPerWeek.setText(df.format(varManager.getSalaryPerWeek()));

        tAreaInfo.setText(tAreaInfo.getText() +"\n" +
                "" + varManager.getYearsOfExperience()+" * "
                + df.format(varManager.getExtraPerYear()) + " + " + df.format(varManager.getStandardSalary())
                + " = " + df.format(varManager.getSalaryPerYear()));
        varManager = new Manager();
        }catch (Exception e){
        tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"cannot calculate the payroll...");
        }

    }//GEN-LAST:event_btnCalculatePayrollActionPerformed

    private void txtDateOfHireKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateOfHireKeyTyped
        // TODO add your handling code here:
        datavalidation.dateValidation(evt);
    }//GEN-LAST:event_txtDateOfHireKeyTyped

    private void txtStandardSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStandardSalaryKeyTyped
        // TODO add your handling code here:
        datavalidation.currencyValidation(evt);
    }//GEN-LAST:event_txtStandardSalaryKeyTyped

    private void txtExtraPayPerYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExtraPayPerYearKeyTyped
        // TODO add your handling code here:
        datavalidation.currencyValidation(evt);
    }//GEN-LAST:event_txtExtraPayPerYearKeyTyped

    private void btnSaveInformationToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveInformationToFileActionPerformed
        // TODO add your handling code here:
        
            try{
            varManager = managerList.get(managerID);
            PrintWriter writer =new PrintWriter("TXTFILES/"+varManager.getName()+varManager.getSurname()+".txt");
            writer.println("\t\tManager's salary calculation");
            writer.println("\tName\t\t\t\t "+varManager.getName());
            writer.println("\tSurname\t\t\t\t "+varManager.getSurname());
            writer.println("\tYears employed\t\t\t "+varManager.getYearsOfExperience());
            writer.println("\tStandard Salary\t\t\t "+df.format(varManager.getStandardSalary()));
            writer.println("\tSalary per Year\t\t\t "+df.format(varManager.getSalaryPerYear()));
            writer.print("\tSalary per Week\t\t "+df.format(varManager.getSalaryPerWeek()));

            writer.flush();
            writer.close();
            tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"Information was saved sucessfully. in TXTFILES/"+varManager.getName()+varManager.getSurname()+".txt");
            } catch (Exception e){
            tAreaInfo.setText(tAreaInfo.getText() +"\n"
                +"cannot save the file...");
            }
    }//GEN-LAST:event_btnSaveInformationToFileActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculatePayroll;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveAs;
    private javax.swing.JButton btnSaveInformationToFile;
    private javax.swing.JButton btnSavePayroll;
    private javax.swing.JComboBox cboxCity;
    private javax.swing.JComboBox cboxGender;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDateOfHire;
    private javax.swing.JLabel lblExtraPayPerYear;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPPSNumber;
    private javax.swing.JLabel lblSalaryPerWeek;
    private javax.swing.JLabel lblSalaryPerYear;
    private javax.swing.JLabel lblStandardSalary;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JList lstManagerList;
    private javax.swing.JPanel pnlManagerInformation;
    private javax.swing.JPanel pnlPayrollCalculation;
    private javax.swing.JTextArea tAreaInfo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtDateOfHire;
    private javax.swing.JTextField txtExtraPayPerYear;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPPSNumber;
    private javax.swing.JTextField txtSalaryPerWeek;
    private javax.swing.JTextField txtSalaryPerYear;
    private javax.swing.JTextField txtStandardSalary;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

}
