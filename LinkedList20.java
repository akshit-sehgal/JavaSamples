package JavaSample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList20 {
    public static void main(String[] args){
        LinkedList<String> placesToVisit=new LinkedList<String>();
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Brisbane");
       addInOrder(placesToVisit,"Argentina");
        addInOrder(placesToVisit,"Switzerland");
        addInOrder(placesToVisit,"Spain");
//        printList(placesToVisit);
//        placesToVisit.add(4,"Brisbane");
//        placesToVisit.remove(4);
        printList(placesToVisit);
        visit(placesToVisit);
    }
    private static void printList(LinkedList<String> list){
        Iterator<String> i=list.iterator();
        while(i.hasNext()){
            System.out.println("Visiting "+i.next());
        }
        System.out.println("=====================");
    }
    private static boolean addInOrder(LinkedList<String> list, String newCity){
        ListIterator<String> itr=list.listIterator();
        while(itr.hasNext()){
            int comparison=itr.next().compareTo(newCity);
            if(comparison==0){
                System.out.println("New city already there");
                return false;
            }
            else if(comparison>0){
                itr.previous();
                itr.add(newCity);
                return false;
            }
            else{
            }
        }
        itr.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;
        ListIterator<String> itr=cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities to visit");
        }
        else{
            System.out.println("Now Visiting "+ itr.next());
            printMenu();
        }
        while(!quit){
            int action=scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0: 
                    System.out.println("Holiday vacation over");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                        if(itr.hasNext())
                            itr.next();
                        forward=true;
                    }
                    if(itr.hasNext())
                        System.out.println("Now Visiting "+itr.next());
                    else
                    {
                        System.out.println("Reached the end of the list");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(itr.hasPrevious())
                            itr.previous();
                        forward=false;
                    }
                    if(itr.hasPrevious())
                        System.out.println("Now Visiting "+itr.previous());
                    else
                    {
                        System.out.println("We are at the start of the list");
                        forward=true;
                    }
                        break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions: ");
        System.out.println("0: To quit"
                + "\n1: Go to next city"
                + "\n2: Go to previous city"
                + "\n3. Display menu");
    }
}
