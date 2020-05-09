package ZadaniaDomoweJavaPodst;

import java.util.*;

public class Varargs {

    public int suma(int skladnik, int...skladniki) {

        int suma =skladnik;

        for (int i = 0; i <skladniki.length ; i++) {

            suma+=skladniki[i];

        } return suma;


    }

    public static List<String> listaImion(List list, String...imiona){

        for (String imie : imiona){

            list.add(imie);

        }
        return list;


    }

    public static void wypiszListeImion(List listaImion){

        int i=0;

        while(listaImion.size()-1>0 ) {
            System.out.println(listaImion.get(i));
            i++;
        }

    }


    public static void main(String[] args) {

        Varargs varargs=new Varargs();
        System.out.println("Suma liczb to: " +varargs.suma(5,5,7,89,6,11,12,13,14));

        List <String>listaImion=new ArrayList<>();

        listaImion(listaImion, "Kasia", "Madzia", "Marysia");

        wypiszListeImion(listaImion);







}}
