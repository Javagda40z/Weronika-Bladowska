package Pojazd;

public abstract class Pojazdy {

    private String rejestracja;
    private Typ typ;   //uzywamy enum bo to typ tyliczeniowy do okreslonych wartosci
    private Paliwo paliwo;

    public Pojazdy(String rejestracja, Typ typ, Paliwo paliwo) {
        this.rejestracja = rejestracja;
        this.typ = typ;
        this.paliwo = paliwo;
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public Typ getTyp() {
        return typ;
    }

    public Paliwo getPaliwo() {
        return paliwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pojazdy pojazdy = (Pojazdy) o;

        return rejestracja.equals(pojazdy.rejestracja);
    }

    @Override
    public int hashCode() {
        return rejestracja.hashCode();
    }
}
