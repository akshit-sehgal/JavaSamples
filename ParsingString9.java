
package JavaSample;

public class ParsingString9 {
    public static void main(String[] args){
        String noAsString="2018.890";
        noAsString+=1;
        System.out.println("Number as string = "+noAsString);
//        int num=(int)Integer.parseInt(noAsString);
//        num+=1;
//         System.out.println(num);
          double dnum=Double.parseDouble(noAsString);
        System.out.println(dnum);
    }
}
