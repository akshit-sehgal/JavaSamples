
package JavaSample;

public class Dog extends Animal {
    
    private int eyes;
    private int legs;
    private int tale;
    private int teeth;
    private String coat;

    public Dog(int eyes, int legs, int tale, int teeth, String coat, String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tale = tale;
        this.teeth = teeth;
        this.coat = coat;
    }
    
    public void chew(){
        System.out.println("Chew-Dog");
    }
    @Override
    public void eat(){
        chew();
        System.out.println("Eat-dog");
        super.eat();
    }
    public void walk(){
        System.out.println("Dog-Walk");
        super.move(100);
    }
    public void run(){
        System.out.println("Dog-Run");
        super.move(200);
    }
    
}
