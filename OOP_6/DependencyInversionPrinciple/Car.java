package task_1.OOP_6.DependencyInversionPrinciple;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void  start() {
        this.engine.start();
    }
}