package Petle;

//Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class Tablica {

    public static void main(String[] args) {

        int[] tablica=new int[]{1,2,3};
        System.out.println(Arrays.toString(tablica));  //potrzebne jest to zeby wypisac tablice
        zamienPierwszyITrzeciElement(tablica);
        System.out.println(Arrays.toString(tablica));

        int[] nieposortowanatablica=new int[]{1,3,3,2,4,1};
        System.out.println(Arrays.toString(nieposortowanatablica));
       // Arrays.sort(nieposortowanatablica);
        System.out.println(Arrays.toString(nieposortowanatablica));

        System.out.println(NumberUtils.max(nieposortowanatablica)); //biblioteka apache commons ma gotowa metode do wyznaczania max
    }

    public static void zamienPierwszyITrzeciElement (int[] tablica){

        int zmienna =tablica[0];
        tablica[0]=tablica[2];
        tablica[2]=zmienna;
    }
    //Dla zadanej tablicy intów wyświetl najmniejszą oraz największą liczbę z tablicy


}
