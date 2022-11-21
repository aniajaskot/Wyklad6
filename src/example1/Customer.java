package example1;

public class Customer extends Person{
    private double totalPayments;

    void printInfo(){
        String info = getFirstName() + " " + getLastName();
        if(getAddress() != null){
            String address = getAddress().getCity() + " " + getAddress().getStreet() + " "
                    + getAddress().getHomeNo() + " " + getAddress().getFlatNo();

            info = info + " " + address;
        }
        info = info + ", zakupy na kwotę " + totalPayments;

        System.out.println(info);
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(double totalPayments) {
        this.totalPayments = totalPayments;
    }
}
