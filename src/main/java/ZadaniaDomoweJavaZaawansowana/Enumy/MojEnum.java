package ZadaniaDomoweJavaZaawansowana.Enumy;

public enum MojEnum {

    TYP1(1), TYP2(2), TYP3(3);

    public int wartosc;

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    MojEnum(int wartosc) {
        this.wartosc=wartosc;

    }

    public int zwrocWartoscEnuma(int wartosc){
        return wartosc;
    }
}
