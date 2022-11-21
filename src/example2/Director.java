package example2;

public class Director extends Employee {
    private double bonus;

    public Director(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address, salary);
    }

    @Override
    void printInfo(){
        super.printInfo();
        System.out.println(", premia " + bonus
                + ", całkowita wypłata " + totalPayment());
    }

    double totalPayment(){
        return getSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
