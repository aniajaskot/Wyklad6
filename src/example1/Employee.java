package example1;

public class Employee extends Person{
    private double salary;

    void printInfo(){
        String info = getFirstName() + " " + getLastName();
        if(getAddress() != null){
            String address = getAddress().getCity() + " " + getAddress().getStreet() + " "
                    + getAddress().getHomeNo() + " " + getAddress().getFlatNo();

            info = info + " " + address;
        }
        info = info + ", wypłata " + salary;

        System.out.println(info);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
