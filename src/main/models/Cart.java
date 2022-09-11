package src.main.models;

import java.util.ArrayList;

public class Cart {
    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }
    /**
     * Function name: add
     * @param item
     *
     * Inside the function:
     *   1. adds an Item object
     */
    public void add(Item item){
        items.add(new Item(item));
    }

    /**
     * Function name: contains
     * @param item
     * @return (boolean)
     *
     * Inside the function:
     *    1. checks if items list contains() item.
     */
    public boolean contains(Item item){
        return items.contains(item);
    }
    
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

}
