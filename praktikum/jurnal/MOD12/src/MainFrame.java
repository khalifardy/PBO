
import Employee.Employee;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author khalifardy
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    ArrayList<Employee> listEmployee = new ArrayList<>();
    DefaultListModel listnamaemployee = new DefaultListModel();
    public MainFrame() {
        initComponents();
        listemployee.setModel(listnamaemployee);
        
        listemployee.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Check if the selection is adjusting (to avoid firing the event twice)
                if (!e.getValueIsAdjusting()) {
                    int index = listemployee.getSelectedIndex();

                    if (index != -1) {
                        // Update JLabels based on the selected Employee
                        jLabel4.setText(listEmployee.get(index).getName());
                        //jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
                        jLabel5.setText(listEmployee.get(index).getPosition());
                        jLabel6.setText(listEmployee.get(index).getStatus());
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tabpanelui = new javax.swing.JTabbedPane();
        inputui = new javax.swing.JPanel();
        positionlabel = new javax.swing.JLabel();
        textname = new javax.swing.JTextField();
        namelabel = new javax.swing.JLabel();
        staffbuttonradio = new javax.swing.JRadioButton();
        ManagerRadioButton = new javax.swing.JRadioButton();
        statuslabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        savebutton = new javax.swing.JButton();
        listemployeeui = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listemployee = new javax.swing.JList<>();
        detailemployeelabel = new javax.swing.JLabel();
        namelabellist = new javax.swing.JLabel();
        positionlabellist = new javax.swing.JLabel();
        statuslabellist = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        positionlabel.setText("Position         :");

        namelabel.setText("Name             :");

        staffbuttonradio.setText("Staff");
        staffbuttonradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffbuttonradioActionPerformed(evt);
            }
        });

        ManagerRadioButton.setText("Manager");
        ManagerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerRadioButtonActionPerformed(evt);
            }
        });

        statuslabel.setText("Status             :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full TIme", "Part Time", "Intern", " " }));

        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputuiLayout = new javax.swing.GroupLayout(inputui);
        inputui.setLayout(inputuiLayout);
        inputuiLayout.setHorizontalGroup(
            inputuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputuiLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(inputuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputuiLayout.createSequentialGroup()
                        .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(textname, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputuiLayout.createSequentialGroup()
                        .addComponent(positionlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(inputuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManagerRadioButton)
                            .addComponent(staffbuttonradio)))
                    .addGroup(inputuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(savebutton)
                        .addGroup(inputuiLayout.createSequentialGroup()
                            .addComponent(statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        inputuiLayout.setVerticalGroup(
            inputuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputuiLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(inputuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffbuttonradio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManagerRadioButton)
                .addGroup(inputuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputuiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputuiLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(savebutton)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        tabpanelui.addTab("Input Employee", inputui);

        jScrollPane1.setViewportView(listemployee);

        detailemployeelabel.setText("Employee Detail");

        namelabellist.setText("Name             :");

        positionlabellist.setText("Position         :");

        statuslabellist.setText("Status             :");

        javax.swing.GroupLayout listemployeeuiLayout = new javax.swing.GroupLayout(listemployeeui);
        listemployeeui.setLayout(listemployeeuiLayout);
        listemployeeuiLayout.setHorizontalGroup(
            listemployeeuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listemployeeuiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(listemployeeuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listemployeeuiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(listemployeeuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listemployeeuiLayout.createSequentialGroup()
                                .addComponent(statuslabellist, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(listemployeeuiLayout.createSequentialGroup()
                                .addComponent(positionlabellist, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(listemployeeuiLayout.createSequentialGroup()
                                .addComponent(namelabellist, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))))
                    .addGroup(listemployeeuiLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(detailemployeelabel)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        listemployeeuiLayout.setVerticalGroup(
            listemployeeuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listemployeeuiLayout.createSequentialGroup()
                .addGroup(listemployeeuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listemployeeuiLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listemployeeuiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(detailemployeelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(listemployeeuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namelabellist, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listemployeeuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(positionlabellist, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listemployeeuiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statuslabellist, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tabpanelui.addTab("list employee", listemployeeui);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tabpanelui, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(tabpanelui, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
      
        var nama = textname.getText();
        var position = "";
        if(staffbuttonradio.isSelected()){
            position = staffbuttonradio.getText();
        }else if(ManagerRadioButton.isSelected()){
            position = ManagerRadioButton.getText();
        }
        
        var status = (String)jComboBox1.getSelectedItem();
        
        Employee emp = new Employee(nama,position,status);
        listEmployee.add(emp);
        listnamaemployee.addElement(emp.getName());
        staffbuttonradio.setSelected(false);
        ManagerRadioButton.setSelected(false);
        textname.setText("");
        jComboBox1.setSelectedIndex(0);
                
    }                                          

    private void staffbuttonradioActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        if (staffbuttonradio.isSelected()){
            ManagerRadioButton.setSelected(false);
        }
    }                                                

    private void ManagerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        if (ManagerRadioButton.isSelected()){
            staffbuttonradio.setSelected(false);
        }
        
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

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton ManagerRadioButton;
    private javax.swing.JLabel detailemployeelabel;
    private javax.swing.JPanel inputui;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listemployee;
    private javax.swing.JPanel listemployeeui;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel namelabellist;
    private javax.swing.JLabel positionlabel;
    private javax.swing.JLabel positionlabellist;
    private javax.swing.JButton savebutton;
    private javax.swing.JRadioButton staffbuttonradio;
    private javax.swing.JLabel statuslabel;
    private javax.swing.JLabel statuslabellist;
    private javax.swing.JTabbedPane tabpanelui;
    private javax.swing.JTextField textname;
    // End of variables declaration                   
}
