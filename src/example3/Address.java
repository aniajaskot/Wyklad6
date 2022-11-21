package example3;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(homeNo, address.homeNo) &&
                Objects.equals(flatNo, address.flatNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, homeNo, flatNo);
    }

    @Override
    public String toString() {
        return "Address: " + " " + city + ", " + street + ", " + homeNo + "/" + flatNo;
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
