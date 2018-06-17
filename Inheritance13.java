
package JavaSample;

public class Inheritance13 {
    public static void main(String[] args){
        Animal animal=new Animal("Animal",1,1,1,5);
       Dog dog=new Dog(1,2,3,4,"Spark","Coat",5,6,7,8);
       dog.walk();
       dog.run();
       Fish fish=new Fish(1,2,3,"Fish",3,4);
       fish.swim(90);
    }
}
