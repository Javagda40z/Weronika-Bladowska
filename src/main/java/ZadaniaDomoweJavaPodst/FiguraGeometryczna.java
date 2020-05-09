package ZadaniaDomoweJavaPodst;

public abstract class FiguraGeometryczna {
    String kolor;
    String nazwa;

    public FiguraGeometryczna(String kolor, String nazwa) {

        this.kolor=kolor;
        this.nazwa=nazwa;
    }


    public abstract double poleFigury();

    public String getKolor() {
        return kolor;
    }

    public String getNazwa() {
        return nazwa;
    }
}

