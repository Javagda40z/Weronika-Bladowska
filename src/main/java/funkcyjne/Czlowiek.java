package funkcyjne;

import javax.lang.model.element.NestingKind;

public class Czlowiek {

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Czlowiek(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    private int wiek;
    private String imie;
}
