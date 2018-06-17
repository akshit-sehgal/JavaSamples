package JavaSample;

import java.util.ArrayList;

public class Autoboxing18 {
   public static void main(String[] args){
       Integer no=new Integer(45);
       Double dno=new Double(56.78);
       ArrayList<Integer> inArray=new ArrayList<Integer>();
       for(int i=0;i<=10;i++)
           inArray.add(Integer.valueOf(i));
       for(int i=0;i<=10;i++)
           System.out.println(i+" --> "+inArray.get(i).intValue());
       Integer myValue = 56; // Integer.valueOf(56);
       int myInt=myValue;
       ArrayList<Double> myDoubles=new ArrayList<Double>();
       for(double db=0.0;db<=10;db+=0.5)
           myDoubles.add(Double.valueOf(db));
       for(int i=0;i<myDoubles.size();i++){
           double val=myDoubles.get(i);
           System.out.println(i+" --> "+val);
       }
       
   } 
}
