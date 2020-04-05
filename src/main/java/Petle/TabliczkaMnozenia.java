package Petle;

public class TabliczkaMnozenia {
       //public static final int LICZBA =5; dostep z zewnatrz

    private final int liczba;

    public TabliczkaMnozenia(int liczba) {  //konstruktor
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void wypiszTabliczke(){
        System.out.println("Tabliczka mnozenia dla liczby: "+ liczba);
        for (int i=1; i<=liczba; i++){
            System.out.println(liczba + " x "+ i + " = " + liczba*i);
        }
    }
}
