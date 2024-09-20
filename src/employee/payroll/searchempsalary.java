
package employee.payroll;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class searchempsalary extends javax.swing.JFrame {

Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;


    public searchempsalary() {
        initComponents();
       conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2); 
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_firstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_lastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_department = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_designation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_doj = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_job = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Employee ID :");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel2.setText("Employee ID :");

        jLabel3.setText("First Name :");

        jLabel4.setText("Surname :");

        jLabel5.setText("Date of Birth :");

        jLabel6.setText("Department :");

        jLabel7.setText("Designation :");

        jLabel8.setText("Status :");

        jLabel9.setText("date Hired :");

        jLabel10.setText("Job Title :");

        jLabel11.setText("Basic salary :");

        jButton1.setText("Generate slip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_doj, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_department, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_doj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
       try{

            String sql ="select * from Staff_information where id=? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs=pst.executeQuery();

            String add1 =rs.getString("id");
            txt_id.setText(add1);

            String add2 =rs.getString("first_name");
            txt_firstName.setText(add2);

            String add3 =rs.getString("surname");
            txt_lastName.setText(add3);

            String add4 =rs.getString("Dob");
            txt_dob.setText(add4);

            String add5 =rs.getString("Department");
            txt_department.setText(add5);

            String add7 =rs.getString("Salary");
            txt_salary.setText(add7);

            String add8 =rs.getString("Status");
            txt_status.setText(add8);

            String add9 =rs.getString("Date_hired");
            txt_doj.setText(add9);

            String add10 =rs.getString("job_title");
            txt_job.setText(add10);

            String add17 =rs.getString("Designation");
            txt_designation.setText(add17);


        }catch(Exception e){
          JOptionPane.showMessageDialog(null, "No Data");
        }
        finally {

            try{

                rs.close();
                pst.close();

            }
            catch(Exception e){

            }
        } 


        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String value1 = txt_firstName.getText();
        String value2 = txt_lastName.getText();
        String value3 = txt_id.getText();
        String value4 = txt_department.getText();
        String value5 = txt_designation.getText();
        String filePath = "";
        String val = "0";
        String reason = "";
        String overtime = "";
        String medical = "";
        String bonus = "";
        String other = "";
        
        
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(value1 + " " + value2+ "-Salary Slip.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if(dialogResult == JFileChooser.APPROVE_OPTION){
            filePath = dialog.getSelectedFile().getPath();
        }
try{
            
            String sql = "Select * from Deduction where emp_id = '" +value3 +"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //pull from Deductions table if data is there
            while(rs.next()){
                val = rs.getString(4);
                reason = rs.getString(5);
            }
            String sq = "select * from Allowance where emp_id = '"+value3+"'";
            pst=conn.prepareStatement(sq);
            rs=pst.executeQuery();
            int calcTotal = Integer.parseInt((txt_salary.getText()));
            float x = 0;
            
            //pull from Allowance table if data is there
            while(rs.next()){
                x = Float.valueOf(rs.getString("total_allowance"));
                
                overtime = rs.getString("overtime");
                medical = rs.getString("medical");
                bonus = rs.getString("bonus");
                other = rs.getString("other");
            }
            
            int v = Integer.parseInt(val);
            float total = calcTotal + x - v;
            //------
            
            
            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
            myDocument.open();
            
            myDocument.add(new Paragraph("PAY SLIP",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph("-----------------------------------------------------------------------------------------"));
            myDocument.add((new Paragraph("EMPLOYEE DETAILS",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD))));
            myDocument.add((new Paragraph("Name of Employee: " +value1 + " "+value2,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            myDocument.add((new Paragraph("Designation: "+value5,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            myDocument.add((new Paragraph("Department: "+value4,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            myDocument.add(new Paragraph("-----------------------------------------------------------------------------------------"));
            myDocument.add(new Paragraph("SALARY",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
            myDocument.add(new Paragraph("Basic Salary: $"+calcTotal,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("Allowance: $"+x,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("Overtime: "+overtime+" Hours",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("Medical: $" +medical,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("Bonus: $"+bonus,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("Other: $"+other,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("-----------------------------------------------------------------------------------------"));
            myDocument.add(new Paragraph("DEDUCTION",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
            myDocument.add(new Paragraph("Deduction Details: "+reason,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("Total Deductions : $"+val ,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("-----------------------------------------------------------------------------------------"));
            myDocument.add(new Paragraph("TOTAL PAYMENT",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.BOLD)));
            myDocument.add(new Paragraph("Total Earnings: $"+total,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("-----------------------------------------------------------------------------------------"));
            
            
            
            myDocument.newPage();
            myDocument.close();
            JOptionPane.showMessageDialog(null,"Report was successfully generated");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(searchempsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchempsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchempsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchempsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchempsalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_designation;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_firstName;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_lastName;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    // End of variables declaration//GEN-END:variables
}
