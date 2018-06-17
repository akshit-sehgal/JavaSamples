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
public class Fish extends Animal {
    private int gills;
    private int fins;
    private int eyes;

    public Fish(int gills, int fins, int eyes, String name,  int size, int weight) {
        super(name, 1,1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }
    public void rest(){
        System.out.println("Fish-Rest");
    }
    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
    public void moveMuscles(){
        System.out.println("Fish-Move Muscles");
    }
    public void moveBackFin(){
        System.out.println("Fish-Move Back Fin");
    }
}
