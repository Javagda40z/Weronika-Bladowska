package Animal2;

import Obiekty.Movable;
// pokazanie jak z klasa abstrakcyjna to zrobic
public abstract class Animal2 implements Movable {

    private String imie;

    public Animal2(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    abstract void makeSound();

}
