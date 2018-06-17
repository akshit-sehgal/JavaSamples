/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSample;

/**
 *
 * @author Akshit
 */
public class Insect extends Bug implements CanFly {

    public Insect(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat2");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying");
    }
    
}
