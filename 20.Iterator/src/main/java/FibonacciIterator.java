import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int previous = 0;
    private int current = 1;
    private final int limit;
    private int count = 0;


    public FibonacciIterator(int limit) {
    this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return count < limit;
    }

    @Override
    public Integer next() {
        count++;
        int total = previous + current;
        previous = current;
        current = total;
        return total;
    }
}
