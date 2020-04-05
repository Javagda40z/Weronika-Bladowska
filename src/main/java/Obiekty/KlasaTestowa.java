package Obiekty;

import java.util.ArrayList;
import java.util.List;

public class KlasaTestowa {

    public static void main(String[] args) {

        Animal zwierzeta[]= new Animal[5];
        List<Animal> listaZwierzat = new ArrayList<>();

        zwierzeta[0]= new Cat("m");
        zwierzeta[1]= new Cat("k");
        zwierzeta[2]= new Dog("i");
        zwierzeta[3]= new Cow();
        zwierzeta[4]= new Dog("ii");

        listaZwierzat.add(new Dog("iiii"));
        listaZwierzat.add(new Cat("popo"));
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Cat("popopo"));
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Dog("popopopo"));
            //dajGlosDlaTablicyZwierzat(zwierzeta);  //wywoluje tablice
            dajGlosDlaTablicyZwierzat(listaZwierzat);
        }



    public static void dajGlosDlaTablicyZwierzat(List<Animal> zwierzeta) {

        for (Animal animal : zwierzeta) {

            animal.makeSound();
        }

}

}
