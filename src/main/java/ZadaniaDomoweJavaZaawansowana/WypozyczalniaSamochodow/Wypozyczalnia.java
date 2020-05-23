package ZadaniaDomoweJavaZaawansowana.WypozyczalniaSamochodow;

import java.time.LocalDateTime;

public class Wypozyczalnia {

private LocalDateTime czasWjazdu;
private Pojazd pojazd;

    public LocalDateTime getCzasWjazdu() {
        return czasWjazdu;
    }

    public Pojazd getPojazd() {
        return pojazd;
    }

    public Wypozyczalnia(LocalDateTime czasWjazdu, Pojazd pojazd) {
        this.czasWjazdu = czasWjazdu;
        this.pojazd = pojazd;
    }
}
