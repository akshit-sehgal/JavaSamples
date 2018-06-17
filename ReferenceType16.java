package JavaSample;

import java.util.Arrays;

public class ReferenceType16 {
    public static void main(String[] args){
    int myInt=10;
    int anotherInt=10;
    System.out.println(myInt);
    int[] myArray=new int[5];
    int[] anotherArray=myArray;
    System.out.println("myArray = "+Arrays.toString(myArray));
    System.out.println("anotherArray = "+Arrays.toString(anotherArray));
    anotherArray[0]=1;
    System.out.println("myArray = "+Arrays.toString(myArray));
    System.out.println("anotherArray = "+Arrays.toString(anotherArray));
   modifyArray(myArray);
   System.out.println("myArray = "+Arrays.toString(myArray));
    System.out.println("anotherArray = "+Arrays.toString(anotherArray));
   
    }
    private static void modifyArray(int[] array){
        array[0]=2;
    }
}
