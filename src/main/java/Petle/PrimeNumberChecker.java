package Petle;

public class PrimeNumberChecker {

    private int[] liczbyPierwsze;

    public PrimeNumberChecker(int[] liczbyPierwsze) {
        this.liczbyPierwsze = liczbyPierwsze;
    }

    public boolean czyPierwsza(int a) {
        boolean isEqual=false;
        for (int i: liczbyPierwsze){
            if(i==a){
                return true;
            }
        }
        return false;
    }
}
