package ZadaniaDomoweJavaZaawansowana.TypyGeneryczne;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pojemnik pojemnik=new Pojemnik("pojemnik1");
        Przedmiot przedmiot1= new Przedmiot("dlugopis");
        Przedmiot przedmiot2= new Przedmiot("olowek");
        Przedmiot przedmiot3=new Przedmiot("mazak");
        List<Przedmiot>przedmiotList=new ArrayList<>();


       przedmiotList.add(przedmiot1);
       przedmiotList.add(przedmiot2);
       przedmiotList.add(przedmiot3);


        for (Przedmiot przedmiot : przedmiotList) {
            System.out.println(przedmiot.getNazwa());

        }

        Ubrania sukienka=new Ubrania("M","czerwona","mini");
        Przedmiot przedmiot=new Przedmiot("kubek");

        Walizka walizka=new Walizka("duza","czarna");

        List<Walizka> zawartoscWalizki=new ArrayList<>();
        zawartoscWalizki.add(sukienka);




    }
}
