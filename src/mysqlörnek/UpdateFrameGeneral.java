/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlörnek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MFİ
 */
public class UpdateFrameGeneral extends javax.swing.JFrame {

    /**
     * Creates new form UpdateFrameGeneral
     */
    public UpdateFrameGeneral() {
        initComponents();
        intialize();
        intializeUP();
        ıcons();
        
    }
  public void ıcons(){
    Icon Btn_updateIcon = new ImageIcon("C:\\Users\\MFİ\\Documents\\NetBeansProjects\\mysqlörnek\\src\\change.png");
     Btn_Update.setIcon(Btn_updateIcon);
     Icon Btn_backIcon = new ImageIcon("C:\\Users\\MFİ\\Documents\\NetBeansProjects\\mysqlörnek\\src\\back.png");
     Btn_Back.setIcon(Btn_backIcon);
      Icon Btn_showIcon = new ImageIcon("C:\\Users\\MFİ\\Documents\\NetBeansProjects\\mysqlörnek\\src\\show2.png");
     Btn_Show.setIcon(Btn_showIcon);
     
}
    public void intialize() {
        //burada combobox un içeriğini düzenledim
        txt_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Woman ", "Man "}));
        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        txt_Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        txt_Dayup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
    }

    public void intializeUP() {
        //burada combobox un içeriğini düzenledim
        txt_Genderup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Woman ", "Man "}));
        Monthup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
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

    public void month(String month) {

        if (month.equals("January")) {
            Month.setSelectedIndex(0);
        }
        if (month.equals("February")) {
            Month.setSelectedIndex(1);

        }
        if (month.equals("March")) {
            Month.setSelectedIndex(2);

        }
        if (month.equals("April")) {
            Month.setSelectedIndex(3);

        }
        if (month.equals("May")) {
            Month.setSelectedIndex(4);

        }
        if (month.equals("June")) {
            Month.setSelectedIndex(5);

        }
        if (month.equals("July")) {
            Month.setSelectedIndex(6);

        }
        if (month.equals("August")) {
            Month.setSelectedIndex(7);

        }
        if (month.equals("September")) {
            Month.setSelectedIndex(8);

        }
        if (month.equals("October")) {
            Month.setSelectedIndex(9);

        }
        if (month.equals("November")) {
            Month.setSelectedIndex(10);

        }
        if (month.equals("December")) {
            Month.setSelectedIndex(11);

        }
    }

    public void Day(String Day) {
       
        if (Day.equals("1")) {
            txt_Day.setSelectedIndex(0);
        }
        if (Day.equals("2")) {
            txt_Day.setSelectedIndex(1);
        }
        if (Day.equals("3")) {
            txt_Day.setSelectedIndex(2);
        }
        if (Day.equals("4")) {
            txt_Day.setSelectedIndex(3);
        }
        if (Day.equals("5")) {
            txt_Day.setSelectedIndex(4);
        }
        if (Day.equals("6")) {
            txt_Day.setSelectedIndex(5);
        }
        if (Day.equals("7")) {
            txt_Day.setSelectedIndex(6);
        }
        if (Day.equals("8")) {
            txt_Day.setSelectedIndex(7);
        }
        if (Day.equals("9")) {
            txt_Day.setSelectedIndex(8);
        }
        if (Day.equals("10")) {
            txt_Day.setSelectedIndex(9);
        }
        if (Day.equals("11")) {
            txt_Day.setSelectedIndex(10);
        }
        if (Day.equals("12")) {
            txt_Day.setSelectedIndex(11);
        }
        if (Day.equals("13")) {
            txt_Day.setSelectedIndex(12);
        }
        if (Day.equals("14")) {
            txt_Day.setSelectedIndex(13);
        }
        if (Day.equals("15")) {
            txt_Day.setSelectedIndex(14);
        }
        if (Day.equals("16")) {
            txt_Day.setSelectedIndex(15);
        }
        if (Day.equals("17")) {
            txt_Day.setSelectedIndex(16);
        }
        if (Day.equals("18")) {
            txt_Day.setSelectedIndex(17);
        }
        if (Day.equals("19")) {
            txt_Day.setSelectedIndex(18);
        }
        if (Day.equals("20")) {
            txt_Day.setSelectedIndex(19);
        }
        if (Day.equals("21")) {
            txt_Day.setSelectedIndex(20);
        }
        if (Day.equals("22")) {
            txt_Day.setSelectedIndex(21);
        }
        if (Day.equals("23")) {
            txt_Day.setSelectedIndex(22);
        }
        if (Day.equals("24")) {
            txt_Day.setSelectedIndex(23);
        }
        if (Day.equals("25")) {
            txt_Day.setSelectedIndex(24);
        }
        if (Day.equals("26")) {
            txt_Day.setSelectedIndex(25);
        }
        if (Day.equals("27")) {
            txt_Day.setSelectedIndex(26);
        }
        if (Day.equals("28")) {
            txt_Day.setSelectedIndex(27);
        }
        if (Day.equals("29")) {
            txt_Day.setSelectedIndex(28);
        }
        if (Day.equals("30")) {
            txt_Day.setSelectedIndex(29);
        }
        if (Day.equals("31")) {
            txt_Day.setSelectedIndex(30);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        Recording_Time = new javax.swing.JLabel();
        Age3 = new javax.swing.JLabel();
        txt_Age = new javax.swing.JTextField();
        txt_Recording_Time = new javax.swing.JTextField();
        Surname = new javax.swing.JLabel();
        txt_Surname = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Address = new javax.swing.JTextArea();
        txt_Gender = new javax.swing.JComboBox<>();
        Recording_Time1 = new javax.swing.JLabel();
        Month = new javax.swing.JComboBox<>();
        txt_Year = new javax.swing.JTextField();
        Btn_Update = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Btn_Back = new javax.swing.JButton();
        txt_nameup = new javax.swing.JTextField();
        txt_Surnameup = new javax.swing.JTextField();
        txt_Ageup = new javax.swing.JTextField();
        txt_Genderup = new javax.swing.JComboBox<>();
        Monthup = new javax.swing.JComboBox<>();
        txt_Yearup = new javax.swing.JTextField();
        txt_Recording_Timeup = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_Addressup = new javax.swing.JTextArea();
        Btn_Show = new javax.swing.JButton();
        txt_Day = new javax.swing.JComboBox<>();
        txt_Dayup = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name:");

        Age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Age.setText("Age");

        txt_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });

        txt_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        Gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gender.setText("Gender ");

        Recording_Time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Recording_Time.setText("Recording Time");

        Age3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_Age.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AgeActionPerformed(evt);
            }
        });

        txt_Recording_Time.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Recording_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Recording_TimeActionPerformed(evt);
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

        Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Address.setText("Address");

        txt_Address.setColumns(20);
        txt_Address.setRows(5);
        jScrollPane2.setViewportView(txt_Address);

        txt_Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GenderActionPerformed(evt);
            }
        });

        Recording_Time1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Recording_Time1.setText("Recording Date");

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

        Btn_Update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Update.setText("Update ");
        Btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UpdateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("Personal İnformation");

        Btn_Back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Back.setText("Back");
        Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BackActionPerformed(evt);
            }
        });

        txt_nameup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nameup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameupActionPerformed(evt);
            }
        });

        txt_Surnameup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Surnameup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SurnameupActionPerformed(evt);
            }
        });

        txt_Ageup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Ageup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AgeupActionPerformed(evt);
            }
        });

        txt_Genderup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GenderupActionPerformed(evt);
            }
        });

        Monthup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthupActionPerformed(evt);
            }
        });

        txt_Yearup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Yearup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_YearupActionPerformed(evt);
            }
        });

        txt_Recording_Timeup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Recording_Timeup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Recording_TimeupActionPerformed(evt);
            }
        });

        txt_Addressup.setColumns(20);
        txt_Addressup.setRows(5);
        jScrollPane4.setViewportView(txt_Addressup);

        Btn_Show.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Show.setText("Show");
        Btn_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ShowActionPerformed(evt);
            }
        });

        txt_Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DayActionPerformed(evt);
            }
        });

        txt_Dayup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DayupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(Surname)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_Surnameup, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Age3))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_nameup, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(72, 72, 72))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Recording_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Recording_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Recording_Timeup, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Recording_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                        .addComponent(txt_Dayup, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Monthup, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)))
                        .addComponent(txt_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Yearup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(515, 515, 515))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Gender)
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_Back))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btn_Show, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_Ageup, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_Genderup, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Btn_Back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nameup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Surnameup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Ageup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Genderup, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Monthup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Yearup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Recording_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Dayup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Recording_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Recording_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Recording_Timeup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_Show, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addComponent(Age3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BackActionPerformed
        LoginPage lp = new LoginPage();

        setVisible(false);
        lp.setVisible(true);
    }//GEN-LAST:event_Btn_BackActionPerformed

    private void Btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UpdateActionPerformed
        LoginPage lp = new LoginPage();
        if (txt_ID.getText() != null) {

            Connection con = getConnection();
            try {
                PreparedStatement ps = con.prepareStatement("UPDATE General_information SET Name=? ,Surname=? ,Age=?,Gender=? ,"
                        + "Rec_Day=?,Rec_Month=?,Rec_Year=?,RecordingTime=?,Address=? WHERE ID=?");

                //PS.SET... KISMINAN SEÇEREK GÖNDERİYORUZ
                ps.setString(1, txt_nameup.getText());

                ps.setString(2, txt_Surnameup.getText());

                ps.setString(3, txt_Ageup.getText());

                String Gender = (String) txt_Genderup.getSelectedItem();//stringe dönüştüürerek gönderdim
                ps.setString(4, Gender);//combocox dan seçilen kısmı

                String day = (String) txt_Day.getSelectedItem();//stringe dönüştüürerek gönderdim
                ps.setString(5, day);

                String month = (String) Monthup.getSelectedItem();//stringe dönüştüürerek gönderdim
                ps.setString(6, month);

                ps.setString(7, txt_Yearup.getText());

                ps.setString(8, txt_Recording_Timeup.getText());

                ps.setString(9, txt_Addressup.getText());

                ps.setString(10, txt_ID.getText());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update");

                setVisible(false);
                lp.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(UpdateFrameGeneral.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }
    }//GEN-LAST:event_Btn_UpdateActionPerformed

    private void txt_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_YearActionPerformed

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthActionPerformed

    private void txt_GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GenderActionPerformed

    private void txt_SurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SurnameActionPerformed

    private void txt_Recording_TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Recording_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Recording_TimeActionPerformed

    private void txt_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AgeActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void txt_nameupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameupActionPerformed

    private void txt_SurnameupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SurnameupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SurnameupActionPerformed

    private void txt_AgeupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AgeupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AgeupActionPerformed

    private void txt_GenderupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GenderupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GenderupActionPerformed

    private void MonthupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthupActionPerformed

    private void txt_YearupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_YearupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_YearupActionPerformed

    private void txt_Recording_TimeupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Recording_TimeupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Recording_TimeupActionPerformed

    private void Btn_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ShowActionPerformed

        Connection con = getConnection();

        try {
            Object ID = txt_ID.getText();
            String querygeneral = "SELECT * FROM general_information Where ID=" + ID;

            Statement st1;
            ResultSet rs1;

            st1 = con.createStatement();
            rs1 = st1.executeQuery(querygeneral);

            while (rs1.next()) {
                txt_name.setText(rs1.getString("Name"));

                txt_Surname.setText(rs1.getString("Surname"));

                txt_Age.setText(rs1.getString("Age"));

                if (rs1.getString("Gender").equals("Women")) {
                    txt_Gender.setSelectedIndex(0);
                } else {
                    txt_Gender.setSelectedIndex(1);
                }

                Day(rs1.getString("Rec_Day"));

                month(rs1.getString("Rec_Month"));

                txt_Year.setText(rs1.getString("Rec_Year"));

                txt_Recording_Time.setText(rs1.getString("RecordingTime"));

                txt_Address.setText(rs1.getString("Address"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ShowFrame.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_Btn_ShowActionPerformed

    private void txt_DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DayActionPerformed

    private void txt_DayupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DayupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DayupActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateFrameGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFrameGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFrameGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFrameGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFrameGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Age3;
    private javax.swing.JButton Btn_Back;
    private javax.swing.JButton Btn_Show;
    private javax.swing.JButton Btn_Update;
    private javax.swing.JLabel Gender;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JComboBox<String> Monthup;
    private javax.swing.JLabel Recording_Time;
    private javax.swing.JLabel Recording_Time1;
    private javax.swing.JLabel Surname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txt_Address;
    private javax.swing.JTextArea txt_Addressup;
    private javax.swing.JTextField txt_Age;
    private javax.swing.JTextField txt_Ageup;
    private javax.swing.JComboBox<String> txt_Day;
    private javax.swing.JComboBox<String> txt_Dayup;
    private javax.swing.JComboBox<String> txt_Gender;
    private javax.swing.JComboBox<String> txt_Genderup;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_Recording_Time;
    private javax.swing.JTextField txt_Recording_Timeup;
    private javax.swing.JTextField txt_Surname;
    private javax.swing.JTextField txt_Surnameup;
    private javax.swing.JTextField txt_Year;
    private javax.swing.JTextField txt_Yearup;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nameup;
    // End of variables declaration//GEN-END:variables
}
