
package JavaSample;

public class AbstractClass25 {
    public static void main(String[] args){
        GrassHopper gh = new GrassHopper("Spike");
        gh.breathe();
        gh.eat();
        
        Parrot parrot = new Parrot("Tommy");
        parrot.breathe();
        parrot.fly();
        parrot.eat();        
        Roach roach = new Roach("Case");
        roach.fly();
        roach.bye();
    }
}
