public class Triple <T, V, Z>{
    private T first;
    private V second;
    private Z third;

    public Triple(T first, V second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public Z getThird() {
        return third;
    }
}
