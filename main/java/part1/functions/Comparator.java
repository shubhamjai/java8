package main.java.part1.functions;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    public static <U> Comparator<U> comparing(Function<U, Comparable> func) {
        return (p1, p2) -> func.apply(p1).compareTo(func.apply(p2));
    }

    public int compare(T t1, T t2);

    public default Comparator<T> thenComparing(Comparator<T> cmp) {
        return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2) : compare(p1, p2);
    }

    public default Comparator<T> thenComparing(Function<T, Comparable> func) {
        return thenComparing(comparing(func));
    }
}
