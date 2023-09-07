package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс описывает поток. Содержит список групп,номер потока и колличество групп
 */
public class StudentStream implements Iterable<StudentGroup> {
    /**
     * список групп в потоке
     */
    private List<StudentGroup> stream;
    /**
     * id потока
     */
    private int idStream;
    /**
     * размер потока
     */
    private int streamSize;

    /**
     * конструктор класса
     * @param stream поток
     * @param idStream id потока
     */
    public StudentStream(List<StudentGroup> stream, int idStream) {
        this.stream = stream;
        this.idStream = idStream;
        this.streamSize = stream.size();
    }

    /**
     * @return поток
     */
    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setGroup(List<StudentGroup> stream) {
        this.stream = stream;
    }

    /**
     * @return id потока
     */
    public int getIdStream() {
        return idStream;
    }

    public void setIdStream(int idStream) {
        this.idStream = idStream;
    }

    /**
     * @return размер потока
     */
    public int getStreamSize() {
        return streamSize;
    }

    /**
     * Выводит информацию о потоке
     */
    @Override
    public String toString() {
        String groupsOut = "Номер потока:" + idStream + " Колличество групп = " + streamSize
                + "\n\n";
        for (StudentGroup group : stream) {
            groupsOut += group + "\n";

        }
        return groupsOut;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(stream);
    }

}