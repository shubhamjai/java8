package main.java.lambda.part2.functionalinterface.predicate;

@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T t);

    public default Predicate<T> and(Predicate<T> predicate)
    {
        return t -> test(t) && predicate.test(t);
    }

    public default Predicate<T> or(Predicate<T> predicate)
    {
        return t -> test(t) || predicate.test(t);
    }

    public static <U>Predicate<U> isEqualTo(U t)
    {
        return s -> s.equals(t);
    }
}
