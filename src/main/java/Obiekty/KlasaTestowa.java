package Obiekty;

import java.util.ArrayList;
import java.util.List;

public class KlasaTestowa {

    public static void main(String[] args) {

        Animal zwierzeta[]= new Animal[5];
        List<Animal> listaZwierzat = new ArrayList<>();

        zwierzeta[0]= new Cat();
        zwierzeta[1]= new Cat();
        zwierzeta[2]= new Dog();
        zwierzeta[3]= new Cow();
        zwierzeta[4]= new Dog();

        listaZwierzat.add(new Dog());
        listaZwierzat.add(new Cat());
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Cat());
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Dog());
            dajGlosDlaTablicyZwierzat(zwierzeta);  //wywoluje tablice
            dajGlosDlaTablicyZwierzat(listaZwierzat);
        }



    public static void dajGlosDlaTablicyZwierzat(List<Animal> zwierzeta) {

        for (Animal animal : zwierzeta) {

            animal.makeSound();
        }

}

}
