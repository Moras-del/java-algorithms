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
        search.setArray(new Integer[]{1, 2, 3, 4, 5});
        int result = search.search(5);
        assertEquals(4, result);
    }

    @ParameterizedTest
    @ValueSource(classes = {LinearSearch.class, BinarySearch.class, FibonacciSearch.class})
    void should_search_person(Class alghorithmClass){
        Search<Person> search = SearchAlgorithmFactory.create(alghorithmClass);
        search.setArray(Person.getData());
        int result = search.search(new Person("adam", 30));
        assertEquals(1, result);
    }
}
