package Petle;

public class Application {
    public static void main(String[] args) {

        for (int i=0; i<=100; i++) {
            System.out.println(i);
        }

        for (int i=100; i>=0; i--){
            System.out.println(i);
        }
        int i=0;
        while (i<101) {
            System.out.println(i);
            i++;
        }

        for (int j=300; j<=1000; j++){ //liczby podzielne przez 2 i 3 na raz
            if (j%3==0 && j%2==0) {
                System.out.println(j);
            }
        }
        String napis= "Jestem na dobrej drodze do zostania profesjonalnym proramista Java";

        for (int y=0; y<=10; y++){
                    System.out.println("nr " +y+ napis);
        }

        for (int y=0; y<napis.length(); y=y+2){   //wypisywanie co drugiego elementu
            System.out.print(napis.charAt(y));

        }
//        for (int x =napis.length()-1; x>=0; x--){ //wypisywanie od tylu
//            System.out.print(napis.charAt(x));
//        }
//        while(true){
//            System.out.println(napis);
//        }
    }

    public static void dodawanie (int a, int b, int c){

        int suma = 0;
        while(suma<c){
            suma= suma + (a+b);
        }
        System.out.println(suma);

    }
}
