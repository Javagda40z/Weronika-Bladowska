package ZadaniaDomoweJavaZaawansowana.powtorka2;

import java.time.LocalDate;

public class Meeting {
    private String description;
    private LocalDate date;
    private String adress;
    private int size;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Meeting(String description, String adress) {
        this.description = description;
        this.adress = adress;
        this.date=LocalDate.now();
        this.size=18;
    }

    public Meeting(String description, LocalDate date, String adress, int size) {
        this.description = description;
        this.date = date;
        this.adress = adress;
        this.size = size;
    }

    public String opisSpotkania(){
        return "Opis: "+description+"\n"+
                "data: "+date+"\n"+
                "adres spotkania: "+adress;
    }

    public void delayMeeting(int days){

       date = date.plusDays(days);
    }

}
