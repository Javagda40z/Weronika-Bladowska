package ZadaniaDomoweJavaZaawansowana.powtorka2;
import java.util.Arrays;
import java.util.List;

public class Boisko {

    public static void main(String[] args) {
        Bramkarz bramkarz=new Bramkarz();
        Pilkarz pilkarz=new Pilkarz();
        //Zawodnik zawodnik=new Zawodnik(); zawodnik jest abstract i nie mozna go utworzyc

        Zawodnik bramkarz1=new Bramkarz();
        Zawodnik pilkarz1=new Pilkarz();

//        Bramkarz bramkarz2=(Bramkarz)bramkarz1;
//        bramkarz2.bron();
//
//        Bramkarz bramkarz3=(Bramkarz) pilkarz1;
//        bramkarz3.bron();

        bramkarz1.kopnij();
        pilkarz1.kopnij();

        Sprinter bramkarzSprinter=new Bramkarz();
        Sprinter pilkarzSprinter=new Pilkarz();
        niechWszyscySprinterzyBiegajaSprintem(Arrays.asList(bramkarzSprinter,pilkarzSprinter));

    }
    public static void niechWszyscySprinterzyBiegajaSprintem (List<Sprinter> sprinterList){
        for (Sprinter sprinter:sprinterList){
//            sprinter.sprint;
        }
//             ) {
//
//        }

    }
}
