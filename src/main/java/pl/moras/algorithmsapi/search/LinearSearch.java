package pl.moras.algorithmsapi.search;

public class LinearSearch<T> extends Search<T> {

    @Override
    public int search(T item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item))
                return i;
        }
        return -1;
    }
}
