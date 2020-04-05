package Obiekty;

public class Dog implements Animal{
private String imie;

    public Dog(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void aportuj(){
        //pies aportuje
    }

    @Override
    public void makeSound() {
        System.out.println("Hau hau");
    }

    @Override
    public void move() {
        System.out.println("Biegam");
    }
}
