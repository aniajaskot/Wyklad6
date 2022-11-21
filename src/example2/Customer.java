package example2;

public class Customer extends Person {
    private double totalPayments;

    public Customer(String firstName, String lastName, Address address, double totalPayments) {
        super(firstName, lastName, address);
        this.totalPayments = totalPayments;
    }

    @Override
    void printInfo(){
        super.printInfo();
        System.out.print(", zakupy na kwotę " + totalPayments);
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(double totalPayments) {
        this.totalPayments = totalPayments;
    }
}
