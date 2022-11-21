package example1;

public class Director extends Employee {
    private double bonus;

    void printInfo(){
        String info = getFirstName() + " " + getLastName();
        if(getAddress() != null){
            String address = getAddress().getCity() + " " + getAddress().getStreet() + " "
                    + getAddress().getHomeNo() + " " + getAddress().getFlatNo();

            info = info + " " + address;
        }
        info = info + ", wypłata " + getSalary() + ", premia " + bonus;

        System.out.println(info);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
