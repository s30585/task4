public class Zamówienie {
    int id;
    Klient klient;
    Produkt[] produkt;
    int[] ilosci;
    String dataZamowienia;
    String status;
    public Zamówienie(int id, Klient klient, Produkt[] produkt, int[] ilosci, String dataZamowienia, String status) {
        this.id = id;
        this.klient = klient;
        this.produkt = produkt;
        this.ilosci = ilosci;
        this.dataZamowienia = dataZamowienia;
        this.status = status;
    }
    public void obliczWartoscZamowienia() {

    }
    public void zastosujZnizke() {

    }
    public void wyswietlSzczegoly() {

    }
}
