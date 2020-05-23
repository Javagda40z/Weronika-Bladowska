package ZadaniaDomoweJavaZaawansowana.Enumy;

public enum Obliczenia {

    DODAWANIE, ODEJMOWANIE, MNOZENIE, DZIELENIE;

    double obliczanie(double x, double y){

        switch (this){

            case DODAWANIE:
                return x+y;

            case ODEJMOWANIE:
                return x-y;

            case MNOZENIE:
                return x*y;

            case DZIELENIE:
                return x/y;
            default:
                throw new AssertionError("Nieznana operacja:"+ this);
        }

    }
}
