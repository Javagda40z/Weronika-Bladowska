package Obiekty;

public class Cat implements Animal{

    public void drap(){
        //kot drapie
    }

    @Override
    public void makeSound() {
        System.out.println("Miauuu");
    }
}
