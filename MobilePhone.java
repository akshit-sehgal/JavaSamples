package JavaSample;

public class MobilePhone implements Telephone{
    private int myNo;
    private boolean isRinging;
    private boolean isOn;
    
    public MobilePhone(int myNo) {
        this.myNo = myNo;
    }
    
    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Power on implemented.");
    }

    @Override
    public void dial(int phoneNo) {
        if(isOn)
        System.out.println("Now Ringing "+phoneNo);
        else
            System.out.println("Phone is switched off.");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNo) {
        if(myNo==phoneNo && isOn)
        {
            isRinging=true;
            System.out.println("Ringing");
        }
        else 
        {
            isRinging = false;
            System.out.println("Phone switched off or wrong phone no.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
