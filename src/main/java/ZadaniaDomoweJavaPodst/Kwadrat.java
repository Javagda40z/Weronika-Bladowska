package ZadaniaDomoweJavaPodst;

public class Kwadrat extends FiguraGeometryczna{

    int bok;
    String kolor;
    String nazwa;

    public Kwadrat(int bok, String kolor, String nazwa){
        super(kolor, nazwa);
        this.bok=bok;

    }

    @Override
    public double poleFigury() {
        return bok*bok;
    }

    public String getKolor() {
        return kolor;
    }

    public String getNazwa() {
        return nazwa;
    }
}
