
package JavaSample;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNo;
    
    public Account(){
        this("56789",1200,"Name","EMail","PhoneNo");
        System.out.println("Empty constructor");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNo) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNo = customerPhoneNo;
    }
    
  
    
    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Deposit of Rs. "+amount+" made. New balance Rs. "+this.balance);
    }
    public void withdraw(double amount){
        if(this.balance-amount<0)
            System.out.println("Only Rs. "+this.balance+" available. Cannot withdraw");
        else
        {
            this.balance-=amount;
            System.out.println("Withdrawal of Rs. "+amount+" . New balance Rs. "+this.balance);
        }
        
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }
}
