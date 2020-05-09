package Zadanie;

public class Testowa {
    public static void main(String[] args) {
        Shop shop=new Shop(2);
        Person pelnoletni=new Person(20);
        Person niepelnoletni=new Person(15);

        try{
            shop.sellVodka(pelnoletni);
            shop.sellVodka(niepelnoletni);
        } catch (InvalidAgeException e){
            e.printStackTrace();
        } catch(NoVodkaException e){
            e.printStackTrace();
        }
    }
}
