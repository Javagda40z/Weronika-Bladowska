package TypyGeneryczne;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMieszkancow {

    public static void main(String[] args) {

//        Miasto miasto=new Miasto("?");
//        List<Mieszkaniec>mieszkaniecList=new ArrayList<>();
//        Mieszkaniec mieszkaniec=new Mieszkaniec();
//        mieszkaniec.setId(1);
//        mieszkaniec.setImie("Mateusz");
//
//        Mieszkaniec mieszkaniec1=new Mieszkaniec();
//        mieszkaniec1.setId(2);
//        mieszkaniec1.setImie("Adam");
//
//        mieszkaniecList.add(mieszkaniec);
//        mieszkaniecList.add(mieszkaniec1);
//
//        miasto.setMieszkancy(mieszkaniecList);
//
////        Miasto gdansk=new Miasto("Gdansk");
////        Miasto gdynia=new Miasto("Gdynia");
//
//        Gdanszczanin gdanszczanin=new Gdanszczanin();
//        mieszkaniecList.add(gdanszczanin);
//
//        Miasto<Gdanszczanin>gdansk=new Miasto<>("Gdansk"); //tworzenie miasta z typem generycznym(parametrem)
//
//        Miasto<Gdynianin> gdynia=new Miasto<>("Gdynia");
//
////        Miasto<Object>miastoObiektow=new Miasto<>("Obiekty");
////
////        Miasto<String>miastoString=new Miasto<>("StringCity");
//


        List<Double>doubles=new ArrayList<>();
        doubles.add(1.2);
        doubles.add(1.3);

        System.out.println(sum(doubles));

        List<Integer> integers= Arrays.asList(1,2,3,4);

        sum(integers);


    }





    private static double sum(List<? extends Number>doubles){ // ? to WildCard dziedziczy p numerach wiec kazdy moze byc lista z kazdego rodzaju zmiennych numerycznych
        double sum=0.0;
        for (Number liczba:doubles ) {
            sum+= liczba.doubleValue();

        }
        return sum;
    }
}
