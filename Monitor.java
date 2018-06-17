
package JavaSample;


public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution res;

    public Monitor(String model, String manufacturer, int size, Resolution res) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.res = res;
    }
    
    public void drawPixelAt(int x,int y, String color){
        System.out.println("Drawing pixel at "+x+" , "+y+" in "+color+" color ");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resolution getRes() {
        return res;
    }

    public void setRes(Resolution res) {
        this.res = res;
    }
    
}
