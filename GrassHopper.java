
package JavaSample;

public class GrassHopper extends Bug {

    public GrassHopper(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
    
}
