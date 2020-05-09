package ZadaniaDomoweJavaPodst;

public class Prostokat extends FiguraGeometryczna {

  int bokA;
   int bokB;
     String kolor;
    String nazwa;

    public Prostokat(int bokA, int bokB, String kolor, String nazwa){
        super(kolor, nazwa);
        this.bokA=bokA;
        this.bokB=bokB;

    }

    public double poleFigury(){

        return bokA*bokB;
    }

    public String getKolor() {
        return kolor;
    }

    public String getNazwa() {
        return nazwa;
    }
}
