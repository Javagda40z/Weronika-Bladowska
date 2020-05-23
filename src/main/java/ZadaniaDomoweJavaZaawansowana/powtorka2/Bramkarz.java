package ZadaniaDomoweJavaZaawansowana.powtorka2;

public class Bramkarz extends Zawodnik implements Sprinter {

    public void bron(){
        System.out.println("Bronie");
    }

    @Override
    public void kopnij() {
        System.out.println("Kopnijjj");
    }

    @Override
    public void sprint() {
        System.out.println("Lekki sprint");
    }
}
