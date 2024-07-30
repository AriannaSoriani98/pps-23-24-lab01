package tdd_2;

import tdd.CircularList;
import tdd.CircularListImpl;

import java.util.Iterator;

public class CircularListIteratorImpl implements CircularListIterator{
    private CircularList circularList = new CircularListImpl();

    @Override
    public void add(int element) {
        this.circularList.add(element);
    }

    @Override
    public int size() {
        return this.circularList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.circularList.isEmpty();
    }

    @Override
    public Iterator<Integer> forwardIterator() {
        return new Iterator<>() {

            public boolean hasNext() {
                return !isEmpty();
            }

            public Integer next() {
                return circularList.next().get();
            }
        };
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        return new Iterator<Integer>() {

            public boolean hasNext() {
                return !isEmpty();
            }

            public Integer next() {
                return circularList.previous().get();
            }
        };
    }

    @Override
    public void reset() {
        this.circularList = new CircularListImpl();
    }
}
