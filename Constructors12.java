
package JavaSample;

public class Constructors12 {
    public static void main(String[] args){
        Account acc=new Account();        
        acc.withdraw(500);
        acc.deposit(1000);
        acc.withdraw(500);
        System.out.println(acc.getCustomerName());
    }
}
