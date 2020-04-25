package Bramka;

import Pojazd.Autobus;
import Pojazd.Motocykl;
import Pojazd.Paliwo;
import Pojazd.Samochod;

public class AplikacjaBramka {

    //sprawdzaniew czy jest miejsce
    //spr regexem czy rejestracja jest ok
    // stworzyc nowy kalkulator oplat
    //wydawanie reszty
    //nie pozwalac na podmiane kalkulatora jesli ktos jest na parkingu
    //przy wjezdzie dawac informace wg jakiego kalkulatora bedazie naliczona oplata
    //zmienna oplata w zaleznosci od godziny
    //kilka bramek - wielowatkowowsc
    //tworzyc pdfa z raportem
    //co zostalo na parkingu
    

    public static void main(String[] args) {
        RejestrPojazdrow rejestrPojazdrow=new RejestrPojazdrow();
        Bramka bramka = new Bramka(rejestrPojazdrow);
        bramka.setKalkulatorOplat(new KalkulatorOplat());

        Motocykl motocykl = new Motocykl("GD12345", Paliwo.BENZYNA);
        Samochod samochod=new Samochod("GD54321", Paliwo.BENZYNA);
        Autobus autobus=new Autobus("GD54322", Paliwo.BENZYNA);


        bramka.wjazd(motocykl);
        bramka.wjazd(samochod);
        bramka.wjazd(autobus);

        bramka. wyjazd(samochod, 10);
        bramka.wyjazd(autobus,100);

        bramka.wjazd(samochod);
        bramka.wjazd(motocykl);

        Raport raport =bramka.przygotujRaport();
        raport.wyswietl();
} }
