package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Итератор для Класса StudentStream
 */
public class StreamIterator implements Iterator<StudentGroup> {
    private int count;
    private final List<StudentGroup> stream;

    public StreamIterator(List<StudentGroup> group) {
        this.stream = group;
    }

    @Override
    public boolean hasNext() {
        return count < stream.size();
    }

    @Override
    public StudentGroup next() {
        count++;
        return stream.get(count - 1);
    }

}