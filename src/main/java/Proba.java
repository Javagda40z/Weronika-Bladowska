public class Proba {

    public static void main(String[] args) {
       int i=5;
       double d=6.2;
       float f=10;

        System.out.println(i);
        System.out.println(d);
        System.out.println(f);

        System.out.println(i*d);

        System.out.println(dodaj(5,6));
        System.out.println(odejmij(9,2));
        System.out.println(pomnoz(9,2));
        System.out.println(podziel(10,0));

        System.out.println(czyParzysta(5));
        System.out.println(czyParzysta(4));
    }

    public static int dodaj (int a, int b){

        return a+b;
    }

    public static int odejmij (int a, int b){

        return a-b;
    }

    public static int pomnoz (int a, int b){

        return a*b;
    }

    public static double podziel(int a, int b){

        return ((double)a)/b;
    }

    public static boolean czyParzysta(int a){
        return a%2 ==0;
    }
}
