package Hashcode;

public class Czlowiek {

    private String imie;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Czlowiek(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Czlowiek czlowiek = (Czlowiek) o;

        if (wiek != czlowiek.wiek) return false;
        return imie.equals(czlowiek.imie);
    }   // jezeli equals jest rowny to hascode tez
    // jzeli hashcode jest rowny to equals nie musi zwracac true
    // hashcode jest zawszew taki sam dla niezmienionych danych
    // hashcode jest glownie uzywany w kolekcjach javy

    @Override
    public int hashCode() {    //hashcode nie powinien sie zmieniac dla obiektu ktory sie nie zmienia,
        int result = imie.hashCode();
        result = 31 * result + wiek;
        return result;
    }
}
