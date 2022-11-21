package example1;

public class OnlineShop {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Wrocław");
        address.setStreet("wybrzeże Wyspiańskiego");
        address.setHomeNo("27");
        address.setFlatNo("321");

        Customer customer = new Customer();
        customer.setFirstName("Jan");
        customer.setLastName("Kowalski");
        customer.setTotalPayments(3000);
        customer.setAddress(address);
        customer.printInfo();

        Employee employee = new Employee();
        employee.setFirstName("Karol");
        employee.setLastName("Nowak");
        employee.setSalary(5000);
        employee.setAddress(address);
        employee.printInfo();

        Director director = new Director();
        director.setFirstName("Andrzej");
        director.setLastName("Kamiński");
        director.setSalary(10000);
        director.setBonus(20000);
        director.printInfo();
    }
}
