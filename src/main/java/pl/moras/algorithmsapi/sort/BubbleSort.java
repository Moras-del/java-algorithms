package pl.moras.algorithmsapi.sort;


public class BubbleSort<T extends Comparable> extends Sort<T> {
    @Override
    public T[] sortArray(T[] array) {
        array = array.clone();
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j <n-i-1; j++){
                if (array[j].compareTo(array[j+1]) > 0)
                    swap(array, j, j+1);
            }
        }
        return array;
    }

    void swap(T[] array, int i, int j){
        T temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }


}
