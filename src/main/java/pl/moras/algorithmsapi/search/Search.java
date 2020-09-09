package pl.moras.algorithmsapi.search;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
public abstract class Search<T> {

    protected T[] array;

    protected void setArray(T[] array) {
        this.array = array;
    }

    public abstract int search(T item);

}
