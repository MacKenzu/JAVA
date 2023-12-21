package task_1.OOP_1.domen;

public class HotDrinks extends Bottle{
    private int temperature; 
    public HotDrinks (String name, int place, int price, String type, double volume, int temperature){
        super(name, place, price, type, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
     @Override 
    public String toString() {
        return super.toString() + ", temperature " + this.temperature;
    } 
    

    
}
