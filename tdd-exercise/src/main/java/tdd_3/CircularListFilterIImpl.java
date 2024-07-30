package tdd_3;

import tdd.CircularListImpl;

import java.util.Optional;
import java.util.function.Predicate;

public class CircularListFilterIImpl extends CircularListImpl implements CircularListFilter{


    @Override
    public Optional<Integer> filteredNext(Predicate<Integer> condition) {
        for (int i = 0; i < this.size(); i++) {
            int element = this.next().get();
            if (condition.test(element)) {
                return Optional.of(element);
            }
        }
        return Optional.empty();
    }
}
