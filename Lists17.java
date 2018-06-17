
package JavaSample;

import java.util.ArrayList;
import java.util.Scanner;


public class Lists17 {
    private static Scanner scanner=new Scanner(System.in);
     private static GroceryList list=new GroceryList();
    public static void main(String[] args){
        boolean quit=false;
        int choice=0;
        while(!quit){
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0: 
//                    printInstructions();
                    break;
                case 1:
                    list.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit=true;
                    break;
            }
        }
    }
    public static void addItem(){
        list.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        String item=scanner.nextLine();
       scanner.nextLine();
       String newItem=scanner.nextLine();
       scanner.nextLine();
       list.modifyGroceryItem(item,newItem);
    }
    public static void removeItem(){
        String item=scanner.nextLine();
        scanner.nextLine();
        list.removeGroceryItem(item);
    }
    public static void searchForItem(){
        String item=scanner.nextLine();
        if(list.onFile(item))
            System.out.println("Found "+item);
        else
            System.out.println("Item not found");
    }
    public static void processArrayList(){
        ArrayList<String> newArray=new ArrayList<String>();
        newArray.addAll(list.getGroceryList());
        ArrayList<String> newArray2=new ArrayList<String>(list.getGroceryList());
        String[] myArray=new String[list.getGroceryList().size()];
        myArray=list.getGroceryList().toArray(myArray);
    }
}
