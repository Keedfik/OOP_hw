import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Сергей", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Ксения", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);
        Student s7 = new Student("Олег", 28);
        Student s8 = new Student("Данил", 24);
        Student s9 = new Student("Петр", 22);
        Student s10 = new Student("Тамара", 23);
        Student s11 = new Student("Семен", 22);
        Student s12 = new Student("Светлана", 23);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);

        List<Student> listStud2 = new ArrayList<Student>();

        listStud2.add(s6);
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s10);
        listStud3.add(s11);
        listStud3.add(s12);

        StudentGroup group5123 = new StudentGroup(listStud1, 5123);
        StudentGroup group5124 = new StudentGroup(listStud2, 5124);
        StudentGroup group5125 = new StudentGroup(listStud3, 5125);

        List<StudentGroup> stream1 = new ArrayList<StudentGroup>();
        stream1.add(group5123);
        stream1.add(group5124);
        stream1.add(group5125);

        StudentStream stream12 = new StudentStream(stream1, 1);

        Collections.sort(stream12.getStream());
        System.out.println(stream12);

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");
        Teacher t3 = new Teacher("Олег", 36, "Учитель");

        System.out.println(new PersonComparator<Student>().compare(s1, s3));

        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(s1, 50000);

        AccountController.paySalary(t1, 50000);

        System.out.println(AccountController.averageAge(listStud1));

        List<Teacher> teacherList1= new ArrayList<Teacher>();
        teacherList1.add(t1);
        teacherList1.add(t2);
        teacherList1.add(t3);
        System.out.println(AccountController.averageAge(teacherList1));
    }
}