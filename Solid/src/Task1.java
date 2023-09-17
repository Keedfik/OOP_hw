import java.util.Date;

public class Task1 {
    public class Employee {
        private String name;
        private Date dob;

        // private int baseSalary;
        /**
         * @param name имя сотрудника
         * @param dob дата 
         */
        public Employee(String name, Date dob) {
            this.name = name;
            this.dob = dob;
            // this.baseSalary = baseSalary;
        }

        /**
         * @return имя сотрудника и дата
         */
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }
        // public int calculateNetSalary() {
        // int tax = (int) (baseSalary * 0.25);//calculate in otherway
        // return baseSalary - tax;
        // }
    }

    /**
     * Класс работы с зарплатой.
     */
    public class Salary {
        private Employee employee;

        private int baseSalary;

        /**
         * @param employee сотрудник
         * @param baseSalary зарплата
         */
        public Salary(Employee employee, int baseSalary) {
            this.employee = employee;
            this.baseSalary = baseSalary;
        }

        /**
         * @return зарплата с вычетом налогов
         */
        public int calculateNetSalary() {
            int tax = (int) (baseSalary * 0.25);// calculate in otherway
            return baseSalary - tax;
        }

    }
}
