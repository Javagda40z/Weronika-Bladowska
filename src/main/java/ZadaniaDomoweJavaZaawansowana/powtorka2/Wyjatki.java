package ZadaniaDomoweJavaZaawansowana.powtorka2;

import java.io.IOException;

public class Wyjatki {
    public static void main(String[] args) {

        boolean zmienna=true;

//        try(){
//            nawiazPolaczenie();
//            metodaKtoraRzucaWyjatekCzasem(zmienna);
//        }
//        catch (IOException e){
//            System.out.println("Polecial wyjatek uzywam innej metody");
//            metodaBezWyjatku(zmienna);
//            zerwijPolaczenieZBaza();
//        }
//        finally {
//            zerwijPolaczenieZBaza();
//        }


        try(DBConnector connector=new DBConnector()){
//            metodaKtoraRzucaWyjatekCzasem(zmienna);
        } catch (SDAException e){
            System.out.println("Polecial wyjatek");
            metodaBezWyjatku(zmienna);
        }

    }

    private static void metodaKtoraRzucaWyjatekCzasem(boolean zmienna) throws IOException {
        if(zmienna) {
            throw new IOException();
        }
    }

    private static void metodaBezWyjatku(boolean zmienna){

    }

    private static void zerwijPolaczenieZBaza(){
        System.out.println("Koniec polaczenia z baza");
    };

    private static void nawiazPolaczenie(){
        System.out.println("Lacze z baza");
    }
}
