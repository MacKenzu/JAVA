package task_1.OOP_6.OpenClosedPrinciple;

public class Bus extends Vehicle {
    public Bus(int maxSpeed, String type){
        super(maxSpeed, type);
    }
    @Override
    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.6;
    }
}
