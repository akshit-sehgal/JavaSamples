package JavaSample;

public class Loops8 {
    public static void main(String[] args){;
        for(int i=2;i<9;i++){
            System.out.println("10,000 at "+i+"% interest= "+String.format("%.2f",calculateInterest(10_000,i)));
        }
        int count=0;
        while(count<6){
            System.out.println("Count value is: "+count);
            count++;
        }
        do {
            System.out.println("Count value is: "+count);
            count++;
        } while(count<12);
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
