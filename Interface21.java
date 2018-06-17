package JavaSample;

public class Interface21 {
    public static void main(String[] args){
         Telephone myPhone;
         myPhone = new DeskPhone(123456);
//       DeskPhone myPhone=new DeskPhone(123455);
       myPhone.powerOn();
       myPhone.callPhone(123456);
       myPhone.answer();
       System.out.println("==========");
       myPhone=new MobilePhone(24565);
       myPhone.powerOn();
       myPhone.callPhone(24565);
       myPhone.answer();
    }
}
