package TypyGeneryczne;

import com.sun.source.tree.BreakTree;

import java.util.List;

public class Miasto<T extends Mieszkaniec> { //okresla ze bedzie to typem generyznym

    private String nazwa;

    public Miasto(String nazwa) {
        this.nazwa = nazwa;
    }

    private List<T> mieszkancy;

    public List<T> getMieszkancy() {
        return mieszkancy;
    }

    public void setMieszkancy(List<T> mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public T znajdzMieszkancapoImieniu(String imie) {


        for (T  mieszkaniec : this.mieszkancy) {
            if (mieszkaniec.getImie().equals(imie)) {
                return mieszkaniec;

            }

        }
        return null;

    }

}

