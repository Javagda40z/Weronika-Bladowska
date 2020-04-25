package Animal2;

public class Dog2 extends Animal2 {
    public Dog2(String imie) {
        super(imie);
    }

    @Override
    void makeSound() {
        System.out.println("Hauuu hauu");
    }

    @Override
    public void move() {
        System.out.println("Biega");
    }
}
