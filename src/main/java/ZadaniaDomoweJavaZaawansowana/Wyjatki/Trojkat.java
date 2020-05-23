package ZadaniaDomoweJavaZaawansowana.Wyjatki;

public class Trojkat {

    static int bokA;
    static int bokB;
    static int bokC;

    public Trojkat(int bokA, int bokB, int bokC)  {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
//        if (bokA+bokB<bokC || bokB+bokC<bokA || bokA+bokC>bokB){
//            throw new TrojkatWyjatek("Z podanych bokow nie mozna stworzyc trojkata");
//        }
    }

    public static void main(String[] args) throws TrojkatWyjatek {

        Trojkat trojkat= new Trojkat(10,6,5);
        if (bokA+bokB<bokC){
            throw new TrojkatWyjatek("Z podanych bokow nie da sie utworzyc trojkata");
        }
    }
}
