package pl.moras.algorithms.search;

import static java.lang.Math.min;

public class FibonacciSearch<T extends Comparable> extends Search<T> {

    @Override
    public int search(T item) {
        return fibbonaciSearch(item, array.length);
    }

    int fibbonaciSearch(T item, int length){
        int fib1 = 0;
        int fib2 = 1;
        int fibN = 1;

        while (fibN < length){
            fib1 = fib2;
            fib2 = fibN;
            fibN = fib1+fib2;
        }

        int offset = -1;
        while (fibN > 1){
            int index = min(offset+fib1, length-1);
            if (array[index].compareTo(item) < 0){
                fibN = fib2;
                fib2 = fib1;
                fib1 = fibN-fib2;
                offset = index;
            } else if (array[index].compareTo(item) > 0){
                fibN = fib1;
                fib2 = fib2-fib1;
                fib1 = fibN-fib2;
            } else
                return index;
        }
        if (fib2 == 1 && array[++offset].equals(item))
            return offset;

        return -1;
    }


}
