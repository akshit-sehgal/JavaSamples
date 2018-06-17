
package JavaSample;

import java.util.ArrayList;


public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+groceryList.size() + " items in your grocery list.");
        for(int i=0;i<groceryList.size();i++)
            System.out.println((i+1)+". "+groceryList.get(i));
    }
    private void modifyGroceryItem(int pos, String newItem){
        groceryList.set(pos, newItem);
        System.out.println("Grocery Item "+(pos+1)+" has been modififed.");
    }
    private void removeGroceryItem(int pos){
        String item=groceryList.get(pos);
        groceryList.remove(pos);
        System.out.println("Removed "+item);
    }
    private int findItem(String searchItem){
        int pos=groceryList.indexOf(searchItem);
        return pos;
    }
    public void modifyGroceryItem(String cItem, String newItem){
        int pos=findItem(cItem);
        if(pos>=0)
            modifyGroceryItem(pos,newItem);
    }
    public void removeGroceryItem(String item){
          int pos=findItem(item);
        if(pos>=0)
            removeGroceryItem(pos);
    }
    public boolean onFile(String item){
        int pos=findItem(item);
        if(pos>=0) return true;
        return false;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    
}
