package PozostaleZadaniaDomowe;

public class Produkt {

    public Produkt(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    String nazwa;
    int cena;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public double obliczanieCenyBrutto(){
        double cenaBrutto=cena*1.08;
        return cenaBrutto;
    }
}
