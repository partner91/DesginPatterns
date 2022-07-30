package hr.hrsak;

public interface Specification <T>{
    boolean isSatisfied(T item);
}
