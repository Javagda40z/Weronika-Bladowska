package Petle;

import java.util.ArrayList;
import java.util.List;

public class Ciagi {

    public static void main(String[] args) {

//            List<Integer> lista=new ArrayList<Integer>();//polimorfizm bo lista to arraylista
//            ArrayList<Integer> lista2=new ArrayList<>(); // arraylista jest szersza od listy
        System.out.println(stworzCiagArytmetyczny(5,1,2));
        List<Integer> ciag = stworzCiagArytmetyczny(10,1,1);
        System.out.println(ciag);
    }


    public static List<Integer> stworzCiagArytmetyczny(int dlugosc, int pierwszyelement, int roznica){

        List<Integer> ciag= new ArrayList<>();
        ciag.add(pierwszyelement);
        for (int i = pierwszyelement; i <dlugosc ; i++) {
            ciag.add(pierwszyelement+ i*roznica);

        }return ciag;

    }

    public boolean sprawdzCzyCiagArytmetyczny(List<Integer> ciag) {

        for (int i = 1; i + 1 < ciag.size(); i++) {
            if ((ciag.get(i - 1) + ciag.get(i + 1)) / 2 != ciag.get(i)) {

                return false;
            }

        }

        return false;
    }
}
