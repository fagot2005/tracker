package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .sorted()
                .distinct()
                .map(profile -> profile.getAddress())
                .collect(Collectors.toList());
    }

}
