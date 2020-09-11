package pl.moras.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pl.moras.algorithms.search.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SearchTests {

    @ParameterizedTest
    @ValueSource(classes = {LinearSearch.class, BinarySearch.class, FibonacciSearch.class})
    void should_search_integer(Class alghorithmClass){
        Search<Integer> search = SearchAlgorithmFactory.create(alghorithmClass);
        search.setArray(TestUtils.createRangeTo(150));
        int result = search.search(120);
        assertEquals(120, result);
    }

    @ParameterizedTest
    @ValueSource(classes = {LinearSearch.class, BinarySearch.class, FibonacciSearch.class})
    void should_search_person(Class alghorithmClass){
        Search<Person> search = SearchAlgorithmFactory.create(alghorithmClass);
        search.setArray(TestUtils.getData());
        int result = search.search(new Person("adam", 30));
        assertEquals(1, result);
    }



}
