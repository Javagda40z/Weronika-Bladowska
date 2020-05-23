package Kolekcje;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestPorownywatorow {

    public static void main(String[] args) {
        Gracz gracz1=new Gracz(1,"Gracz1");
        Gracz gracz2=new Gracz(15,"Gracz2");
        Gracz gracz3=new Gracz(6,"Gracz3");
        Gracz gracz4=new Gracz(2,"Gracz4");

        List<Gracz>gracze=new ArrayList<>();

        gracze.add(gracz1);
        gracze.add(gracz2);
        gracze.add(gracz3);
        gracze.add(gracz4);
        System.out.println("Przed sortowaniem");
        System.out.println(gracze);

        Collections.sort(gracze); // sortuje po kluczu
        Collections.sort(gracze, new GraczComparator());
        System.out.println("Po sortowaniu");
        System.out.println(gracze);
    }
}
