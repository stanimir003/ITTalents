package CarVignette;

import CarVignette.vegnettes.Vignette;

import java.util.Comparator;

public class comparatorByPrice implements Comparator<Vignette> {
    @Override
    public int compare(Vignette o1, Vignette o2) {
        return o1.getVigDate()-o2.getVigDate();
    }
}
