package Zadanie;

public class Shop {

    public Shop(int iloscVodki){}

    private int iloscVodki;

    public void sellVodka(Person person) throws InvalidAgeException, NoVodkaException {

        if (person.getAge()<18){
            throw new InvalidAgeException("Nie masz 18 lat");
        }
        if(iloscVodki==0){
        throw new NoVodkaException("brak wodki");
        }
        iloscVodki--;
        System.out.println("sold");

    }
}
