import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.List;
import java.util.stream.Collectors;

@Named
@RequestScoped
public class CountryService {

    private CountryBeam countryBeam = new CountryBeam();

    public List<Integer> getYear() {
        return countryBeam.getCountries().stream().map(i -> i.getYear()).distinct().collect(Collectors.toList());
    }
}
