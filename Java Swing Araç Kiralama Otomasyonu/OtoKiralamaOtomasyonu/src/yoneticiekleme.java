import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class yoneticiekleme extends javax.swing.JFrame {
  Connection conn = null;
  ResultSet rs=null;
  PreparedStatement pst=null;
    int yonetici_id=0;
    public yoneticiekleme() {
        initComponents();
         conn=baglan.ConnecrDb();
      update_table();
          this.getContentPane().setBackground(Color.white);
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

 
    private void temizle(){
    
    txt_k_adi.setText("");
    txt_sifre.setText("");
   
    }
    
    private void update_table(){
   try{
       String sql ="Select * from admin";
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
        pnl1 = new javax.swing.JPanel();
        Btn_Ekle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        btn_listele = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_sifre = new javax.swing.JTextField();
        txt_k_adi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_ktur = new javax.swing.JTextField();
        btn_anasayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Yönetici İşlemleri");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guncelle)
                .addGap(18, 18, 18)
                .addComponent(btn_temizle)
                .addGap(18, 18, 18)
                .addComponent(btn_listele)
                .addGap(84, 84, 84))
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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Kullanıcı Türü :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Şifre :");

        txt_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sifreActionPerformed(evt);
            }
        });

        txt_k_adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_k_adiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Kullanıcı Adı :");

        txt_ktur.setText("admin");
        txt_ktur.setEnabled(false);
        txt_ktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kturActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_k_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ktur, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_k_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_ktur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

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
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(116, 116, 116)
                        .addComponent(btn_anasayfa))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_anasayfa))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_k_adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_k_adiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_k_adiActionPerformed

    private void txt_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sifreActionPerformed

    private void arac_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arac_tablosuMouseClicked

        try{

            int row = arac_tablosu.getSelectedRow();
            String Table_click=(arac_tablosu.getModel().getValueAt(row, 0).toString());
            String sql ="select * from admin where id ='"+Table_click+"'";
            pst =conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if (rs.next()) {

                txt_k_adi.setText(rs.getString("k_adi"));
                txt_sifre.setText(rs.getString("sifre"));
              
                yonetici_id=Integer.parseInt( rs.getString("id"));

            }

        }
        catch(Exception hata){

            JOptionPane.showMessageDialog(null, hata);

        }

    }//GEN-LAST:event_arac_tablosuMouseClicked

    private void txt_kturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kturActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kturActionPerformed

    private void Btn_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EkleActionPerformed

        String sql="insert into admin(k_adi,sifre,k_turu) values(?,?,?)";
        try{

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_k_adi.getText());
            pst.setString(2,txt_sifre.getText() );
            pst.setString(3,"Admin");
           
            pst.execute();
            JOptionPane.showMessageDialog(null, "Admin Ekleme İşleminiz Başarılı");
            update_table();
            temizle();

        }catch( Exception e){
            JOptionPane.showMessageDialog(null, e+"Admin Ekleme Başarısız");
        }

    }//GEN-LAST:event_Btn_EkleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        try{
            String sql="delete from admin where id =?";
            pst=conn.prepareStatement(sql);

            pst.setString(1, String.valueOf(yonetici_id));

            pst.execute();
            JOptionPane.showMessageDialog(null, "Silme İşlemi Başarılı");
            temizle();
            update_table();

        } catch(Exception hata){

            JOptionPane.showMessageDialog(null, hata);

        }

    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed

        String sql="update admin set k_adi=?,sifre=? where id=?";
        try{

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_k_adi.getText());
            pst.setString(2,txt_sifre.getText() );
           
            pst.setString(3, String.valueOf(yonetici_id));
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
            java.util.logging.Logger.getLogger(yoneticiekleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yoneticiekleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yoneticiekleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yoneticiekleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yoneticiekleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ekle;
    private javax.swing.JTable arac_tablosu;
    private javax.swing.JButton btn_anasayfa;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_listele;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_temizle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnl1;
    private javax.swing.JTextField txt_k_adi;
    private javax.swing.JTextField txt_ktur;
    private javax.swing.JTextField txt_sifre;
    // End of variables declaration//GEN-END:variables
}
