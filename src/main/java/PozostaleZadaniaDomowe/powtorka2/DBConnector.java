package PozostaleZadaniaDomowe.powtorka2;

public class DBConnector implements AutoCloseable {

    private boolean czyJestPolaczenie;
    public DBConnector() {
        System.out.println("Lacze z baza");
        czyJestPolaczenie=true;
    }

    public boolean isCzyJestPolaczenie() {
        return czyJestPolaczenie;
    }

    @Override
    public void close() throws SDAException {

        System.out.println("Koncze polaczenie z baza");
        czyJestPolaczenie=false;
    }
}
