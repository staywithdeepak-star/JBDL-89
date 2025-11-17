package collections;

import java.util.*;

public class MyMap implements Map<String, Integer> {


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Integer get(Object key) {
        return 0;
    }

    @Override
    public Integer put(String key, Integer value) {
        return 0;
    }

    @Override
    public Integer remove(Object key) {
        return 0;
    }

    @Override
    public void putAll(Map<? extends String, ? extends Integer> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return Set.of();
    }

    @Override
    public Collection<Integer> values() {
        return List.of();
    }

    @Override
    public Set<Entry<String, Integer>> entrySet() {
        return Set.of();
    }


    /**
     * Abstract function is a function that does not have any method definition, just the declaration is present.
     * All the functions in the interface that do not have definition are abstract functions
     *
     */
}
