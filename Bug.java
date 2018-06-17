
package JavaSample;


public abstract class Bug {
    private String name;    
    public Bug(String name){
        this.name=name;
    }
    public abstract void eat();
    public abstract void breathe();
    public String getName(){
        return this.name;
    }
}
