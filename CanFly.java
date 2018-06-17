
package JavaSample;

public interface CanFly {
    void fly();
    default void bye(){
        System.out.println("okay");
    }
}
