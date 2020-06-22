package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profiles -> profiles.getAddress().getCity() + ", "
                + profiles.getAddress().getStreet() + ", "
                + profiles.getAddress().getHouse() + ", "
        + profiles.getAddress().getApartments()).collect(Collectors.toList());
    }
}
