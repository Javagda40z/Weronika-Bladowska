package Kolekcje;

public class Gracz implements Comparable<Gracz>{

    private int iloscPunktow;
    private String imie;

    public int getIloscPunktow() {
        return iloscPunktow;
    }

    @Override
    public String toString() {
        return "Gracz{" +
                "ranking=" + iloscPunktow +
                ", imie='" + imie + '\'' +
                '}';
    }

    public void setIloscPunktow(int iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Gracz(int ranking, String imie) {
        this.iloscPunktow = ranking;
        this.imie = imie;
    }

    @Override
    public int compareTo(Gracz inny) {
        //this - inny
        //>= 1
        //0
        //<=-1
        return this.iloscPunktow -inny.iloscPunktow;
    }
}
