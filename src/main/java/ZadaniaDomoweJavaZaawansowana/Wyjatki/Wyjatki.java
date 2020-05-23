package ZadaniaDomoweJavaZaawansowana.Wyjatki;

public class Wyjatki {

    public static int dziel(int a, int b){

        if(b==0){
            throw new ArithmeticException("Nie mozna dzielic przez 0");
        }
        return a/b;
    }

    public static void sprawdzCzyPelnoletni(int wiek) throws NiepelnoletniException{
        if (wiek < 18) {
            throw new  NiepelnoletniException("Nie jestes pelnoletni");

        }

    }


    public static void main(String[] args)  {
//        dziel(5,0);
        try {
            sprawdzCzyPelnoletni(17);
        }
        catch (NiepelnoletniException e){
//            e.printStackTrace();
            System.out.println("Jestes niepelnoletni");
        } finally {
            System.out.println("I co z tego?");
        }

    }
}
