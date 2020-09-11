package pl.moras.algorithms;

import java.util.Arrays;
import java.util.Collections;

public class TestUtils {

    public static Integer[] createRangeTo(int max, boolean reversed){
        Integer[] ints = new Integer[max];
        for (int i = 0; i < max; i++)
            ints[i] = i;
        if(reversed)
            reverse(ints);
        return ints;
    }
    public static Integer[] createRangeTo(int max){
        return createRangeTo(max, false);
    }

    private static void reverse(Integer[] array){
        int n = array.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }

    public static Person[] getData(boolean reversed){
        Person[] data = {new Person("kate", 40), new Person("adam", 30), new Person("mike", 20)};
        if(!reversed)
            Arrays.sort(data);
        return data;
    }

    public static Person[] getData(){
        return getData(false);
    }

}
