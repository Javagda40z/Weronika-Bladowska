package PozostaleZadaniaDomowe.powtorka2;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Meeting meeting=new Meeting("opis","adres");
        Meeting meeting1=new Meeting("opis2", LocalDate.now().plusDays(2), "adres2", 20);

        System.out.println(meeting.opisSpotkania());
        System.out.println(meeting1.opisSpotkania());
    }
}
