import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack = new ArrayList<>();
    
    public boolean isEmpty(){
        if(this.stack.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add (String value){
        if(!this.stack.contains(value)){
            this.stack.add(value);
        }
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        String topMost = stack.get(stack.size() - 1);
        stack.remove(topMost);
        return topMost;
    }
}
