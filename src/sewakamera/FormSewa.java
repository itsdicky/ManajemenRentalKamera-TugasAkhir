
package sewakamera;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormSewa extends javax.swing.JFrame {
    
    int rowOrder = 0;//baris tabel order
    int rowStock = 0;// baris tabel stock
    int selectedID;
    DefaultTableModel modelOrder;
    DefaultTableModel modelStock;
    Order order = new Order();//instansiasi class Order
    StockKamera stock = new StockKamera(); //instansiasi class StockBarang

    public FormSewa() {
        initComponents();
        this.modelOrder = (DefaultTableModel)tableOrder.getModel();
        this.modelStock = (DefaultTableModel)tableStock.getModel();
    }

    @SuppressWarnings("unhecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGrupJenis = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jKam = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnToListStock = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnToAddStock = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnLogOut1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnLogOut2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        addOrderPanel = new javax.swing.JPanel();
        tboxNik = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tboxAlamat = new javax.swing.JTextField();
        tboxNama = new javax.swing.JTextField();
        tboxNotlp = new javax.swing.JTextField();
        waktuCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        kameraCB = new javax.swing.JComboBox<>();
        listOrderPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        btnHapusOrder = new javax.swing.JButton();
        addStockPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tboxNamaKamera = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tboxHargaKamera = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tboxTahunKamera = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tboxCountKamera = new javax.swing.JTextField();
        radioDSLR = new javax.swing.JRadioButton();
        radioMirrorless = new javax.swing.JRadioButton();
        btnAddKamera = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        editStockPanel = new javax.swing.JPanel();
        listStockPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        btnEditKamera = new javax.swing.JButton();
        btnHapusKamera = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        addStockPanelEdit = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tboxNamaKameraEdit = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tboxHargaKameraEdit = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tboxTahunKameraEdit = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tboxCountKameraEdit = new javax.swing.JTextField();
        radioDSLREdit = new javax.swing.JRadioButton();
        radioMirrorlessEdit = new javax.swing.JRadioButton();
        btnAddKameraEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jKam.setBackground(new java.awt.Color(222, 225, 230));
        jKam.setPreferredSize(new java.awt.Dimension(928, 490));

        jPanel2.setBackground(new java.awt.Color(48, 56, 65));

        jLabel1.setFont(new java.awt.Font("HP Simplified Hans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sewa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        btnToListStock.setBackground(new java.awt.Color(84, 140, 168));
        btnToListStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnToListStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnToListStockMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnToListStockMouseReleased(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("HP Simplified Hans", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Daftar  Kamera");

        javax.swing.GroupLayout btnToListStockLayout = new javax.swing.GroupLayout(btnToListStock);
        btnToListStock.setLayout(btnToListStockLayout);
        btnToListStockLayout.setHorizontalGroup(
            btnToListStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnToListStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnToListStockLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnToListStockLayout.setVerticalGroup(
            btnToListStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(btnToListStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnToListStockLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnToAddStock.setBackground(new java.awt.Color(84, 140, 168));
        btnToAddStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnToAddStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnToAddStockMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnToAddStockMouseReleased(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("HP Simplified Hans", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tambah Kamera");

        javax.swing.GroupLayout btnToAddStockLayout = new javax.swing.GroupLayout(btnToAddStock);
        btnToAddStock.setLayout(btnToAddStockLayout);
        btnToAddStockLayout.setHorizontalGroup(
            btnToAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnToAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnToAddStockLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnToAddStockLayout.setVerticalGroup(
            btnToAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(btnToAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnToAddStockLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnLogOut.setBackground(new java.awt.Color(84, 140, 168));
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOutMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogOutMouseReleased(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("HP Simplified Hans", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Exit");

        javax.swing.GroupLayout btnLogOutLayout = new javax.swing.GroupLayout(btnLogOut);
        btnLogOut.setLayout(btnLogOutLayout);
        btnLogOutLayout.setHorizontalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogOutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnLogOutLayout.setVerticalGroup(
            btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(btnLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogOutLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnLogOut1.setBackground(new java.awt.Color(84, 140, 168));
        btnLogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOut1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOut1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogOut1MouseReleased(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("HP Simplified Hans", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Daftar Penyewa");

        javax.swing.GroupLayout btnLogOut1Layout = new javax.swing.GroupLayout(btnLogOut1);
        btnLogOut1.setLayout(btnLogOut1Layout);
        btnLogOut1Layout.setHorizontalGroup(
            btnLogOut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnLogOut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogOut1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnLogOut1Layout.setVerticalGroup(
            btnLogOut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(btnLogOut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogOut1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnLogOut2.setBackground(new java.awt.Color(84, 140, 168));
        btnLogOut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOut2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOut2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogOut2MouseReleased(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("HP Simplified Hans", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Tambah Sewa");

        javax.swing.GroupLayout btnLogOut2Layout = new javax.swing.GroupLayout(btnLogOut2);
        btnLogOut2.setLayout(btnLogOut2Layout);
        btnLogOut2Layout.setHorizontalGroup(
            btnLogOut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnLogOut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogOut2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnLogOut2Layout.setVerticalGroup(
            btnLogOut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(btnLogOut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLogOut2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnToAddStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnToListStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(66, 66, 66))
            .addComponent(btnLogOut1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogOut2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnLogOut2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnToAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnToListStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(0, 240, 240));
        mainPanel.setLayout(new java.awt.CardLayout());

        addOrderPanel.setBackground(new java.awt.Color(255, 255, 255));

        tboxNik.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        tboxNik.setPreferredSize(new java.awt.Dimension(8, 19));

        jLabel2.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel2.setText("NIK");

        jLabel3.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel3.setText("Nama Lengkap");

        jLabel4.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel5.setText("No. Telpon");

        tboxAlamat.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        tboxNama.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        tboxNotlp.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        tboxNotlp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tboxNotlpKeyPressed(evt);
            }
        });

        waktuCB.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        waktuCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih waktu", "6 Jam", "12 Jam", "1 Hari", "2 Hari", "7 Hari" }));
        waktuCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                waktuCBItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel6.setText("Waktu");

        jPanel5.setBackground(new java.awt.Color(71, 96, 114));

        jLabel7.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Biaya");

        labelHarga.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        labelHarga.setForeground(new java.awt.Color(255, 255, 255));
        labelHarga.setText("Harga");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHarga)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelHarga))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(71, 96, 114));

        jLabel11.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TAMBAH SEWA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(576, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        btnSubmit.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel13.setText("Kamera");

        kameraCB.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        kameraCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih kamera" }));

        javax.swing.GroupLayout addOrderPanelLayout = new javax.swing.GroupLayout(addOrderPanel);
        addOrderPanel.setLayout(addOrderPanelLayout);
        addOrderPanelLayout.setHorizontalGroup(
            addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addOrderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addOrderPanelLayout.createSequentialGroup()
                        .addGroup(addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(addOrderPanelLayout.createSequentialGroup()
                                .addComponent(waktuCB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tboxNotlp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tboxAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tboxNik, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tboxNama, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kameraCB, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addOrderPanelLayout.setVerticalGroup(
            addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addOrderPanelLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(kameraCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tboxNik, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tboxNama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tboxAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tboxNotlp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waktuCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnSubmit))
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        tboxNik.getAccessibleContext().setAccessibleName("");
        tboxNik.getAccessibleContext().setAccessibleDescription("");

        mainPanel.add(addOrderPanel, "card2");

        listOrderPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(71, 96, 114));

        jLabel12.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DAFTAR PENYEWA");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        tableOrder.setFont(new java.awt.Font("HP Simplified", 0, 11)); // NOI18N
        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "NIK", "Nama", "Alamat", "No. telepon", "Kamera", "Waktu", "Jml. Bayar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrder);

        btnHapusOrder.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        btnHapusOrder.setText("Hapus");
        btnHapusOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listOrderPanelLayout = new javax.swing.GroupLayout(listOrderPanel);
        listOrderPanel.setLayout(listOrderPanelLayout);
        listOrderPanelLayout.setHorizontalGroup(
            listOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(listOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(listOrderPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHapusOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        listOrderPanelLayout.setVerticalGroup(
            listOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listOrderPanelLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapusOrder)
                .addContainerGap())
        );

        mainPanel.add(listOrderPanel, "card3");

        addStockPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel16.setText("Nama");

        tboxNamaKamera.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel17.setText("Jenis");

        tboxHargaKamera.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel18.setText("Harga");

        jLabel19.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel19.setText("Tahun Prod.");

        tboxTahunKamera.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel20.setText("Shutter Count");

        tboxCountKamera.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        radioGrupJenis.add(radioDSLR);
        radioDSLR.setText("DSLR");

        radioGrupJenis.add(radioMirrorless);
        radioMirrorless.setText("Mirrorless");

        btnAddKamera.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        btnAddKamera.setText("Tambah");
        btnAddKamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKameraActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(71, 96, 114));

        jLabel28.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("TAMBAH KAMERA");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addContainerGap())
        );

        javax.swing.GroupLayout addStockPanelLayout = new javax.swing.GroupLayout(addStockPanel);
        addStockPanel.setLayout(addStockPanelLayout);
        addStockPanelLayout.setHorizontalGroup(
            addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStockPanelLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addStockPanelLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnAddKamera))
                            .addGroup(addStockPanelLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tboxHargaKamera, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tboxTahunKamera)
                                        .addComponent(tboxCountKamera, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addStockPanelLayout.createSequentialGroup()
                                        .addComponent(radioDSLR)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMirrorless))
                                    .addComponent(tboxNamaKamera, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19))
                        .addGap(206, 390, Short.MAX_VALUE))))
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addStockPanelLayout.setVerticalGroup(
            addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStockPanelLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tboxNamaKamera, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(radioDSLR)
                    .addComponent(radioMirrorless))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tboxHargaKamera, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tboxTahunKamera, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tboxCountKamera, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddKamera)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        mainPanel.add(addStockPanel, "card4");

        editStockPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout editStockPanelLayout = new javax.swing.GroupLayout(editStockPanel);
        editStockPanel.setLayout(editStockPanelLayout);
        editStockPanelLayout.setHorizontalGroup(
            editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        editStockPanelLayout.setVerticalGroup(
            editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        mainPanel.add(editStockPanel, "card7");

        listStockPanel.setBackground(new java.awt.Color(255, 255, 255));

        tableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Jenis", "Harga", "Tahun", "Sht. Count", "Status"
            }
        ));
        jScrollPane2.setViewportView(tableStock);

        btnEditKamera.setText("Edit");
        btnEditKamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditKameraActionPerformed(evt);
            }
        });

        btnHapusKamera.setText("Hapus");
        btnHapusKamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKameraActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(71, 96, 114));

        jLabel31.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("DAFTAR KAMERA");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap())
        );

        javax.swing.GroupLayout listStockPanelLayout = new javax.swing.GroupLayout(listStockPanel);
        listStockPanel.setLayout(listStockPanelLayout);
        listStockPanelLayout.setHorizontalGroup(
            listStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listStockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(listStockPanelLayout.createSequentialGroup()
                        .addComponent(btnEditKamera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapusKamera)))
                .addContainerGap())
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        listStockPanelLayout.setVerticalGroup(
            listStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listStockPanelLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapusKamera)
                    .addComponent(btnEditKamera))
                .addContainerGap())
        );

        mainPanel.add(listStockPanel, "card5");

        addStockPanelEdit.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel21.setText("Nama");

        tboxNamaKameraEdit.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel22.setText("Jenis");

        tboxHargaKameraEdit.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        jLabel23.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel23.setText("Harga");

        jLabel24.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel24.setText("Tahun Prod.");

        tboxTahunKameraEdit.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("HP Simplified Hans", 0, 14)); // NOI18N
        jLabel25.setText("Shutter Count");

        tboxCountKameraEdit.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N

        buttonGroup1.add(radioDSLREdit);
        radioDSLREdit.setText("DSLR");

        buttonGroup1.add(radioMirrorlessEdit);
        radioMirrorlessEdit.setText("Mirrorless");

        btnAddKameraEdit.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        btnAddKameraEdit.setText("Edit");
        btnAddKameraEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKameraEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addStockPanelEditLayout = new javax.swing.GroupLayout(addStockPanelEdit);
        addStockPanelEdit.setLayout(addStockPanelEditLayout);
        addStockPanelEditLayout.setHorizontalGroup(
            addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStockPanelEditLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStockPanelEditLayout.createSequentialGroup()
                        .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addStockPanelEditLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnAddKameraEdit))
                            .addGroup(addStockPanelEditLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tboxHargaKameraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tboxTahunKameraEdit)
                                        .addComponent(tboxCountKameraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addStockPanelEditLayout.createSequentialGroup()
                                        .addComponent(radioDSLREdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMirrorlessEdit))
                                    .addComponent(tboxNamaKameraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addStockPanelEditLayout.createSequentialGroup()
                        .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel24))
                        .addGap(206, 390, Short.MAX_VALUE))))
        );
        addStockPanelEditLayout.setVerticalGroup(
            addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStockPanelEditLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tboxNamaKameraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(radioDSLREdit)
                    .addComponent(radioMirrorlessEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tboxHargaKameraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tboxTahunKameraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStockPanelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tboxCountKameraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddKameraEdit)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        mainPanel.add(addStockPanelEdit, "card7");

        javax.swing.GroupLayout jKamLayout = new javax.swing.GroupLayout(jKam);
        jKam.setLayout(jKamLayout);
        jKamLayout.setHorizontalGroup(
            jKamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jKamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jKamLayout.setVerticalGroup(
            jKamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jKamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jKamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jKam, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jKam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //method untuk menampilkan data dari database ke tabel order
    private void tampilOrder(){
        int rowCount = tableOrder.getRowCount();
        for(int i=0; i<rowCount; i++){
            modelOrder.removeRow(0);
        }
        try{
            //koneksi
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM list_order");
            while(rs.next()){
                String data[] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)};
                modelOrder.addRow(data);
            }
        }catch(SQLException e){
            Logger.getLogger(FormSewa.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    //method untuk menampilkan data dari database ke tabel stock
    private void tampilStock(){
        int rowCount = tableStock.getRowCount();
        for(int i=0; i<rowCount; i++){
            modelStock.removeRow(0);
        }
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM list_stock");
            while(rs.next()){
                String data[] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)};
                modelStock.addRow(data);
            }
        }catch(SQLException e){
            Logger.getLogger(FormSewa.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    //Method untuk membersihkan form order
    private void clearFieldOrder(){
        tboxNik.setText("");
        tboxNama.setText("");
        tboxAlamat.setText("");
        tboxNotlp.setText("");
        kameraCB.setSelectedIndex(0);
        waktuCB.setSelectedIndex(0);
    }
    
    //Method untuk membersihkan form stock
    private void clearFieldStock(){
        tboxNamaKamera.setText("");
        tboxHargaKamera.setText("");
        tboxTahunKamera.setText("");
        tboxCountKamera.setText("");
        radioGrupJenis.clearSelection();
    }
    
    //Method untuk membersihkan form edit stock
    private void clearFieldStockEdit(){
        tboxNamaKameraEdit.setText("");
        tboxHargaKameraEdit.setText("");
        tboxTahunKameraEdit.setText("");
        tboxCountKameraEdit.setText("");
        buttonGroup1.clearSelection();
    }
    
    //method submit button order
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if(!kameraCB.getSelectedItem().toString().equals("Pilih kamera")&&!waktuCB.getSelectedItem().toString().equals("Pilih waktu")){
            try{
                //mengambil nilai dari form order
                String kamera = kameraCB.getSelectedItem().toString();
                int id = stock.toID(kamera);
                long nik = Long.parseLong(tboxNik.getText());
                String nama = tboxNama.getText();
                String alamat = tboxAlamat.getText();
                String notlp = tboxNotlp.getText();
                String waktu = waktuCB.getSelectedItem().toString(); //berupa string
                String bayar = labelHarga.getText();

                //membuat objek baru dengan mengambil data dari tbox
                order.newOrder(nik, nama, alamat, notlp, id, waktu, bayar);
                
                try{
                    int i=order.getLastIndex(); //mengambil index terakhir
                    //koneksi database
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
                    cn.createStatement().executeUpdate("insert into list_order values"+"('"+order.getOrderID(i)+"','"+order.getOrderNik(i)+"','"+order.getOrderNama(i)+"','"+order.getOrderAlamat(i)+"','"+order.getOrderNotlp(i)+"','"+stock.toNama(order.getOrderIDBarang(i))+"','"+order.getOrderWaktu(i)+"','"+order.getOrderBayar(i)+"')");
                    stock.changeStatus(id, 0); // mengubah status
                    cn.createStatement().executeUpdate("update list_stock set status_stock='"+stock.getStatusByID(id)+"' where id_stock='"+id+"'"); //merubah status barang di database
                    tampilOrder(); //update data pada tabel order
                    tampilStock(); //update data pada tabel stock
                    JOptionPane.showMessageDialog(null,"Data telah ditambahkan!","Success",JOptionPane.INFORMATION_MESSAGE);
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "terjadi kesalahan1!!!");
                }

                try{
                    //koneksi database
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
                    ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM list_stock");
                    
                    kameraCB.removeAllItems();
                    kameraCB.addItem("Pilih kamera");
                    while(rs.next()){
                        String namaKamera = rs.getString(2);
                        String newStatus = rs.getString(7);
                        if(newStatus.equals("Ready")){
                            kameraCB.addItem(namaKamera);
                        }
                    }
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "terjadi kesalahan2!!!");
                }
                
                //membersihkan form order
                clearFieldOrder();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Input tidak valid!","Invalid Input",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Opsi belum dipilih","Invalid Option",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    //method button hapus order
    private void btnHapusOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusOrderActionPerformed
        if(tableOrder.isRowSelected(tableOrder.getSelectedRow())){
            String id = modelOrder.getValueAt(tableOrder.getSelectedRow(), 0).toString(); //mengambil id order dari tabel
            int idInt = Integer.parseInt(id); //mengubah tipe id ke int
            int idBarang = stock.toID(tableOrder.getValueAt(tableOrder.getSelectedRow(), 5).toString()); //mendapatkan id kamera
            
            //konfirmasi hapus
            int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah barang sudah dikembalikan?","Hapus", JOptionPane.YES_NO_OPTION);

            if(dialogResult == 0){
                try{
                    //koneksi database
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
                    PreparedStatement pst = cn.prepareStatement("DELETE FROM list_order WHERE id_order='"+idInt+"'");
                    pst.execute();
                    
                    stock.changeStatus(idBarang, 1); //merubah status
                    cn.createStatement().executeUpdate("update list_stock set status_stock='"+stock.getStatusByID(idBarang)+"' where id_stock='"+idBarang+"'"); //merubah status barang di database
                    order.hapusOrder(idInt); //hapus order
                    //modelOrder.removeRow(tableOrder.getSelectedRow()); //menghapus baris tabel
                    tampilStock(); //refresh tampilan tabel
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "terjadi kesalahan!!!");
                }
                
                try{
                    //koneksi database
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
                    ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM list_stock");
                    
                    kameraCB.removeAllItems(); //menghapus semua item combobox kamera
                    kameraCB.addItem("Pilih kamera");
                    //menambahkan kamera yang ready
                    while(rs.next()){
                        String namaKamera = rs.getString(2);
                        String newStatus = rs.getString(7);
                        if(newStatus.equals("Ready")){
                            kameraCB.addItem(namaKamera);
                        }
                    }
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "terjadi kesalahan!!!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Baris belum dipilih!","Invalid Option",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusOrderActionPerformed

    //method button log out
    private void btnLogOutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseReleased
        int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah anda ingin keluar?","Keluar", JOptionPane.YES_NO_OPTION);
        if(dialogResult == 0){
            new Login().setVisible(true);
            close(); 
        }
    }//GEN-LAST:event_btnLogOutMouseReleased

    //method perubahan waktu ke biaya
    private void waktuCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_waktuCBItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(!waktuCB.getSelectedItem().toString().equals("Pilih waktu")){
                if(waktuCB.getSelectedIndex()==1){
                    labelHarga.setText("Rp."+ Double.toString(stock.pricing(stock.toID(kameraCB.getSelectedItem().toString()), 1.0)));
                }else if(waktuCB.getSelectedIndex()==2){
                    labelHarga.setText("Rp."+ Double.toString(stock.pricing(stock.toID(kameraCB.getSelectedItem().toString()), 2.0)));
                }else if(waktuCB.getSelectedIndex()==3){
                    labelHarga.setText("Rp."+ Double.toString(stock.pricing(stock.toID(kameraCB.getSelectedItem().toString()), 3.0)));
                }else if(waktuCB.getSelectedIndex()==4){
                    labelHarga.setText("Rp."+ Double.toString(stock.pricing(stock.toID(kameraCB.getSelectedItem().toString()), 4.0)));
                }else if(waktuCB.getSelectedIndex()==5){
                    labelHarga.setText("Rp."+ Double.toString(stock.pricing(stock.toID(kameraCB.getSelectedItem().toString()), 5.0)));
                }
            }
        }
    }//GEN-LAST:event_waktuCBItemStateChanged

    private void btnToAddStockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToAddStockMouseReleased

        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // add panel
        mainPanel.add(addStockPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnToAddStockMouseReleased

    private void btnToListStockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToListStockMouseReleased
        
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // add panel
        mainPanel.add(listStockPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnToListStockMouseReleased

    private void btnHapusKameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKameraActionPerformed
        if(tableStock.isRowSelected(tableStock.getSelectedRow())){
            String id = modelStock.getValueAt(tableStock.getSelectedRow(), 0).toString(); //mendapatkan id kamera dari tabel
            int idInt = Integer.parseInt(id); //merubah id kamera ke int
            if(stock.isStatusReady(idInt)==true){
                //konfirmasi
                int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah barang akan dihapus?","Hapus", JOptionPane.YES_NO_OPTION);
                
                if(dialogResult == 0){
                    try{
                        //koneksi database
                        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
                        PreparedStatement pst = cn.prepareStatement("DELETE FROM list_stock WHERE id_stock='"+idInt+"'");
                        pst.execute();
                        
                        stock.hapusStock(idInt); //menghapus barang
                        modelStock.removeRow(tableStock.getSelectedRow()); //menghapus baris tabel
                        //tampilStock?
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(null, "terjadi kesalahan!!!");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null,"Barang tidak tersedia!","Invalid Option",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Baris belum dipilih!","Invalid Option",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusKameraActionPerformed

    //method button tambah kamera
    private void btnAddKameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKameraActionPerformed
        
        if(radioDSLR.isSelected()||radioMirrorless.isSelected()){
            try{
                //mengambil nilai dari form stock
                String namaKamera = tboxNamaKamera.getText();
                String jenisKamera = null;
                if(radioDSLR.isSelected()==true){
                    jenisKamera = "DSLR";
                }else if(radioMirrorless.isSelected()==true){
                    jenisKamera = "Mirrorless";
                }
                int hargaKamera = Integer.parseInt(tboxHargaKamera.getText()); 
                int tahunKamera = Integer.parseInt(tboxTahunKamera.getText());
                int shutterKamera = Integer.parseInt(tboxCountKamera.getText());

                //memasukan nilai ke objek barang yang ada di arraylist stockBarang
                stock.tambahKamera(jenisKamera, namaKamera, hargaKamera, tahunKamera, shutterKamera);
                
                //memasukan ke database
                try{
                    int i=stock.getLastIndex(); //mendapatkan index terakhir
                    //koneksi database
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
                    cn.createStatement().executeUpdate("insert into list_stock values"+"('"+stock.getIDKamera(i)+"','"+stock.getNamaKamera(i)+"','"+stock.getJenisKamera(i)+"','"+stock.getHargaKamera(i)+"','"+stock.getTahunKamera(i)+"','"+stock.getShtCountKamera(i)+"','"+stock.getStatusByIndex(i)+"')");
                    
                    tampilStock(); //refresh tabel stock
                    //notifikasi berhasil
                    JOptionPane.showMessageDialog(null,"Kamera telah ditambahkan!","Success",JOptionPane.INFORMATION_MESSAGE);
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "terjadi kesalahan!!!");
                }
                
                //menambahkan nama kamera ke combobox pada addOrderPanel
                kameraCB.addItem(stock.toNama(stock.idStock-1));

                //membersihkan form
                clearFieldStock();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Input tidak valid!","Invalid Input",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Input tidak valid!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddKameraActionPerformed

    private void btnEditKameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditKameraActionPerformed
        if(tableStock.isRowSelected(tableStock.getSelectedRow())){
            String id = modelStock.getValueAt(tableStock.getSelectedRow(), 0).toString(); //mendapatkan id barang dari tabel
            selectedID = Integer.parseInt(id);

            //memasukan nilai ke tbox stock
            tboxNamaKameraEdit.setText(tableStock.getValueAt(tableStock.getSelectedRow(), 1).toString());
            tboxHargaKameraEdit.setText(tableStock.getValueAt(tableStock.getSelectedRow(), 3).toString());
            tboxTahunKameraEdit.setText(tableStock.getValueAt(tableStock.getSelectedRow(), 4).toString());
            tboxCountKameraEdit.setText(tableStock.getValueAt(tableStock.getSelectedRow(), 5).toString());

            ////mengambil data pada tabel terpilih
            String jenis = tableStock.getValueAt(tableStock.getSelectedRow(), 2).toString();

            //mengubah nilai pada radio button
            if(jenis.equals("DSLR")){
                radioDSLREdit.setSelected(true);
            }else if(jenis.equals("Mirrorless")){
                radioMirrorlessEdit.setSelected(true);
            }

            // remove panel
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();

            // add panel
            mainPanel.add(addStockPanelEdit);
            mainPanel.repaint();
            mainPanel.revalidate();
        }else{
            JOptionPane.showMessageDialog(null,"Baris belum dipilih!","Invalid Option",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditKameraActionPerformed

    private void btnAddKameraEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKameraEditActionPerformed
        if(radioDSLREdit.isSelected()||radioMirrorlessEdit.isSelected()){
            try{
                //mengambil nilai dari form stock
                String namaKamera = tboxNamaKameraEdit.getText();
                String jenisKamera = null;
                if(radioDSLREdit.isSelected()==true){
                    jenisKamera = "DSLR";
                }else if(radioMirrorlessEdit.isSelected()==true){
                    jenisKamera = "Mirrorless";
                }
                String hargaKamera = tboxHargaKameraEdit.getText(); 
                String tahunKamera = tboxTahunKameraEdit.getText();
                String shutterKamera = tboxCountKameraEdit.getText();
                
                try{
                    //int i=stock.getLastIndex();
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_kamera","root","");
                    cn.createStatement().executeUpdate("update list_stock set nama_stock='"+namaKamera+"',jenis_stock ='"+jenisKamera+"',harga_stock ='"+hargaKamera+"',tahun_stock ='"+tahunKamera+"',count_stock ='"+shutterKamera+"' where id_stock='"+selectedID+"'");
                    tampilStock();
                    //notifikasi berhasil
                    JOptionPane.showMessageDialog(null,"Data telah berhasil dirubah!","Success",JOptionPane.INFORMATION_MESSAGE);
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "terjadi kesalahan!!!");
                }
                
                //edit data kamera
                stock.editStock(selectedID, jenisKamera, namaKamera, Integer.parseInt(hargaKamera), Integer.parseInt(tahunKamera),  Integer.parseInt(shutterKamera));

                //membersihkan form
                clearFieldStockEdit();

                // remove panel
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                // add panel
                mainPanel.add(listStockPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Input tidak valid!","Invalid Input",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Input tidak valid!","Invalid Input",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddKameraEditActionPerformed

    private void tboxNotlpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tboxNotlpKeyPressed

        String nomor = tboxNotlp.getText();//mengambil nilai dari textfield
        int length = nomor.length();//mengambil panjang dari input
        char c = evt.getKeyChar();//input per key
        
        //hanya 0-9
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //maksimal 12 karakter
            if(length<12){
                tboxNotlp.setEditable(true);
            }else{
                tboxNotlp.setEditable(false);
            }
        }else{
            //mengizinkan key backspace dan delete jika penuh
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                tboxNotlp.setEditable(true);
            }else{
                tboxNotlp.setEditable(false);
            }
        }
    }//GEN-LAST:event_tboxNotlpKeyPressed

    private void btnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseEntered
        btnLogOut.setBackground(new Color(162,219,250));
    }//GEN-LAST:event_btnLogOutMouseEntered

    private void btnLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseExited
        btnLogOut.setBackground(new Color(84,140,168));
    }//GEN-LAST:event_btnLogOutMouseExited

    private void btnToListStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToListStockMouseEntered
        btnToListStock.setBackground(new Color(162,219,250));
    }//GEN-LAST:event_btnToListStockMouseEntered

    private void btnToListStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToListStockMouseExited
        btnToListStock.setBackground(new Color(84,140,168));
    }//GEN-LAST:event_btnToListStockMouseExited

    private void btnToAddStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToAddStockMouseEntered
        btnToAddStock.setBackground(new Color(162,219,250));
    }//GEN-LAST:event_btnToAddStockMouseEntered

    private void btnToAddStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToAddStockMouseExited
        btnToAddStock.setBackground(new Color(84,140,168));
    }//GEN-LAST:event_btnToAddStockMouseExited

    private void btnLogOut1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut1MouseEntered
        btnLogOut1.setBackground(new Color(162,219,250));
    }//GEN-LAST:event_btnLogOut1MouseEntered

    private void btnLogOut1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut1MouseExited
        btnLogOut1.setBackground(new Color(84,140,168));
    }//GEN-LAST:event_btnLogOut1MouseExited

    private void btnLogOut1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut1MouseReleased
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // add panel
        mainPanel.add(listOrderPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnLogOut1MouseReleased

    private void btnLogOut2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut2MouseEntered
        btnLogOut2.setBackground(new Color(162,219,250));
    }//GEN-LAST:event_btnLogOut2MouseEntered

    private void btnLogOut2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut2MouseExited
        btnLogOut2.setBackground(new Color(84,140,168));
    }//GEN-LAST:event_btnLogOut2MouseExited

    private void btnLogOut2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOut2MouseReleased
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // add panel
        mainPanel.add(addOrderPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnLogOut2MouseReleased

    //method untuk close window
    public void close(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSewa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addOrderPanel;
    private javax.swing.JPanel addStockPanel;
    private javax.swing.JPanel addStockPanelEdit;
    private javax.swing.JButton btnAddKamera;
    private javax.swing.JButton btnAddKameraEdit;
    private javax.swing.JButton btnEditKamera;
    private javax.swing.JButton btnHapusKamera;
    private javax.swing.JButton btnHapusOrder;
    private javax.swing.JPanel btnLogOut;
    private javax.swing.JPanel btnLogOut1;
    private javax.swing.JPanel btnLogOut2;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel btnToAddStock;
    private javax.swing.JPanel btnToListStock;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel editStockPanel;
    private javax.swing.JPanel jKam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> kameraCB;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JPanel listOrderPanel;
    private javax.swing.JPanel listStockPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton radioDSLR;
    private javax.swing.JRadioButton radioDSLREdit;
    private javax.swing.ButtonGroup radioGrupJenis;
    private javax.swing.JRadioButton radioMirrorless;
    private javax.swing.JRadioButton radioMirrorlessEdit;
    private javax.swing.JTable tableOrder;
    private javax.swing.JTable tableStock;
    private javax.swing.JTextField tboxAlamat;
    private javax.swing.JTextField tboxCountKamera;
    private javax.swing.JTextField tboxCountKameraEdit;
    private javax.swing.JTextField tboxHargaKamera;
    private javax.swing.JTextField tboxHargaKameraEdit;
    private javax.swing.JTextField tboxNama;
    private javax.swing.JTextField tboxNamaKamera;
    private javax.swing.JTextField tboxNamaKameraEdit;
    private javax.swing.JTextField tboxNik;
    private javax.swing.JTextField tboxNotlp;
    private javax.swing.JTextField tboxTahunKamera;
    private javax.swing.JTextField tboxTahunKameraEdit;
    private javax.swing.JComboBox<String> waktuCB;
    // End of variables declaration//GEN-END:variables
}
