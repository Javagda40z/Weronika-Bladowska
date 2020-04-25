package Bramka;

import Pojazd.Pojazdy;

public class Bramka implements Szlaban {

    private final Raport raport;
    private final RejestrPojazdrow rejestrPojazdrow;
    private KalkulatorOplat kalkulatorOplat;

    public Bramka(RejestrPojazdrow rejestrPojazdrow) {
        this.rejestrPojazdrow = rejestrPojazdrow;
        raport = new Raport();
    }

    @Override
    public void wjazd(Pojazdy pojazdy) {

       boolean czyWjechal= rejestrPojazdrow.wpisz(pojazdy);
       if(!czyWjechal){
           zawolajPomoc(pojazdy);
       } else {
           System.out.println("Pojazd o rejestracji "+ pojazdy.getRejestracja() + " wjechal na parking");
       }

    }

    private void zawolajPomoc(Pojazdy pojazdy) {
        System.out.println("Wolam pomoc dla pojazdu o rejestracji " + pojazdy.getRejestracja());
    }

    @Override
    public void wyjazd(Pojazdy pojazdy, int zaplata) {

        Wjazd wjazd=rejestrPojazdrow.wypisz(pojazdy);

        int koszt=kalkulatorOplat.policz(wjazd);

        raport.dodajPojazd(pojazdy.getTyp());
        raport.dodajKase(zaplata);
        raport.dodajKoszt(koszt);

        if(koszt>zaplata){
            zawolajPomoc(pojazdy);
        }

        System.out.println("Wyjezdza pojazd o rejestracji: " +wjazd.getPojazdy().getRejestracja() + " zaplacono "+ zaplata + " a koszt to: "+ koszt);

    }

    public void setKalkulatorOplat(KalkulatorOplat kalkulatorOplat) {
        this.kalkulatorOplat = kalkulatorOplat;
    }

    public Raport przygotujRaport(){
        return raport;
    }
}
