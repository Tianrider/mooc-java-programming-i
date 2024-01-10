/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Bird {
    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public void addObserved(){
        this.observed++;
    }

    public int getObserved(){
        return this.observed;
    }
}
