package ZadaniaDomoweJavaZaawansowana;

public class Test {
    public static void main(String[] args) {


//    Czlowiek czlowiek=new Czlowiek();
//    czlowiek.imie="Mateusz";
//    czlowiek.wypiszImie();
//
//    Czlowiek czlowiek1=new Czlowiek("nissia");
//    czlowiek1.wypiszImie();
//    Czlowiek.zrobCos(); //metoda statyczna - przypisana do klasy a nie do obiektu - przy narzedziach pomocniczych jest przydatne

        Czlowiek czlowiek2=Czlowiek.stworzCzlowieka("Mateusz");
        Czlowiek czlowiek3=Czlowiek.stworzCzlowieka("Mateusz");
        System.out.println(czlowiek2);
        czlowiek2.wypiszImie();
        System.out.println(czlowiek3);

        czlowiek2.gadaj();
        czlowiek3.gadaj("amkoj");

}}
