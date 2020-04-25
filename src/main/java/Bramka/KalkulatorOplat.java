package Bramka;

import Pojazd.Paliwo;
import Pojazd.Pojazdy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static Pojazd.Paliwo.PRAD;

public class KalkulatorOplat {

    public static int OPLATA=2;

    public int policz(Wjazd wjazd){

       LocalDateTime dataWjazdu= wjazd.getDataWjazdu();
       LocalDateTime dataWyjazdu=LocalDateTime.now();
        Pojazdy pojazdy=wjazd.getPojazdy();

        long czasNaParkingu=ChronoUnit.HOURS.between(dataWjazdu, dataWyjazdu);  //mozna uzyc duration

       czasNaParkingu=czasNaParkingu+ KalkulatorUtil.randomBetween(1,24);

        if(czasNaParkingu<1 || PRAD.equals(pojazdy.getPaliwo()) ){
            return 0;
        }

        double mnoznik= policzMnoznik(pojazdy);



        return (int) (OPLATA*mnoznik*czasNaParkingu);
    }

    private double policzMnoznik(Pojazdy pojazdy){
        double mnoznik=1;

        switch (pojazdy.getTyp()) {
            case OSOBOWY:
                mnoznik=mnoznik*1;
                break;

            case MOTOCYKL:
                mnoznik=mnoznik* 0.5;
                break;

            case CIEZAROWY:
                mnoznik=mnoznik*2;
                break;

            default:
                break;
        }




        return mnoznik;

    }
}
