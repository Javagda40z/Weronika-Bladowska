package Bramka;

import Pojazd.Pojazdy;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class RejestrPojazdrow {

    Map<String, Wjazd>rejestr = new HashMap<>();  //kluczem numery rejestracyjne, przypisana wartosc wjazdu

    public boolean wpisz(Pojazdy pojazdy){

        Wjazd wjazd= new Wjazd(LocalDateTime.now(), pojazdy);

        if(czyPojazdJestWRejestrze(pojazdy)) {
            return false;
        }

        rejestr.put(pojazdy.getRejestracja(), wjazd);
        return true;
    }

    public Wjazd wypisz(Pojazdy pojazdy) {
       Wjazd wjazd= rejestr.remove(pojazdy.getRejestracja());
       return wjazd;
    }

    private boolean czyPojazdJestWRejestrze(Pojazdy pojazdy) {
        return rejestr.containsKey(pojazdy.getRejestracja());
    }
}
