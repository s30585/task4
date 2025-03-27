public class SklepKomputerowy {
    Produkt[] produkt;
    Klient[] klient;
    Zamówienie[] zamowienia;
    int liczbaProduktow;
    int liczbaKlientow;
    int liczbaZamowien;
    public SklepKomputerowy(Produkt[] produkt,Klient[] klient, Zamówienie[] zamowienia, int liczbaProduktow, int liczbaKlientow, int liczbaZamowien) {
        this.produkt = produkt;
        this.klient = klient;
        this.zamowienia = zamowienia;
        this.liczbaProduktow = liczbaProduktow;
        this.liczbaKlientow = liczbaKlientow;
        this.liczbaZamowien = liczbaZamowien;
    }
    public void dodajProdukt(Produkt produkt) {

    }
    public void dodajKlienta(Klient klient) {

    }
    public void utworzZamowienie(Klient[] klient, Produkt[] produkt, int[] ilosci) {

    }
    public void aktualizujStanMagazynowy(Zamówienie zamowienie) {
        // dla każdego wyciągnietego produktu wyciadamy index ze sklepu arraylist to zrobic
    }
    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {

    }
    public void wyswietlProduktyWKategorii(String kategoria) {

    }
    public void wyswietlZamowieniaKlienta(int idKlientA) {

    }
}
