package TypyGeneryczne;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List lista=new ArrayList(); //lista bez typu generycznego przez to mozna dodac wszystko i jest balagan

        lista.add("napis");
        lista.add(123);

        for (Object element:lista ) {

            System.out.println(((String) element).length());//nie wypisze dlugosci dla drugiego objektu bo nie jest Stirngiem


        }

        List<String>listaGeneryczna=new ArrayList<String>();//lista z typem generycznym, okreslenie typu danych w liscie
        listaGeneryczna.add("napis");
        //listaGeneryczna.add(123); nie mozna dodac bo 123 nie jest stringiem

        for (String element:listaGeneryczna ) {
            System.out.println(element.length());

        }
    }
}
