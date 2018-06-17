
package JavaSample;
/* 
    4 types of nested classes: 
    static nested class
    non-static nested class or inner class
    local class
    anonymous class
*/

public class InnerClass23 {
    public static void main(String[] args){
        GearBox car = new GearBox(6);
        car.operateClutch(true);
        car.changeGear(1);
        car.operateClutch(false);
        System.out.println(car.wheelSpeed(1000));
    }
}
