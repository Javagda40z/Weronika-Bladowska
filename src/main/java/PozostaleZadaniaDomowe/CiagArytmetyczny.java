package PozostaleZadaniaDomowe;

public class CiagArytmetyczny {

    int dlugosc;
    int pierwszyElement;
    int roznicaCiagu;

   public CiagArytmetyczny(int dlugosc, int pierwszyElement, int roznicaCiagu){
       this.dlugosc=dlugosc;
       this.pierwszyElement=pierwszyElement;
       this.roznicaCiagu=roznicaCiagu;
   }

   public void stworzCiagArytmetyczny(){

       int tablica[]= new int[dlugosc];
       tablica[0]=pierwszyElement;
       System.out.print(tablica[0]+" ");
       for (int i = 1; i <dlugosc ; i++) {

           tablica[i]=tablica[i-1]+roznicaCiagu;
           System.out.print(tablica[i]+" ");

       }

   }


    public static void main(String[] args) {

        CiagArytmetyczny ciagArytmetyczny=new CiagArytmetyczny(5,5,5);
        ciagArytmetyczny.stworzCiagArytmetyczny();

    }

}
