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
import static pl.moras.algorithms.TestUtils.createRangeTo;

public class SortTests {

    @ParameterizedTest
    @ValueSource(classes = {BubbleSort.class, QuickSort.class})
    void should_sort_integers(Class alghorithmClass){
        Sort<Integer> sorter = SortAlghorithmFactory.create(alghorithmClass);
        Integer[] result = sorter.sortArray(TestUtils.createRangeTo(300, true));
        assertArrayEquals(createRangeTo(300), result);
    }

    @ParameterizedTest
    @ValueSource(classes = {BubbleSort.class, QuickSort.class})
    void should_sort_persons(Class alghorithmClass){
        Person[] expected = TestUtils.getData();
        Sort<Person> sorter = SortAlghorithmFactory.create(alghorithmClass);
        Person[] actual = sorter.sortArray(TestUtils.getData(true));
        assertArrayEquals(expected, actual);
    }


}
