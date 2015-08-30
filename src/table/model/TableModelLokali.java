package table.model;

import domen.Korisnik;
import domen.Lokal;
import domen.Mesto;
import domen.TipLokala;
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
public class TableModelLokali extends AbstractTableModel {

    private List<Lokal> listaLokala;

    public TableModelLokali(List<Lokal> listaLokala) {
        this.listaLokala = listaLokala;
    }

    public TableModelLokali() {
        this.listaLokala = new ArrayList<>();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "LokalID";
            case 1:
                return "Email";
            case 2:
                return "Naziv";
            case 3:
                return "Sifra";
            case 4:
                return "Mesto";
            case 5:
                return "Adresa";
            case 6:
                return "Tip lokala";    
            case 7:
                return "Broj telefona";
            case 8:
                return "Poslednji put ulogovan";    
            default:
                return "greska";
        }
    }

    @Override
    public int getRowCount() {
        return listaLokala.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lokal l = listaLokala.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return l.getLokalID();
            case 1:
//                SimpleDateFormat sdf = new SimpleDateFormat("EEEE H:mm:ss");
//                sdf.format(p.getVreme());
                return l.getEmail();
            case 2:
                return l.getNaziv();
            case 3:
                return l.getSifra();
            case 4:
                return l.getMesto();
            case 5:
                return l.getAdresa();
            case 6:
                return l.getTip();    
            case 7:
                return l.getBrojTelefona();
            case 8:
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd H:mm:ss");
                return sdf.format(l.getLastLogin()); 
                } catch (Exception e) {
                    return "Nije bio ulogovan!";
                }
                 
                
            default:
                return "";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Lokal l = listaLokala.get(rowIndex);
        switch (columnIndex) {
            case 0:
                l.setLokalID(Integer.parseInt(aValue.toString()));
                break;
            case 1:
                l.setEmail(aValue.toString());
//                    SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss");
//                    p.setVreme(sdf.parse(aValue.toString()));
                break;
            case 2:
                l.setNaziv(aValue.toString());
                break;
            case 3:
                l.setSifra(aValue.toString());
                break;
            case 4:
                l.setMesto((Mesto) aValue);
                break;
            case 5:
                l.setAdresa(aValue.toString());
                break;
            case 6:
                l.setTip((TipLokala) aValue);
                break;
            case 7:
                l.setBrojTelefona(aValue.toString());
                break;    
        }

    }

    public void obrisi(int red) {
        listaLokala.remove(red);
        fireTableDataChanged();
    }

    public void dodajNoviRed(Lokal l) {
        listaLokala.add(l);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if((1<=columnIndex && columnIndex<=7))
            return true;
        return false;
    }

    public List<Lokal> vratiListuLokala() {
        return listaLokala;
    }

    public void setListaKorisnika(List<Lokal> listaLokala) {
        this.listaLokala = listaLokala;
        fireTableDataChanged();
    }

}
