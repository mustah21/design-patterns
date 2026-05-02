import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int previous = 0;
    private int current = 1;
    private int total = 0;
    private int limit = 10;
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
        total = previous + current;
        previous = current;
        current = total;
        return total;
    }
}
