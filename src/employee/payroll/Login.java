
package employee.payroll;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Login extends javax.swing.JFrame {
    Connection conn =null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    
    public Login() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
       
        conn=db.java_db(); 
        currentDate();

    }
    
        public void currentDate(){
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        
        lbl_date.setText((month+1)+"/"+day+"/"+year);
        int second=cal.get(Calendar.SECOND);
        int minute=cal.get(Calendar.MINUTE);
        int hour=cal.get(Calendar.HOUR);
        lbl_time.setText(hour+":"+minute+":"+second);
        
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_combo = new javax.swing.JComboBox<>();
        txt_username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        lbl_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("DIVISION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 90, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("USERNAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 309, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("        PLEASE ENTER USERNAME AND PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 840, -1));

        txt_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Sales" }));
        getContentPane().add(txt_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 179, -1));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 179, -1));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 490, -1, -1));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 180, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/bk2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        lbl_date.setText("Date");
        jMenuBar1.add(lbl_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         String sq1="select id,username,password,division from Users where(username=? and password=? and division=?)";
        try{
            int count=0;
            pst =conn.prepareStatement(sq1);
            
            pst.setString(1,txt_username.getText());
            pst.setString(2,txt_password.getText());
            pst.setString(3,txt_combo.getSelectedItem().toString());
            
            rs=pst.executeQuery();
            while(rs.next()){
                int id=rs.getInt(1);
                Emp.empId=id;
                String username=rs.getString("username");
                Emp.empname=username;
                count=count+1;            
            }
            
            String access=(txt_combo.getSelectedItem().toString());
            if("Admin".equals(access)){
                if(count==1){
                    JOptionPane.showMessageDialog(null,"Success");
                    MainMenu j=new MainMenu();
                    j.setVisible(true);
                    j.setLocation(300, 200);

                    this.dispose();
       
                }else{
                    JOptionPane.showMessageDialog(null,"Username and Password you enter are wrong");
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        finally{
            try{
                rs.close();
                pst.close();
                
                
            }catch(Exception e){
                
            }
        }
        
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JComboBox<String> txt_combo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
