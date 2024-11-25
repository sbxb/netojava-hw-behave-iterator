import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected final Random random = new Random();
    protected final int minBound;
    protected final int maxBound;

    public Randoms(int min, int max) {
        minBound = min;
        maxBound = max;
    }

    protected int nextInt() {
        return random.nextInt(minBound, maxBound + 1); // make upper bound also included
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return nextInt();
            }
        };
    }
}
