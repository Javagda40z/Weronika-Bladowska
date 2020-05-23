package funkcyjne;

@FunctionalInterface
public interface Checker {   //interfejs funkcyjny musi miec tylko jedna metode

    boolean check(Czlowiek czlowiek);
}
