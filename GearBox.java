package JavaSample;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxgears;
    private int currentGear=0;
    private boolean clutch;
    
    public GearBox(int maxGears){
        this.maxgears=maxGears;
        this.gears = new ArrayList<Gear>();
        for(int i=0;i<maxGears;i++)
            addgear(i,i*5.3);
    }
    public void operateClutch(boolean in){
        this.clutch = in;
    }
    public void addgear(int no, double ratio){
        if(no>0 && no< maxgears){
            this.gears.add(new Gear (no,ratio));
        }
        else
            System.out.println("Gear already there!");
    }
    public void changeGear(int newGear){
        if(newGear>=0 && newGear<this.gears.size() && this.clutch){
            this.currentGear=newGear;
            System.out.println("Gear "+ newGear+" selected");
        }
        else {
            System.out.println("Grind!!");
        }
    }
    public double wheelSpeed(int revs){
        if(this.clutch){
            System.out.println("Scream");
            return 0.0;
        }
        return revs*gears.get(currentGear).getRatio();
    }
    private class Gear{
        private int gearNo;
        private double ratio;

        public Gear(int gearNo, double ratio) {
            this.gearNo = gearNo;
            this.ratio = ratio;
        }
        
        public double driveSpeed(int revs){
            return revs*this.ratio;
        }

        public int getGearNo() {
            return gearNo;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
