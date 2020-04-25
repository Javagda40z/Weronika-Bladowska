package ZadaniaDomoweJavaPodst;

import java.util.Scanner;

public class RegexZastap {
    Scanner scanner = new Scanner(System.in);

    public String regexZastap(){
        System.out.println("Podaj wyraz na ktory chcesz zamienic Zycie w zdaniu: Zycie jest piekne");
        String wczytywany2=scanner.nextLine();
        String zdanie="Niebo jest piekne.";
        String zdanie2=zdanie.replaceAll("Niebo",wczytywany2);
            return zdanie2;
    }
}
