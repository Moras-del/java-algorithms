package pl.moras.algorithmsapi.search;

import java.lang.reflect.InvocationTargetException;

public class SearchAlgorithmFactory {


    public static <T> Search<T> create(Class<? extends Search> alghorithmImpl, T[] array){
        try {
            Search<T> search = alghorithmImpl.getDeclaredConstructor().newInstance();
            search.setArray(array);
            return search;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }



}
