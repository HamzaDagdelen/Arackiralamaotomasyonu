import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class musteri_islemleri extends javax.swing.JFrame {

   
   Connection conn = null;
  ResultSet rs=null;
  PreparedStatement pst=null;
    int musteri_id=0;
    
    public musteri_islemleri() {
        initComponents();
         conn=baglan.ConnecrDb();
      update_table();
          this.getContentPane().setBackground(Color.white);
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

     private void temizle(){
    
    txt_tc.setText("");
    txt_adsoyad.setText("");
    txt_tel.setText("");
    txt_dogum.setText("");
    txt_ehliyet.setText("");
    txt_sifre.setText("");
    txt_yanit.setText("");
    }
    
     private void update_table(){
   try{
       String sql ="Select * from musteri";
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

        jPanel1 = new javax.swing.JPanel();
        lbl_tc5 = new javax.swing.JLabel();
        txt_yanit = new javax.swing.JTextField();
        txt_adsoyad = new javax.swing.JTextField();
        txt_ehliyet = new javax.swing.JTextField();
        lbl_tc = new javax.swing.JLabel();
        lbl_tc6 = new javax.swing.JLabel();
        txt_sifre = new javax.swing.JTextField();
        combo_cinsiyet = new javax.swing.JComboBox();
        lbl_tc4 = new javax.swing.JLabel();
        lbl_tc2 = new javax.swing.JLabel();
        lbl_tc7 = new javax.swing.JLabel();
        combo_gizlisoru = new javax.swing.JComboBox();
        lbl_tc8 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        lbl_tc3 = new javax.swing.JLabel();
        txt_dogum = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        lbl_tc1 = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        Btn_Ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        btn_listele = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        arac_tablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_tc_ara = new javax.swing.JTextField();
        btn_ara = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_anasayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Bilgileri"));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        lbl_tc5.setText("Ehliyet No:");

        lbl_tc.setText("TC :");

        lbl_tc6.setText("Şifre :");

        txt_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sifreActionPerformed(evt);
            }
        });

        combo_cinsiyet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cinsiyet Seç", "Erkek", "Kadın" }));

        lbl_tc4.setText("Doğum Tarihi :");

        lbl_tc2.setText("Cinsiyet :");

        lbl_tc7.setText("Gizli Soru :");

        combo_gizlisoru.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gizli Soru Seç", "Annenizin kızlık soyadı nedir?", "İlk evcil hayvanınızın adı nedir?", "İlk aracınızın modeli nedir?", "Hangi şehirde doğdunuz?", "Babanızın ortanca ismi nedir?", "Çocukluk lakabınız nedir?" }));

        lbl_tc8.setText("Yanıtı :");

        lbl_tc3.setText("Telefon :");

        lbl_tc1.setText("Adı Soyadı :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_tc8)
                    .addComponent(lbl_tc7)
                    .addComponent(lbl_tc6)
                    .addComponent(lbl_tc5)
                    .addComponent(lbl_tc4)
                    .addComponent(lbl_tc3)
                    .addComponent(lbl_tc2)
                    .addComponent(lbl_tc1)
                    .addComponent(lbl_tc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_adsoyad)
                    .addComponent(combo_cinsiyet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_tel)
                    .addComponent(txt_dogum)
                    .addComponent(txt_ehliyet)
                    .addComponent(txt_sifre)
                    .addComponent(combo_gizlisoru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_tc)
                    .addComponent(txt_yanit, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tc))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tc1)
                    .addComponent(txt_adsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tc2)
                    .addComponent(combo_cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tc3)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tc4)
                    .addComponent(txt_dogum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ehliyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tc5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tc6)
                    .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tc7)
                    .addComponent(combo_gizlisoru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tc8)
                    .addComponent(txt_yanit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addComponent(Btn_Ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_temizle)
                .addGap(18, 18, 18)
                .addComponent(btn_listele)
                .addContainerGap())
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

        arac_tablosu.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
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

        jLabel1.setText("TC:");

        btn_ara.setText("Ara");
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Müşteri İşlemleri");

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
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(txt_tc_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ara))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(317, 317, 317)
                        .addComponent(btn_anasayfa)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_anasayfa))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_tc_ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_ara)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sifreActionPerformed

    private void Btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EkleActionPerformed

        String sql="insert into musteri(tc,adi_soyadi,cinsiyet,telefon,dogum_tarihi,ehliyet_no,sifre,gizli_soru,yaniti) values(?,?,?,?,?,?,?,?,?)";
        try{

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_tc.getText());
            pst.setString(2,txt_adsoyad.getText() );
            pst.setString(3, combo_cinsiyet.getSelectedItem().toString());
            pst.setString(4, txt_tel.getText());
            pst.setString(5, txt_dogum.getText());
            pst.setString(6, txt_ehliyet.getText());
            pst.setString(7, txt_sifre.getText());
            pst.setString(8, combo_gizlisoru.getSelectedItem().toString());
            pst.setString(9, txt_yanit.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Müşteri Ekleme İşleminiz Başarılı");
            update_table();
            temizle();

        }catch( Exception e){
            JOptionPane.showMessageDialog(null, e+"Müşteri Ekleme Başarısız");
        }

    }//GEN-LAST:event_Btn_EkleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        try{
            String sql="delete from musteri where id =?";
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

        String sql="update musteri set tc=?,adi_soyadi=?,cinsiyet=?,telefon=?,dogum_tarihi=?,ehliyet_no=?,sifre=?,gizli_soru=?,yaniti=? where id=?";
        try{

           pst=conn.prepareStatement(sql);
            pst.setString(1,txt_tc.getText());
            pst.setString(2,txt_adsoyad.getText() );
            pst.setString(3, combo_cinsiyet.getSelectedItem().toString());
            pst.setString(4, txt_tel.getText());
            pst.setString(5, txt_dogum.getText());
            pst.setString(6, txt_ehliyet.getText());
            pst.setString(7, txt_sifre.getText());
              pst.setString(8,combo_gizlisoru.getSelectedItem().toString());
            pst.setString(9, txt_yanit.getText());
            pst.setString(10, String.valueOf(musteri_id));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Güncelleme İşleminiz Başarılı");
            update_table();
            temizle();

        }catch( Exception e){
            JOptionPane.showMessageDialog(null, e+"Müşteri Güncelleme Başarısız");
        }

    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
        temizle();
    }//GEN-LAST:event_btn_temizleActionPerformed

    private void btn_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeleActionPerformed
        update_table();
    }//GEN-LAST:event_btn_listeleActionPerformed

    private void arac_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arac_tablosuMouseClicked

        try{

            int row = arac_tablosu.getSelectedRow();
            String Table_click=(arac_tablosu.getModel().getValueAt(row, 0).toString());
            String sql ="select * from musteri where id ='"+Table_click+"'";
            pst =conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if (rs.next()) {

               txt_tc.setText(rs.getString("tc"));
                txt_adsoyad.setText(rs.getString("adi_soyadi"));
            
                txt_dogum.setText(rs.getString("dogum_tarihi"));
                txt_ehliyet.setText(rs.getString("ehliyet_no"));
                txt_tel.setText(rs.getString("telefon"));
                txt_sifre.setText(rs.getString("sifre"));
           
                txt_yanit.setText(rs.getString("yaniti"));
                musteri_id=Integer.parseInt( rs.getString("id"));

            }

        }
        catch(Exception hata){

            JOptionPane.showMessageDialog(null, hata);

        }

    }//GEN-LAST:event_arac_tablosuMouseClicked

    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_araActionPerformed

        try{
            String sql ="Select * from musteri where tc='"+txt_tc_ara.getText()+"'";
            pst =conn.prepareStatement(sql);
            rs=pst.executeQuery();
            arac_tablosu.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        }
        catch(Exception hata){

            JOptionPane.showMessageDialog(null, hata);
        }

    }//GEN-LAST:event_btn_araActionPerformed

    private void btn_anasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anasayfaActionPerformed
        kullanicimenu km = new kullanicimenu();
        km.show();
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
            java.util.logging.Logger.getLogger(musteri_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musteri_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musteri_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musteri_islemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteri_islemleri().setVisible(true);
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
    private javax.swing.JComboBox combo_cinsiyet;
    private javax.swing.JComboBox combo_gizlisoru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_tc;
    private javax.swing.JLabel lbl_tc1;
    private javax.swing.JLabel lbl_tc2;
    private javax.swing.JLabel lbl_tc3;
    private javax.swing.JLabel lbl_tc4;
    private javax.swing.JLabel lbl_tc5;
    private javax.swing.JLabel lbl_tc6;
    private javax.swing.JLabel lbl_tc7;
    private javax.swing.JLabel lbl_tc8;
    private javax.swing.JPanel pnl1;
    private javax.swing.JTextField txt_adsoyad;
    private javax.swing.JTextField txt_dogum;
    private javax.swing.JTextField txt_ehliyet;
    private javax.swing.JTextField txt_sifre;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_tc_ara;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_yanit;
    // End of variables declaration//GEN-END:variables
}
