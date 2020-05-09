package PozostaleZadaniaDomowe;

import java.util.Scanner;

public class ResztaZDzielenia {

    int dzielna;
    int dzielnik;
    int reszta;
    int wynik;

   static Scanner scanner=new Scanner(System.in);

   public ResztaZDzielenia(int dzielna, int dzielnik){
       this.dzielnik=dzielnik;
       this.dzielna=dzielna;
   }

    public void resztaZDzielenia(){

        wynik=dzielna/dzielnik;
        if(wynik*dzielnik!=dzielna){
//            reszta=((wynik+1)*dzielnik)-wynik;
            reszta=dzielna-(wynik*dzielnik);
        } else reszta=0;

        System.out.println("Reszta z dzielenia wynosi: "+ reszta);
    }


    public static void main(String[] args) {

       ResztaZDzielenia resztaZDzielenia=new ResztaZDzielenia(30,8);
       resztaZDzielenia.resztaZDzielenia();


    }

}
