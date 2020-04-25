package Bramka;

import Pojazd.Typ;

import java.util.EnumMap;
import java.util.Map;

public class Raport {

    private int zarobek;
    private int koszt;

   private Map<Typ, Integer> iloscPojazdow = new EnumMap<>(Typ.class);

    public int getZarobek() {
        return zarobek;
    }

    public Map<Typ, Integer> getIloscPojazdow() {
        return iloscPojazdow;
    }

    public int getKoszt() {
        return koszt;
    }

    public void dodajKase(int kasa){
        zarobek+=kasa;
    }

    public void dodajKoszt(int koszt){
        this.koszt+=koszt;
    }
    public void dodajPojazd(Typ typ){
        if(iloscPojazdow.containsKey(typ)){
           Integer licznik= iloscPojazdow.get(typ);
           licznik++;
           iloscPojazdow.put(typ,licznik);
        } else {
            iloscPojazdow.put(typ,1);
        }
    }

    public void wyswietl() {

        System.out.println("Zarobiona kasa: "+ zarobek);
        System.out.println("Koszt: "+ koszt);

        for (Typ typ : iloscPojazdow.keySet()) {
            System.out.println("Pojazdow o typie: "+ typ.name() + " jest: "+ iloscPojazdow.get(typ));

        }
    }
}
