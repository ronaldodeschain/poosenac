public class Triplet<K,V,T> {
    private final K key;
    private final V value;
    private final T third;

    public Triplet(K key, V value, T third) {
        this.key = key;
        this.value = value;
        this.third = third;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public T getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "key=" + key +
                ", value=" + value +
                ", third=" + third +
                "}";
    }
}

