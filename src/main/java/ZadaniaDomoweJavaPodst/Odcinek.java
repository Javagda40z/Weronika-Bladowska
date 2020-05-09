package ZadaniaDomoweJavaPodst;

public class Odcinek extends Punkt {

    double wspolrzednaX2;
    double wspolrzednaY2;
    double dlugoscOdcinka;

    public Odcinek(double wspolrzednaX,double wspolrzednaY, double wspolrzednaX2, double wspolrzednaY2){
        super(wspolrzednaX, wspolrzednaY);
        this.wspolrzednaX2=wspolrzednaX2;
        this.wspolrzednaY2=wspolrzednaY2;
        
    }

    public double obliczDlugosOdcinka(){

        double dlugoscOdcinka= Math.abs(Math.sqrt(Math.pow(wspolrzednaX2-wspolrzednaX,2)+Math.pow(wspolrzednaY2-wspolrzednaY,2)));
        return dlugoscOdcinka;
    }

    public void narysujOdcinek(double dlugoscOdcinka){

        int dlugoscOdcinkaInt=(int) dlugoscOdcinka;
        System.out.print("|");

        for (int i=0; i< dlugoscOdcinkaInt;i++){
            System.out.print("-");
        }
        System.out.print("|");
        System.out.println();
    }




    public static void main(String[] args) {
        Odcinek odcinek=new Odcinek(1,2,4,5);

        System.out.println("Dlugosc odcinka to: " +odcinek.obliczDlugosOdcinka());

        odcinek.narysujOdcinek(5);
    }
}
