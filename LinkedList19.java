package JavaSample;

import java.util.ArrayList;

public class LinkedList19 {
    public static void main(String[] args){
        Customer customer = new Customer("Tim",54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println(customer.getName()+" : "+customer.getBalance());
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(4);
        intList.add(0,34);
        System.out.println(intList);
    }
}
