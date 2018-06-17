
package JavaSample;

public class Switch7 {
    public static void main(String[] args){
        int val=2;
        switch(val){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:case 4:
                System.out.println("three or four");
                break;
            default:
                System.out.println("default");
        }
    }
}
