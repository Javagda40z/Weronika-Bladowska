package Obiekty;

public class Cow implements Animal {

    public void dajeMleko(){
        //krowa daje mleko
    }

    @Override         //metoda jesst nadpisywana z klasy ktora implementujemy
    public void makeSound() {
        System.out.println("Muuuuuu");
    }

    @Override
    public void move() {
        System.out.println("Laze po polu");
    }
}
