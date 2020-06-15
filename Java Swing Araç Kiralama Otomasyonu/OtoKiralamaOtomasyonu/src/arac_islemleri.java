import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class arac_islemleri extends javax.swing.JFrame {

   Connection conn = null;
  ResultSet rs=null;
  PreparedStatement pst=null;
    int arac_id=0;
    
  
    public arac_islemleri() {
        initComponents();
         conn=baglan.ConnecrDb();
      update_table();
          this.getContentPane().setBackground(Color.white);
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    private void temizle(){
    
    txt_Plaka.setText("");
    txt_Marka.setText("");
    txt_Model.setText("");
    txt_aractipi.setText("");
    txt_renk.setText("");
    txt_yil.setText("");
    txt_ucret.setText("");
    }
    
    private void update_table(){
   try{
       String sql ="Select * from arac";
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
        jScrollPane2 = new javax.swing.JScrollPane();
        arac_tablosu = new javax.swing.JTable();
        lbl_kapat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_plaka_ara = new javax.swing.JTextField();
        btn_ara = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        txt_ucret = new javax.swing.JTextField();
        txt_yil = new javax.swing.JTextField();
        txt_renk = new javax.swing.JTextField();
        txt_Plaka = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_aractipi = new javax.swing.JTextField();
        txt_Model = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo_renk = new javax.swing.JComboBox();
        txt_Marka = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        Btn_Ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        btn_listele = new javax.swing.JButton();
        denemebtn = new javax.swing.JButton();
        btn_anasayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Araç İşlemleri");

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

        lbl_kapat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_kapat.setForeground(new java.awt.Color(255, 0, 51));
        lbl_kapat.setText("X");
        lbl_kapat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_kapatMouseClicked(evt);
            }
        });

        jLabel1.setText("Araç Plaka :");

        btn_ara.setText("Ara");
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });

        panel2.setBackground(java.awt.Color.white);
        panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_ucret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ucretActionPerformed(evt);
            }
        });

        txt_yil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yilActionPerformed(evt);
            }
        });

        txt_renk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_renkActionPerformed(evt);
            }
        });

        txt_Plaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PlakaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Yıl :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Ücret :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Model :");

        txt_aractipi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aractipiActionPerformed(evt);
            }
        });

        txt_Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ModelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Plaka :");

        combo_renk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Renk Sec", "Beyaz", "Gri", "Siyah", "Mavi", "Mor", "Sarı", "Turuncu", "Kırmızı", "Yeşil", "Pempe" }));
        combo_renk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_renkActionPerformed(evt);
            }
        });

        txt_Marka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MarkaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Araç Tipi :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Marka :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Renk :");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Model)
                            .addComponent(txt_aractipi)
                            .addComponent(txt_yil)
                            .addComponent(txt_ucret)
                            .addComponent(txt_renk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Marka, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(combo_renk, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_aractipi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combo_renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txt_yil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_ucret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

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
                .addComponent(Btn_Ekle)
                .addGap(3, 3, 3)
                .addComponent(btn_sil)
                .addGap(4, 4, 4)
                .addComponent(btn_guncelle)
                .addGap(18, 18, 18)
                .addComponent(btn_temizle)
                .addGap(19, 19, 19)
                .addComponent(btn_listele)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap())
        );

        denemebtn.setText("nedensilnimiyorum");

        btn_anasayfa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-icon (1).png"))); // NOI18N
        btn_anasayfa.setText("Anasayfa");
        btn_anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anasayfaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_plaka_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_ara)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(232, 232, 232)
                        .addComponent(btn_anasayfa))
                    .addComponent(lbl_kapat, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_anasayfa)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_kapat)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_plaka_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ara)
                            .addComponent(jLabel1))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_aractipiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aractipiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aractipiActionPerformed

    private void txt_yilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yilActionPerformed

    private void txt_MarkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MarkaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MarkaActionPerformed

    private void txt_PlakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PlakaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PlakaActionPerformed

    private void Btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EkleActionPerformed
       
        String sql="insert into arac(plaka,marka,model,arac_tipi,renk,yil,resim,durum,ucret) values(?,?,?,?,?,?,?,?,?)";
       try{
        
        pst=conn.prepareStatement(sql);
        pst.setString(1,txt_Plaka.getText());
         pst.setString(2,txt_Marka.getText() );
          pst.setString(3, txt_Model.getText());
           pst.setString(4, txt_aractipi.getText());
            pst.setString(5, txt_renk.getText());
             pst.setString(6, txt_yil.getText());
              pst.setString(7, "resimyok.jpg");
               pst.setString(8, "musait");
                pst.setString(9, txt_ucret.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Ekleme İşleminiz Başarılı");
               update_table();
               temizle();
        
       }catch( Exception e){
           JOptionPane.showMessageDialog(null, e+"Araç Ekleme Başarısız");
       }
     
        
        
    }//GEN-LAST:event_Btn_EkleActionPerformed

    private void txt_ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ModelActionPerformed

    private void txt_ucretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ucretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ucretActionPerformed

    private void arac_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arac_tablosuMouseClicked

        
  try{
        
            
         int row = arac_tablosu.getSelectedRow();
         String Table_click=(arac_tablosu.getModel().getValueAt(row, 0).toString());
         String sql ="select * from arac where id ='"+Table_click+"'";
            pst =conn.prepareStatement(sql);
   rs=pst.executeQuery();
      if (rs.next()) {
          
          txt_Marka.setText(rs.getString("marka"));
          txt_Plaka.setText(rs.getString("plaka"));
          txt_Model.setText(rs.getString("model"));
          txt_aractipi.setText(rs.getString("arac_tipi"));
          txt_renk.setText(rs.getString("renk"));
          txt_yil.setText(rs.getString("yil"));
          txt_ucret.setText(rs.getString("ucret"));
          arac_id=Integer.parseInt( rs.getString("id"));
          
      }
            
            
        }
        catch(Exception hata){
            
         JOptionPane.showMessageDialog(null, hata);
            
        }
        
    }//GEN-LAST:event_arac_tablosuMouseClicked

    private void combo_renkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_renkActionPerformed
        txt_renk.setText(combo_renk.getSelectedItem().toString());
    }//GEN-LAST:event_combo_renkActionPerformed

    private void txt_renkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_renkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_renkActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        try{
        String sql="delete from arac where id =?";
        pst=conn.prepareStatement(sql);
        
        pst.setString(1, String.valueOf(arac_id));
        
        pst.execute();
        JOptionPane.showMessageDialog(null, "Silme İşlemi Başarılı");
        temizle();
        update_table();
            
            
        } catch(Exception hata){
            
         JOptionPane.showMessageDialog(null, hata);
            
        }
        
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
    
        
        String sql="update arac set plaka=?,marka=?,model=?,arac_tipi=?,renk=?,yil=?,ucret=? where id=?";
       try{
        
        pst=conn.prepareStatement(sql);
        pst.setString(1,txt_Plaka.getText());
         pst.setString(2,txt_Marka.getText() );
          pst.setString(3, txt_Model.getText());
           pst.setString(4, txt_aractipi.getText());
            pst.setString(5, txt_renk.getText());
             pst.setString(6, txt_yil.getText());
                pst.setString(7, txt_ucret.getText());
                pst.setString(8, String.valueOf(arac_id));
                pst.execute();
                JOptionPane.showMessageDialog(null, "Güncelleme İşleminiz Başarılı");
               update_table();
               temizle();
        
       }catch( Exception e){
           JOptionPane.showMessageDialog(null, e+"Araç Güncelleme Başarısız");
       }
        
        
        
    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void lbl_kapatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_kapatMouseClicked
        this.hide();
    }//GEN-LAST:event_lbl_kapatMouseClicked

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
      temizle();
    }//GEN-LAST:event_btn_temizleActionPerformed

    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_araActionPerformed
       
        
         try{
       String sql ="Select * from arac where plaka='"+txt_plaka_ara.getText()+"'";
       pst =conn.prepareStatement(sql);
   rs=pst.executeQuery();
   arac_tablosu.setModel(DbUtils.resultSetToTableModel(rs));
   pst.close();
   }
   catch(Exception hata){
    
       JOptionPane.showMessageDialog(null, hata);
   }
        
        
    }//GEN-LAST:event_btn_araActionPerformed

    private void btn_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeleActionPerformed
       update_table();
    }//GEN-LAST:event_btn_listeleActionPerformed

    private void btn_anasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anasayfaActionPerformed
        kullanicimenu kmenu = new kullanicimenu();
        kmenu.show();
        this.hide();
    }//GEN-LAST:event_btn_anasayfaActionPerformed

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
            java.util.logging.Logger.getLogger(arac_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arac_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arac_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arac_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arac_islemleri().setVisible(true);
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
    private javax.swing.JComboBox combo_renk;
    private javax.swing.JButton denemebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_kapat;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel pnl1;
    private javax.swing.JTextField txt_Marka;
    private javax.swing.JTextField txt_Model;
    private javax.swing.JTextField txt_Plaka;
    private javax.swing.JTextField txt_aractipi;
    private javax.swing.JTextField txt_plaka_ara;
    private javax.swing.JTextField txt_renk;
    private javax.swing.JTextField txt_ucret;
    private javax.swing.JTextField txt_yil;
    // End of variables declaration//GEN-END:variables
}
