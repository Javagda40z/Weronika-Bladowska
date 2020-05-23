package EnumZadanie.Kalkulator;

public enum Operation {

    PLUS,MINUS, DODATKOWAOPERACJA;

    double calculate(double x,double y){

        switch (this){

            case PLUS:
                return x+y;

            case MINUS:
                return x-y;
            default:
                throw new AssertionError("Nieznana operacja:"+ this);
        }

    }
}
