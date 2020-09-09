package pl.moras.algorithms.search;

import java.lang.reflect.InvocationTargetException;

public class SearchAlgorithmFactory {


    public static <T> Search<T> create(Class<? extends Search> alghorithmImpl){
        try {
            Search<T> search = alghorithmImpl.getDeclaredConstructor().newInstance();
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
