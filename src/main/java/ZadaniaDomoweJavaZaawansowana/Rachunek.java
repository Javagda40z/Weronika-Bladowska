package ZadaniaDomoweJavaZaawansowana;

import java.util.ArrayList;
import java.util.List;

public class Rachunek {
    public static List<Produkt>listaProduktow=new ArrayList<>();
    Produkt produkt;

    public void dodajProdukt(List<Produkt>listaProduktow){

        listaProduktow.add(produkt);
    }
    public void sumujRachunek(List<Produkt>listaProduktow){
        double suma;
        for (Produkt produkt:listaProduktow) {
            suma=+produkt.cena;

        }
    }


    public static void main(String[] args) {
        Produkt produkt=new Produkt("okno", 120);
        Produkt produkt1=new Produkt("drzwi", 100);

    }


}
