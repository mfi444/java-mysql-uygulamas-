/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlörnek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MFİ
 */
public class recording extends javax.swing.JFrame {

    /**
     * Creates new form recording
     */
    public recording() {
        initComponents();
        intialize();
    }

    public Connection getConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/uygulamam";
        String kök = "root";
        String şifre = "*****";
        try {
            con = DriverManager.getConnection(url, kök, şifre);
            //                               uzantısı      localhost/veritabanı ismi,kullanıcı adı sanırım 
            //veritabanına buradn erişim sağlıyoruz aşşağıda da tabloya direkt gönderiiyoruz (veritabanı içindeki)
            //bağlantıyı libraries den add library ekleyerek sağladım (kütüphane ekledim)

            return con;
        } catch (SQLException ex) {
            Logger.getLogger(MAİN.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Not Connected");
            return null;
        }
    }

    public void intialize() {
        //burada combobox un içeriğini düzenledim
        txt_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Woman ", "Man "}));
        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        txt_Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
    }

    public boolean checkGENERALİNFORMATİON() {//girişlerin kontrollerini boş burakılmışsa göndermiyoruz

        if (txt_name.getText() == null || txt_Surname.getText() == null || txt_Age.getText() == null
                || txt_Address.getText() == null || txt_Year.getText() == null || txt_Gender == null || txt_Day == null
                || txt_NickName == null || txt_Password == null) {

            return false;

        } else {
            try {

                return true;
            } catch (Exception ex) {

                return false;

            }
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

        jPanel1 = new javax.swing.JPanel();
        Btn_Back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        Surname = new javax.swing.JLabel();
        txt_Surname = new javax.swing.JTextField();
        Age = new javax.swing.JLabel();
        txt_Age = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        txt_Gender = new javax.swing.JComboBox<>();
        Address = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Address = new javax.swing.JTextArea();
        Age1 = new javax.swing.JLabel();
        txt_Number = new javax.swing.JTextField();
        Age2 = new javax.swing.JLabel();
        txt_NickName = new javax.swing.JTextField();
        Age3 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JTextField();
        Recording_Time1 = new javax.swing.JLabel();
        txt_Day = new javax.swing.JComboBox<>();
        Month = new javax.swing.JComboBox<>();
        txt_Year = new javax.swing.JTextField();
        Btn_Insert = new javax.swing.JButton();
        txt_Gym_Password = new javax.swing.JPasswordField();
        Age4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        Btn_Back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Back.setText("Back");
        Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        txt_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        Surname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Surname.setText("SurnName");

        txt_Surname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SurnameActionPerformed(evt);
            }
        });

        Age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Age.setText("Age");

        txt_Age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AgeActionPerformed(evt);
            }
        });

        Gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gender.setText("Gender ");

        txt_Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GenderActionPerformed(evt);
            }
        });

        Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Address.setText("Address");

        txt_Address.setColumns(20);
        txt_Address.setRows(5);
        jScrollPane2.setViewportView(txt_Address);

        Age1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Age1.setText("Number");

        txt_Number.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NumberActionPerformed(evt);
            }
        });

        Age2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Age2.setText("NickName");

        txt_NickName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_NickName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NickNameActionPerformed(evt);
            }
        });

        Age3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Age3.setText("Password");

        txt_Password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });

        Recording_Time1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Recording_Time1.setText("Recording Date");

        txt_Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DayActionPerformed(evt);
            }
        });

        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });

        txt_Year.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_YearActionPerformed(evt);
            }
        });

        Btn_Insert.setText("İNSERT");
        Btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InsertActionPerformed(evt);
            }
        });

        txt_Gym_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Gym_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Gym_PasswordActionPerformed(evt);
            }
        });

        Age4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Age4.setText("GYM Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Surname)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Gender)
                                    .addComponent(Age)
                                    .addComponent(Age1)
                                    .addComponent(Recording_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Age2)
                                            .addComponent(Age3)
                                            .addComponent(Age4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_NickName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gym_Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(268, 268, 268))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_NickName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Recording_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gym_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BackActionPerformed
        Password ps = new Password();

        setVisible(false);
        ps.setVisible(true);
    }//GEN-LAST:event_Btn_BackActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_SurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SurnameActionPerformed

    private void txt_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AgeActionPerformed

    private void txt_GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GenderActionPerformed

    private void txt_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumberActionPerformed

    private void txt_NickNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NickNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NickNameActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void txt_DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DayActionPerformed

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthActionPerformed

    private void txt_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_YearActionPerformed

    private void Btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InsertActionPerformed
            Password pas=new  Password();
         String password = new String(txt_Gym_Password.getPassword());
        if (checkGENERALİNFORMATİON() == true && password.equals("MFİ51099")) {

            try {
                Connection con = getConnection();//bağlantıyı sağladık
                //şimdi de tabloya ekleme yapacağız sql komutlarını kullanarak
                PreparedStatement ps = con.prepareStatement("INSERT INTO admin(Name,Surname,Age,Number,Gender,Day,Month,Year,Address,NickName,Password)"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");

                ps.setString(1, txt_name.getText());

                ps.setString(2, txt_Surname.getText());

                ps.setString(3, txt_Age.getText());

                ps.setString(4, txt_Number.getText());

                String Gender = (String) txt_Gender.getSelectedItem();//stringe dönüştüürerek gönderdim
                ps.setString(5, Gender);//combocox dan seçilen kısmı

                String day = (String) txt_Day.getSelectedItem();//stringe dönüştüürerek gönderdim
                ps.setString(6, day);

                String month = (String) Month.getSelectedItem();//stringe dönüştüürerek gönderdim
                ps.setString(7, month);

                ps.setString(8, txt_Year.getText());

                ps.setString(9, txt_Address.getText());

                ps.setString(10, txt_NickName.getText());

                ps.setString(11, txt_Password.getText());

                ps.executeUpdate();//bunları yüklüyor

                setVisible(false);
                pas.setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "one or more field are empty ");//ekrana mesaj  veren kutucuğu çıkartıyor
        }
    }//GEN-LAST:event_Btn_InsertActionPerformed

    private void txt_Gym_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Gym_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Gym_PasswordActionPerformed

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
            java.util.logging.Logger.getLogger(recording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recording().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Age1;
    private javax.swing.JLabel Age2;
    private javax.swing.JLabel Age3;
    private javax.swing.JLabel Age4;
    private javax.swing.JButton Btn_Back;
    private javax.swing.JButton Btn_Insert;
    private javax.swing.JLabel Gender;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JLabel Recording_Time1;
    private javax.swing.JLabel Surname;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_Address;
    private javax.swing.JTextField txt_Age;
    private javax.swing.JComboBox<String> txt_Day;
    private javax.swing.JComboBox<String> txt_Gender;
    private javax.swing.JPasswordField txt_Gym_Password;
    private javax.swing.JTextField txt_NickName;
    private javax.swing.JTextField txt_Number;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Surname;
    private javax.swing.JTextField txt_Year;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
