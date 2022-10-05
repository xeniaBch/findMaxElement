package maxElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxElement {

    //implement collection

    private final List <Integer> friendsList = new ArrayList<>();
    private final Stack <Integer> elementsStack = new Stack<>();

    public void addElement(int a) {

        if(friendsList.isEmpty()){
            friendsList.add(a);
            elementsStack.push(a);
            return;
        }
        friendsList.add(a);
        elementsStack.push(Math.max(a, getMax()));
    }

    public void removeLast() {
        friendsList.remove(size()-1);
        elementsStack.pop();
    }

    public int getLast(){
       return friendsList.get(size()-1);
    }

    public int getMax(){
        return elementsStack.peek();
    }

    public int size(){
        return friendsList.size();
    }

    public boolean isEmpty(){
        return friendsList.isEmpty();
    }
}
