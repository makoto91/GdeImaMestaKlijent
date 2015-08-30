package table.model;

import domen.Korisnik;
import domen.Mesto;
import domen.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.Kontroler;
import util.Akcija;
import util.TransferKlasa;

/**
 *
 * @author Matija Veljkovic
 */
public class TableModelKorisnici extends AbstractTableModel {

    private List<Korisnik> listaKorisnika;

    public TableModelKorisnici(List<Korisnik> listaPostova) {
        this.listaKorisnika = listaPostova;
    }

    public TableModelKorisnici() {
        this.listaKorisnika = new ArrayList<>();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "KorisnikID";
            case 1:
                return "Ime i prezime";
            case 2:
                return "Email";
            case 3:
                return "Sifra";
            case 4:
                return "Mesto";
            case 5:
                return "Adresa";
            case 6:
                return "Poslednji put ulogovan";    
            case 7:
                return "Uloga";
            default:
                return "greska";
        }
    }

    @Override
    public int getRowCount() {
        return listaKorisnika.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Korisnik k = listaKorisnika.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return k.getKorisnikID();
            case 1:
//                SimpleDateFormat sdf = new SimpleDateFormat("EEEE H:mm:ss");
//                sdf.format(p.getVreme());
                return k.getImePrezime();
            case 2:
                return k.getEmail();
            case 3:
                return k.getSifra();
            case 4:
                return k.getMesto();
            case 5:
                return k.getAdresa();
            case 6:
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd H:mm:ss");
                return sdf.format(k.getLastLogin());
            case 7:
                return k.getUloga();    
            default:
                return "";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Korisnik k = listaKorisnika.get(rowIndex);
        switch (columnIndex) {
            case 0:
                k.setKorisnikID(Integer.parseInt(aValue.toString()));
                break;
            case 1:
                k.setImePrezime(aValue.toString());
//                    SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss");
//                    p.setVreme(sdf.parse(aValue.toString()));
                break;
            case 2:
                k.setEmail(aValue.toString());
                break;
            case 3:
                k.setSifra(aValue.toString());
                break;
            case 4:
                k.setMesto((Mesto) aValue);
                break;
            case 5:
                k.setAdresa(aValue.toString());
                break;
            case 6:
                
                break;
            case 7:
                k.setUloga(Integer.parseInt(aValue.toString()));
                break;    
        }

    }

    public void obrisi(int red) {
        listaKorisnika.remove(red);
        fireTableDataChanged();
    }

    public void dodajNoviRed(Korisnik k) {
        listaKorisnika.add(k);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if((1<=columnIndex && columnIndex<=5) || columnIndex>=7)
            return true;
        return false;
    }

    public List<Korisnik> vratiListuKorisnika() {
        return listaKorisnika;
    }

    public void setListaKorisnika(List<Korisnik> listaKorisnika) {
        this.listaKorisnika = listaKorisnika;
        fireTableDataChanged();
    }

}
