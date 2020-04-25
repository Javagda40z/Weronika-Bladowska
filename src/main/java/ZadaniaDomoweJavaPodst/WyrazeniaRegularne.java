package ZadaniaDomoweJavaPodst;

import java.util.Scanner;

public class WyrazeniaRegularne {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        RegexZastap regexZastap = new RegexZastap();
        System.out.println(regexZastap.regexZastap());  //zastepuje wyraz w zdaniu podanym przez uzytkownika

        czyZawieraTylkoLiczby(); //sprawdza czy dany ciagznakow zawiera tylko liczby

        System.out.println("Zdanie bez bialych znakow:" + usunBialeZnaki());  //usuwa biale znaki

        sprawdzCzySameLiteryIDlugoscPiec();

        sprawdzCzyZdanie();

        sprwdzCzyZmiennoprzecinkowa();

        sprawdzCzyPoprawnyNumerTelefonu();
    }


    public static void czyZawieraTylkoLiczby() {

        System.out.println("Podaj dowolny ciag znakow:");
        String wczytywany3 = scanner.nextLine();
        String regex2 = "[0-9]*";
        if (wczytywany3.matches(regex2)) {
            System.out.println("Podana dana zawiera tylko liczby");
        } else {
            System.out.println("Podana dana nie zawiera wylacznie liczb");
        }

    }


    public static String usunBialeZnaki() {
        System.out.println("Wpisz dowolne zdanie:");
        String zdanie = scanner.nextLine();
        String zdanieBezBialychZnakow = zdanie.replaceAll("\\s+", "");
        return zdanieBezBialychZnakow;
    }


    public static void sprawdzCzySameLiteryIDlugoscPiec() {

        System.out.println("Podaj dowolne zdanie: ");

        String regex3 = "[a-zA-Z]*";
        String wczytywaneZdanie = scanner.nextLine();

        if (wczytywaneZdanie.matches(regex3)) {
            System.out.print("Podanie zdanie zawiera tylko litery");
        } else {
            System.out.print("Podane zdanie zawiera nietylko litery");
        }

        if (wczytywaneZdanie.length() == 5) {
            System.out.println(" oraz ma dlugosc pieciu znakow");
        } else {
            System.out.println(" oraz jego dlugosc nie wynosi 5 znakow");

        }
    }


    public static void sprawdzCzyZdanie() {

        System.out.println("Podaj dowolne zdanie:");
        String wczytywaneZdanie2 = scanner.nextLine();

        if (wczytywaneZdanie2.endsWith(".")) {
            System.out.println("Podane wyrazenie jest zdaniem");
        }

    }


    public static void sprwdzCzyZmiennoprzecinkowa() {

        System.out.println("Podaj dowolna liczbe wymierna");
        String liczba = scanner.nextLine();
        String regex4 = "\\d+.\\d+";
        if (liczba.matches(regex4)) {
            System.out.println("Jest to liczba zmiennoprzecinkowa");
        } else {
            System.out.println("Nie jest to liczba zmiennoprzecinkowa");

        }


    }


    public static void sprawdzCzyPoprawnyNumerTelefonu(){
        System.out.println("Podaj nr telefonu");
        String numerTelefonu=scanner.nextLine();
        String regex5="[0-9]{9}";
        String regex6="[0-9]{3}-[0-9]{3}-[0-9]{3}";

        if(numerTelefonu.matches(regex5) || numerTelefonu.matches(regex6)){
            System.out.println("Poprawny nr telefonu");
        } else{
            System.out.println("Niepoprawny numer telefonu");
        }

    }
}



