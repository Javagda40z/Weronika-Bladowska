package Petle;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class CzyUjemna {
//    Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
//    utwórz nową tablicę, do której przepisze tylko te ujemne liczby

    public static void main(String[] args) {
        int[] tablica = new int[]{-1,2,-5,7,9,-10,0,12,-50,-1,4,6,-3};
        System.out.println(Arrays.toString(policzUjemne(tablica)));
//        for (int i=0; i<tablica.length; i++){
//            if(tablica[i]<0){
//                System.out.println(tablica[i]);
//            }
//        }

    }
    
    public static int[] policzUjemne(int[]tablica) {

        int[] tab= new int[1];

        for (int elementTablicy :tablica) {
            if(elementTablicy<0){
            tab=ArrayUtils.add(tab,elementTablicy);
        }
    }return tab;
}}
