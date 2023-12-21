package task_1.OOP_6.SingleResponsibilityPrinciple;

public class calculateNetSalary {
    private int baseSalary;

    public calculateNetSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}
