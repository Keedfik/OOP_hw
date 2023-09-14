package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetModel {
    public List<Student> getStudents();

    /**
     * Удаляет студента из списка
     * 
     * @param index индекс студента для удаления
     */
    public void removeStudent(int index);
}