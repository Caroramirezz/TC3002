import java.util.HashMap;

public class Hashy<K, V> {
    private HashMap<K, V> map = new HashMap<>();

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public void remove(K key) {
        map.remove(key);
    }

    public void printAll() {
        for (K key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

