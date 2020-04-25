package Animal2;

public class Hamster extends Animal2 {
    public Hamster(String imie) {
        super(imie);
    }

    @Override
    void makeSound() {
        System.out.println("Chrum");
    }

    @Override
    public void move() {
        System.out.println("Biegam");
    }
}
