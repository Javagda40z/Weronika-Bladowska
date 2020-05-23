package ZadaniaDomoweJavaZaawansowana.WypozyczalniaSamochodow;

public abstract class Pojazd {
    String rejestracja;
    String vin;
    String kolor;
    int cena;
    double spalanie;
    int stanZbiornika;
    int licznikKilometrow;
    RodzajPojazdu rodzajPojazdu;

    public Pojazd(String rejestracja, String vin, String kolor, int cena, double spalanie, int stanZbiornika, int licznikKilometrow, RodzajPojazdu rodzajPojazdu) {
        this.rejestracja = rejestracja;
        this.vin = vin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.stanZbiornika = stanZbiornika;
        this.licznikKilometrow = licznikKilometrow;
        this.rodzajPojazdu=rodzajPojazdu;
    }

    public void wypozycz(){

    }
}
