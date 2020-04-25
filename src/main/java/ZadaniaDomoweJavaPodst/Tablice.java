package ZadaniaDomoweJavaPodst;

import java.util.Arrays;

public class Tablice<tablica1> {
    static int[] tablica1= new int[]{6,3,5,7,1,1,7,9};
    static int[] tablica2 = new int[]{1,2,3,4,5,6,7,8};
    static double suma = 0;
    static int[] tablicaposortowana = new int[8];
    static int[] trzeciaTablica=new int[tablica1.length+tablica2.length];
    static int [] tablicaBezPowtorzen = new int[]{};

    public static void main(String[] args) {

        System.out.println("Tablica pierwsza: " +Arrays.toString(tablica1));
        System.out.println("Srednia liczb z tablicy 1 to: "+ Srednia());
        System.out.println("Najwieksza liczba z tablicy pierwszej to: "+ ZnajdzMax());
        System.out.println("Najmniejsza liczba z tablicy drugiej to: " + ZnajdzMin());
        System.out.println("Tablica druga: "+ Arrays.toString(tablica2));
        System.out.println("Suma tablic to: " +Arrays.toString(DodawanieTablic()));
        System.out.println("Iloczyn tablic to: " + Arrays.toString(MnozenieTablic()));
        System.out.println("Tablica pierwsza posortowana to:" + Arrays.toString(Sortowanie()));
        System.out.println("Pierwsza i druga tablica razem to: " + Arrays.toString(TrzeciaTablica()));
        System.out.println("Tablica w odwrotnej kolejnosci to : "+ Arrays.toString(WypiszWOdwrotnejKolejnosci()));
        System.out.println("Tablice bez powtorzen to:" + Arrays.toString(TabliceBezPowtorzen()));
    }

    public static double Srednia(){

        for (int i = 0; i < tablica1.length; i++) {
            suma = suma+ tablica1[i];
        }
        return suma/(tablica1.length);
    }

    public static int ZnajdzMax(){

        int max=tablica1[0];
        for (int i = 0; i <  tablica1.length; i++) {
            if(tablica1[i]>max){
                max=tablica1[i];
            }
        }
        return max;
    }

    public static int ZnajdzMin()  {

        int min=tablica1[0];

        for (int i = 0; i < tablica1.length ; i++) {
            if (tablica1[i]<min){
                min=tablica1[i];
            }

        }
        return min;
    }


    public static int[] DodawanieTablic(){

        int[] sumaTablic= new int[8];

        for (int i = 0; i < tablica1.length; i++) {

            sumaTablic[i]=tablica1[i]+tablica2[i];
        }
        Arrays.toString(sumaTablic);
        return sumaTablic;
    }

    public static int[] MnozenieTablic(){

        int mnozenieTablic[]=new int[8];
        for (int i = 0; i <tablica1.length ; i++) {

            mnozenieTablic[i]=tablica1[i]*tablica2[i];

        }
        Arrays.toString(mnozenieTablic);
        return mnozenieTablic;
    }

    public static int[] Sortowanie(){

        Arrays.sort(tablica1);
        return tablica1;
    }

    public static int[] TrzeciaTablica(){


        System.arraycopy(tablica1,0,trzeciaTablica,0,tablica1.length);
        System.arraycopy(tablica2,0,trzeciaTablica, tablica1.length, tablica2.length);
        return trzeciaTablica;

    }

    public static int[] WypiszWOdwrotnejKolejnosci(){

        int[]tablicaOdwrotna=new int[tablica1.length];
        int j=tablica1.length-1;

        for (int i =0;  i<tablica1.length ; i++) {
            tablicaOdwrotna[i]=tablica1[j];
            j--;
        }
        return tablicaOdwrotna;
    }

    public static int[] TabliceBezPowtorzen(){

        System.arraycopy(tablica1,0,trzeciaTablica,0,tablica1.length);
        System.arraycopy(tablica2,0,trzeciaTablica, tablica1.length, tablica2.length);
        int end = trzeciaTablica.length;
        for (int i = 0; i <end ; i++) {
            for (int j = i+1; j <end ; j++) {
                if (trzeciaTablica[i]==trzeciaTablica[j]){
                    int zmiennapomoc=j;
                    for (int k=j+1; k<end; k++, zmiennapomoc++) {
                        trzeciaTablica[zmiennapomoc]=trzeciaTablica[k];}
                    end--;
                    j--;
                }
                }
            }
        int[]tablicaBezPowtorzen=new int[end];
        for (int i = 0; i <end ; i++) {
            tablicaBezPowtorzen[i]=trzeciaTablica[i];

        }
        return tablicaBezPowtorzen;
        }


    }

