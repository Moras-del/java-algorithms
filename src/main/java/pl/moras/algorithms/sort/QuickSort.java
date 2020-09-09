package pl.moras.algorithms.sort;

public class QuickSort<T extends Comparable> extends Sort<T>{

    @Override
    public T[] sortArray(T[] array) {
        array = array.clone();
        quickSort(array, 0, array.length-1);
        return array;
    }



    void quickSort(T[] array, int low, int high){
        if (low < high){
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot-1);
            quickSort(array, pivot+1, high);
        }
    }

    int partition(T[] array, int low, int high){
        T item = array[high];
        int i = low-1;
        for (int j = low; j < high; j++){
            if (array[j].compareTo(item) < 0){
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
