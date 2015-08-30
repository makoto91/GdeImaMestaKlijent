/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import domen.Mesto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Kontroler;
import model.sesija.Sesija;
import util.Akcija;
import util.TransferKlasa;

/**
 *
 * @author Matija1
 */
public class RegistrujSeKorisnik extends javax.swing.JFrame {

    /**
     * Creates new form RegistrujSeKorisnik
     */
    public RegistrujSeKorisnik() {
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

        jbtnNazad = new javax.swing.JButton();
        jbtnRegistrujSe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxtImeIPrezime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jtxtSifra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtAdresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcmbMesta = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        errImePrezime = new javax.swing.JLabel();
        errEmail = new javax.swing.JLabel();
        errSifra = new javax.swing.JLabel();
        errAdresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnNazad.setText("Nazad");
        jbtnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNazadActionPerformed(evt);
            }
        });

        jbtnRegistrujSe.setText("Registruj se");
        jbtnRegistrujSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrujSeActionPerformed(evt);
            }
        });

        jLabel1.setText("Ime i prezime:");

        jLabel2.setText("Email:");

        jLabel3.setText("Sifra:");

        jLabel4.setText("Adresa:");

        jLabel6.setText("Mesto:");

        errImePrezime.setText(" ");

        errEmail.setText(" ");

        errSifra.setText(" ");

        errAdresa.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcmbMesta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtImeIPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jbtnNazad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnRegistrujSe))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(errAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errImePrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtImeIPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(errImePrezime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(errEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errSifra)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errAdresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbMesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNazad)
                    .addComponent(jbtnRegistrujSe))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNazadActionPerformed
        try {
            Glavna glavna = (Glavna) Kontroler.getINSTANCE().vratiIzMape("glavna");
            glavna.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(UlogujSeKorisnik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnNazadActionPerformed

    private void jbtnRegistrujSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrujSeActionPerformed
        
            String imePrezime = jtxtImeIPrezime.getText().trim();
            String email = jtxtEmail.getText().trim();
            String sifra = jtxtSifra.getText().trim();
            String adresa = jtxtAdresa.getText().trim();
            Mesto m = (Mesto)jcmbMesta.getSelectedItem();
            
            String sifraPutREGEX = ".+";
            String imePrezimePrREGEX = ".+ .+";
            String emailREGEX = ".+@.+";
            String adresaREGEX = ".+ [0-9]+";
            
            if (!email.matches(emailREGEX)) {
            errEmail.setText("Obavezno polje!!!");
                return;
            }
            if (!imePrezime.matches(imePrezimePrREGEX)) {
            errImePrezime.setText("Obavezno polje!!!");
                return;
            }
            if (!adresa.matches(adresaREGEX)) {
            errAdresa.setText("Obavezno polje!!!");
                return;
            }
            if (!sifra.matches(sifraPutREGEX)) {
            errSifra.setText("Obavezno polje!!!");
                return;
            }
            
            try {
            
            Korisnik k = new Korisnik(imePrezime, email, sifra, m, adresa, 1);
            TransferKlasa zahtev = new TransferKlasa();
            zahtev.setOperacija(Akcija.REGISTRACIJA);
            zahtev.setParametar(k);
            Kontroler.getINSTANCE().posalji(zahtev);
            TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
            boolean izvrseno = (boolean) odgovor.getRezultat();
            if(izvrseno)
            JOptionPane.showMessageDialog(this, "Uspesno ste se registrovali!");
        } catch (Exception ex) {
            Logger.getLogger(RegistrujSeKorisnik.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnRegistrujSeActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrujSeKorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrujSeKorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrujSeKorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrujSeKorisnik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrujSeKorisnik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errAdresa;
    private javax.swing.JLabel errEmail;
    private javax.swing.JLabel errImePrezime;
    private javax.swing.JLabel errSifra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnNazad;
    private javax.swing.JButton jbtnRegistrujSe;
    private javax.swing.JComboBox jcmbMesta;
    private javax.swing.JTextField jtxtAdresa;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtImeIPrezime;
    private javax.swing.JTextField jtxtSifra;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        setTitle("Registracija");
        ucitajCombo();
    }

    private void ucitajCombo() {
        List<Mesto> listaMesta = new ArrayList<Mesto>();
        try {
            TransferKlasa zahtev = new TransferKlasa();
            zahtev.setOperacija(Akcija.VRATI_SVA_MESTA);
            Kontroler.getINSTANCE().posalji(zahtev);
            TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
            listaMesta = (List<Mesto>) odgovor.getRezultat();
            jcmbMesta.setModel(new DefaultComboBoxModel(listaMesta.toArray()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
    }
}
