package JavaSample;

import java.util.Scanner;

public class UserInput10 {
    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        boolean hasNextInt=scanner.hasNextInt();
//        if(hasNextInt){
//            int age=scanner.nextInt();
//        scanner.nextLine(); // Handle next line character (Enter key)
//        System.out.println("Enter your name: ");
//        String name=scanner.nextLine();
//        System.out.println("Your name is "+name+"\nYour age is "+age);
//        }
//        else{
//            System.out.println("Invalid input.");
//        }
//        scanner.close();
        sum();
    }
    public static void sum(){
        // Integer.MAX_VALUE
        int count=0;
        int sum=0;
        Scanner input=new Scanner(System.in);
        
        while(count<10){
            System.out.print("Enter number #"+(count+1)+": ");
            if(input.hasNextInt()){
                sum+=input.nextInt();
                count++;
            }
            else{
                System.out.println("Invalid number");
            }            
            
                input.nextLine();
        }
        System.out.println("\nThe sum of 10 numbers is "+sum);
        input.close();
    }
}
