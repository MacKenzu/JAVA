package task_1.domen;

public class Bottle extends product{
    private double volume;

    public Bottle (String name, int place, int price, String type, double volume) {
        super(name, place, price, type);
        this.volume = volume; 
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
    
    @Override 
    public String toString() {
        return super.toString() + ", volume " + this.volume;
    } 

    
}
