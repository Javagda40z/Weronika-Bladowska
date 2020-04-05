package Petle;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Zadanie1 {

    public static void main(String[] args) {
//        Zadanie1 zadanie= new Zadanie1();
//        zadanie.tabliczkaMnozenia(5);
//        zadanie.tabliczkaMnozenia(10);

        TabliczkaMnozenia tabliczkaMnozenia = new TabliczkaMnozenia(5);
        System.out.println(tabliczkaMnozenia.getLiczba());
        tabliczkaMnozenia.wypiszTabliczke();

        tabliczkaMnozenia = new TabliczkaMnozenia(10);
        tabliczkaMnozenia.wypiszTabliczke();
        System.out.println(sumaLiczb(1,5));

    }
    public void tabliczkaMnozenia(int liczba) {

        System.out.println("Tabliczka mnozenia dla liczby: "+ liczba);
        for (int i=1; i<=liczba; i++){
            System.out.println(liczba + " x "+ i + " = " + liczba*i);
        }


    }

    //Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y

    public static int sumaLiczb(int x, int y){
        int suma=0;

        for( int i=x; i<=y; i++) {

            suma=suma+i;

        }return suma;
    }

}
