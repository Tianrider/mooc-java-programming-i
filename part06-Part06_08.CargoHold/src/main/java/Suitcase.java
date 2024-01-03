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

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int weight) {
        this.maxWeight = weight;
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item itemWeight : items) {
            totalWeight += itemWeight.getWeight();
        }

        if (maxWeight >= totalWeight + item.getWeight()) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public String toString() {
        int totalWeight = totalWeight(); 
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }
        if (this.items.size() == 1) {
            return 1 + " item (" + totalWeight + "kg)";
        }
        return this.items.size() + " items (" + totalWeight + "kg)";
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }

    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for(Item item : items){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
}
