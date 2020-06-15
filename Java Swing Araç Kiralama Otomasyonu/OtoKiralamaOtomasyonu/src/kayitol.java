import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class kayitol extends javax.swing.JFrame {

    Connection conn = null;
  ResultSet rs=null;
  PreparedStatement pst=null;

    public kayitol() {
        initComponents();
          conn=baglan.ConnecrDb();
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
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
        btn_anasayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/regis.png"))); // NOI18N
        jButton1.setText("Kayit Ol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Kayıt Ol");

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kayıt Bilgileri"));
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

        btn_anasayfa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.png"))); // NOI18N
        btn_anasayfa.setText("Geri Dön");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_anasayfa)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_anasayfa))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
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
            JOptionPane.showMessageDialog(null, "Kayıt Olma İşlemi Başarılı");
           
            temizle();

        }catch( Exception e){
            JOptionPane.showMessageDialog(null, e+"Kayıt Olma İşlemi Başarısız");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sifreActionPerformed

    private void btn_anasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anasayfaActionPerformed
        girisSayfasi kmenu = new girisSayfasi();
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
            java.util.logging.Logger.getLogger(kayitol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kayitol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kayitol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kayitol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayitol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anasayfa;
    private javax.swing.JComboBox combo_cinsiyet;
    private javax.swing.JComboBox combo_gizlisoru;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_tc;
    private javax.swing.JLabel lbl_tc1;
    private javax.swing.JLabel lbl_tc2;
    private javax.swing.JLabel lbl_tc3;
    private javax.swing.JLabel lbl_tc4;
    private javax.swing.JLabel lbl_tc5;
    private javax.swing.JLabel lbl_tc6;
    private javax.swing.JLabel lbl_tc7;
    private javax.swing.JLabel lbl_tc8;
    private javax.swing.JTextField txt_adsoyad;
    private javax.swing.JTextField txt_dogum;
    private javax.swing.JTextField txt_ehliyet;
    private javax.swing.JTextField txt_sifre;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JTextField txt_yanit;
    // End of variables declaration//GEN-END:variables
}
