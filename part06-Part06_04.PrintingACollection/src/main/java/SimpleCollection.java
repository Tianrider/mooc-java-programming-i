
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String returned = "";
        if (this.elements.size() == 1) {
            returned = "The collection " + this.name + " has " + this.elements.size() + " element:\n" + this.elements.get(0);
        } else {
            returned = "The collection " + this.name + " has " + this.elements.size() + " elements:\n";
            for (String element : elements) {
                returned += element + "\n";
            }
        }

        return returned;
    }

}
