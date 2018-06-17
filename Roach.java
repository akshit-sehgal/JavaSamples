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
public class Roach extends Insect{

    public Roach(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Not very good at that");
        
    }
    
}
