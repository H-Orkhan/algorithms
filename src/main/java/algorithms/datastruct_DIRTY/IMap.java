package algorithms.datastruct_DIRTY;

public interface IMap<K, V> {
    void put(K key, V val);
    V get(K key);
}
