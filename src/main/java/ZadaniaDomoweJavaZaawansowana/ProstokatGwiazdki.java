package ZadaniaDomoweJavaZaawansowana;

import java.util.Scanner;

public class ProstokatGwiazdki {

   static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj dlugosc boku prostokata: ");

        int bokA=scanner.nextInt();

        System.out.println("Podaj dlugosc drugiego boku prostokata: ");

        int bokB=scanner.nextInt();

        for (int i = 0; i <bokA ; i++) {
            for (int j = 0; j <bokB-1 ; j++) {
                System.out.print("*");

            }
            System.out.println("*");
        }
    }
}
