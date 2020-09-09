package pl.moras.algorithms.search;

public class BinarySearch<T extends Comparable<T>> extends Search<T>{

    @Override
    public int search(T item) {
        int n = array.length;
        return binarySearch(item, 0, n-1);
    }

    int binarySearch(T item, int low, int high){
        if (low <= high){
            int mid = low+(high-low)/2;
            if (array[mid].equals(item)){
                return mid;
            }
            if (array[mid].compareTo(item) > 0){
                return binarySearch(item, low, mid-1);
            }
            return binarySearch(item, mid+1, high);
        }
        return -1;
    }
}
