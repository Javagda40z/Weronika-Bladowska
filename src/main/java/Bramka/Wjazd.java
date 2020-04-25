package Bramka;

import Pojazd.Pojazdy;

import java.time.LocalDateTime;

public class Wjazd {

    private final LocalDateTime dataWjazdu;    //final bo nie moze sie zmienic nigdy godzina wjazdu
    private final Pojazdy pojazdy;

    public Wjazd(LocalDateTime dataWjazdu, Pojazdy pojazdy) {
        this.dataWjazdu = dataWjazdu;
        this.pojazdy = pojazdy;
    }

    public LocalDateTime getDataWjazdu() {
        return dataWjazdu;
    }

    public Pojazdy getPojazdy(){
        return pojazdy;
    }
}
