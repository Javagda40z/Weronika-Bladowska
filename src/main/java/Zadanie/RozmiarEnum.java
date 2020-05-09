package Zadanie;

public enum RozmiarEnum {

    S(50,100),M(55,110),L(60,115),XL(65,120);

    private int dlugosc;

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    private int szerokosc;

    RozmiarEnum(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }
}
