package simplest.possible.implementation;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;

public class PrimeFactors {
    public List<Integer> of(int number) {
        if (number == 1)
            return emptyList();
        return Arrays.asList(2);
    }
}
