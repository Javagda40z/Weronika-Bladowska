package ZadaniaDomoweJavaZaawansowana.Enumy;

import static ZadaniaDomoweJavaZaawansowana.Enumy.Liczby.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(JEDEN.getLiczba());
        System.out.println(DWA.getLiczba());
        System.out.println(TRZY.getLiczba());
        System.out.println(CZTERY.getLiczba());



        for (Liczby liczby: Liczby.values()) {
            System.out.println(liczby);
        }

        MojEnum.TYP1.setWartosc(55);
        System.out.println(MojEnum.TYP1.getWartosc());
        System.out.println(MojEnum.TYP2.getWartosc());
        System.out.println(MojEnum.TYP3.getWartosc());


        System.out.println(Obliczenia.DODAWANIE.obliczanie(3, 6));
        System.out.println(Obliczenia.ODEJMOWANIE.obliczanie(3, 6));
        System.out.println(Obliczenia.MNOZENIE.obliczanie(3, 6));
        System.out.println(Obliczenia.DZIELENIE.obliczanie(3, 6));

    }

}




