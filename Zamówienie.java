public class Zamówienie {
    int id;
    Klient klient;
    Produkt[] produkt;
    int[] ilosci;
    String dataZamowienia;
    String status;
    public Zamowienie(int id, Klient klient, Produkt[] produkt, int[] ilosci, String dataZamowienia, String status) {
        this.id = id;
        this.klient = klient;
        this.produkt = produkt;
        this.ilosci = ilosci;
        this.dataZamowienia = dataZamowienia;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double obliczWartoscZamowienia() {
        double suma = 0;
        for (int i = 0; i < produkt.length; i++) {
            suma += produkt[i].getCena() * ilosci[i];
        }
        return suma;
    }
    public void zastosujZnizke() {
        if (klient.getCzyStaly()) {
            for (int i = 0; i < produkt.length; i++) {
                double nowaCena = produkt[i].getCena() * 0.9;
                produkt[i].setCena(nowaCena);
            }
        }
    }
    public void wyswietlSzczegoly() {
        System.out.println("Zamówienie ID: " + id + ", Data: " + dataZamowienia + ", Status: " + status);
        for (int i = 0; i < produkt.length; i++) {
            System.out.println("Produkt: " + produkt[i].getNazwa() + ", Ilość: " + ilosci[i] + ", Cena: " + produkt[i].getCena());
        }
        System.out.println("Łączna wartość zamówienia: " + obliczWartoscZamowienia());
    }
}
