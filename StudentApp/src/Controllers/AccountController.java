package Controllers;

import java.util.List;

import Domen.Person;
import Domen.Teacher;

public class AccountController {

    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    /**
     * Рассчитывает средний возраст списка персон
     * @param <T> (дженерик тип) в данном случае Person и его потомки
     * @param persons список персон
     * @return средний возраст
     */
    public static <T extends Person> double averageAge(List<T> persons) {
        double summ = 0.0;
        for(T person: persons){
            summ+=person.getAge();
        }
        return summ/persons.size();
    }

}