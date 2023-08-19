package business;



@FunctionalInterface
public interface Condition<T> {
    boolean test(T o);
}
