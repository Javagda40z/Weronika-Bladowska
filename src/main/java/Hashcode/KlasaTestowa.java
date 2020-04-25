package Hashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KlasaTestowa {

    public static void main(String[] args) {


        String zmienna = "tekst";
        String zmienna2 = new String("tekst"); //tworzenie poprzez konstruktor
        String zmienna3 = zmienna;
//        zmienna="inny tekst";

//        System.out.println(zmienna==zmienna2);  //daje false bo zajmuja inne miejsca w pamieci
//        System.out.println(zmienna);
//        System.out.println(zmienna3);  //stringi nie sa zmienialne
//
//        System.out.println(zmienna.equals(zmienna2));


        Czlowiek czlowiek = new Czlowiek("Mateusz", 99);
        Czlowiek czlowiek2 = new Czlowiek("Mateusz", 99);
        Czlowiek czlowiek3 = new Czlowiek("X", 99);

//        System.out.println(czlowiek==czlowiek2);
//        System.out.println(czlowiek==czlowiek3);
//        System.out.println(czlowiek.equals(czlowiek2));

        Czlowiek czlowiek4 = new SuperCzlowiek("SuperMateusz", 100);
        Czlowiek czlowiek5 = new ExtraCzlowiek("SuperMateusz", 100);
        Czlowiek czlowiek6 = new Czlowiek("SuperMateusz", 100);

//        czlowiek6.equals()  bierze equals z Czlowieka
//        czlowiek4.equals() bierze equals z SuperCzliwieka

        System.out.println(czlowiek4.equals(czlowiek5)); //skoro jest equals w superczlowieku, to z teog korzysta.


        List<Czlowiek> listaCzlowiekow = new ArrayList<>();

        listaCzlowiekow.add(czlowiek4);
        listaCzlowiekow.add(czlowiek5);
        listaCzlowiekow.add(czlowiek6);
        test(listaCzlowiekow);

        Map<String, Czlowiek> mapa = new HashMap<>();
        mapa.put("Mateusz", czlowiek4);
        mapa.put("X", czlowiek3);
        mapa.put("Mateusz", czlowiek3);  //pod jednym kluczem moze byc tylko jedna wartosc

        System.out.println("Mateusz".hashCode());


        System.out.println(mapa.get("Mateusz").getImie());
    }
        public static void test (List<Czlowiek> czlowieki) {

        Czlowiek czlowiek=czlowieki.get(0);
        Czlowiek czlowiek1= czlowieki.get(1);

        czlowiek.equals(czlowiek1);  //użyta jest metoda z czlowieka


            //tablica[0]
            //

        }

    }

