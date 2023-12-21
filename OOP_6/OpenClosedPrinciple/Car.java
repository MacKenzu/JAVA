package task_1.OOP_6.OpenClosedPrinciple;

public class Car extends Vehicle {
    public  Car (int maxSpeed, String type){
        super (maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.8;
    }
}
