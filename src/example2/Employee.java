package example2;

public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }

    @Override
    void printInfo(){
        super.printInfo();
        System.out.print(", wypłata " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
