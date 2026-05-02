import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        SequenceInterface f = new FibonacciSequence();
        Iterator<Integer> iterator = f.getIterator();


        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}