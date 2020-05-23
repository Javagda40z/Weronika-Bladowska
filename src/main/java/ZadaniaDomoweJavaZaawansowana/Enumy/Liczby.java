package ZadaniaDomoweJavaZaawansowana.Enumy;

public enum Liczby {

    JEDEN(1), DWA(2), TRZY(3), CZTERY(4);

    Liczby(int liczba) {
        this.liczba=liczba;
    }

    public int liczba;

    public int getLiczba() {
        return liczba;
    }

    public void wypiszCyfreDlaEnuma(Liczby liczby) {

        switch (liczby){

            case JEDEN -> System.out.println("1");
            case DWA -> System.out.println("2");
            case TRZY -> System.out.println("3");
            case CZTERY -> System.out.println("4");
        }


    }
}