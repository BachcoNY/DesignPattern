package BehavioralPattern.IteratorPattern;

public interface ItemIterator<T> {
    boolean hasNext();
    T next();
}
