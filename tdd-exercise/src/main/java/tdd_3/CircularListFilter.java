package tdd_3;

import tdd.CircularList;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * Represents a list of integers, with a built-in iterator that is bidirectional and circular.
 * Example: with a list like {1,2,3}, the first call of next() returns 1, the second call returns 2,
 * the third returns 3, the fourth returns 1, and so on. Call to previous() goes in the other way.
 */
public interface CircularListFilter  extends CircularList {

    Optional<Integer> filteredNext(final Predicate<Integer> condition);

}
