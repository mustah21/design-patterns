import java.util.Iterator;

public class FibonacciSequence implements SequenceInterface {



    @Override
    public Iterator<Integer> getIterator() {
        return new FibonacciIterator(15);
    }
}
