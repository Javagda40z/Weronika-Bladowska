package Zadanie;

public class EnumTestowa {
    public static void main(String[] args) {

        Koszulka koszulka=new Koszulka();
        koszulka.setRozmiarEnum(RozmiarEnum.M);
        System.out.println(RozmiarEnum.values());

        for (RozmiarEnum value:RozmiarEnum.values()
             ) {
            System.out.println("Rozmiar dla " + value);
            System.out.println("to "+value.getDlugosc()+"x"+value.getSzerokosc());

        }
    }
}
