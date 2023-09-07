package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс cодержит список cтудентов, номер группы и колличество студентов в
 * группе
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    /**
     * группа студентов
     */
    private List<Student> group;
    /**
     * id группы
     */
    private int idGroup;
    /**
     * размер группы
     */
    private int groupSize;

    /**
     * конструктор класса 
     * @param group группа студентов
     * @param idGroup id группы
     */
    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
        this.groupSize = group.size();
    }

    /**
     * @return группа
     */
    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    /**
     * @return id группы
     */
    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    /**
     * @return размер группы
     */
    public int getGroupSize() {
        return groupSize;
    }

    @Override
    public String toString() {
        String studentsOut = "Номер группы = " + idGroup + " Колличество учеников = " + groupSize
                + "\n";
        for (Student student : group) {
            studentsOut += student + "\n";

        }
        return studentsOut;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.idGroup == o.idGroup) {
            return 0;
        } else if (this.idGroup > o.idGroup) {
            return 1;
        } else
            return -1;
    }

}