package pl.moras.algorithmsapi.sort;

public abstract class Sort<T extends Comparable> {

    protected T[] array;

    protected void setArray(T[] array) {
        this.array = array;
    }

    abstract T[] sort();

}
