package PozostaleZadaniaDomowe;

import java.util.ArrayList;
import java.util.List;

public class Czlowiek extends Object//kazda klasa dziedziczy po obiekcie
 {
     private String imie;//pole klasy - jej atrybut

     private static List<String>listaImion=new ArrayList<>();

     private Czlowiek(){

     }

//     public Czlowiek(String imie){
//            this.imie=imie;
//        }

     public void wypiszImie(){
         System.out.println(imie);
     }

     public static void zrobCos(){

     }

   public static Czlowiek stworzCzlowieka(String imie){

         if(listaImion.contains(imie)){
             return null;
         }

         Czlowiek czlowiek=new Czlowiek();
         czlowiek.imie=imie;
         listaImion.add(imie);

         return czlowiek;

   }

   public void gadaj(){
       System.out.println("gadam");
   }

   public void gadaj(String trescGadania){
       System.out.println(trescGadania);
   }

//    public static boolean czyTakieImieIstnieje(String imie){
//        for (Czlowiek czlowiek:listaImion ) {
//
//            if (imie.equals(czlowiek.imie)){
//                return true;
//            }
//
//        }
//    }
}
