package task_1.OOP_6.LiskovSubstitutionPrinciple;

public class Rectangle extends Quadrangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}