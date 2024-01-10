
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipeList = new ArrayList<>();

        System.out.println("File to read: ");
        String filename = scanner.nextLine();

        System.out.println("Commands: \nlist- lists the recipes\nstop- stops the program\n");

        int i = 0;
        int recipesCount = 0;
        try(Scanner reader = new Scanner(Paths.get(filename))){
            recipeList.add(new Recipe());
            while(reader.hasNextLine()){
                String line = reader.nextLine();

                if(!line.isEmpty()){
                    if(i == 0){
                        recipeList.get(recipesCount).setName(line);
                    } else if(i == 1){
                        recipeList.get(recipesCount).setCookTime(Integer.valueOf(line));
                    } else {
                        recipeList.get(recipesCount).addIngredients(line);
                    }
                    i++;
                } else if (line.isEmpty()){
                    recipesCount++;
                    i = 0;
                     recipeList.add(new Recipe());
                }
            }
        }  catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        while(true){
            System.out.println();
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            System.out.println("");
            if (command.equals("list")){
                for(Recipe recipe : recipeList){
                    System.out.println(recipe);
                }
            }
            if(command.equals("stop")){
                break;
            }
            if(command.equals("find name")){
                searchName(recipeList, scanner);
            }

            if(command.equals("find cooking time")){
                searchCookTime(recipeList, scanner);
            }

            if(command.equals("find ingredient")){
                searchIngredient(recipeList, scanner);
            }
        }
    }

    public static void searchName(ArrayList<Recipe> recipeList, Scanner scanner){
        System.out.println("Searched word: ");
        String searchedName = scanner.nextLine();

        System.out.println("Recipes: ");
        for(Recipe recipe : recipeList){
            if(recipe.getName().contains(searchedName)){
                System.out.println(recipe);
            }
        }
    }

    public static void searchCookTime(ArrayList<Recipe> recipeList, Scanner scanner){
        System.out.println("Max cooking time: ");
        int maxCookTime = Integer.valueOf(scanner.nextLine());

        System.out.println("Recipes: ");
        for(Recipe recipe : recipeList){
            if(recipe.getCookTime() <=  maxCookTime){
                System.out.println(recipe);
            }
        }
    }

    public static void searchIngredient(ArrayList<Recipe> recipeList, Scanner scanner){
        System.out.println("Ingredient: ");
        String searchedString = scanner.nextLine();

        
        for(Recipe recipe : recipeList){
            for(String ingredient : recipe.getIngredients()){
                if(ingredient.equals(searchedString)){
                    System.out.println(recipe);
                }
            }
        }
    }
}
