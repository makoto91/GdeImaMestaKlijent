/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import domen.Post;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import model.Kontroler;
import model.sesija.Sesija;
import table.model.TableModelPostovi;
import util.Akcija;
import util.TransferKlasa;

/**
 *
 * @author Matija1
 */
public class UlogovanKorisnik extends javax.swing.JFrame {

    /**
     * Creates new form UlogovanKorisnik
     */
    List<Post> listaPostova;
    TableModelPostovi tmp;
    public UlogovanKorisnik() {
        initComponents();
        srediFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPostovi = new javax.swing.JTable();
        jtxtFilter = new javax.swing.JTextField();
        jcmbKriterijum = new javax.swing.JComboBox();
        jbtnAdminStrana = new javax.swing.JButton();
        jbtnNazad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblPostovi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblPostovi);

        jtxtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtFilterKeyReleased(evt);
            }
        });

        jcmbKriterijum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lokal", "Stolovi za dvoje", "Stolovi za cetvoro", "Separei", "Status", "Adresa", "Grad" }));
        jcmbKriterijum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbKriterijumActionPerformed(evt);
            }
        });

        jbtnAdminStrana.setText("Admin strana");
        jbtnAdminStrana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdminStranaActionPerformed(evt);
            }
        });

        jbtnNazad.setText("Nazad");
        jbtnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNazadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jcmbKriterijum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnAdminStrana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnNazad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbtnAdminStrana)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcmbKriterijum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnNazad))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFilterKeyReleased
        String polje = jcmbKriterijum.getSelectedItem().toString();
        String filter = jtxtFilter.getText().toLowerCase();
        
//        napuniListu();
        List<Post> listTemp = new ArrayList<>();
        for (int i = 0; i < listaPostova.size(); i++) {
            listTemp.add(i, listaPostova.get(i));
            
        }
        switch (polje) {
            case "Lokal":
                for (int i = listaPostova.size() - 1; i >= 0; i--) {
                    if (!listaPostova.get(i).getLokal().getNaziv().toLowerCase().contains(filter)) {
                        listTemp.remove(i);
                    }
                }
                break;
            case "Stolovi za dvoje":
                for (int i = listaPostova.size() - 1; i >= 0; i--) {
                    if (!(listaPostova.get(i).getStoloviZaDvoje()+"").toLowerCase().contains(filter)) {
                        listTemp.remove(i);
                    }
                }
                break;
            case "Stolovi za cetvoro":
                for (int i = listaPostova.size() - 1; i >= 0; i--) {
                    if (!(listaPostova.get(i).getStoloviZaCetvoro()+"").toLowerCase().contains(filter)) {
                        listTemp.remove(i);
                    }
                }
                break;
            case "Separei":
                for (int i = listaPostova.size() - 1; i >= 0; i--) {
                    if (!(listaPostova.get(i).getSepare()+"").toLowerCase().contains(filter)) {
                        listTemp.remove(i);
                    }
                }
                break;

            case "Status":
                for (int i = listaPostova.size() - 1; i >= 0; i--) {
                    if (!listaPostova.get(i).getPrateciTekst().toLowerCase().contains(filter)) {
                        listTemp.remove(i);
                    }
                }
                break;
            case "Adresa":
                for (int i = listaPostova.size() - 1; i >= 0; i--) {
                    if (!listaPostova.get(i).getLokal().getAdresa().toLowerCase().contains(filter)) {
                        listTemp.remove(i);
                    }
                }
                break;  
            case "Grad":
                for (int i = listaPostova.size() - 1; i >= 0; i--) {
                    if (!listaPostova.get(i).getLokal().getMesto().getNaziv().toLowerCase().contains(filter)) {
                        listTemp.remove(i);
                    }
                }
                break;       
        }

        tmp.setListaPostova(listTemp);
//        jtblPostovi.setModel(tmp);
//        srediTabelu(listaAviona);
//        JOptionPane.showMessageDialog(this, "Sistem je nasao postove po zadatoj vrednosti", "Poruka", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jtxtFilterKeyReleased

    private void jcmbKriterijumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbKriterijumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbKriterijumActionPerformed

    private void jbtnAdminStranaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdminStranaActionPerformed
        try {
            Kontroler.getINSTANCE().staviUMapu("ulogovanKorisnik", this);
        } catch (Exception ex) {
            Logger.getLogger(UlogovanKorisnik.class.getName()).log(Level.SEVERE, null, ex);
        }
        AdminForma af = new AdminForma();
        af.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jbtnAdminStranaActionPerformed

    private void jbtnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNazadActionPerformed
        try {
            Korisnik k = (Korisnik) Kontroler.getINSTANCE().vratiIzMape("korisnik");
            Kontroler.getINSTANCE().izlogujSe(k.getEmail(), "korisnici");
        } catch (Exception ex) {
            Logger.getLogger(UlogovanLokal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Glavna g = new Glavna();
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnNazadActionPerformed

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
            java.util.logging.Logger.getLogger(UlogovanKorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UlogovanKorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UlogovanKorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UlogovanKorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UlogovanKorisnik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdminStrana;
    private javax.swing.JButton jbtnNazad;
    private javax.swing.JComboBox jcmbKriterijum;
    private javax.swing.JTable jtblPostovi;
    private javax.swing.JTextField jtxtFilter;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        try {
            setTitle("Najnovije informacije o slobodnim mestima");
            Korisnik k = (Korisnik)Kontroler.getINSTANCE().vratiIzMape("korisnik");
            if(k.getUloga() == 1){
                jbtnAdminStrana.setVisible(false);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ups", "Something went wrong", JOptionPane.ERROR_MESSAGE);
        }
        
        
        napuniListu();
//        List<Post> listaPostova = new ArrayList<Post>();
        
        
        
        tmp = new TableModelPostovi(listaPostova);
        
        jtblPostovi.setModel(tmp);
        jtblPostovi.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        resizeColumnWidth(jtblPostovi);
        jtblPostovi.setRowHeight(55);
    }
    
     public static void resizeColumnWidth(JTable table) {
    final TableColumnModel columnModel = table.getColumnModel();
    for (int column = 0; column < table.getColumnCount(); column++) {
        int width = 50; // Min width
        for (int row = 0; row < table.getRowCount(); row++) {
            TableCellRenderer renderer = table.getCellRenderer(row, column);
            Component comp = table.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width, width);
        }
        columnModel.getColumn(column).setPreferredWidth(width);
    }
}

    private void napuniListu() {
        try {
            TransferKlasa zahtev = new TransferKlasa();
            zahtev.setOperacija(Akcija.VRATI_SVE_POSTOVE);
            Kontroler.getINSTANCE().posalji(zahtev);
            TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
            listaPostova = (List<Post>) odgovor.getRezultat();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
    }
}
