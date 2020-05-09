package ZadaniaDomoweJavaPodst;


import java.util.ArrayList;
import java.util.List;

public class FiguryMain {

    public static void main(String[] args) {

        FiguraGeometryczna kolo=new Kolo(5,"czerwone", "koleczko");
        FiguraGeometryczna kwadrat=new Kwadrat(3,"niebieski", "kwadracik");
        FiguraGeometryczna prostokat=new Prostokat(4,6,"zielony", "prostokacik");
        FiguraGeometryczna trojkat = new Trojkat(4,5,"fioletowy", "trojkacik");


        List<FiguraGeometryczna>lista=new ArrayList<>();
        lista.add(kolo);
        lista.add(kwadrat);
        lista.add(prostokat);
        lista.add(trojkat);

        for (FiguraGeometryczna figuraGeometryczna:lista) {

            System.out.printf("Pole figury %s %s wynosi %.1f\n",figuraGeometryczna.nazwa, figuraGeometryczna.kolor, figuraGeometryczna.poleFigury());

            

        }



    }
}
