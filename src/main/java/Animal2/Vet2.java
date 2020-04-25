package Animal2;

import Obiekty.Animal;
import Obiekty.Cat;
import Obiekty.Dog;
import Obiekty.Vet;

public class Vet2 {

    public void sayHello(Animal2 zwierze) {
        System.out.println("Witaj " + zwierze.getImie());
    }
    public static void main(String[] args) {

        Animal2 kot = new Cat2("filemonik");
        Animal2 pies= new Dog2("Burcio");

        Vet2 weterynarz = new Vet2();
        weterynarz.sayHello(kot);
        weterynarz.sayHello(pies);

        Animal2 chomik =new Hamster("Chomiczek");
        weterynarz.sayHello(chomik);

    }



}
