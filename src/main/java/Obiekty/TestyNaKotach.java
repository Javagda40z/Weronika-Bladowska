package Obiekty;

public class TestyNaKotach {

    public static void main(String[] args) {
        Cat kot = new Cat();
        //System.out.println(kot.getLicznikZlapanychMyszy());
        kot.eatMouse();
        kot.eatMouse();kot.eatMouse();kot.eatMouse();kot.eatMouse();kot.eatMouse();kot.eatMouse();

        if(czyPowinienDostacMleko(kot)){
            System.out.println("daje mleko");
        }else
            System.out.println("Za malo zjedzonych myzszy");

    }
    public static boolean czyPowinienDostacMleko(Cat cat){

        if(cat.getLicznikZlapanychMyszy()>10) {
            return true;
        }else
        return false;
    }
}
