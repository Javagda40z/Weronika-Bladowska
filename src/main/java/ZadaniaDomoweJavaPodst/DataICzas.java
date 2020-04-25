package ZadaniaDomoweJavaPodst;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

public class DataICzas {
 static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        dzisiejszaDataIGodzina();

        ileDniDoKoncaRoku();

        ileDni();

        dodawanieIOdejmowanieDni();

        czyPrzestepnyRok();

        formatDaty();

    }




    public static void dzisiejszaDataIGodzina(){

        System.out.println(LocalDateTime.now());
    }

    public static void ileDniDoKoncaRoku(){

        LocalDate dzis=LocalDate.now();
        int dzien=dzis.getDayOfYear();
        int rok=dzis.getYear();

        if(rok%4==0){
            System.out.println("Do konca roku pozostalo "+ (366-dzien) + " dni");
            System.out.println("Od poczaktu roku minelo "+ dzien + " dni");
        } else {
            System.out.println("Do konca roku pozostalo "+ (365-dzien) + " dni");
            System.out.println("Od poczatku roku minelo "+ dzien+ " dni");
        }

    }


        public static long ileDni(){


            System.out.println("Podaj rok pierwszej daty:");
            int rok1 = scanner.nextInt();
            System.out.println("Podaj miesiac pierwszej daty");
            int miesiac1 = scanner.nextInt();
            System.out.println("Podaj dzien pierwszej daty");
            int dzien1 = scanner.nextInt();

            System.out.println("Podaj rok drugiej daty");
            int rok2 = scanner.nextInt();
            System.out.println("Podaj miesiac drugiej daty");
            int miesiac2 = scanner.nextInt();
            System.out.println("Podaj dzien drugiej daty");
            int dzien2 = scanner.nextInt();

            Calendar c1=Calendar.getInstance();
            Calendar c2=Calendar.getInstance();
            c1.set(rok1, miesiac1, dzien1);
            c2.set(rok2, miesiac2, dzien2);

            System.out.println("Miedzy datami minelo " +Math.round((c1.getTimeInMillis() - c2.getTimeInMillis())/ (1000 * 60 * 60 * 24)) + " dni");

            return Math.abs(Math.round((c1.getTimeInMillis() - c2.getTimeInMillis())/ (1000 * 60 * 60 * 24)));

        }




        public static  LocalDate dodawanieIOdejmowanieDni (){

            SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
            System.out.println("Podaj rok daty");
            int rok=scanner.nextInt();
            System.out.println("Podaj miesiac daty");
            int miesiac=scanner.nextInt();
            System.out.println("Podaj dzien daty");
            int dzien=scanner.nextInt();

            LocalDate podanaData=LocalDate.of(rok,miesiac, dzien);
            System.out.println("Podaj ile dni chcesz dodac do daty: ");
            int ileDniDodac=scanner.nextInt();

            LocalDate nowaData=podanaData.plusDays(ileDniDodac);

            System.out.println("Nowa data to: "+nowaData);

            return nowaData;
        }




        public static void czyPrzestepnyRok(){
            System.out.println("podaj rok, by sprawdzic, czy jest przestepny: ");
        int rok=scanner.nextInt();

        if(rok%4==0){
            System.out.println("Podany rok jest przestępny!");
        } else {
        System.out.println("Podany rok nie jest przestępny");
    }}

        public static LocalDateTime formatDaty(){

        SimpleDateFormat format=new SimpleDateFormat("HH:mm, yyyy/MM/dd");
        LocalDateTime data= LocalDateTime.now();
            System.out.println(format.format(data));
            return data;
            }

    }




