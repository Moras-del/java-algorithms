package pl.moras.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pl.moras.algorithms.sort.BubbleSort;
import pl.moras.algorithms.sort.QuickSort;
import pl.moras.algorithms.sort.Sort;
import pl.moras.algorithms.sort.SortAlghorithmFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTests {

    @ParameterizedTest
    @ValueSource(classes = {BubbleSort.class, QuickSort.class})
    void should_sort_integers(Class alghorithmClass){
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        Sort<Integer> sorter = SortAlghorithmFactory.create(alghorithmClass);
        Integer[] result = sorter.sortArray(new Integer[]{5, 4, 3, 2, 1});
        assertArrayEquals(arr, result);
    }

    @ParameterizedTest
    @ValueSource(classes = {BubbleSort.class, QuickSort.class})
    void should_sort_persons(Class alghorithmClass){
        Person[] expected = Person.getData();
        Arrays.sort(expected);

        Sort<Person> sorter = SortAlghorithmFactory.create(alghorithmClass);
        Person[] actual = sorter.sortArray(Person.getData());

        assertArrayEquals(expected, actual);
    }


}
