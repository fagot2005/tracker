package stream;

import java.util.List;
import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int house;
    private int apartments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return house == address.house &&
                apartments == address.apartments &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, house, apartments);
    }

    public Address(String city, String street, int house, int apartments) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartments = apartments;
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

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }
    List<Address> address = List.of(
            new Address("Rome", "First street", 42, 125),
            new Address("New York", "Second street", 242, 14),
            new Address("Berlin", "Thried street", 3, 23),
            new Address("Lviv", "Forty street", 445, 767),
            new Address("Rome", "Fifty street", 7, 22),
            new Address("Rome", "Six street", 4, 5));
}
