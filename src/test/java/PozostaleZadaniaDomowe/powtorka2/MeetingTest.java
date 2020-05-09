package PozostaleZadaniaDomowe.powtorka2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class MeetingTest {

    private Meeting meeting;

    @BeforeEach  //dzieki tym adnotacjom Junit wie czego szukac
    void setUp() {//przed kazdym testem ma sie zrobic setup
        meeting=new Meeting("opis","adres");
    }

    @Test
    void testIfDefaultDateIsNow() {

        LocalDate now=LocalDate.now();
        LocalDate date=meeting.getDate();

        if(now.equals(date)){
            //test przeszedl
        } else {
            //test nie przeszedl
        }

        assertEquals(LocalDate.now(),meeting.getDate(), "Domyslna data powinna byc dzisiejsza");
        assertTrue(now.equals(date));
    }

    @Test
    void testIfDefaultRoomCapacityIs18() {

        assertEquals(18,meeting.getSize(),"Domyslny rozmiar sali to 18");

    }

    @Test
    void testWhenDelayingMeeting(){
        meeting.delayMeeting(5);
        assertEquals(LocalDate.now().plusDays(5),meeting.getDate());
    }

    //dodaj test ktory sprawdza czy opoznianie spotkania o 0 dni daTA spotkania sie nie zmienia

}