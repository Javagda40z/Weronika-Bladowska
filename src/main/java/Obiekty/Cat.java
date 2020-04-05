package Obiekty;

public class Cat implements Animal, Movable{
private int licznikZlapanychMyszy=0;
private String imie;

    public Cat(String imie) {
        this.imie = imie;
    }

    public Cat() {

    }

    public String getImie() {  //bierzemy getera zeby mozna bylo cos zrobic z imieniem
        return imie;
    }

    public void drap(){
        //kot drapie
    }


    public void eatMouse(){


        licznikZlapanychMyszy++;  // =licznik=licznik+1;
        System.out.println("Zjadlem" + licznikZlapanychMyszy + "myszy");
    }

    @Override
    public void makeSound() {
        System.out.println("Miauuu");
    }
public int getLicznikZlapanychMyszy(){
        return licznikZlapanychMyszy*2;
}

    @Override
    public void move() {
        System.out.println("Kotek drepcze");
    }
}
