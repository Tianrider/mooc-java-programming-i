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

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;

    public Recipe(){
        this.name = "";
        this.cookTime = 0;
        ingredients = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCookTime(){
        return this.cookTime;
    }

    public void setCookTime(int cookTime){
        this.cookTime = cookTime;
    }

    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }

    public ArrayList<String> getIngredients(){
        return ingredients;
    }

    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookTime;
    }
}
