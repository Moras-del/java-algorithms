package pl.moras.algorithms.sort;

import java.lang.reflect.Array;

public class QuickSort<T extends Comparable> extends Sort<T>{

    @Override
    public T[] sortArray(T[] array) {
        array = array.clone();
        quickSort(array, 0, array.length-1);
        return array;
    }



    void quickSort(T[] array, int low, int high){
        int[] stack = new int[high-low+1];
        int top = -1;
        stack[++top] = low;
        stack[++top] = high;
        while (top >= 0){
            high = stack[top--];
            low = stack[top--];
            int pivot = partition(array, low, high);
            if (pivot -1 > low){
                stack[++top] = low;
                stack[++top] = pivot-1;
            }
            if (pivot+1 < high){
                stack[++top] = pivot+1;
                stack[++top] = high;
            }
        }

    }

    int partition(T[] array, int low, int high){
        T pivot = array[high];
        int i = low-1;
        for (int j = low; j < high; j++){
            if (array[j].compareTo(pivot) < 0){
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, high);
        return i;
    }

    void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
