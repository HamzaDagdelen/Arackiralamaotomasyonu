import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class kiralama extends javax.swing.JFrame {

     Connection conn = null;
  ResultSet rs=null;
  PreparedStatement pst=null;
    int musteri_id=0;
    
    public kiralama() {
        initComponents();
         conn=baglan.ConnecrDb();
         doldurplaka();
        update_table();
        doldurtc();
            this.getContentPane().setBackground(Color.white);
               Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    
    private void temizle(){
    
    txt_atarih.setText("");
    txt_ttarih.setText("");
    txt_gun.setText("");
    txt_ucret.setText("");
    txt_toplam.setText("");
   
    }
    
    
     private void doldurplaka(){
    try{
        
    String sql ="Select * from arac where durum='"+"musait"+"'";
    pst =conn.prepareStatement(sql);
     
    rs=pst.executeQuery();
     while(rs.next()){
     String name =rs.getString("plaka").toString();
     combo_plaka.addItem(name);
     }   
    
     }
   catch(Exception hata){
    
       JOptionPane.showMessageDialog(null, hata);
   }
    }
    
    
    private void doldurtc(){
    try{
        
    String sql ="Select * from musteri";
    pst =conn.prepareStatement(sql);
    rs=pst.executeQuery();
     while(rs.next()){
     String name =rs.getString("tc").toString();
     combo_tc.addItem(name);
     }   
    
     }
   catch(Exception hata){
    
       JOptionPane.showMessageDialog(null, hata);
   }
    }
    
    private void update_table(){
   try{
       String sql ="Select * from kiralama";
       pst =conn.prepareStatement(sql);
   rs=pst.executeQuery();
   arac_tablosu.setModel(DbUtils.resultSetToTableModel(rs));
   pst.close();
   }
   catch(Exception hata){
    
       JOptionPane.showMessageDialog(null, hata);
   }
   }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        Btn_Ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        btn_listele = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        arac_tablosu = new javax.swing.JTable();
        btn_anasayfa = new javax.swing.JButton();
        btn_ara = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_plaka_ara = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_plaka = new javax.swing.JComboBox();
        ucrete_bak = new javax.swing.JLabel();
        txt_gun = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        txt_plaka = new javax.swing.JTextField();
        txt_ttarih = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_atarih = new javax.swing.JTextField();
        combo_tc = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hesapla_lbl = new javax.swing.JLabel();
        txt_toplam = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_ucret = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Kiralama İşlemi");

        pnl1.setBackground(java.awt.Color.white);
        pnl1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menü", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 11))); // NOI18N
        pnl1.setForeground(new java.awt.Color(51, 51, 255));

        Btn_Ekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ekle.png"))); // NOI18N
        Btn_Ekle.setText("Ekle");
        Btn_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EkleActionPerformed(evt);
            }
        });

        btn_sil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sil.png"))); // NOI18N
        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_guncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guncelle.png"))); // NOI18N
        btn_guncelle.setText("Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_temizle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_temizle.setText("Temizle");
        btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temizleActionPerformed(evt);
            }
        });

        btn_listele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/listele.png"))); // NOI18N
        btn_listele.setText("Listele");
        btn_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listeleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Ekle, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guncelle)
                .addGap(18, 18, 18)
                .addComponent(btn_temizle)
                .addGap(18, 18, 18)
                .addComponent(btn_listele)
                .addGap(20, 20, 20))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Ekle)
                    .addComponent(btn_sil)
                    .addComponent(btn_guncelle)
                    .addComponent(btn_temizle)
                    .addComponent(btn_listele))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        arac_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        arac_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arac_tablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(arac_tablosu);

        btn_anasayfa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-icon (1).png"))); // NOI18N
        btn_anasayfa.setText("Anasayfa");
        btn_anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anasayfaActionPerformed(evt);
            }
        });

        btn_ara.setText("Ara");
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });

        jLabel11.setText("Araç Plaka :");

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kiralama Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel1.setText("TC Listesi :");

        jLabel7.setText("Araç Ücreti :");

        jLabel5.setText("Teslim Tarihi :");

        jLabel2.setText("Musait Araç Plakaları :");

        combo_plaka.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_plakaİtemStateChanged(evt);
            }
        });
        combo_plaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_plakaActionPerformed(evt);
            }
        });

        ucrete_bak.setBackground(new java.awt.Color(51, 0, 51));
        ucrete_bak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ucrete_bak.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        ucrete_bak.setText("Ücrete Bak");
        ucrete_bak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucrete_bakMouseClicked(evt);
            }
        });

        txt_gun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gunActionPerformed(evt);
            }
        });

        txt_tc.setEnabled(false);
        txt_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tcActionPerformed(evt);
            }
        });

        txt_plaka.setEnabled(false);
        txt_plaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_plakaActionPerformed(evt);
            }
        });

        txt_ttarih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ttarihActionPerformed(evt);
            }
        });

        jLabel10.setText("Seçili Plaka :");

        txt_atarih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_atarihActionPerformed(evt);
            }
        });

        combo_tc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tcİtemStateChanged(evt);
            }
        });
        combo_tc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_tcMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combo_tcMousePressed(evt);
            }
        });
        combo_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tcActionPerformed(evt);
            }
        });

        jLabel3.setText("Alış Tarihi :");

        jLabel6.setText("Gün Sayısı :");

        hesapla_lbl.setBackground(new java.awt.Color(51, 0, 51));
        hesapla_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hesapla_lbl.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        hesapla_lbl.setText("Hesapla");
        hesapla_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hesapla_lblMouseClicked(evt);
            }
        });

        txt_toplam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_toplamActionPerformed(evt);
            }
        });

        jLabel9.setText("Seçili TC :");

        jLabel8.setText("Toplam Ücret :");

        txt_ucret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ucretActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ttarih)
                            .addComponent(txt_gun)
                            .addComponent(txt_ucret)
                            .addComponent(txt_toplam)
                            .addComponent(txt_atarih)
                            .addComponent(txt_tc)
                            .addComponent(combo_tc, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_plaka, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combo_plaka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(hesapla_lbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(ucrete_bak)
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_plaka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(ucrete_bak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_atarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_ttarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_gun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ucret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hesapla_lbl)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txt_toplam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(196, 196, 196)
                        .addComponent(btn_anasayfa)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txt_plaka_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_ara))
                            .addComponent(pnl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btn_anasayfa))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_plaka_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ara)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EkleActionPerformed

        String sql="insert into kiralama(tc,plaka,alis_tarihi,veris_tarihi,ucret) values(?,?,?,?,?)";
        try{

            pst=conn.prepareStatement(sql);
            pst.setString(1,combo_tc.getSelectedItem().toString());
            pst.setString(2, combo_plaka.getSelectedItem().toString());
            pst.setString(3, txt_atarih.getText());
            pst.setString(4, txt_ttarih.getText());
            pst.setString(5, txt_toplam.getText());
          
            pst.execute();
            JOptionPane.showMessageDialog(null, "Kiralama İşleminiz Başarılı");
            update_table();
            
              sql="update arac set durum=? where plaka=?";
        pst=conn.prepareStatement(sql);
        pst.setString(1,"musaitdegil");
          pst.setString(2,combo_plaka.getSelectedItem().toString());
           
              pst.execute();        
            
            temizle();
             int itemCount = combo_plaka.getItemCount();

    for(int i=0;i<itemCount;i++){
        combo_plaka.removeItemAt(0);
        
     }
        doldurplaka();
        }catch( Exception e){
            JOptionPane.showMessageDialog(null, e+" Kiralama Başarısız");
        }

    }//GEN-LAST:event_Btn_EkleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        try{
            String sql="delete from kiralama where id =?";
            pst=conn.prepareStatement(sql);

            pst.setString(1, String.valueOf(musteri_id));

            pst.execute();
            JOptionPane.showMessageDialog(null, "Silme İşlemi Başarılı");
            temizle();
            update_table();

        } catch(Exception hata){

            JOptionPane.showMessageDialog(null, hata);

        }

    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed

        String sql="update kiralama set tc=?,plaka=?,alis_tarihi=?,veris_tarihi=?,ucret=? where id=?";
        try{

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_tc.getText());
            pst.setString(2,txt_plaka.getText() );
            pst.setString(3, txt_atarih.getText());
            pst.setString(4, txt_ttarih.getText());
            pst.setString(5, txt_toplam.getText());
            pst.setString(6, String.valueOf(musteri_id));
          
            pst.execute();
            JOptionPane.showMessageDialog(null, "Güncelleme İşleminiz Başarılı");
            update_table();
            temizle();

        }catch( Exception e){
            JOptionPane.showMessageDialog(null, e+" Güncelleme Başarısız");
        }

    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
       temizle();
    }//GEN-LAST:event_btn_temizleActionPerformed

    private void btn_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeleActionPerformed
      update_table();
    }//GEN-LAST:event_btn_listeleActionPerformed

    private void txt_atarihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_atarihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_atarihActionPerformed

    private void txt_ttarihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ttarihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ttarihActionPerformed

    private void txt_gunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gunActionPerformed

    private void txt_ucretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ucretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ucretActionPerformed

    private void txt_toplamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_toplamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_toplamActionPerformed

    private void combo_plakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_plakaActionPerformed
   
        
    }//GEN-LAST:event_combo_plakaActionPerformed

    private void ucrete_bakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucrete_bakMouseClicked
     
        
         try{
        
    String sql ="Select * from arac where plaka='"+combo_plaka.getSelectedItem()+"'";
    pst =conn.prepareStatement(sql);
     
    rs=pst.executeQuery();
     if(rs.next()){
    
     txt_ucret.setText(rs.getString("ucret"));
     }   
    
     }
   catch(Exception hata){
    
       JOptionPane.showMessageDialog(null, hata);
   }
        
    }//GEN-LAST:event_ucrete_bakMouseClicked

    private void hesapla_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hesapla_lblMouseClicked
        
        int toplam = Integer.parseInt(txt_gun.getText())*Integer.parseInt(txt_ucret.getText()) ;
        txt_toplam.setText(String.valueOf(toplam));
        
    }//GEN-LAST:event_hesapla_lblMouseClicked

    private void arac_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arac_tablosuMouseClicked
   
               
  try{
        
            
         int row = arac_tablosu.getSelectedRow();
         String Table_click=(arac_tablosu.getModel().getValueAt(row, 0).toString());
         String sql ="select * from kiralama where id ='"+Table_click+"'";
            pst =conn.prepareStatement(sql);
   rs=pst.executeQuery();
      if (rs.next()) {
          
          txt_tc.setText(rs.getString("tc"));
          txt_plaka.setText(rs.getString("plaka"));
          txt_atarih.setText(rs.getString("alis_tarihi"));
          txt_ttarih.setText(rs.getString("veris_tarihi"));
          txt_toplam.setText(rs.getString("ucret"));
       
          musteri_id=Integer.parseInt( rs.getString("id"));
          
      }
            
            
        }
        catch(Exception hata){
            
         JOptionPane.showMessageDialog(null, hata);
            
        }
       
    }//GEN-LAST:event_arac_tablosuMouseClicked

    private void txt_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tcActionPerformed

    private void txt_plakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_plakaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_plakaActionPerformed

    private void combo_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tcActionPerformed
      
    }//GEN-LAST:event_combo_tcActionPerformed

    private void combo_tcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tcMouseClicked
   
    }//GEN-LAST:event_combo_tcMouseClicked

    private void combo_tcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tcMousePressed
             
    }//GEN-LAST:event_combo_tcMousePressed

    private void btn_anasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anasayfaActionPerformed
    kullanicimenu kmenu = new kullanicimenu();
    kmenu.show();
        this.hide();
    }//GEN-LAST:event_btn_anasayfaActionPerformed

    private void combo_tcİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tcİtemStateChanged
   txt_tc.setText(combo_tc.getSelectedItem().toString());
    }//GEN-LAST:event_combo_tcİtemStateChanged

    private void combo_plakaİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_plakaİtemStateChanged
       txt_plaka.setText(combo_plaka.getSelectedItem().toString());
    }//GEN-LAST:event_combo_plakaİtemStateChanged

    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_araActionPerformed

        try{
            String sql ="Select * from kiralama where plaka='"+txt_plaka_ara.getText()+"'";
            pst =conn.prepareStatement(sql);
            rs=pst.executeQuery();
            arac_tablosu.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        }
        catch(Exception hata){

            JOptionPane.showMessageDialog(null, hata);
        }

    }//GEN-LAST:event_btn_araActionPerformed

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
            java.util.logging.Logger.getLogger(kiralama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kiralama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kiralama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kiralama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kiralama().setVisible(true);
                
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ekle;
    private javax.swing.JTable arac_tablosu;
    private javax.swing.JButton btn_anasayfa;
    private javax.swing.JButton btn_ara;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_listele;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_temizle;
    private javax.swing.JComboBox combo_plaka;
    private javax.swing.JComboBox combo_tc;
    private javax.swing.JLabel hesapla_lbl;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnl1;
    private javax.swing.JTextField txt_atarih;
    private javax.swing.JTextField txt_gun;
    private javax.swing.JTextField txt_plaka;
    private javax.swing.JTextField txt_plaka_ara;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_toplam;
    private javax.swing.JTextField txt_ttarih;
    private javax.swing.JTextField txt_ucret;
    private javax.swing.JLabel ucrete_bak;
    // End of variables declaration//GEN-END:variables
}
