package ZadaniaDomoweJavaPodst;

import java.util.Arrays;

public class TabliceStringow {

    public static void main(String[] args) {

        String[] tablicaImion= new String[]{"mateusz", "kasia", "adam", "tomek", "andrzej"};
        System.out.println(Arrays.toString(tablicaImion));
        System.out.println("Rozmiat tablicy to: " + tablicaImion.length);

        tablicaImion[0]="piotr";
        System.out.println(Arrays.toString(tablicaImion));

        for (int i = 0; i <tablicaImion.length ; i++) {

            char[] array = tablicaImion[i].toCharArray();
            array[0] = Character.toUpperCase(array[0]);
            tablicaImion[i]= new String(array);
        }
        System.out.println(Arrays.toString(tablicaImion));





    }









}
