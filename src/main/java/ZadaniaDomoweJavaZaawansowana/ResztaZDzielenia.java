package ZadaniaDomoweJavaZaawansowana;

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

    public void obliczReszteZDzielenia(){

        wynik=dzielna/dzielnik;
        if(wynik*dzielnik!=dzielna){

            reszta=dzielna-(wynik*dzielnik);
        } else reszta=0;

        System.out.println("Reszta z dzielenia wynosi: "+ reszta);
    }

    public void sprawdzenieModulo(int dzielna, int dzielnik){
        if(dzielna % dzielnik == reszta) {
            System.out.println("Modulo jest obliczone poprawnie");
        }


    }


    public static void main(String[] args) {

       ResztaZDzielenia resztaZDzielenia=new ResztaZDzielenia(30,8);
       resztaZDzielenia.obliczReszteZDzielenia();
       resztaZDzielenia.sprawdzenieModulo(30,8);




    }



}
