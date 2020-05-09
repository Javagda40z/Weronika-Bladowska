package ZadaniaDomoweJavaPodst;

public class Kolo extends FiguraGeometryczna {

    int promien;
    String kolor;
    String nazwa;

    public Kolo(int promien, String kolor, String nazwa) {
        super(kolor, nazwa);
        this.promien=promien;

    }


    @Override
    public double poleFigury() {
        double poleKola=Math.PI * Math.pow(promien,2);
       return poleKola;
    }

    public String getKolor() {
        return kolor;
    }

    public String getNazwa() {
        return nazwa;
    }
}
