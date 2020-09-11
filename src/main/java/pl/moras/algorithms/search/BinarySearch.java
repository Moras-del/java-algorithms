package pl.moras.algorithms.search;

public class BinarySearch<T extends Comparable<T>> extends Search<T>{

    @Override
    public int search(T item) {
        int n = array.length;
        return binarySearch(item, 0, n-1);
    }

    int binarySearch(T item, int low, int high){
        int pointer = 0;
        while (low <= high){
            pointer = low+(high-low)/2;
            if (array[pointer].equals(item))
                return pointer;
            else if (array[pointer].compareTo(item) > 0)
                high = pointer-1;
            else
                low = pointer+1;
        }
        return -1;
    }
}
