package Petle;

public class LiczbyPierwsze {
    public static void main(String[] args) {

//        System.out.println(MathUtils.czyPierwsza(2));
//        System.out.println(MathUtils.czyPierwsza(3));
//        System.out.println(MathUtils.czyPierwsza(5));
//        System.out.println(MathUtils.czyPierwsza(9));
        int[] tablicaLiczbPierwszych=new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        PrimeNumberChecker sprawdzator = new PrimeNumberChecker(tablicaLiczbPierwszych);
        System.out.println(sprawdzator.czyPierwsza(30));
    }
}
