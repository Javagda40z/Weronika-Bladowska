package ZadaniaDomoweJavaZaawansowana.TypyGeneryczne;

public class Ubrania extends Walizka {

    private String nazwa;

    public Ubrania(String rozmiar, String kolor, String nazwa) {
        super(rozmiar, kolor);
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
