package model;

import domen.AbstractDomainObject;
import domen.Korisnik;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Akcija;
import util.TransferKlasa;

/**
 *
 * @author Matija Veljkovic
 */
public class Kontroler {

    private static Kontroler INSTANCE;
    private final Map<String, Object> mapa;
    private final Socket soket;

    public static Kontroler getINSTANCE() throws Exception {
        if (INSTANCE == null) {
            INSTANCE = new Kontroler();
        }
        return INSTANCE;
    }

    private Kontroler() throws Exception {
        mapa = new HashMap<>();
        soket = new Socket("127.0.0.1", 9000);
    }

    public Object vratiIzMape(String key) {
        return mapa.get(key);
    }

    public void staviUMapu(String key, Object value) {
        mapa.put(key, value);
    }

    public void posalji(TransferKlasa objekat) throws IOException {
        ObjectOutputStream output = new ObjectOutputStream(soket.getOutputStream());
        output.writeObject(objekat);
        if (objekat.getOperacija() == Akcija.KRAJ) {
            soket.close();
        }
    }

    public TransferKlasa primi() throws Exception {
        ObjectInputStream input = new ObjectInputStream(soket.getInputStream());
        TransferKlasa odgovor = (TransferKlasa) input.readObject();
        if (odgovor.getIzuzetak() != null) {
            throw (Exception) odgovor.getIzuzetak();
        } else {
            return odgovor;
        }
    }

    public Socket getSocket() {
        return soket;
    }

    public void kraj() throws Exception {
        TransferKlasa zahtev = new TransferKlasa();
        zahtev.setOperacija(Akcija.KRAJ);
        posalji(zahtev);
        Thread.sleep(100);
        soket.close();
    }
    
    public AbstractDomainObject ulogujSe(String kEmail, String kSifra, String entitet) throws Exception {
        try {
            

            TransferKlasa zahtev = new TransferKlasa();
            zahtev.setOperacija(Akcija.LOGIN);
            zahtev.setParametar(kEmail + "/" + kSifra + "/" + entitet);

            Kontroler.getINSTANCE().posalji(zahtev);
            TransferKlasa odgovor = Kontroler.getINSTANCE().primi();
            AbstractDomainObject ado = (AbstractDomainObject) odgovor.getRezultat();
            return ado;
//            Korisnik korisnik = (Korisnik) odgovor.getRezultat();
//            return korisnik;
//            Kontroler.getINSTANCE().staviUMapu("adminUlogovan", ulogovan);

            
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
//            return ex;
        }
    }
    
    public void izlogujSe(String kEmail, String entitet) throws Exception{
        try {
            TransferKlasa zahtev = new TransferKlasa();
            zahtev.setOperacija(Akcija.LOGOUT);
            zahtev.setParametar(kEmail + "/" + entitet);

            Kontroler.getINSTANCE().posalji(zahtev);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
