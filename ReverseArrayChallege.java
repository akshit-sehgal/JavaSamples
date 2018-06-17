
package JavaSample;

import java.util.Arrays;


public class ReverseArrayChallege {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        reverse(arr);
    }
    private static void reverse(int [] array){
        int e=array.length-1;
        for(int i=0;i<array.length/2;i++,e--){
            int temp=array[i];
            array[i]=array[e];
            array[e]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
