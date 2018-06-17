
package JavaSample;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    
//    Car(int doors, int wheels, String model, String engine, String color){
//                this.doors=doors;
//                this.wheels=wheels;
//                this.model=model;
//                this.engine=engine;
//                this.color=color;
//    }
    public void setModel(String model){
        String validModel=model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("commodore"))
        this.model=model;
    }
    public void setDoors(int doors){
        this.doors=doors;
    }
    public String getModel(){
        return model;
    }
}
