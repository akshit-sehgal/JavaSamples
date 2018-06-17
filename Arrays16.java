
package JavaSample;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays16 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
//    int[] myInts=new int[10];
//    myInts[5]=10;
//    for(int i=0;i<myInts.length;i++)
//        myInts[i]=i*70;
//    double[] myDoubles=new double[]{10.0,8.9};
//    long[] myLongs={1,2,4,5};
//    System.out.println(myLongs[2]);

    int[] myInts=getIntegers(5);
    int[] newInts=Arrays.copyOf(myInts, myInts.length);
    printArray(myInts);
    System.out.println("Average of the gievn numbers: "+getAvg(myInts));
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integers values");
        int[] values=new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element #"+i+": "+array[i]);
        }
    }
    public static double getAvg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        return (double)(sum/arr.length);
    }
}
