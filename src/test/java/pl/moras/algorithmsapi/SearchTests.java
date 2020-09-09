package pl.moras.algorithmsapi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pl.moras.algorithmsapi.search.BinarySearch;
import pl.moras.algorithmsapi.search.LinearSearch;
import pl.moras.algorithmsapi.search.Search;
import pl.moras.algorithmsapi.search.SearchAlgorithmFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SearchTests {

    @ParameterizedTest
    @ValueSource(classes = {LinearSearch.class, BinarySearch.class})
    void should_search_integer(Class alghorithmClass){
        Search<Integer> search = SearchAlgorithmFactory.create(alghorithmClass, new Integer[]{1, 2, 3, 4, 5});
        int result = search.search(4);
        assertEquals(3, result);
    }

    @ParameterizedTest
    @ValueSource(classes = {LinearSearch.class, BinarySearch.class})
    void should_search_person(Class alghorithmClass){
        Search<Person> search = SearchAlgorithmFactory.create(alghorithmClass, Person.getData());
        int result = search.search(new Person("adam", 30));
        assertEquals(1, result);
    }
}
