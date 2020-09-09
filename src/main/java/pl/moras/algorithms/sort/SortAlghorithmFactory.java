package pl.moras.algorithms.sort;

import java.lang.reflect.InvocationTargetException;

public class SortAlghorithmFactory {

    public static <T> Sort<T> create(Class<? extends Sort> alghorithmImpl){
        try {
            Sort<T> search = alghorithmImpl.getDeclaredConstructor().newInstance();
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
