package ZadaniaDomoweJavaPodst;

public class Trojkat extends FiguraGeometryczna {

   int podstawa;
 int wysokosc;
    String kolor;
     String nazwa;

    public Trojkat(int podstawa, int wysokosc, String kolor, String nazwa) {
        super(kolor, nazwa);
        this.podstawa=podstawa;
        this.wysokosc=wysokosc;


    }

    public double poleFigury() {

        return (double)1/2 * podstawa * wysokosc;
    }

    public String getKolor() {
        return kolor;
    }

    public String getNazwa() {
        return nazwa;
    }
}
