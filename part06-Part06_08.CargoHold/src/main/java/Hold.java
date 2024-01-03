/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitCases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        for (Suitcase currentCase : this.suitCases) {
            currentWeight += currentCase.totalWeight();
        }

        if (currentWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitCases.add(suitcase);
        }
    }

    public String toString() {
        int totalWeight = 0;
        for (Suitcase currentCase : this.suitCases) {
            totalWeight += currentCase.totalWeight();
        }

        if (this.suitCases.size() == 1) {
            return 1 + " suitacase (" + totalWeight + "kg)";
        }
        return this.suitCases.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitCases) {
            suitcase.printItems();
        }
    }
}
