
package JavaSample;

public class Compositions13 {
    public static void main(String[] args){
        Dimensions dimens=new Dimensions(20,20,5);
        Case theCase=new Case("220B", "Dell","230V",dimens);
        Monitor theMonitor=new Monitor("27inch","Dell",27,new Resolution(2540,1440));
        Motherboard mb=new Motherboard("b3-40","Asus",4,"v2.2.3",6);
        PC pc=new PC(theCase, theMonitor, mb);
        pc.powerUp();
    }
    
}
