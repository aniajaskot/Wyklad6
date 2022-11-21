package example2;

public class OnlineShop {
    public static void main(String[] args) {
        Address address = new Address("Wrocław", "wybrzeże Wyspiańskiego", "27", "321");

        Customer customer = new Customer("Jan", "Kowalski", address, 3000);
        customer.printInfo();
        System.out.println();

        Employee employee = new Employee("Karol", "Nowak", address, 5000);
        employee.printInfo();
        System.out.println();

        Director director = new Director("Andrzej", "Kamiński", null, 10000);
        director.setBonus(20000);
        director.printInfo();
    }
}
