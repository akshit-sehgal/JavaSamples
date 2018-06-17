/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Akshit
 */
public class Interface22 {
    public static void main(String[] args){
//        IPlayer aks = new IPlayer("Aks",10,15,"Sword");
//        System.out.println(aks.toString());
//        saveObject(aks);
//        aks.setWeapon("Katana");
//        saveObject(aks);
//        System.out.println(aks.toString());
//        loadObject(aks);
//        System.out.println(aks.toString());
         Saveable wolf = new Monster("Werewolf", 20, 40);
         System.out.println(((Monster)wolf).getStrength());
         System.out.println(wolf.toString());
         saveObject(wolf);
    }
    
    
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(Saveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
        }
    }
    public static void loadObject(Saveable obj){
        List<String> values=readValues();
        obj.read(values);
    }
}
