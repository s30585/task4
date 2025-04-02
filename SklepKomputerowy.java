import java.util.ArrayList;
import java.util.List;

public class SklepKomputerowy {
    List<Produkt> produkty = new ArrayList<>();
    List<Klient> klienci = new ArrayList<>();
    List<Zamowienie> zamowienia = new ArrayList<>();
    int liczbaProduktow = 0;
    int liczbaKlientow = 0;
    int liczbaZamowien = 0;
    public SklepKomputerowy() {
        this.zamowienia = zamowienia;
        this.liczbaProduktow = liczbaProduktow;
        this.liczbaKlientow = liczbaKlientow;
        this.liczbaZamowien = liczbaZamowien;
    }
    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }
    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }
    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        Zamowienie zamowienie = new Zamowienie(liczbaZamowien + 1, klient, produkty, ilosci, "2024-04-02", "Nowe");
        zamowienia.add(zamowienie);
        liczbaZamowien++;
        return zamowienie;
    }

   public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < zamowienie.produkt.length; i++) {
           zamowienie.produkt[i].setIloscWMagazynie(zamowienie.produkt[i].getIloscWMagazynie() - zamowienie.ilosci[i]);
        }
    }
    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie.getId() == idZamowienia) {
                zamowienie.setStatus(nowyStatus);
            }
        }
    }
    public void wyswietlProduktyWKategorii(String kategoria) {
        for (Produkt produkt : produkty) {
            if (produkt.getKategoria().equals(kategoria)) {
                produkt.wyswietlInformacje();
            }
        }
    }
    public void wyswietlZamowieniaKlienta(int idKlienta) {
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie.klient.getId() == idKlienta) {
                zamowienie.wyswietlSzczegoly();
            }
        }
    }
}
