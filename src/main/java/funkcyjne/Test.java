package funkcyjne;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Czlowiek czlowiek=new Czlowiek(18, "Mateusz");
        Czlowiek czlowiek1=new Czlowiek(15, "adam");
        Czlowiek czlowiek2=new Czlowiek(19, "adrian");

        Checker checker=czl-> {return true;};

        List <Czlowiek> czlowieki=Arrays.asList(czlowiek,czlowiek1,czlowiek2);

        List<String> listaImion = czlowieki.stream().map(czl1 -> {
            return czl1.getImie();
        })
                .collect(Collectors.toList());//zamienia czlowieka na jego imie i tworzy liste


        List<String>listaImion2=czlowieki.stream().map(Czlowiek::getImie).collect(Collectors.toList()); //:: przyjmuje kazdy element z Czlowieka

        System.out.println(listaImion);


        czlowieki.forEach(czlowiek8-> System.out.println(czlowiek8.getImie()));
//        drukuj(czlowieki,czl->{return czl.getWiek()>=18;});
//
//        czlowieki.stream()
//                .filter(p->p.getWiek()>=18)
//                .forEach(p->System.out.println(p));
//
//        drukuj(Arrays.asList(czlowiek,czlowiek1), p->p.getWiek()>18);//lambda - programowanie funkcyjne
//        // (a)->{   }
//        //po lewej argumenty, po prawej co ma sie wykonac
//
//
//        Checker ageChecker=czlowiek4 -> {return true;};
//        drukuj(czlowieki, czlowiek3 -> {return true;});
//        drukuj(czlowieki,czlowiek4 -> {return czlowiek4.getWiek()>18;});
//    }

//    public static void drukuj(List<Czlowiek>czlowieki, Predicate<Czlowiek> checker){
//
//        for (Czlowiek czlowiek : czlowieki) {
//            if(checker.test(czlowiek)){
//                System.out.println(czlowiek.getImie());
//            }
//        }
//    }
}}
