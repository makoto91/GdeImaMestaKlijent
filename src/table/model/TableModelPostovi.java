package table.model;

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
public class TableModelPostovi extends AbstractTableModel {

    private List<Post> listaPostova;
    private boolean lokaliEditable = true;

    public TableModelPostovi(List<Post> listaPostova) {
        this.listaPostova = listaPostova;
    }

    public TableModelPostovi() {
        this.listaPostova = new ArrayList<>();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Lokal";
            case 1:
                return "Vreme";
            case 2:
                return "Stolovi za dvoje";
            case 3:
                return "Stolovi za cetvoro";
            case 4:
                return "Separei";
            case 5:
                return "Adresa";
            case 6:
                return "Grad";    
            case 7:
                return "Status";
            default:
                return "greska";
        }
    }

    @Override
    public int getRowCount() {
        return listaPostova.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Post p = listaPostova.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return p.getLokal().getNaziv();
            case 1:
                SimpleDateFormat sdf = new SimpleDateFormat("EEEE H:mm:ss");
                return sdf.format(p.getVreme());
            case 2:
                return p.getStoloviZaDvoje();
            case 3:
                return p.getStoloviZaCetvoro();
            case 4:
                return p.getSepare();
            case 5:
                return p.getLokal().getAdresa();
            case 6:
                return p.getLokal().getMesto().getNaziv();
            case 7:
                return p.getPrateciTekst();    
            default:
                return "";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Post p = listaPostova.get(rowIndex);
        switch (columnIndex) {
            case 0:
                if(lokaliEditable)
                p.getLokal().setNaziv(aValue.toString());
                break;
            case 1:
                Date d = new Date(aValue.toString());
                break;
            case 2:
                p.setStoloviZaDvoje(Integer.parseInt(aValue.toString()));
                break;
            case 3:
                p.setStoloviZaCetvoro(Integer.parseInt(aValue.toString()));
                break;
            case 4:
                p.setSepare(Integer.parseInt(aValue.toString()));
                break;
            case 5:
                p.getLokal().setAdresa(aValue.toString());
                break;
            case 6:
                p.getLokal().getMesto().setNaziv(aValue.toString());
                break;
            case 7:
                p.setPrateciTekst(aValue.toString());
                break;    
        }

    }

    public void obrisi(int red) {
        listaPostova.remove(red);
        fireTableDataChanged();
    }

    public void dodajNoviRed(Post p) {
        listaPostova.add(p);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public List<Post> vratiListuPostova() {
        return listaPostova;
    }

    public void setListaPostova(List<Post> listaPostova) {
        this.listaPostova = listaPostova;
        fireTableDataChanged();
    }

    public void setLokalEditable(boolean b) {
        lokaliEditable = b;
    }

}
