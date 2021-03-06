/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import domen.Lokal;
import domen.Mesto;
import domen.TipLokala;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import model.Kontroler;
import table.model.TableModelKorisnici;
import table.model.TableModelLokali;
import util.Akcija;
import util.TransferKlasa;

/**
 *
 * @author Matija1
 */
public class UnosLokala extends javax.swing.JFrame {

    /**
     * Creates new form UnosLokala
     */
    TableModelLokali tml;
    public UnosLokala() {
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

        jLabel2 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jtxtNaziv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxSifra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtAdresa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcmbMesta = new javax.swing.JComboBox();
        jbtnZapamti = new javax.swing.JButton();
        jbtnResetuj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblLokali = new javax.swing.JTable();
        jbtnBrisi = new javax.swing.JButton();
        jbtnSacuvaj = new javax.swing.JButton();
        jtxtBrojTelefona = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcmbTip = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jtxtLokalID = new javax.swing.JTextField();
        errObrisi = new javax.swing.JLabel();
        jbtnNazad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Email:");

        jLabel3.setText("Naziv:");

        jLabel4.setText("Sifra:");

        jLabel5.setText("Adresa:");

        jLabel6.setText("Broj telefona:");

        jcmbMesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbMestaActionPerformed(evt);
            }
        });

        jbtnZapamti.setText("Zapamti lokal");
        jbtnZapamti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnZapamtiActionPerformed(evt);
            }
        });

        jbtnResetuj.setText("Resetuj polja forme");
        jbtnResetuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetujActionPerformed(evt);
            }
        });

        jtblLokali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblLokali);

        jbtnBrisi.setText("Obrisi lokal");
        jbtnBrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrisiActionPerformed(evt);
            }
        });

        jbtnSacuvaj.setText("Sacuvaj lokal");
        jbtnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSacuvajActionPerformed(evt);
            }
        });

        jLabel7.setText("Mesto:");

        jLabel8.setText("Tip:");

        jcmbTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbTipActionPerformed(evt);
            }
        });

        jLabel9.setText("ID lokala:");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(72, 72, 72))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(4, 4, 4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(4, 4, 4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(4, 4, 4)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcmbMesta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxtLokalID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbTip, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnZapamti, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnResetuj, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnBrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtLokalID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jtxtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jcmbMesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmbTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtxtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnZapamti)
                    .addComponent(jbtnBrisi)
                    .addComponent(jbtnSacuvaj))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnResetuj)
                            .addComponent(jbtnNazad)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(errObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbMestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbMestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbMestaActionPerformed

    private void jbtnZapamtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnZapamtiActionPerformed
        String lokalIDS = jtxtLokalID.getText().trim();
        String email = jtxtEmail.getText().trim();
        String naziv = jtxtNaziv.getText().trim();
        String sifra = jtxSifra.getText().trim();
        Mesto m = (Mesto) jcmbMesta.getSelectedItem();
        String adresa = jtxtAdresa.getText().trim();
        TipLokala tip = (TipLokala) jcmbTip.getSelectedItem();
        String brojTelefona = jtxtBrojTelefona.getText().trim();

        String sifraREGEX = ".+";
        String emailREGEX = ".+@.+";
        String adresaREGEX = ".+ [0-9]+";
        String IDREGEX = "[0-9]+";

        if (!lokalIDS.matches(IDREGEX)) {
            JOptionPane.showMessageDialog(this, "Greska!", "Morate uneti id lokala!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!email.matches(emailREGEX)) {
            JOptionPane.showMessageDialog(this, "Greska!", "Morate popuniti email polje sa validnom adresom!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!naziv.matches(sifraREGEX)) {
            JOptionPane.showMessageDialog(this, "Greska!", "Morate uneti naziv!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!sifra.matches(sifraREGEX)) {
            JOptionPane.showMessageDialog(this, "Greska!", "Morate uneti sifru!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!adresa.matches(adresaREGEX)) {
            JOptionPane.showMessageDialog(this, "Greska!", "Morate uneti adresu!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!brojTelefona.matches(sifraREGEX)) {
            JOptionPane.showMessageDialog(this, "Greska!", "Morate uneti telefon!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int lokalID = Integer.parseInt(lokalIDS);
        Lokal l;
        try {
            l = new Lokal(lokalID, email, naziv, sifra, m, adresa, tip, brojTelefona, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }

//        TableModel tm = jtblLokali.getModel();
//        tml = (TableModelLokali) tm;
        tml.dodajNoviRed(l);
        JOptionPane.showMessageDialog(this, "Sistem je kreirao novi lokal.", "Poruka", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbtnZapamtiActionPerformed

    private void jbtnResetujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetujActionPerformed
        resetujPoljaForme();
    }//GEN-LAST:event_jbtnResetujActionPerformed

    private void jbtnBrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrisiActionPerformed
        try {
//            TableModel tm = jtblLokali.getModel();
//            tml = (TableModelLokali) tm;
            tml.obrisi(jtblLokali.getSelectedRow());
            errObrisi.setText("");
        } catch (Exception e) {
            errObrisi.setText("Morate odabrati lokal!");
        }
    }//GEN-LAST:event_jbtnBrisiActionPerformed

    private void jbtnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSacuvajActionPerformed
        try {
            List<Lokal> listaLokala = tml.vratiListuLokala();

                    TransferKlasa zahtev = new TransferKlasa();
                    zahtev.setOperacija(Akcija.NOVI_LOKALI);
                    zahtev.setParametar(listaLokala);
                    Kontroler.getINSTANCE().posalji(zahtev);
                    TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
                    boolean ubacen = (boolean) odgovor.getRezultat();
                    JOptionPane.showMessageDialog(this, "Sistem je zapamtio podatke o novim lokalima.", "Poruka", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da zapamti novi lokal.", "Greska", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtnSacuvajActionPerformed

    private void jcmbTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbTipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbTipActionPerformed

    private void jbtnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNazadActionPerformed
        AdminFormaLokal afl = new AdminFormaLokal();
        afl.setVisible(true);
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
            java.util.logging.Logger.getLogger(UnosLokala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnosLokala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnosLokala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnosLokala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnosLokala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errObrisi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBrisi;
    private javax.swing.JButton jbtnNazad;
    private javax.swing.JButton jbtnResetuj;
    private javax.swing.JButton jbtnSacuvaj;
    private javax.swing.JButton jbtnZapamti;
    private javax.swing.JComboBox jcmbMesta;
    private javax.swing.JComboBox jcmbTip;
    private javax.swing.JTable jtblLokali;
    private javax.swing.JTextField jtxSifra;
    private javax.swing.JTextField jtxtAdresa;
    private javax.swing.JTextField jtxtBrojTelefona;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtLokalID;
    private javax.swing.JTextField jtxtNaziv;
    // End of variables declaration//GEN-END:variables

private void srediFormu() {
        setTitle("Admin - Unos lokala");
        srediTabelu();
    }

    private void srediTabelu() {
        try {
            TransferKlasa zahtev = new TransferKlasa();
            
            zahtev.setOperacija(Akcija.VRATI_SVA_MESTA);
            Kontroler.getINSTANCE().posalji(zahtev);
            TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
            List<Mesto> listaMesta = (List<Mesto>) odgovor.getRezultat();
            
            zahtev.setOperacija(Akcija.VRATI_SVE_TIPOVE);
            Kontroler.getINSTANCE().posalji(zahtev);
            odgovor = Kontroler.getINSTANCE().primi();
            List<TipLokala> listaTipovaLokala = (List<TipLokala>) odgovor.getRezultat();
            
            tml = new TableModelLokali();
            jtblLokali.setModel(tml);
            TableColumnModel tcm = jtblLokali.getColumnModel();
            TableColumn tc = tcm.getColumn(4);
            JComboBox jcb = new JComboBox();

            jcb.setModel(new DefaultComboBoxModel(listaMesta.toArray()));
            tc.setCellEditor(new DefaultCellEditor(jcb));
            
            tc = tcm.getColumn(6);
            JComboBox jcb1 = new JComboBox();
            
            jcb1.setModel(new DefaultComboBoxModel(listaTipovaLokala.toArray()));
            tc.setCellEditor(new DefaultCellEditor(jcb1));
            
            jcmbMesta.setModel(new DefaultComboBoxModel(listaMesta.toArray()));
            jcmbTip.setModel(new DefaultComboBoxModel(listaTipovaLokala.toArray()));

            jtblLokali.setAutoCreateRowSorter(true);
            jtblLokali.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            jtblLokali.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetujPoljaForme() {
        jtxtLokalID.setText("");
        jtxtEmail.setText("");
        jtxtNaziv.setText("");
        jtxSifra.setText("");
        jtxtAdresa.setText("");
        jtxtBrojTelefona.setText("");
        jcmbMesta.setSelectedIndex(0);
        jcmbTip.setSelectedIndex(0);

        resetujErrorLabele();
    }

    private void resetujErrorLabele() {
        errObrisi.setText("");
    }



}
