package example2;

public class Address {
    private String city;
    private String street;
    private String homeNo;
    private String flatNo;

    public Address(String city, String street, String homeNo, String flatNo) {
        this.city = city;
        this.street = street;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }

    String getFullInfo(){
        return city + " " + street + " " + homeNo + "/" + flatNo;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }
}
