package CyberCorner;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.print.PrinterException;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Stack<T> {
    private ArrayList<T> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(T item) {
        elements.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}

public class KikaysComputerShop extends javax.swing.JFrame {

    private int total = 0;
    private int x = 0;
    private Stack<String> selectedComputers;
 
    public KikaysComputerShop() {
        initComponents();
        init();
        selectedComputers = new Stack<>();
    }

    public void init() {
        setImage();
        setTime();
    }

    public void setImage() {
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/frontimg.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/frontimg.png"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/frontimg.png"));
        
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/images/frontimg.png"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/images/frontimg.png"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/images/frontimg.png"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/images/bgimg.jpg"));
       
        

        Image img = icon1.getImage().getScaledInstance(pc1img.getWidth(), pc1img.getHeight(), Image.SCALE_SMOOTH);
        pc1img.setIcon(new ImageIcon(img));
        Image img2 = icon2.getImage().getScaledInstance(pc2img.getWidth(), pc2img.getHeight(), Image.SCALE_SMOOTH);
        pc2img.setIcon(new ImageIcon(img2));
        Image img3 = icon3.getImage().getScaledInstance(pc3img.getWidth(), pc3img.getHeight(), Image.SCALE_SMOOTH);
        pc3img.setIcon(new ImageIcon(img3));
        
        Image img4 = icon4.getImage().getScaledInstance(pc4img.getWidth(), pc4img.getHeight(), Image.SCALE_SMOOTH);
        pc4img.setIcon(new ImageIcon(img4));
        Image img5 = icon5.getImage().getScaledInstance(pc5img.getWidth(), pc5img.getHeight(), Image.SCALE_SMOOTH);
        pc5img.setIcon(new ImageIcon(img5));
        Image img6 = icon6.getImage().getScaledInstance(pc6img.getWidth(), pc6img.getHeight(), Image.SCALE_SMOOTH);
        pc6img.setIcon(new ImageIcon(img6));
        Image img7 = icon7.getImage().getScaledInstance(bgimg.getWidth(), bgimg.getHeight(), Image.SCALE_SMOOTH);
        bgimg.setIcon(new ImageIcon(img7));
        
    }
 private int calculateTotalPrice(int hours, int minutes, int pricePerHour, int pricePer10Minutes) {
    return hours * pricePerHour + minutes * pricePer10Minutes / 6;
}
    
   public boolean qtyIsZero(int hours, int minutes) {
    if (hours == 0 && minutes == 0) {
        JOptionPane.showMessageDialog(null, " Please increase the quantity");
        return false;
    }
    return true;
}

    public void reset() {
        total = 0;
        x = 0;
        
        btnTotal.setEnabled(true);
        hr1.setValue(0);
        hr2.setValue(0);
        hr3.setValue(0);
        
        hr4.setValue(0);
        hr5.setValue(0);
        hr6.setValue(0);
        
       
        jTextFieldSubtotal.setText("0.0");
        jTextFieldTotal.setText("0.0");
        jTextArea12.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
       
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
       
    }

    public void TST() {
        
        jTextFieldSubtotal.setText(String.valueOf(total));
        jTextFieldTotal.setText(String.valueOf(total));
    }
    
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        popupMenu1 = new java.awt.PopupMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jTxTime = new javax.swing.JLabel();
        jTxtDate = new javax.swing.JLabel();
        PC3 = new javax.swing.JLabel();
        pc2img1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comp1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pc1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hr1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        pc1img = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        min1 = new javax.swing.JSpinner();
        comp2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pc2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        hr2 = new javax.swing.JSpinner();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pc2img = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        min2 = new javax.swing.JSpinner();
        comp4 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        pc4 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        hr4 = new javax.swing.JSpinner();
        jCheckBox4 = new javax.swing.JCheckBox();
        pc4img = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        min4 = new javax.swing.JSpinner();
        comp3 = new javax.swing.JPanel();
        pc3img = new javax.swing.JLabel();
        pc3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        hr3 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        min3 = new javax.swing.JSpinner();
        comp5 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        pc5 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        hr5 = new javax.swing.JSpinner();
        jCheckBox5 = new javax.swing.JCheckBox();
        pc5img = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        min5 = new javax.swing.JSpinner();
        jLabel56 = new javax.swing.JLabel();
        comp6 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        pc6 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        hr6 = new javax.swing.JSpinner();
        jCheckBox6 = new javax.swing.JCheckBox();
        pc6img = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        min6 = new javax.swing.JSpinner();
        btnTotal = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btntrans = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldSubtotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        butonUndo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bgimg = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTxTime.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        jTxtDate.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        PC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PC3MouseClicked(evt);
            }
        });

        pc2img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pc2img1MouseClicked(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bg.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                bgComponentResized(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setText("Cyber Corner");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 230, 70));

        comp1.setBackground(new java.awt.Color(255, 204, 204));
        comp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Price:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Quantity in hr:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Rent Now:");

        pc1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc1.setText("PC 1");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel9.setText("Php 100  per hour");

        hr1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel11.setText("Php 3 per mins.");

        pc1img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pc1imgMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Quantity in min:");

        min1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout comp1Layout = new javax.swing.GroupLayout(comp1);
        comp1.setLayout(comp1Layout);
        comp1Layout.setHorizontalGroup(
            comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp1Layout.createSequentialGroup()
                .addComponent(pc1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(comp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pc1img, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(comp1Layout.createSequentialGroup()
                        .addGroup(comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(hr1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(min1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(comp1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        comp1Layout.setVerticalGroup(
            comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pc1img, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pc1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(1, 1, 1)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(comp1Layout.createSequentialGroup()
                        .addGroup(comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(hr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1))
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(comp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 190, 270));

        comp2.setBackground(new java.awt.Color(255, 204, 204));
        comp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Price:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Quantity in hr:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Rent Now:");

        pc2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc2.setText("PC 2");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N

        hr2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel27.setText("Php 100 per hour");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel30.setText("Php 3 per min");

        pc2img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pc2imgMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText(" Quatity in min:");

        min2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout comp2Layout = new javax.swing.GroupLayout(comp2);
        comp2.setLayout(comp2Layout);
        comp2Layout.setHorizontalGroup(
            comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comp2Layout.createSequentialGroup()
                        .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(comp2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pc2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(comp2Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addGroup(comp2Layout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(comp2Layout.createSequentialGroup()
                        .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pc2img, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(comp2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hr2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(comp2Layout.createSequentialGroup()
                                .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19))
                                .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(comp2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jCheckBox2))
                                    .addGroup(comp2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(min2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        comp2Layout.setVerticalGroup(
            comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pc2img, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addGroup(comp2Layout.createSequentialGroup()
                        .addComponent(pc2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(comp2Layout.createSequentialGroup()
                                .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(hr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(comp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(min2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(jCheckBox2))
                            .addComponent(jLabel19))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(comp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 190, 270));

        comp4.setBackground(new java.awt.Color(255, 204, 204));
        comp4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Price:");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("Quantity in hr:");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Rent Now:");

        pc4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc4.setText("PC 4");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel45.setText("PHP 100 per hour");

        hr4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        pc4img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pc4imgMouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel46.setText("PHP 3 per mins.");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("Quantity in min:");

        min4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout comp4Layout = new javax.swing.GroupLayout(comp4);
        comp4.setLayout(comp4Layout);
        comp4Layout.setHorizontalGroup(
            comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comp4Layout.createSequentialGroup()
                        .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pc4img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(comp4Layout.createSequentialGroup()
                                .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hr4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox4)
                                    .addComponent(min4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(comp4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pc4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comp4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(45, 45, 45))
        );
        comp4Layout.setVerticalGroup(
            comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pc4img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pc4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(hr4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(min4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(comp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel43))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        bg.add(comp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 190, 280));

        comp3.setBackground(new java.awt.Color(255, 204, 204));
        comp3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        pc3img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pc3imgMouseClicked(evt);
            }
        });

        pc3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc3.setText("PC 3");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Price:");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel28.setText("Php 100 per hour");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel29.setText("Php 3 per mins");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Quantity in hr:");

        hr3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Rent Now:");

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Quantity in min:");

        min3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout comp3Layout = new javax.swing.GroupLayout(comp3);
        comp3.setLayout(comp3Layout);
        comp3Layout.setHorizontalGroup(
            comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comp3Layout.createSequentialGroup()
                        .addGroup(comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(comp3Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(hr3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(comp3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(comp3Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(comp3Layout.createSequentialGroup()
                                .addGroup(comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox3)
                                    .addComponent(min3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(pc3img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(comp3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(pc3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        comp3Layout.setVerticalGroup(
            comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pc3img, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pc3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comp3Layout.createSequentialGroup()
                        .addGroup(comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel23))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(comp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel25))
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(4, 4, 4))
        );

        bg.add(comp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 200, 270));

        comp5.setBackground(new java.awt.Color(255, 204, 204));
        comp5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setText("Price:");

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setText("Quantity in hr:");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setText("Rent Now:");

        pc5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc5.setText("PC 5");

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel57.setText("PHP 100 per hour");

        hr5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        pc5img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pc5imgMouseClicked(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel58.setText("PHP 3 per mins.");

        min5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setText("Quantity in min:");

        javax.swing.GroupLayout comp5Layout = new javax.swing.GroupLayout(comp5);
        comp5.setLayout(comp5Layout);
        comp5Layout.setHorizontalGroup(
            comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pc5img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(comp5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pc5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(comp5Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(comp5Layout.createSequentialGroup()
                        .addGroup(comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(min5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(comp5Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(18, 18, 18)
                        .addComponent(hr5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        comp5Layout.setVerticalGroup(
            comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pc5img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pc5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel57))
                .addGap(3, 3, 3)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hr5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(min5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(comp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55)
                    .addComponent(jCheckBox5))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        bg.add(comp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 190, 280));

        comp6.setBackground(new java.awt.Color(255, 204, 204));
        comp6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setText("Price:");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setText("Quantity in hr:");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel61.setText("Rent Now:");

        pc6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pc6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pc6.setText("PC 6");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel63.setText("PHP 100 per hour");

        hr6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        pc6img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pc6imgMouseClicked(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel64.setText("Php 3 per mins.");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setText("Quantity in min:");

        min6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout comp6Layout = new javax.swing.GroupLayout(comp6);
        comp6.setLayout(comp6Layout);
        comp6Layout.setHorizontalGroup(
            comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comp6Layout.createSequentialGroup()
                        .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pc6img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(comp6Layout.createSequentialGroup()
                                .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61)
                                    .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hr6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox6)
                                    .addComponent(min6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 14, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(comp6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pc6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comp6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(44, 44, 44))
        );
        comp6Layout.setVerticalGroup(
            comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pc6img, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pc6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel63))
                .addGap(1, 1, 1)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(comp6Layout.createSequentialGroup()
                        .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(hr6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(comp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox6))
                    .addComponent(jLabel61))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        bg.add(comp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 200, 270));

        btnTotal.setBackground(new java.awt.Color(202, 202, 202));
        btnTotal.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.setMaximumSize(new java.awt.Dimension(109, 27));
        btnTotal.setMinimumSize(new java.awt.Dimension(109, 27));
        btnTotal.setPreferredSize(new java.awt.Dimension(109, 27));
        btnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTotalMouseClicked(evt);
            }
        });
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        bg.add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 720, -1, -1));

        btnReceipt.setBackground(new java.awt.Color(202, 202, 202));
        btnReceipt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnReceipt.setText("Receipt");
        btnReceipt.setPreferredSize(new java.awt.Dimension(109, 27));
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });
        bg.add(btnReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 720, -1, -1));

        btnReset.setBackground(new java.awt.Color(202, 202, 202));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setPreferredSize(new java.awt.Dimension(109, 27));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        bg.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, -1, -1));

        btntrans.setBackground(new java.awt.Color(202, 202, 202));
        btntrans.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btntrans.setText("Transaction");
        btntrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntransMouseClicked(evt);
            }
        });
        btntrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransActionPerformed(evt);
            }
        });
        bg.add(btntrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, -1, -1));

        btnExit.setBackground(new java.awt.Color(202, 202, 202));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnExit.setText("Logout");
        btnExit.setPreferredSize(new java.awt.Dimension(109, 27));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        bg.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 720, -1, -1));

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jScrollPane1.setViewportView(jTextArea12);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 116, 330, 400));

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setText("0.0");
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });
        bg.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, 152, 28));

        jTextFieldSubtotal.setEditable(false);
        jTextFieldSubtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSubtotal.setText("0.0");
        jTextFieldSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubtotalActionPerformed(evt);
            }
        });
        bg.add(jTextFieldSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, 152, 27));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 153));
        jLabel10.setText("Total");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, -1, -1));

        butonUndo.setBackground(new java.awt.Color(202, 202, 202));
        butonUndo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        butonUndo.setText("Undo");
        butonUndo.setPreferredSize(new java.awt.Dimension(109, 27));
        butonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonUndoActionPerformed(evt);
            }
        });
        bg.add(butonUndo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 720, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("Subtotal");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, -1, -1));

        bgimg.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        bg.add(bgimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1690, 1010));

        jScrollPane3.setViewportView(bg);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1692, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2231, 2231, 2231)
                        .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(956, 956, 956)
                                .addComponent(pc2img1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2879, 2879, 2879)
                        .addComponent(PC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pc2img1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(842, 842, 842))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PC3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(KikaysComputerShop.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);
                    jTxTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));
                }
            }
        }).start();
    }
    public void KikaysCompShop() {
        int purchaseId = 15020 + (int) (Math.random() * 80800);
        jTextArea12.setText("***********************Cyber Corner*****************\n"
                + "Time: " + jTxTime.getText() + " Date: " + jTxtDate.getText() + "\n"
                + "purchaseId" + purchaseId + "\n"
                + "****************************************************************\n"
                + "Item Name:\t\t\t" + "Price(PHP)\n");
    }
    
    public void undoLastSelection() {
        if (!selectedComputers.isEmpty()) {
            String lastSelected = selectedComputers.pop();
            JOptionPane.showMessageDialog(this, "Removed: " + lastSelected);
        } else {
            JOptionPane.showMessageDialog(this, "No selections to undo.");
        }
    }

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {
        undoLastSelection();
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.valueOf(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(KikaysComputerShop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened
    int xx, xy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void PC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PC3MouseClicked
        PC3 pc3 = new PC3();
        pc3.setVisible(true);
        pc3.pack();
        pc3.setLocationRelativeTo(null);
    }//GEN-LAST:event_PC3MouseClicked

    private void pc2img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pc2img1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pc2img1MouseClicked

    private void bgComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_bgComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_bgComponentResized

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btntransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransActionPerformed

        transacHistory receive = new transacHistory();
        receive.setTransactionText(jTextArea12.getText());
        receive.setVisible(true);
        receive.setLocationRelativeTo(null);
    }//GEN-LAST:event_btntransActionPerformed

    private void btntransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransMouseClicked
        
    }//GEN-LAST:event_btntransMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        if (total != 0) {
            if (!btnTotal.isEnabled()) {
                try {
                    jTextArea12.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(KikaysComputerShop.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "You need to calculate the total first.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchase any product/s");
        }
    }//GEN-LAST:event_btnReceiptActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
          if (total == 0) {
            JOptionPane.showMessageDialog(null, "You haven't selected any product/s");
        } else {
            jTextArea12.setText(jTextArea12.getText()
                + "****************************************************************\n"

                   + "Total: \t\t" + total + "\n"
               
                + "******************************Thank you!!!**************************************\n"
            );
            btnTotal.setEnabled(false);
        }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTotalMouseClicked

    }//GEN-LAST:event_btnTotalMouseClicked

    private void pc6imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pc6imgMouseClicked
        PC6 pc6 = new PC6();
        pc6.setVisible(true);
        pc6.pack();
        pc6.setLocationRelativeTo(null);
    }//GEN-LAST:event_pc6imgMouseClicked

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        int hours = Integer.parseInt(hr6.getValue().toString());
       int minutes = Integer.parseInt(min6.getValue().toString());
    if (qtyIsZero(hours, minutes) && jCheckBox6.isSelected()) {
        x++;
        if (x == 1) {
            KikaysCompShop();
        }
        int totalPrice = calculateTotalPrice(hours, minutes, 100, 20);
        total += totalPrice;
        
        String computerName = pc6.getText();
        selectedComputers.push(computerName);

        jTextArea12.setText(jTextArea12.getText() + x + ". " + pc6.getText() + "\t\t" + totalPrice + "\n");
        TST();
    } else {
        jCheckBox6.setSelected(false);
    }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        int hours = Integer.parseInt(hr3.getValue().toString());
       int minutes = Integer.parseInt(min3.getValue().toString());
    if (qtyIsZero(hours, minutes) && jCheckBox3.isSelected()) {
        x++;
        if (x == 1) {
            KikaysCompShop();
        }
        int totalPrice = calculateTotalPrice(hours, minutes, 100, 20);
        total += totalPrice;
        
        String computerName = pc3.getText();
        selectedComputers.push(computerName);

        jTextArea12.setText(jTextArea12.getText() + x + ". " + pc3.getText() + "\t\t" + totalPrice + "\n");
        TST();
    } else {
        jCheckBox3.setSelected(false);
    }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void pc3imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pc3imgMouseClicked
        PC3 pc3 = new PC3();
        pc3.setVisible(true);
        pc3.pack();
        pc3.setLocationRelativeTo(null);
    }//GEN-LAST:event_pc3imgMouseClicked

    private void pc4imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pc4imgMouseClicked
        PC4 pc4 = new PC4();
        pc4.setVisible(true);
        pc4.pack();
        pc4.setLocationRelativeTo(null);
    }//GEN-LAST:event_pc4imgMouseClicked

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        int hours = Integer.parseInt(hr4.getValue().toString());
       int minutes = Integer.parseInt(min4.getValue().toString());
    if (qtyIsZero(hours, minutes) && jCheckBox4.isSelected()) {
        x++;
        if (x == 1) {
            KikaysCompShop();
        }
        int totalPrice = calculateTotalPrice(hours, minutes, 100, 20);
        total += totalPrice;
        
        String computerName = pc4.getText();
        selectedComputers.push(computerName);

        jTextArea12.setText(jTextArea12.getText() + x + ". " + pc4.getText() + "\t\t" + totalPrice + "\n");
        TST();
    } else {
        jCheckBox4.setSelected(false);
    }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        int hours = Integer.parseInt(hr1.getValue().toString());
       int minutes = Integer.parseInt(min1.getValue().toString());
    if (qtyIsZero(hours, minutes) && jCheckBox1.isSelected()) {
        x++;
        if (x == 1) {
            KikaysCompShop();
        }
        int totalPrice = calculateTotalPrice(hours, minutes, 100, 20);
        total += totalPrice;
        
        String computerName = pc1.getText();
        selectedComputers.push(computerName);

        jTextArea12.setText(jTextArea12.getText() + x + ". " + pc1.getText() + "\t\t" + totalPrice + "\n");
        TST();
    } else {
        jCheckBox1.setSelected(false);
    }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextFieldSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubtotalActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed

    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void pc1imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pc1imgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pc1imgMouseClicked

    private void pc2imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pc2imgMouseClicked
        PC2 pc2 = new PC2();
        pc2.setVisible(true);
        pc2.pack();
        pc2.setLocationRelativeTo(null);
    }//GEN-LAST:event_pc2imgMouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
         int hours = Integer.parseInt(hr2.getValue().toString());
       int minutes = Integer.parseInt(min2.getValue().toString());
    if (qtyIsZero(hours, minutes) && jCheckBox2.isSelected()) {
        x++;
        if (x == 1) {
            KikaysCompShop();
        }
        int totalPrice = calculateTotalPrice(hours, minutes, 100, 20);
        total += totalPrice;
        
        String computerName = pc2.getText();
        selectedComputers.push(computerName);

        jTextArea12.setText(jTextArea12.getText() + x + ". " + pc2.getText() + "\t\t" + totalPrice + "\n");
        TST();
    } else {
        jCheckBox2.setSelected(false);
    }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void pc5imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pc5imgMouseClicked
        PC5 pc5 = new PC5();
        pc5.setVisible(true);
        pc5.pack();
        pc5.setLocationRelativeTo(null);
    }//GEN-LAST:event_pc5imgMouseClicked

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
         int hours = Integer.parseInt(hr5.getValue().toString());
       int minutes = Integer.parseInt(min5.getValue().toString());
    if (qtyIsZero(hours, minutes) && jCheckBox5.isSelected()) {
        x++;
        if (x == 1) {
            KikaysCompShop();
        }
        int totalPrice = calculateTotalPrice(hours, minutes, 100, 20);
        total += totalPrice;
        
        String computerName = pc5.getText();
        selectedComputers.push(computerName);

        jTextArea12.setText(jTextArea12.getText() + x + ". " + pc5.getText() + "\t\t" + totalPrice + "\n");
        TST();
    } else {
        jCheckBox5.setSelected(false);
    }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void butonUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonUndoActionPerformed
        System.out.println("Undo action performed.");
    }//GEN-LAST:event_butonUndoActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KikaysComputerShop().setVisible(true);
            }
        });
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PC3;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgimg;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btntrans;
    private javax.swing.JButton butonUndo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JPanel comp1;
    private javax.swing.JPanel comp2;
    private javax.swing.JPanel comp3;
    private javax.swing.JPanel comp4;
    private javax.swing.JPanel comp5;
    private javax.swing.JPanel comp6;
    private javax.swing.JSpinner hr1;
    private javax.swing.JSpinner hr2;
    private javax.swing.JSpinner hr3;
    private javax.swing.JSpinner hr4;
    private javax.swing.JSpinner hr5;
    private javax.swing.JSpinner hr6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextField jTextFieldSubtotal;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JLabel jTxTime;
    private javax.swing.JLabel jTxtDate;
    private javax.swing.JSpinner min1;
    private javax.swing.JSpinner min2;
    private javax.swing.JSpinner min3;
    private javax.swing.JSpinner min4;
    private javax.swing.JSpinner min5;
    private javax.swing.JSpinner min6;
    private javax.swing.JLabel pc1;
    private javax.swing.JLabel pc1img;
    private javax.swing.JLabel pc2;
    private javax.swing.JLabel pc2img;
    private javax.swing.JLabel pc2img1;
    private javax.swing.JLabel pc3;
    private javax.swing.JLabel pc3img;
    private javax.swing.JLabel pc4;
    private javax.swing.JLabel pc4img;
    private javax.swing.JLabel pc5;
    private javax.swing.JLabel pc5img;
    private javax.swing.JLabel pc6;
    private javax.swing.JLabel pc6img;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables

}
