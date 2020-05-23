package ZadaniaDomoweJavaZaawansowana.WypozyczalniaSamochodow;

public class Dostawcze extends Pojazd {
    public Dostawcze(String rejestracja, String vin, String kolor, int cena, double spalanie, int stanZbiornika, int licznikKilometrow, RodzajPojazdu rodzajPojazdu) {
        super(rejestracja, vin, kolor, cena, spalanie, stanZbiornika, licznikKilometrow, RodzajPojazdu.DOSTAWCZE);
    }
}
