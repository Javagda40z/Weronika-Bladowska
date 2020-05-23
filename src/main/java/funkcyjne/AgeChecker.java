package funkcyjne;

public class AgeChecker implements Checker {

    @Override
    public boolean check(Czlowiek czlowiek) {
        return czlowiek.getWiek()>=18;

    }
}
