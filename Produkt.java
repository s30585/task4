import java.math.BigDecimal;
import java.math.RoundingMode;

public class Produkt {
    int id;
    String nazwa;
    String kategoria;
    double cena;
    int iloscWMagazynie;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getKategoria() {
        return kategoria;
    }
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        BigDecimal bd = new BigDecimal(cena).setScale(2, RoundingMode.HALF_UP);
        this.cena = bd.doubleValue();
    }
    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }
    public void setIloscWMagazynie(int ilosc) {
        this.iloscWMagazynie = ilosc;
    }

    public void wyswietlInformacje() {
        System.out.println("ID: "+ id +", Nazwa: " + nazwa+ ", Kategoria: " + kategoria + ", Cena: " + cena + ", Ilość w magazynie: " + iloscWMagazynie);
    }
}
