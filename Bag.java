import java.io.*;
import java.util.*;
public class Bag {
    private int maxstack;
    private ArrayList<Item> potions;
    public Bag(){
        potions= new ArrayList<Item>();
        maxstack=20;
    }
    public void packitem(){
        potions.add(new Item());

    }
    public void lookitem(){
        for (Item item : potions) {
            System.out.println(item.getname());
        }

    }
    public int useitem(int i){
        int healamonut = potions.get(i).gethpamount();
        potions.remove(i);
        return healamonut;
    }

}