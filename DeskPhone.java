
package JavaSample;

public class DeskPhone implements Telephone{
    private int myNo;
    private boolean isRinging;

    public DeskPhone(int myNo) {
        this.myNo = myNo;
    }
    
    @Override
    public void powerOn() {
        System.out.println("No action taken");
    }

    @Override
    public void dial(int phoneNo) {
        System.out.println("Now Ringing "+phoneNo);
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNo) {
        if(myNo==phoneNo)
            isRinging=true;
        else 
            isRinging = false;
        System.out.println("Ringing "+isRinging);
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
    
}
